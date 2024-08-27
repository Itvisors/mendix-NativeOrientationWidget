import { View, useWindowDimensions } from "react-native";
import { createElement, useEffect, useMemo, useState } from "react";
import { defaultWidgetStyle } from "./ui/styles";
import { mergeNativeStyles } from "@mendix/pluggable-widgets-tools";

export function NativeOrientationWidget(props) {
    const { height, width } = useWindowDimensions();
    const [currentOrientation, setCurrentOrientation] = useState(undefined);

    const ORIENTATION_PORTRAIT = "portrait";
    const ORIENTATION_LANDSCAPE = "landscape";

    const { useMaximumSize } = props;

    const newOrientation = width > height ? ORIENTATION_LANDSCAPE : ORIENTATION_PORTRAIT;

    const styles = mergeNativeStyles(defaultWidgetStyle, props.style);
    const contentStyle = useMaximumSize ? styles.contentMaximumSize : styles.content;

    const { currentOrientationAttr, orientationChangeAction } = props;
    useEffect(() => {
        setCurrentOrientation(c => {
            // console.info(
            //     "NativeOrientationWidget: setCurrentOrientation state updater, current: [" +
            //         c +
            //         "], new: [" +
            //         newOrientation +
            //         "]"
            // );
            if (!c || newOrientation !== c) {
                if (currentOrientationAttr && currentOrientationAttr.status !== "available") {
                    // console.info("NativeOrientationWidget: orientation attribute is not yet available");
                    return undefined;
                }
                if (currentOrientationAttr && currentOrientationAttr.status === "available") {
                    if (!currentOrientationAttr.readonly) {
                        // console.info(
                        //     "NativeOrientationWidget: setCurrentOrientation attribute value to [" + newOrientation + "]"
                        // );
                        currentOrientationAttr.setValue(newOrientation);
                    } else {
                        console.warn("NativeOrientationWidget: orientation attribute is readonly");
                    }
                }
                if (
                    orientationChangeAction &&
                    orientationChangeAction.canExecute &&
                    !orientationChangeAction.isExecuting
                ) {
                    // console.info("NativeOrientationWidget: call orientation change action");
                    orientationChangeAction.execute();
                }
            }
            return newOrientation;
        });
    }, [currentOrientationAttr, newOrientation, orientationChangeAction]);

    const { contentPortrait, contentLandscape } = props;
    const renderContent = useMemo(() => {
        if (!currentOrientation) {
            // console.info("NativeOrientationWidget: no orientation yet");
            return <View style={contentStyle} testID={`${props.name}$noLayout`}></View>;
        }
        if (currentOrientation === ORIENTATION_LANDSCAPE) {
            // console.info("NativeOrientationWidget: render content for landscape");
            return (
                <View style={contentStyle} testID={`${props.name}$contentLandscape`}>
                    {contentLandscape}
                </View>
            );
        } else {
            // console.info("NativeOrientationWidget: render content for portrait");
            return (
                <View style={contentStyle} testID={`${props.name}$contentPortrait`}>
                    {contentPortrait}
                </View>
            );
        }
    }, [contentLandscape, contentPortrait, contentStyle, currentOrientation, props.name]);
    return (
        <View style={useMaximumSize ? styles.containerMaximumSize : styles.container} testID={props.name}>
            {renderContent}
        </View>
    );
}

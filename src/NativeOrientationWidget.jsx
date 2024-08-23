import { createElement, useMemo, useState } from "react";
import { View } from "react-native";
import { defaultWidgetStyle } from "./ui/styles";
import { mergeNativeStyles } from "@mendix/pluggable-widgets-tools";

export function NativeOrientationWidget(props) {
    const [currentLayout, setCurrentLayout] = useState(undefined);
    const { contentPortrait, contentLandscape, useMaximumSize } = props;
    const styles = mergeNativeStyles(defaultWidgetStyle, props.style);
    const contentStyle = useMaximumSize ? styles.contentMaximumSize : styles.content;
    const renderContent = useMemo(() => {
        if (!currentLayout) {
            // console.info("NativeOrientationWidget: no layout data yet");
            return <View style={contentStyle} testID={`${props.name}$noLayout`}></View>;
        }
        if (currentLayout.width > currentLayout.height) {
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
    }, [contentLandscape, contentPortrait, contentStyle, currentLayout, props.name]);
    return (
        <View
            style={useMaximumSize ? styles.containerMaximumSize : styles.container}
            testID={props.name}
            onLayout={eventData => {
                // console.info("NativeOrientationWidget: onLayout: " + JSON.stringify(eventData.nativeEvent.layout));
                setCurrentLayout(eventData.nativeEvent.layout);
            }}
        >
            {renderContent}
        </View>
    );
}

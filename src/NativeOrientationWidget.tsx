import { Component, ReactNode, createElement } from "react";
import { Dimensions, ViewStyle } from "react-native";
import { ContentContainer } from "./components/ContentContainer";
import { NativeOrientationWidgetProps } from "../typings/NativeOrientationWidgetProps";
import { Style } from "./utils/common";

export interface CustomStyle extends Style {
    container: ViewStyle;
    content: ViewStyle;
}

export interface NativeOrientationWidgetState {
    windowHeight: number;
    windowWidth: number;
}

export class NativeOrientationWidget extends Component<
    NativeOrientationWidgetProps<CustomStyle>,
    NativeOrientationWidgetState
> {
    constructor(props: NativeOrientationWidgetProps<CustomStyle>) {
        super(props);

        const { width, height } = Dimensions.get("window");
        this.state = {
            windowHeight: height,
            windowWidth: width
        };
    }

    handler = (newDimensions: any): void => {
        this.setState({
            windowHeight: newDimensions.window.height,
            windowWidth: newDimensions.window.width
        });
    };

    componentDidMount(): void {
        Dimensions.addEventListener("change", this.handler);
    }

    componentWillUnmount(): void {
        // Important to stop updating state after unmount
        Dimensions.removeEventListener("change", this.handler);
    }

    render(): ReactNode {
        const renderedContent = this.renderContent();
        return <ContentContainer style={this.props.style}>{renderedContent}</ContentContainer>;
    }

    private renderContent = (): ReactNode => {
        if (this.state.windowHeight > this.state.windowWidth) {
            console.debug("NativeOrientationWidget: render portrait");
            return this.props.contentPortrait;
        } else {
            console.debug("NativeOrientationWidget: render landscape");
            return this.props.contentLandscape;
        }
    };
}

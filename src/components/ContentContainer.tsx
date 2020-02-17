import { Component, ReactNode, createElement } from "react";
import { View } from "react-native";

import { CustomStyle } from "../NativeOrientationWidget";
import { flattenStyles } from "../utils/common";

export interface ContentContainerProps {
    style: CustomStyle[];
}

const defaultStyle: CustomStyle = {
    container: {},
    content: {}
};

export class ContentContainer extends Component<ContentContainerProps> {
    private readonly styles = flattenStyles(defaultStyle, this.props.style);

    render(): ReactNode {
        return (
            <View style={this.styles.container}>
                {this.renderContent()}
            </View>
        );
    }

    private renderContent = (): ReactNode => {
        return <View style={this.styles.content}>{this.props.children}</View>;
    };

}

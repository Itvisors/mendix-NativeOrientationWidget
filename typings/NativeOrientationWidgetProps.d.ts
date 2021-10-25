/**
 * This file was generated from NativeOrientationWidget.xml
 * WARNING: All changes made to this file will be overwritten
 * @author Mendix UI Content Team
 */
import { ComponentType, ReactNode } from "react";

export interface NativeOrientationWidgetProps<Style> {
    name: string;
    style: Style[];
    contentPortrait?: ReactNode;
    contentLandscape?: ReactNode;
}

export interface NativeOrientationWidgetPreviewProps {
    class: string;
    style: string;
    contentPortrait: { widgetCount: number; renderer: ComponentType<{ caption?: string }> };
    contentLandscape: { widgetCount: number; renderer: ComponentType<{ caption?: string }> };
}

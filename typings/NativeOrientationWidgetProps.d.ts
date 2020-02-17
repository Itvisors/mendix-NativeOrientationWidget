/**
 * This file was generated from NativeOrientationWidget.xml
 * WARNING: All changes made to this file will be overwritten
 * @author Mendix Widgets Team
 */
import { ReactNode } from "react";

interface CommonProps<Style> {
    name: string;
    style: Style[];
}

export interface NativeOrientationWidgetProps<Style> extends CommonProps<Style> {
    contentPortrait?: ReactNode;
    contentLandscape?: ReactNode;
}

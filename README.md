## NativeOrientationWidget
Make your page designs orientation aware in a simple way.

## Features
Render separate content for portrait and landscape orientation.

For example, in portrait, render your dashboard by placing four buttons in two layout grid rows. But in landscape, show all four buttons in one row.

## Usage
Place widget on your page.

Place content in the two content area's, separate for portrait and landscape. Be sure to use snippets to avoid duplicating your page content.

The widget determines portrait or landscape orientation by comparing the width and height available to it. This is the safest crossplatform way. That means the widget could get confused when other large content is on the same page. A custom header with buttons should not be a problem.

When using the widget in an input form, place the widget inside the dataview. Use snippets to place the input elements in the widget. Also, make sure to save input while entering. Otherwise, if the user has typed data but not left the input element and rotates the device, the input of that widget could be lost.

You can check the test app in the GitHub repo.

The maximum size class can be used if your content is scrollable, like a listview or a scroll container. Without the maximum size option, no content could be shown at all or scrolling may not work properly.

## Styling

The widget uses the following classes:
- container,
- containerMaximumSize,
- content,
- contentMaximumSize

The MaximumSize classes have flex: 1 to make the widget take the available space. The container and content classes by default have no styling but are included to allow override of styling.

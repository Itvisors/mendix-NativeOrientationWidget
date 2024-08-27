## NativeOrientationWidget
Make your page designs orientation aware in a simple way.

## Features
Render separate content for portrait and landscape orientation.

For example, in portrait, render your dashboard by placing four buttons in two layout grid rows. But in landscape, show all four buttons in one row.

## Usage
Place widget on your page.

Two options, one or both may be used:
- Place content in the two content area's, separate for portrait and landscape. Be sure to use snippets to avoid duplicating your page content.
- Use the orientation attribute and action to respond to orientation changes

The orientation attribute receives the current orientation, it must be an enumeration.

The action will be called after the widget is shown and with each orientation change

Create an enumeration with these values: (Caption can be different, use a value that suits you)

| Key       | Caption   |
| --------- | --------- |
| portrait  | Portrait  |
| landscape | Landscape |

When using the widget in an input form, place the widget inside the dataview. Use snippets to place the input elements in the widget. Also, make sure to save input while entering. Otherwise, if the user has typed data but not left the input element and rotates the device, the input of that widget could be lost.

You can check the test app in the GitHub repo.

The maximum size class can be used if your content is scrollable, like a scroll container. Without the maximum size option, no content could be shown at all or scrolling may not work properly.

Listviews don't work well inside this widget. Use the orientation attribute to conditionally show, hide or style your listview content.

## Styling

The widget uses the following classes:
- container,
- containerMaximumSize,
- content,
- contentMaximumSize

The MaximumSize classes have `flex: 1` to make the widget take the available space. The container and content classes by default have no styling but are included to allow override of styling.

#Notification

This widget provides the functionality to display a custom message, sourced from either a transient or persistent object. The message is rendered utilizing the [noty](http://ned.im/noty/) jQuery plugin, so the position, style, and timeout can all be configured.

# Getting Started


* The *Notification* widget can be downloaded from within the Mendix Business Modeler in the Mendix Appstore into any model that is built with Mendix 5+


# Configuration

* Drop the widget into the context of an entity
* Apply the following properties:
 * *Show Notification* - Boolean attribute to determine if the message should be rendered
 * *Display Text* - String attribute, containing the message to be displayed
 * *Layout* - The position of the message
 * *Type* - The appearance of the message
 * *Timeout* - How long the message should be displayed, before fading out (in milliseconds.) Set this property to *0* to render the message until it is clicked by the user

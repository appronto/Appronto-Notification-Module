# Description
A really nice notification anywhere in your screen you want. This is the best replacement for the default pop-up (info/warning/error)messages in Mendix. 

## Breaking changes!

With this upgrade we replace the widget that was used for the notifications. We use SweetAlert2 now. Inspired by the module that was already in the Marketplace by Jason Imeidopf. We have made it plug and play for nanoflows AND microflows. It will load the necessary javascript and CSS files. Only place the snippet in your layout and your are good to go. Exisiting calls to SF_CreateNotification are replaced by SUB_CreateNotifications. Rename the new microflow to the old name and back will solve this. The enums for status and position must be set again! It uses also HTML snippet from Mendix: https://marketplace.mendix.com/link/component/56 

# Getting started
The Notification module can be downloaded from the Mendix Marketplace into any model that is built with Mendix 8.18.23 (MTS) + and 9.0+.  
 
# Configuration
- Download module and give every User role the Module role ApprontoNotification.User so every user can see the notification
- Download HTML/ JavaScript widget (if not already in your project)
- Place the notification snippet on your Layouts
- Use the microflows and nanoflows (see examples!) from the USE ME folder

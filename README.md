 # nc-thm
 Stable version: 3.0.3


 Written by members of ThatCakeID: [リェンーゆく](https://github.com/ryenyuku), and [Iyxan23](https://github.com/Iyxan23).
 Some app's UI designed by: [thatcakepiece](https://github.com/thatcakepiece).
 Modded by: [NiceSapien](https://github.com/NiceSapien)

 nc-thm _(stands for: **n**i**c**e-**th**e**m**e)_ is a piece of software that can manage, edit, import, export or remove theme. One of the nc-thm's key feature is that the theme can be applied globally, means the theme can used by apps that have implemented nc-thm.
 nc-thm is intended to be open-source, rich, and easy to use.

 #### So, let's get started!

 ## For Consumers
 nc-thm is an easier way to change your theme globally for every single app that has implemented nc-thm with a single click of a button.

 Make sure to have the nc-thm Manager app installed, as it's supposed to be the manager for all nc-thm themes. You can [download it here](https://os-thm.thatcakeid.com).

 ## For Developers
 nc-thm is an easier way to make theme accessible to the user without worrying about managing themes, all of that _(adding, importing, removing, editing themes)_ are managed by nc-thm, and the best part is, it's [open source](https://github.com/ThatCakeID/os-thm-android)!

 ### How to implement nc-thm to your app?

 (Note: for sketchware developers, you might want to use [nc-thm-sketchware](https://project.sketchub.in/?id=920))

  - Add Jitpack repositories to your root build.gradle
  ```gradle
  allprojects {
     	repositories {
     		...
     		maven { url 'https://jitpack.io' }
     		...
     	}
     }
  ```
 
  - Add os-thm implementation to your build.gradle
    ```gradle
    dependencies {
            ...
       	    implementation 'com.github.ThatCakeID:os-thm-android:3.0.3'
       	    ...
    }

    ```
 
  - Grant Read and Write External Storage Permission
 
 That's it.

 ### How to use the library?
 How to apply the current applied theme with nc-thm
 ```java
 OsThmTheme currentTheme = osthmEngine.getCurrentTheme();
 myFab.setBackgroundColor(currentTheme.colorAccent);
 rootView.setBackgroundColor(currentTheme.colorBackground);
 etc...
 ```

 That's it!

 ## Colors meanings

 Here is a table showing the meanings of the colors:

 |Num |Color Name           |Color Meaning                                                                   |
 |----|---------------------|--------------------------------------------------------------------------------|
 | 1|colorPrimary           |The primary color for your app (ex: actionBar)                                  |
 | 2|colorPrimaryDark       |The darker primary color for your app (ex: statusbar)                           |
 | 3|colorAccent            |The accent color for your app (ex: Button & FAB)                                |
 | 4|colorStatusbarTint     |The tint color of the statusbar icon (can only be black[0] and white[1])        |
 | 5|colorBackground        |The background color for the root container                                     |
 | 6|colorBackgroundText    |The text color for TextView(s) that's inside the root container                 |
 | 7|colorPrimaryText       |The primary text color                                                          |
 | 8|colorAccentText        |The text or tint color for the button/FAB's image source                        |
 | 9|shadow                 |The boolean value to determine if shadow is enabled or not (can only be 1 and 0)|
 |10|colorControlHighlight  |The ripple color                                                                |
 |11|colorHint              |The color for the EditText hint                                                 |
 |12|colorPrimaryTint       |The color for the ActionBar icons or items                                      |
 |13|colorBackgroundTint    |The tint color for images in a root container                                   |
 |14|colorBackgroundCard    |The background color for the card in a root container                           |
 |15|colorBackgroundCardTint|The color tint for an ImageView in a card in a root container                   |
 |16|colorBackgroundCardText|The TextView color in a card inside a container that's in the root container    |
 |17|colorPrimaryCard       |The background color for a card inside an appBar                                |
 |18|colorPrimaryCardTint   |The color tint for an ImageView in a card inside an appBar                      |
 |19|colorPrimaryCardText   |The TextView color in a card that is inside of an appBar                        |
 |20|colorDialog            |The background color for the root dialog container                              |
 |21|colorDialogText        |The text color for TextView(s) that's inside the dialog root container          |
 |22|colorDialogTint        |The tint color for images in a dialog root container                            |


 If you didn't understand the table above, you can use the Theme Editor on nc-thm Theme Manager to determine which colors points to which.

### Branches:
 - master: Current latest and stable version of nc-thm-android.

 Documentation written by [Iyxan23](https://github.com/Iyxan23) and slightly edited by [NiceSapien](https://github.com/NiceSapien)

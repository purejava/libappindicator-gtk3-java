# libappindicator-gtk3-java
![libappindicator-gtk3-java](libappindicator-gtk3-java.svg)

[![License](https://img.shields.io/github/license/purejava/libappindicator-gtk3-java.svg)](https://github.com/purejava/libappindicator-gtk3-java/blob/master/LICENSE)
[![Maven Central](https://img.shields.io/maven-central/v/org.purejava/libappindicator-gtk3-java.svg?label=Maven%20Central)](https://search.maven.org/search?q=g:%22org.purejava%22%20AND%20a:libappindicator-gtk3-java)

Java bindings for libappindicator-gtk3 in 100% pure Java

Based on libappindicator3-1 (12.10.1+20.10.20200706.1-0ubuntu1)

# Requires
Java 19 (preview)
- due to the use of the new Foreign Function & Memory API

# Usage
The bindings come in two flavors:

## Dependency including *all bindings* related to libappindicator:
- gtk-3.0
- glib-2.0
- cairo
- gdk-pixbuf-2.0
- pango-1.0
- atk-1.0
- harfbuzz
```java
<dependency>
    <groupId>org.purejava</groupId>
    <artifactId>libappindicator-gtk3-full-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

As the according jar has a size of ~9,6M, I decided to provide a **reduced variant of the bindings**, see below.
## Dependency for bindings that inlude **the following methods and class**:
- app_indicator_build_menu_from_desktop
- app_indicator_get_category
- app_indicator_get_attention_icon
- app_indicator_get_id
- app_indicator_get_icon
- app_indicator_get_label
- app_indicator_get_menu
- app_indicator_get_ordering_index
- app_indicator_get_status
- app_indicator_get_title
- app_indicator_new
- app_indicator_set_attention_icon
- app_indicator_set_icon
- app_indicator_set_label
- app_indicator_set_menu
- app_indicator_set_ordering_index
- app_indicator_set_status
- app_indicator_set_title
- g_error_free
- g_object_set_data_full
- g_signal_connect_object
- gtk_action_get_name
- gtk_action_group_new
- gtk_action_group_add_action
- gtk_action_group_add_actions
- gtk_container_add
- gtk_init
- gtk_main
- gtk_menu_item_new
- gtk_menu_item_set_label
- gtk_menu_item_set_submenu
- gtk_menu_new
- gtk_menu_shell_append
- gtk_message_dialog_new
- gtk_scrolled_window_new
- gtk_scrolled_window_set_policy
- gtk_scrolled_window_set_shadow_type
- gtk_statusbar_new
- gtk_table_new
- gtk_table_attach
- gtk_text_view_new
- gtk_widget_destroy
- gtk_widget_destroyed
- gtk_widget_grab_focus
- gtk_widget_show
- gtk_widget_show_all
- gtk_window_add_accel_group
- gtk_window_new
- gtk_window_set_default_size
- gtk_window_set_icon
- gtk_window_set_icon_name
- gtk_window_set_title
- gtk_ui_manager_add_ui
- gtk_ui_manager_add_ui_from_string
- gtk_ui_manager_get_accel_group
- gtk_ui_manager_get_widget
- gtk_ui_manager_insert_action_group
- gtk_ui_manager_new
- GCallback
```java
<dependency>
    <groupId>org.purejava</groupId>
    <artifactId>libappindicator-gtk3-minimal-java</artifactId>
    <version>1.0.0-SNAPSHOT</version>
</dependency>
```

# Copyright
Copyright (C) 2023 Ralph Plawetzki

The libappindicator-gtk3-java logo is made from [Icon Fonts](http://www.onlinewebfonts.com/icon) and is licensed by CC BY 3.0

// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
public class app_indicator_h  {

    public static final OfByte C_CHAR = Constants$root.C_CHAR$LAYOUT;
    public static final OfShort C_SHORT = Constants$root.C_SHORT$LAYOUT;
    public static final OfInt C_INT = Constants$root.C_INT$LAYOUT;
    public static final OfLong C_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfLong C_LONG_LONG = Constants$root.C_LONG_LONG$LAYOUT;
    public static final OfFloat C_FLOAT = Constants$root.C_FLOAT$LAYOUT;
    public static final OfDouble C_DOUBLE = Constants$root.C_DOUBLE$LAYOUT;
    public static final OfAddress C_POINTER = Constants$root.C_POINTER$LAYOUT;
    public static int APP_INDICATOR_CATEGORY_APPLICATION_STATUS() {
        return (int)0L;
    }
    public static int APP_INDICATOR_CATEGORY_COMMUNICATIONS() {
        return (int)1L;
    }
    public static int APP_INDICATOR_CATEGORY_SYSTEM_SERVICES() {
        return (int)2L;
    }
    public static int APP_INDICATOR_CATEGORY_HARDWARE() {
        return (int)3L;
    }
    public static int APP_INDICATOR_CATEGORY_OTHER() {
        return (int)4L;
    }
    public static int APP_INDICATOR_STATUS_PASSIVE() {
        return (int)0L;
    }
    public static int APP_INDICATOR_STATUS_ACTIVE() {
        return (int)1L;
    }
    public static int APP_INDICATOR_STATUS_ATTENTION() {
        return (int)2L;
    }
    public static MethodHandle g_error_free$MH() {
        return RuntimeHelper.requireNonNull(constants$0.g_error_free$MH,"g_error_free");
    }
    /**
     * {@snippet :
     * void g_error_free(GError* error);
     * }
     */
    public static void g_error_free(MemorySegment error) {
        var mh$ = g_error_free$MH();
        try {
            mh$.invokeExact(error);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle g_object_set_data_full$MH() {
        return RuntimeHelper.requireNonNull(constants$0.g_object_set_data_full$MH,"g_object_set_data_full");
    }
    /**
     * {@snippet :
     * void g_object_set_data_full(GObject* object, const gchar* key, gpointer data, GDestroyNotify destroy);
     * }
     */
    public static void g_object_set_data_full(MemorySegment object, MemorySegment key, MemorySegment data, MemorySegment destroy) {
        var mh$ = g_object_set_data_full$MH();
        try {
            mh$.invokeExact(object, key, data, destroy);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle g_signal_connect_object$MH() {
        return RuntimeHelper.requireNonNull(constants$0.g_signal_connect_object$MH,"g_signal_connect_object");
    }
    /**
     * {@snippet :
     * gulong g_signal_connect_object(gpointer instance, const gchar* detailed_signal, GCallback c_handler, gpointer gobject, GConnectFlags connect_flags);
     * }
     */
    public static long g_signal_connect_object(MemorySegment instance, MemorySegment detailed_signal, MemorySegment c_handler, MemorySegment gobject, int connect_flags) {
        var mh$ = g_signal_connect_object$MH();
        try {
            return (long)mh$.invokeExact(instance, detailed_signal, c_handler, gobject, connect_flags);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_destroy$MH() {
        return RuntimeHelper.requireNonNull(constants$0.gtk_widget_destroy$MH,"gtk_widget_destroy");
    }
    /**
     * {@snippet :
     * void gtk_widget_destroy(GtkWidget* widget);
     * }
     */
    public static void gtk_widget_destroy(MemorySegment widget) {
        var mh$ = gtk_widget_destroy$MH();
        try {
            mh$.invokeExact(widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_destroyed$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_widget_destroyed$MH,"gtk_widget_destroyed");
    }
    /**
     * {@snippet :
     * void gtk_widget_destroyed(GtkWidget* widget, GtkWidget** widget_pointer);
     * }
     */
    public static void gtk_widget_destroyed(MemorySegment widget, MemorySegment widget_pointer) {
        var mh$ = gtk_widget_destroyed$MH();
        try {
            mh$.invokeExact(widget, widget_pointer);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_show$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_widget_show$MH,"gtk_widget_show");
    }
    /**
     * {@snippet :
     * void gtk_widget_show(GtkWidget* widget);
     * }
     */
    public static void gtk_widget_show(MemorySegment widget) {
        var mh$ = gtk_widget_show$MH();
        try {
            mh$.invokeExact(widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_show_all$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_widget_show_all$MH,"gtk_widget_show_all");
    }
    /**
     * {@snippet :
     * void gtk_widget_show_all(GtkWidget* widget);
     * }
     */
    public static void gtk_widget_show_all(MemorySegment widget) {
        var mh$ = gtk_widget_show_all$MH();
        try {
            mh$.invokeExact(widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_widget_grab_focus$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_widget_grab_focus$MH,"gtk_widget_grab_focus");
    }
    /**
     * {@snippet :
     * void gtk_widget_grab_focus(GtkWidget* widget);
     * }
     */
    public static void gtk_widget_grab_focus(MemorySegment widget) {
        var mh$ = gtk_widget_grab_focus$MH();
        try {
            mh$.invokeExact(widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_container_add$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_container_add$MH,"gtk_container_add");
    }
    /**
     * {@snippet :
     * void gtk_container_add(GtkContainer* container, GtkWidget* widget);
     * }
     */
    public static void gtk_container_add(MemorySegment container, MemorySegment widget) {
        var mh$ = gtk_container_add$MH();
        try {
            mh$.invokeExact(container, widget);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_window_new$MH() {
        return RuntimeHelper.requireNonNull(constants$1.gtk_window_new$MH,"gtk_window_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_window_new(GtkWindowType type);
     * }
     */
    public static MemorySegment gtk_window_new(int type) {
        var mh$ = gtk_window_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_window_set_title$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_window_set_title$MH,"gtk_window_set_title");
    }
    /**
     * {@snippet :
     * void gtk_window_set_title(GtkWindow* window, const gchar* title);
     * }
     */
    public static void gtk_window_set_title(MemorySegment window, MemorySegment title) {
        var mh$ = gtk_window_set_title$MH();
        try {
            mh$.invokeExact(window, title);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_window_add_accel_group$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_window_add_accel_group$MH,"gtk_window_add_accel_group");
    }
    /**
     * {@snippet :
     * void gtk_window_add_accel_group(GtkWindow* window, GtkAccelGroup* accel_group);
     * }
     */
    public static void gtk_window_add_accel_group(MemorySegment window, MemorySegment accel_group) {
        var mh$ = gtk_window_add_accel_group$MH();
        try {
            mh$.invokeExact(window, accel_group);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_window_set_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_window_set_icon$MH,"gtk_window_set_icon");
    }
    /**
     * {@snippet :
     * void gtk_window_set_icon(GtkWindow* window, GdkPixbuf* icon);
     * }
     */
    public static void gtk_window_set_icon(MemorySegment window, MemorySegment icon) {
        var mh$ = gtk_window_set_icon$MH();
        try {
            mh$.invokeExact(window, icon);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_window_set_icon_name$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_window_set_icon_name$MH,"gtk_window_set_icon_name");
    }
    /**
     * {@snippet :
     * void gtk_window_set_icon_name(GtkWindow* window, const gchar* name);
     * }
     */
    public static void gtk_window_set_icon_name(MemorySegment window, MemorySegment name) {
        var mh$ = gtk_window_set_icon_name$MH();
        try {
            mh$.invokeExact(window, name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_window_set_default_size$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_window_set_default_size$MH,"gtk_window_set_default_size");
    }
    /**
     * {@snippet :
     * void gtk_window_set_default_size(GtkWindow* window, gint width, gint height);
     * }
     */
    public static void gtk_window_set_default_size(MemorySegment window, int width, int height) {
        var mh$ = gtk_window_set_default_size$MH();
        try {
            mh$.invokeExact(window, width, height);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_shell_append$MH() {
        return RuntimeHelper.requireNonNull(constants$2.gtk_menu_shell_append$MH,"gtk_menu_shell_append");
    }
    /**
     * {@snippet :
     * void gtk_menu_shell_append(GtkMenuShell* menu_shell, GtkWidget* child);
     * }
     */
    public static void gtk_menu_shell_append(MemorySegment menu_shell, MemorySegment child) {
        var mh$ = gtk_menu_shell_append$MH();
        try {
            mh$.invokeExact(menu_shell, child);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_new$MH() {
        return RuntimeHelper.requireNonNull(constants$3.gtk_menu_new$MH,"gtk_menu_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_menu_new();
     * }
     */
    public static MemorySegment gtk_menu_new() {
        var mh$ = gtk_menu_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_item_new$MH() {
        return RuntimeHelper.requireNonNull(constants$3.gtk_menu_item_new$MH,"gtk_menu_item_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_menu_item_new();
     * }
     */
    public static MemorySegment gtk_menu_item_new() {
        var mh$ = gtk_menu_item_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_item_set_submenu$MH() {
        return RuntimeHelper.requireNonNull(constants$3.gtk_menu_item_set_submenu$MH,"gtk_menu_item_set_submenu");
    }
    /**
     * {@snippet :
     * void gtk_menu_item_set_submenu(GtkMenuItem* menu_item, GtkWidget* submenu);
     * }
     */
    public static void gtk_menu_item_set_submenu(MemorySegment menu_item, MemorySegment submenu) {
        var mh$ = gtk_menu_item_set_submenu$MH();
        try {
            mh$.invokeExact(menu_item, submenu);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_menu_item_set_label$MH() {
        return RuntimeHelper.requireNonNull(constants$3.gtk_menu_item_set_label$MH,"gtk_menu_item_set_label");
    }
    /**
     * {@snippet :
     * void gtk_menu_item_set_label(GtkMenuItem* menu_item, const gchar* label);
     * }
     */
    public static void gtk_menu_item_set_label(MemorySegment menu_item, MemorySegment label) {
        var mh$ = gtk_menu_item_set_label$MH();
        try {
            mh$.invokeExact(menu_item, label);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_init$MH() {
        return RuntimeHelper.requireNonNull(constants$3.gtk_init$MH,"gtk_init");
    }
    /**
     * {@snippet :
     * void gtk_init(int* argc, char*** argv);
     * }
     */
    public static void gtk_init(MemorySegment argc, MemorySegment argv) {
        var mh$ = gtk_init$MH();
        try {
            mh$.invokeExact(argc, argv);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_main$MH() {
        return RuntimeHelper.requireNonNull(constants$3.gtk_main$MH,"gtk_main");
    }
    /**
     * {@snippet :
     * void gtk_main();
     * }
     */
    public static void gtk_main() {
        var mh$ = gtk_main$MH();
        try {
            mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_message_dialog_new$MH() {
        return RuntimeHelper.requireNonNull(constants$4.gtk_message_dialog_new$MH,"gtk_message_dialog_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_message_dialog_new(GtkWindow* parent, GtkDialogFlags flags, GtkMessageType type, GtkButtonsType buttons, const gchar* message_format,...);
     * }
     */
    public static MemorySegment gtk_message_dialog_new(MemorySegment parent, int flags, int type, int buttons, MemorySegment message_format, Object... x5) {
        var mh$ = gtk_message_dialog_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(parent, flags, type, buttons, message_format, x5);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_scrolled_window_new$MH() {
        return RuntimeHelper.requireNonNull(constants$4.gtk_scrolled_window_new$MH,"gtk_scrolled_window_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_scrolled_window_new(GtkAdjustment* hadjustment, GtkAdjustment* vadjustment);
     * }
     */
    public static MemorySegment gtk_scrolled_window_new(MemorySegment hadjustment, MemorySegment vadjustment) {
        var mh$ = gtk_scrolled_window_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(hadjustment, vadjustment);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_scrolled_window_set_policy$MH() {
        return RuntimeHelper.requireNonNull(constants$4.gtk_scrolled_window_set_policy$MH,"gtk_scrolled_window_set_policy");
    }
    /**
     * {@snippet :
     * void gtk_scrolled_window_set_policy(GtkScrolledWindow* scrolled_window, GtkPolicyType hscrollbar_policy, GtkPolicyType vscrollbar_policy);
     * }
     */
    public static void gtk_scrolled_window_set_policy(MemorySegment scrolled_window, int hscrollbar_policy, int vscrollbar_policy) {
        var mh$ = gtk_scrolled_window_set_policy$MH();
        try {
            mh$.invokeExact(scrolled_window, hscrollbar_policy, vscrollbar_policy);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_scrolled_window_set_shadow_type$MH() {
        return RuntimeHelper.requireNonNull(constants$4.gtk_scrolled_window_set_shadow_type$MH,"gtk_scrolled_window_set_shadow_type");
    }
    /**
     * {@snippet :
     * void gtk_scrolled_window_set_shadow_type(GtkScrolledWindow* scrolled_window, GtkShadowType type);
     * }
     */
    public static void gtk_scrolled_window_set_shadow_type(MemorySegment scrolled_window, int type) {
        var mh$ = gtk_scrolled_window_set_shadow_type$MH();
        try {
            mh$.invokeExact(scrolled_window, type);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_statusbar_new$MH() {
        return RuntimeHelper.requireNonNull(constants$4.gtk_statusbar_new$MH,"gtk_statusbar_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_statusbar_new();
     * }
     */
    public static MemorySegment gtk_statusbar_new() {
        var mh$ = gtk_statusbar_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_text_view_new$MH() {
        return RuntimeHelper.requireNonNull(constants$4.gtk_text_view_new$MH,"gtk_text_view_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_text_view_new();
     * }
     */
    public static MemorySegment gtk_text_view_new() {
        var mh$ = gtk_text_view_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_action_get_name$MH() {
        return RuntimeHelper.requireNonNull(constants$5.gtk_action_get_name$MH,"gtk_action_get_name");
    }
    /**
     * {@snippet :
     * const gchar* gtk_action_get_name(GtkAction* action);
     * }
     */
    public static MemorySegment gtk_action_get_name(MemorySegment action) {
        var mh$ = gtk_action_get_name$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(action);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_action_group_new$MH() {
        return RuntimeHelper.requireNonNull(constants$5.gtk_action_group_new$MH,"gtk_action_group_new");
    }
    /**
     * {@snippet :
     * GtkActionGroup* gtk_action_group_new(const gchar* name);
     * }
     */
    public static MemorySegment gtk_action_group_new(MemorySegment name) {
        var mh$ = gtk_action_group_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_action_group_add_action$MH() {
        return RuntimeHelper.requireNonNull(constants$5.gtk_action_group_add_action$MH,"gtk_action_group_add_action");
    }
    /**
     * {@snippet :
     * void gtk_action_group_add_action(GtkActionGroup* action_group, GtkAction* action);
     * }
     */
    public static void gtk_action_group_add_action(MemorySegment action_group, MemorySegment action) {
        var mh$ = gtk_action_group_add_action$MH();
        try {
            mh$.invokeExact(action_group, action);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_action_group_add_actions$MH() {
        return RuntimeHelper.requireNonNull(constants$5.gtk_action_group_add_actions$MH,"gtk_action_group_add_actions");
    }
    /**
     * {@snippet :
     * void gtk_action_group_add_actions(GtkActionGroup* action_group, const GtkActionEntry* entries, guint n_entries, gpointer user_data);
     * }
     */
    public static void gtk_action_group_add_actions(MemorySegment action_group, MemorySegment entries, int n_entries, MemorySegment user_data) {
        var mh$ = gtk_action_group_add_actions$MH();
        try {
            mh$.invokeExact(action_group, entries, n_entries, user_data);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_table_new$MH() {
        return RuntimeHelper.requireNonNull(constants$5.gtk_table_new$MH,"gtk_table_new");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_table_new(guint rows, guint columns, gboolean homogeneous);
     * }
     */
    public static MemorySegment gtk_table_new(int rows, int columns, int homogeneous) {
        var mh$ = gtk_table_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(rows, columns, homogeneous);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_table_attach$MH() {
        return RuntimeHelper.requireNonNull(constants$5.gtk_table_attach$MH,"gtk_table_attach");
    }
    /**
     * {@snippet :
     * void gtk_table_attach(GtkTable* table, GtkWidget* child, guint left_attach, guint right_attach, guint top_attach, guint bottom_attach, GtkAttachOptions xoptions, GtkAttachOptions yoptions, guint xpadding, guint ypadding);
     * }
     */
    public static void gtk_table_attach(MemorySegment table, MemorySegment child, int left_attach, int right_attach, int top_attach, int bottom_attach, int xoptions, int yoptions, int xpadding, int ypadding) {
        var mh$ = gtk_table_attach$MH();
        try {
            mh$.invokeExact(table, child, left_attach, right_attach, top_attach, bottom_attach, xoptions, yoptions, xpadding, ypadding);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_ui_manager_new$MH() {
        return RuntimeHelper.requireNonNull(constants$6.gtk_ui_manager_new$MH,"gtk_ui_manager_new");
    }
    /**
     * {@snippet :
     * GtkUIManager* gtk_ui_manager_new();
     * }
     */
    public static MemorySegment gtk_ui_manager_new() {
        var mh$ = gtk_ui_manager_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact();
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_ui_manager_insert_action_group$MH() {
        return RuntimeHelper.requireNonNull(constants$6.gtk_ui_manager_insert_action_group$MH,"gtk_ui_manager_insert_action_group");
    }
    /**
     * {@snippet :
     * void gtk_ui_manager_insert_action_group(GtkUIManager* manager, GtkActionGroup* action_group, gint pos);
     * }
     */
    public static void gtk_ui_manager_insert_action_group(MemorySegment manager, MemorySegment action_group, int pos) {
        var mh$ = gtk_ui_manager_insert_action_group$MH();
        try {
            mh$.invokeExact(manager, action_group, pos);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_ui_manager_get_accel_group$MH() {
        return RuntimeHelper.requireNonNull(constants$6.gtk_ui_manager_get_accel_group$MH,"gtk_ui_manager_get_accel_group");
    }
    /**
     * {@snippet :
     * GtkAccelGroup* gtk_ui_manager_get_accel_group(GtkUIManager* manager);
     * }
     */
    public static MemorySegment gtk_ui_manager_get_accel_group(MemorySegment manager) {
        var mh$ = gtk_ui_manager_get_accel_group$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(manager);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_ui_manager_get_widget$MH() {
        return RuntimeHelper.requireNonNull(constants$6.gtk_ui_manager_get_widget$MH,"gtk_ui_manager_get_widget");
    }
    /**
     * {@snippet :
     * GtkWidget* gtk_ui_manager_get_widget(GtkUIManager* manager, const gchar* path);
     * }
     */
    public static MemorySegment gtk_ui_manager_get_widget(MemorySegment manager, MemorySegment path) {
        var mh$ = gtk_ui_manager_get_widget$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(manager, path);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_ui_manager_add_ui_from_string$MH() {
        return RuntimeHelper.requireNonNull(constants$6.gtk_ui_manager_add_ui_from_string$MH,"gtk_ui_manager_add_ui_from_string");
    }
    /**
     * {@snippet :
     * guint gtk_ui_manager_add_ui_from_string(GtkUIManager* manager, const gchar* buffer, gssize length, GError** error);
     * }
     */
    public static int gtk_ui_manager_add_ui_from_string(MemorySegment manager, MemorySegment buffer, long length, MemorySegment error) {
        var mh$ = gtk_ui_manager_add_ui_from_string$MH();
        try {
            return (int)mh$.invokeExact(manager, buffer, length, error);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle gtk_ui_manager_add_ui$MH() {
        return RuntimeHelper.requireNonNull(constants$6.gtk_ui_manager_add_ui$MH,"gtk_ui_manager_add_ui");
    }
    /**
     * {@snippet :
     * void gtk_ui_manager_add_ui(GtkUIManager* manager, guint merge_id, const gchar* path, const gchar* name, const gchar* action, GtkUIManagerItemType type, gboolean top);
     * }
     */
    public static void gtk_ui_manager_add_ui(MemorySegment manager, int merge_id, MemorySegment path, MemorySegment name, MemorySegment action, int type, int top) {
        var mh$ = gtk_ui_manager_add_ui$MH();
        try {
            mh$.invokeExact(manager, merge_id, path, name, action, type, top);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_new$MH() {
        return RuntimeHelper.requireNonNull(constants$7.app_indicator_new$MH,"app_indicator_new");
    }
    /**
     * {@snippet :
     * AppIndicator* app_indicator_new(const gchar* id, const gchar* icon_name, AppIndicatorCategory category);
     * }
     */
    public static MemorySegment app_indicator_new(MemorySegment id, MemorySegment icon_name, int category) {
        var mh$ = app_indicator_new$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(id, icon_name, category);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_status$MH() {
        return RuntimeHelper.requireNonNull(constants$7.app_indicator_set_status$MH,"app_indicator_set_status");
    }
    /**
     * {@snippet :
     * void app_indicator_set_status(AppIndicator* self, AppIndicatorStatus status);
     * }
     */
    public static void app_indicator_set_status(MemorySegment self, int status) {
        var mh$ = app_indicator_set_status$MH();
        try {
            mh$.invokeExact(self, status);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_attention_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$7.app_indicator_set_attention_icon$MH,"app_indicator_set_attention_icon");
    }
    /**
     * {@snippet :
     * void app_indicator_set_attention_icon(AppIndicator* self, const gchar* icon_name);
     * }
     */
    public static void app_indicator_set_attention_icon(MemorySegment self, MemorySegment icon_name) {
        var mh$ = app_indicator_set_attention_icon$MH();
        try {
            mh$.invokeExact(self, icon_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_menu$MH() {
        return RuntimeHelper.requireNonNull(constants$7.app_indicator_set_menu$MH,"app_indicator_set_menu");
    }
    /**
     * {@snippet :
     * void app_indicator_set_menu(AppIndicator* self, GtkMenu* menu);
     * }
     */
    public static void app_indicator_set_menu(MemorySegment self, MemorySegment menu) {
        var mh$ = app_indicator_set_menu$MH();
        try {
            mh$.invokeExact(self, menu);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$7.app_indicator_set_icon$MH,"app_indicator_set_icon");
    }
    /**
     * {@snippet :
     * void app_indicator_set_icon(AppIndicator* self, const gchar* icon_name);
     * }
     */
    public static void app_indicator_set_icon(MemorySegment self, MemorySegment icon_name) {
        var mh$ = app_indicator_set_icon$MH();
        try {
            mh$.invokeExact(self, icon_name);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_label$MH() {
        return RuntimeHelper.requireNonNull(constants$7.app_indicator_set_label$MH,"app_indicator_set_label");
    }
    /**
     * {@snippet :
     * void app_indicator_set_label(AppIndicator* self, const gchar* label, const gchar* guide);
     * }
     */
    public static void app_indicator_set_label(MemorySegment self, MemorySegment label, MemorySegment guide) {
        var mh$ = app_indicator_set_label$MH();
        try {
            mh$.invokeExact(self, label, guide);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_ordering_index$MH() {
        return RuntimeHelper.requireNonNull(constants$8.app_indicator_set_ordering_index$MH,"app_indicator_set_ordering_index");
    }
    /**
     * {@snippet :
     * void app_indicator_set_ordering_index(AppIndicator* self, guint32 ordering_index);
     * }
     */
    public static void app_indicator_set_ordering_index(MemorySegment self, int ordering_index) {
        var mh$ = app_indicator_set_ordering_index$MH();
        try {
            mh$.invokeExact(self, ordering_index);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_set_title$MH() {
        return RuntimeHelper.requireNonNull(constants$8.app_indicator_set_title$MH,"app_indicator_set_title");
    }
    /**
     * {@snippet :
     * void app_indicator_set_title(AppIndicator* self, const gchar* title);
     * }
     */
    public static void app_indicator_set_title(MemorySegment self, MemorySegment title) {
        var mh$ = app_indicator_set_title$MH();
        try {
            mh$.invokeExact(self, title);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_id$MH() {
        return RuntimeHelper.requireNonNull(constants$8.app_indicator_get_id$MH,"app_indicator_get_id");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_id(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_id(MemorySegment self) {
        var mh$ = app_indicator_get_id$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_category$MH() {
        return RuntimeHelper.requireNonNull(constants$8.app_indicator_get_category$MH,"app_indicator_get_category");
    }
    /**
     * {@snippet :
     * AppIndicatorCategory app_indicator_get_category(AppIndicator* self);
     * }
     */
    public static int app_indicator_get_category(MemorySegment self) {
        var mh$ = app_indicator_get_category$MH();
        try {
            return (int)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_status$MH() {
        return RuntimeHelper.requireNonNull(constants$8.app_indicator_get_status$MH,"app_indicator_get_status");
    }
    /**
     * {@snippet :
     * AppIndicatorStatus app_indicator_get_status(AppIndicator* self);
     * }
     */
    public static int app_indicator_get_status(MemorySegment self) {
        var mh$ = app_indicator_get_status$MH();
        try {
            return (int)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$8.app_indicator_get_icon$MH,"app_indicator_get_icon");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_icon(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_icon(MemorySegment self) {
        var mh$ = app_indicator_get_icon$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_attention_icon$MH() {
        return RuntimeHelper.requireNonNull(constants$9.app_indicator_get_attention_icon$MH,"app_indicator_get_attention_icon");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_attention_icon(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_attention_icon(MemorySegment self) {
        var mh$ = app_indicator_get_attention_icon$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_title$MH() {
        return RuntimeHelper.requireNonNull(constants$9.app_indicator_get_title$MH,"app_indicator_get_title");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_title(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_title(MemorySegment self) {
        var mh$ = app_indicator_get_title$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_menu$MH() {
        return RuntimeHelper.requireNonNull(constants$9.app_indicator_get_menu$MH,"app_indicator_get_menu");
    }
    /**
     * {@snippet :
     * GtkMenu* app_indicator_get_menu(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_menu(MemorySegment self) {
        var mh$ = app_indicator_get_menu$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_label$MH() {
        return RuntimeHelper.requireNonNull(constants$9.app_indicator_get_label$MH,"app_indicator_get_label");
    }
    /**
     * {@snippet :
     * const gchar* app_indicator_get_label(AppIndicator* self);
     * }
     */
    public static MemorySegment app_indicator_get_label(MemorySegment self) {
        var mh$ = app_indicator_get_label$MH();
        try {
            return (java.lang.foreign.MemorySegment)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_get_ordering_index$MH() {
        return RuntimeHelper.requireNonNull(constants$9.app_indicator_get_ordering_index$MH,"app_indicator_get_ordering_index");
    }
    /**
     * {@snippet :
     * guint32 app_indicator_get_ordering_index(AppIndicator* self);
     * }
     */
    public static int app_indicator_get_ordering_index(MemorySegment self) {
        var mh$ = app_indicator_get_ordering_index$MH();
        try {
            return (int)mh$.invokeExact(self);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
    public static MethodHandle app_indicator_build_menu_from_desktop$MH() {
        return RuntimeHelper.requireNonNull(constants$9.app_indicator_build_menu_from_desktop$MH,"app_indicator_build_menu_from_desktop");
    }
    /**
     * {@snippet :
     * void app_indicator_build_menu_from_desktop(AppIndicator* self, const gchar* desktop_file, const gchar* desktop_profile);
     * }
     */
    public static void app_indicator_build_menu_from_desktop(MemorySegment self, MemorySegment desktop_file, MemorySegment desktop_profile) {
        var mh$ = app_indicator_build_menu_from_desktop$MH();
        try {
            mh$.invokeExact(self, desktop_file, desktop_profile);
        } catch (Throwable ex$) {
            throw new AssertionError("should not reach here", ex$);
        }
    }
}


// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$971 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$971() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_emblemed_icon_new",
        constants$5.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_emblemed_icon_get_icon",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_emblemed_icon_get_emblems",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_emblemed_icon_add_emblem",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_emblemed_icon_clear_emblems",
        constants$13.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("g_iface"),
        RuntimeHelper.POINTER.withName("dup"),
        RuntimeHelper.POINTER.withName("hash"),
        RuntimeHelper.POINTER.withName("equal"),
        RuntimeHelper.POINTER.withName("is_native"),
        RuntimeHelper.POINTER.withName("has_uri_scheme"),
        RuntimeHelper.POINTER.withName("get_uri_scheme"),
        RuntimeHelper.POINTER.withName("get_basename"),
        RuntimeHelper.POINTER.withName("get_path"),
        RuntimeHelper.POINTER.withName("get_uri"),
        RuntimeHelper.POINTER.withName("get_parse_name"),
        RuntimeHelper.POINTER.withName("get_parent"),
        RuntimeHelper.POINTER.withName("prefix_matches"),
        RuntimeHelper.POINTER.withName("get_relative_path"),
        RuntimeHelper.POINTER.withName("resolve_relative_path"),
        RuntimeHelper.POINTER.withName("get_child_for_display_name"),
        RuntimeHelper.POINTER.withName("enumerate_children"),
        RuntimeHelper.POINTER.withName("enumerate_children_async"),
        RuntimeHelper.POINTER.withName("enumerate_children_finish"),
        RuntimeHelper.POINTER.withName("query_info"),
        RuntimeHelper.POINTER.withName("query_info_async"),
        RuntimeHelper.POINTER.withName("query_info_finish"),
        RuntimeHelper.POINTER.withName("query_filesystem_info"),
        RuntimeHelper.POINTER.withName("query_filesystem_info_async"),
        RuntimeHelper.POINTER.withName("query_filesystem_info_finish"),
        RuntimeHelper.POINTER.withName("find_enclosing_mount"),
        RuntimeHelper.POINTER.withName("find_enclosing_mount_async"),
        RuntimeHelper.POINTER.withName("find_enclosing_mount_finish"),
        RuntimeHelper.POINTER.withName("set_display_name"),
        RuntimeHelper.POINTER.withName("set_display_name_async"),
        RuntimeHelper.POINTER.withName("set_display_name_finish"),
        RuntimeHelper.POINTER.withName("query_settable_attributes"),
        RuntimeHelper.POINTER.withName("_query_settable_attributes_async"),
        RuntimeHelper.POINTER.withName("_query_settable_attributes_finish"),
        RuntimeHelper.POINTER.withName("query_writable_namespaces"),
        RuntimeHelper.POINTER.withName("_query_writable_namespaces_async"),
        RuntimeHelper.POINTER.withName("_query_writable_namespaces_finish"),
        RuntimeHelper.POINTER.withName("set_attribute"),
        RuntimeHelper.POINTER.withName("set_attributes_from_info"),
        RuntimeHelper.POINTER.withName("set_attributes_async"),
        RuntimeHelper.POINTER.withName("set_attributes_finish"),
        RuntimeHelper.POINTER.withName("read_fn"),
        RuntimeHelper.POINTER.withName("read_async"),
        RuntimeHelper.POINTER.withName("read_finish"),
        RuntimeHelper.POINTER.withName("append_to"),
        RuntimeHelper.POINTER.withName("append_to_async"),
        RuntimeHelper.POINTER.withName("append_to_finish"),
        RuntimeHelper.POINTER.withName("create"),
        RuntimeHelper.POINTER.withName("create_async"),
        RuntimeHelper.POINTER.withName("create_finish"),
        RuntimeHelper.POINTER.withName("replace"),
        RuntimeHelper.POINTER.withName("replace_async"),
        RuntimeHelper.POINTER.withName("replace_finish"),
        RuntimeHelper.POINTER.withName("delete_file"),
        RuntimeHelper.POINTER.withName("delete_file_async"),
        RuntimeHelper.POINTER.withName("delete_file_finish"),
        RuntimeHelper.POINTER.withName("trash"),
        RuntimeHelper.POINTER.withName("trash_async"),
        RuntimeHelper.POINTER.withName("trash_finish"),
        RuntimeHelper.POINTER.withName("make_directory"),
        RuntimeHelper.POINTER.withName("make_directory_async"),
        RuntimeHelper.POINTER.withName("make_directory_finish"),
        RuntimeHelper.POINTER.withName("make_symbolic_link"),
        RuntimeHelper.POINTER.withName("make_symbolic_link_async"),
        RuntimeHelper.POINTER.withName("make_symbolic_link_finish"),
        RuntimeHelper.POINTER.withName("copy"),
        RuntimeHelper.POINTER.withName("copy_async"),
        RuntimeHelper.POINTER.withName("copy_finish"),
        RuntimeHelper.POINTER.withName("move"),
        RuntimeHelper.POINTER.withName("move_async"),
        RuntimeHelper.POINTER.withName("move_finish"),
        RuntimeHelper.POINTER.withName("mount_mountable"),
        RuntimeHelper.POINTER.withName("mount_mountable_finish"),
        RuntimeHelper.POINTER.withName("unmount_mountable"),
        RuntimeHelper.POINTER.withName("unmount_mountable_finish"),
        RuntimeHelper.POINTER.withName("eject_mountable"),
        RuntimeHelper.POINTER.withName("eject_mountable_finish"),
        RuntimeHelper.POINTER.withName("mount_enclosing_volume"),
        RuntimeHelper.POINTER.withName("mount_enclosing_volume_finish"),
        RuntimeHelper.POINTER.withName("monitor_dir"),
        RuntimeHelper.POINTER.withName("monitor_file"),
        RuntimeHelper.POINTER.withName("open_readwrite"),
        RuntimeHelper.POINTER.withName("open_readwrite_async"),
        RuntimeHelper.POINTER.withName("open_readwrite_finish"),
        RuntimeHelper.POINTER.withName("create_readwrite"),
        RuntimeHelper.POINTER.withName("create_readwrite_async"),
        RuntimeHelper.POINTER.withName("create_readwrite_finish"),
        RuntimeHelper.POINTER.withName("replace_readwrite"),
        RuntimeHelper.POINTER.withName("replace_readwrite_async"),
        RuntimeHelper.POINTER.withName("replace_readwrite_finish"),
        RuntimeHelper.POINTER.withName("start_mountable"),
        RuntimeHelper.POINTER.withName("start_mountable_finish"),
        RuntimeHelper.POINTER.withName("stop_mountable"),
        RuntimeHelper.POINTER.withName("stop_mountable_finish"),
        JAVA_INT.withName("supports_thread_contexts"),
        MemoryLayout.paddingLayout(4),
        RuntimeHelper.POINTER.withName("unmount_mountable_with_operation"),
        RuntimeHelper.POINTER.withName("unmount_mountable_with_operation_finish"),
        RuntimeHelper.POINTER.withName("eject_mountable_with_operation"),
        RuntimeHelper.POINTER.withName("eject_mountable_with_operation_finish"),
        RuntimeHelper.POINTER.withName("poll_mountable"),
        RuntimeHelper.POINTER.withName("poll_mountable_finish"),
        RuntimeHelper.POINTER.withName("measure_disk_usage"),
        RuntimeHelper.POINTER.withName("measure_disk_usage_async"),
        RuntimeHelper.POINTER.withName("measure_disk_usage_finish")
    ).withName("_GFileIface");
}



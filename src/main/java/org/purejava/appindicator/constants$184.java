// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$184 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$184() {}
    static final StructLayout g_timeout_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_timeout_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_timeout_funcs", constants$184.g_timeout_funcs$LAYOUT);
    static final StructLayout g_child_watch_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_child_watch_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_child_watch_funcs", constants$184.g_child_watch_funcs$LAYOUT);
    static final StructLayout g_idle_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_idle_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_idle_funcs", constants$184.g_idle_funcs$LAYOUT);
    static final StructLayout g_unix_signal_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_unix_signal_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_unix_signal_funcs", constants$184.g_unix_signal_funcs$LAYOUT);
    static final StructLayout g_unix_fd_source_funcs$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_POINTER$LAYOUT.withName("prepare"),
        Constants$root.C_POINTER$LAYOUT.withName("check"),
        Constants$root.C_POINTER$LAYOUT.withName("dispatch"),
        Constants$root.C_POINTER$LAYOUT.withName("finalize"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_callback"),
        Constants$root.C_POINTER$LAYOUT.withName("closure_marshal")
    ).withName("_GSourceFuncs");
    static final MemorySegment g_unix_fd_source_funcs$SEGMENT = RuntimeHelper.lookupGlobalVariable("g_unix_fd_source_funcs", constants$184.g_unix_fd_source_funcs$LAYOUT);
    static final FunctionDescriptor g_unicode_script_to_iso15924$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_unicode_script_to_iso15924$MH = RuntimeHelper.downcallHandle(
        "g_unicode_script_to_iso15924",
        constants$184.g_unicode_script_to_iso15924$FUNC
    );
}


// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$342 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$342() {}
    static final OfInt glib_major_version$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_major_version$VH = constants$342.glib_major_version$LAYOUT.varHandle();
    static final MemorySegment glib_major_version$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_major_version", constants$342.glib_major_version$LAYOUT);
    static final OfInt glib_minor_version$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_minor_version$VH = constants$342.glib_minor_version$LAYOUT.varHandle();
    static final MemorySegment glib_minor_version$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_minor_version", constants$342.glib_minor_version$LAYOUT);
    static final OfInt glib_micro_version$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_micro_version$VH = constants$342.glib_micro_version$LAYOUT.varHandle();
    static final MemorySegment glib_micro_version$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_micro_version", constants$342.glib_micro_version$LAYOUT);
    static final OfInt glib_interface_age$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_interface_age$VH = constants$342.glib_interface_age$LAYOUT.varHandle();
    static final MemorySegment glib_interface_age$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_interface_age", constants$342.glib_interface_age$LAYOUT);
    static final OfInt glib_binary_age$LAYOUT = Constants$root.C_INT$LAYOUT;
    static final VarHandle glib_binary_age$VH = constants$342.glib_binary_age$LAYOUT.varHandle();
    static final MemorySegment glib_binary_age$SEGMENT = RuntimeHelper.lookupGlobalVariable("glib_binary_age", constants$342.glib_binary_age$LAYOUT);
    static final FunctionDescriptor glib_check_version$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle glib_check_version$MH = RuntimeHelper.downcallHandle(
        "glib_check_version",
        constants$342.glib_check_version$FUNC
    );
}


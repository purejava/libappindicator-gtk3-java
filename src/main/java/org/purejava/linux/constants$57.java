// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$57 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$57() {}
    static final FunctionDescriptor mkdtemp$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle mkdtemp$MH = RuntimeHelper.downcallHandle(
        "mkdtemp",
        constants$57.mkdtemp$FUNC
    );
    static final FunctionDescriptor system$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle system$MH = RuntimeHelper.downcallHandle(
        "system",
        constants$57.system$FUNC
    );
    static final FunctionDescriptor realpath$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle realpath$MH = RuntimeHelper.downcallHandle(
        "realpath",
        constants$57.realpath$FUNC
    );
    static final FunctionDescriptor __compar_fn_t$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor __compar_fn_t_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __compar_fn_t_UP$MH = RuntimeHelper.upcallHandle(__compar_fn_t.class, "apply", constants$57.__compar_fn_t_UP$FUNC);
    static final FunctionDescriptor __compar_fn_t_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __compar_fn_t_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$57.__compar_fn_t_DOWN$FUNC
    );
    static final FunctionDescriptor bsearch$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle bsearch$MH = RuntimeHelper.downcallHandle(
        "bsearch",
        constants$57.bsearch$FUNC
    );
}


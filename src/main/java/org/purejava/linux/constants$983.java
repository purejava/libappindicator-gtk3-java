// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$983 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$983() {}
    static final FunctionDescriptor vfscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vfscanf$MH = RuntimeHelper.downcallHandle(
        "vfscanf",
        constants$983.vfscanf$FUNC
    );
    static final FunctionDescriptor vscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vscanf$MH = RuntimeHelper.downcallHandle(
        "vscanf",
        constants$983.vscanf$FUNC
    );
    static final FunctionDescriptor vsscanf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle vsscanf$MH = RuntimeHelper.downcallHandle(
        "vsscanf",
        constants$983.vsscanf$FUNC
    );
    static final FunctionDescriptor fgetc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fgetc$MH = RuntimeHelper.downcallHandle(
        "fgetc",
        constants$983.fgetc$FUNC
    );
    static final FunctionDescriptor getc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getc$MH = RuntimeHelper.downcallHandle(
        "getc",
        constants$983.getc$FUNC
    );
    static final FunctionDescriptor getchar$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle getchar$MH = RuntimeHelper.downcallHandle(
        "getchar",
        constants$983.getchar$FUNC
    );
}


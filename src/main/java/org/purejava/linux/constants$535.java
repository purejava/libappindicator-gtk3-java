// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$535 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$535() {}
    static final FunctionDescriptor getusershell$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle getusershell$MH = RuntimeHelper.downcallHandle(
        "getusershell",
        constants$535.getusershell$FUNC
    );
    static final FunctionDescriptor endusershell$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle endusershell$MH = RuntimeHelper.downcallHandle(
        "endusershell",
        constants$535.endusershell$FUNC
    );
    static final FunctionDescriptor setusershell$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle setusershell$MH = RuntimeHelper.downcallHandle(
        "setusershell",
        constants$535.setusershell$FUNC
    );
    static final FunctionDescriptor daemon$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle daemon$MH = RuntimeHelper.downcallHandle(
        "daemon",
        constants$535.daemon$FUNC
    );
    static final FunctionDescriptor chroot$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle chroot$MH = RuntimeHelper.downcallHandle(
        "chroot",
        constants$535.chroot$FUNC
    );
    static final FunctionDescriptor getpass$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getpass$MH = RuntimeHelper.downcallHandle(
        "getpass",
        constants$535.getpass$FUNC
    );
}


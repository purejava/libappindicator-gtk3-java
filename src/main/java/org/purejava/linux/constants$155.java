// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$155 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$155() {}
    static final FunctionDescriptor GHookMarshaller_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookMarshaller_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$155.GHookMarshaller_DOWN$FUNC
    );
    static final FunctionDescriptor GHookCheckMarshaller$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookCheckMarshaller_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckMarshaller_UP$MH = RuntimeHelper.upcallHandle(GHookCheckMarshaller.class, "apply", constants$155.GHookCheckMarshaller_UP$FUNC);
    static final FunctionDescriptor GHookCheckMarshaller_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckMarshaller_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$155.GHookCheckMarshaller_DOWN$FUNC
    );
    static final FunctionDescriptor GHookFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFunc_UP$MH = RuntimeHelper.upcallHandle(GHookFunc.class, "apply", constants$155.GHookFunc_UP$FUNC);
    static final FunctionDescriptor GHookFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$155.GHookFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GHookCheckFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GHookCheckFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GHookCheckFunc_UP$MH = RuntimeHelper.upcallHandle(GHookCheckFunc.class, "apply", constants$155.GHookCheckFunc_UP$FUNC);
}


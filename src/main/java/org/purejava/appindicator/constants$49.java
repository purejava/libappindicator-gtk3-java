// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$49 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$49() {}
    static final FunctionDescriptor nrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle nrand48$MH = RuntimeHelper.downcallHandle(
        "nrand48",
        constants$49.nrand48$FUNC
    );
    static final FunctionDescriptor mrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle mrand48$MH = RuntimeHelper.downcallHandle(
        "mrand48",
        constants$49.mrand48$FUNC
    );
    static final FunctionDescriptor jrand48$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle jrand48$MH = RuntimeHelper.downcallHandle(
        "jrand48",
        constants$49.jrand48$FUNC
    );
    static final FunctionDescriptor srand48$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle srand48$MH = RuntimeHelper.downcallHandle(
        "srand48",
        constants$49.srand48$FUNC
    );
    static final FunctionDescriptor seed48$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle seed48$MH = RuntimeHelper.downcallHandle(
        "seed48",
        constants$49.seed48$FUNC
    );
    static final FunctionDescriptor lcong48$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle lcong48$MH = RuntimeHelper.downcallHandle(
        "lcong48",
        constants$49.lcong48$FUNC
    );
}


// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$430 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$430() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_scanner_scope_foreach_symbol$func.class, "apply", constants$14.const$3);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_scanner_scope_foreach_symbol",
        constants$179.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_scanner_lookup_symbol",
        constants$5.const$5
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_scanner_unexp_token",
        constants$430.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandleVariadic(
        "g_scanner_error",
        constants$13.const$4
    );
}



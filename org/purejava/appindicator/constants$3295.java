// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$3295 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3295() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_gradient_add_color_stop",
        constants$3295.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_gradient_ref",
        constants$5.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_gradient_unref",
        constants$13.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_gradient_resolve",
        constants$12.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_gradient_resolve_for_context",
        constants$5.const$5
    );
}


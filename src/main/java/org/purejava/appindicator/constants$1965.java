// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1965 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1965() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_border_free",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GtkRcPropertyParser.class, "apply", constants$12.const$2);
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GtkBuilderConnectFunc.class, "apply", constants$1965.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1965.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_get_major_version",
        constants$83.const$1
    );
}



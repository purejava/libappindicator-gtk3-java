// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$359 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$359() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_variant_new_dict_entry",
        constants$5.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_variant_get_maybe",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_variant_n_children",
        constants$4.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "g_variant_get_child",
        constants$359.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_variant_get_child_value",
        constants$21.const$1
    );
}



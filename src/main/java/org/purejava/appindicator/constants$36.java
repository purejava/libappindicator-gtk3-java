// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$36 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$36() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_ptr_array_new_take$element_free_func.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_ptr_array_new_take",
        constants$36.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_ptr_array_new_from_array$copy_func.class, "apply", constants$5.const$5);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_ptr_array_new_from_array$element_free_func.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_ptr_array_new_from_array",
        constants$36.const$5
    );
}



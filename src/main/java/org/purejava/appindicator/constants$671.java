// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$671 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$671() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_param_spec_variant",
        constants$671.const$0
    );
    static final MemorySegment const$2 = RuntimeHelper.lookupGlobalVariable("g_param_spec_types", RuntimeHelper.POINTER);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_signal_group_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_signal_group_new",
        constants$63.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_signal_group_set_target",
        constants$13.const$4
    );
}


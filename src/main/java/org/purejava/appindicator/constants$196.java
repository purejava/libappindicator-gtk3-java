// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$196 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$196() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "alphasort",
        constants$9.const$0
    );
    static final FunctionDescriptor const$1 = FunctionDescriptor.of(JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "getdirentries",
        constants$196.const$1
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_dir_open",
        constants$196.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_dir_read_name",
        constants$5.const$2
    );
}



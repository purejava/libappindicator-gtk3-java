// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$164 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$164() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_application_info",
        constants$164.const$0
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_app_info",
        constants$164.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_application_info",
        constants$164.const$2
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_is_private",
        constants$164.const$5
    );
}



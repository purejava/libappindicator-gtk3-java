// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$827 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$827() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "unlinkat",
        constants$827.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "rmdir",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "tcgetpgrp",
        constants$8.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "tcsetpgrp",
        constants$123.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "getlogin",
        constants$35.const$2
    );
}



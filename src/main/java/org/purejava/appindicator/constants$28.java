// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$28 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$28() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "strsignal",
        constants$24.const$0
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "__stpcpy",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "stpcpy",
        constants$5.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "__stpncpy",
        constants$17.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "stpncpy",
        constants$17.const$1
    );
    static final StructLayout const$5 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("data"),
        JAVA_INT.withName("len"),
        MemoryLayout.paddingLayout(4)
    ).withName("_GArray");
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$8 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$8() {}
    static final MemorySegment const$0 = RuntimeHelper.lookupGlobalVariable("daylight", JAVA_INT);
    static final MemorySegment const$1 = RuntimeHelper.lookupGlobalVariable("timezone", JAVA_LONG);
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "timegm",
        constants$4.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "timelocal",
        constants$4.const$0
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "dysize",
        constants$8.const$4
    );
}



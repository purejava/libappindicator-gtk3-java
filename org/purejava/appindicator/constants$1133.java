// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1133 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1133() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_list_store_remove",
        constants$40.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_list_store_remove_all",
        constants$13.const$1
    );
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_list_store_splice",
        constants$1133.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_list_store_find",
        constants$12.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_list_store_find_with_equal_func$equal_func.class, "apply", constants$9.const$0);
}


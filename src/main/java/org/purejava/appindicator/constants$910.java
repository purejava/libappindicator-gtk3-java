// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$910 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$910() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GBusNameAppearedCallback.class, "apply", constants$42.const$1);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GBusNameVanishedCallback.class, "apply", constants$14.const$3);
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_bus_watch_name$name_appeared_handler.class, "apply", constants$42.const$1);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(g_bus_watch_name$name_vanished_handler.class, "apply", constants$14.const$3);
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_bus_watch_name$user_data_free_func.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$5 = FunctionDescriptor.of(JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "g_bus_watch_name",
        constants$910.const$5
    );
}



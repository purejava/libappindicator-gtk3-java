// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_SHORT;
final class constants$1196 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1196() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_network_address_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_network_address_new",
        constants$1106.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_network_address_new_loopback",
        constants$351.const$0
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_network_address_parse",
        constants$1196.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_network_address_parse_uri",
        constants$1196.const$3
    );
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_SHORT;
final class constants$1200 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1200() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_SHORT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_network_address_parse",
        constants$1200.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_network_address_parse_uri",
        constants$1200.const$0
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_network_address_get_hostname",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_network_address_get_port",
        constants$186.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_network_address_get_scheme",
        constants$5.const$2
    );
}



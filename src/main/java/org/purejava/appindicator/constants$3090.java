// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
final class constants$3090 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$3090() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "gtk_rc_property_parse_border",
        constants$12.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_settings_set_property_value",
        constants$14.const$3
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_settings_set_string_property",
        constants$42.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_settings_set_long_property",
        constants$1143.const$1
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_settings_set_double_property",
        constants$3090.const$4
    );
}



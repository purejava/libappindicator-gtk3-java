// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_DOUBLE;
final class constants$1682 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1682() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "cairo_pop_group_to_source",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "cairo_set_operator",
        constants$40.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "cairo_set_source",
        constants$13.const$4
    );
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "cairo_set_source_rgb",
        constants$1682.const$3
    );
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE,
        JAVA_DOUBLE
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "cairo_set_source_rgba",
        constants$1682.const$5
    );
}


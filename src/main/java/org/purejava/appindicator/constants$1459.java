// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_FLOAT;
final class constants$1459 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1459() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "hb_paint_funcs_set_user_data",
        constants$1427.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "hb_paint_funcs_get_user_data",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "hb_paint_funcs_make_immutable",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "hb_paint_funcs_is_immutable",
        constants$10.const$5
    );
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        JAVA_FLOAT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(hb_paint_push_transform_func_t.class, "apply", constants$1459.const$4);
}



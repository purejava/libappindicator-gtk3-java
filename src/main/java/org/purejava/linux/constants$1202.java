// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1202 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1202() {}
    static final FunctionDescriptor atk_object_get_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_get_attributes$MH = RuntimeHelper.downcallHandle(
        "atk_object_get_attributes",
        constants$1202.atk_object_get_attributes$FUNC
    );
    static final FunctionDescriptor atk_object_ref_state_set$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_ref_state_set$MH = RuntimeHelper.downcallHandle(
        "atk_object_ref_state_set",
        constants$1202.atk_object_ref_state_set$FUNC
    );
    static final FunctionDescriptor atk_object_get_index_in_parent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_get_index_in_parent$MH = RuntimeHelper.downcallHandle(
        "atk_object_get_index_in_parent",
        constants$1202.atk_object_get_index_in_parent$FUNC
    );
    static final FunctionDescriptor atk_object_set_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_set_name$MH = RuntimeHelper.downcallHandle(
        "atk_object_set_name",
        constants$1202.atk_object_set_name$FUNC
    );
    static final FunctionDescriptor atk_object_set_description$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_set_description$MH = RuntimeHelper.downcallHandle(
        "atk_object_set_description",
        constants$1202.atk_object_set_description$FUNC
    );
    static final FunctionDescriptor atk_object_set_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_object_set_parent$MH = RuntimeHelper.downcallHandle(
        "atk_object_set_parent",
        constants$1202.atk_object_set_parent$FUNC
    );
}


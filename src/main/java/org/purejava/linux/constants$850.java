// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$850 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$850() {}
    static final FunctionDescriptor hb_face_reference_table$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_face_reference_table$MH = RuntimeHelper.downcallHandle(
        "hb_face_reference_table",
        constants$850.hb_face_reference_table$FUNC
    );
    static final FunctionDescriptor hb_face_reference_blob$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_reference_blob$MH = RuntimeHelper.downcallHandle(
        "hb_face_reference_blob",
        constants$850.hb_face_reference_blob$FUNC
    );
    static final FunctionDescriptor hb_face_set_index$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_face_set_index$MH = RuntimeHelper.downcallHandle(
        "hb_face_set_index",
        constants$850.hb_face_set_index$FUNC
    );
    static final FunctionDescriptor hb_face_get_index$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_get_index$MH = RuntimeHelper.downcallHandle(
        "hb_face_get_index",
        constants$850.hb_face_get_index$FUNC
    );
    static final FunctionDescriptor hb_face_set_upem$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_face_set_upem$MH = RuntimeHelper.downcallHandle(
        "hb_face_set_upem",
        constants$850.hb_face_set_upem$FUNC
    );
    static final FunctionDescriptor hb_face_get_upem$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_face_get_upem$MH = RuntimeHelper.downcallHandle(
        "hb_face_get_upem",
        constants$850.hb_face_get_upem$FUNC
    );
}


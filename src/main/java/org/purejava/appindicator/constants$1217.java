// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1217 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1217() {}
    static final FunctionDescriptor atk_text_get_character_count$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_character_count$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_character_count",
        constants$1217.atk_text_get_character_count$FUNC
    );
    static final FunctionDescriptor atk_text_get_offset_at_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_get_offset_at_point$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_offset_at_point",
        constants$1217.atk_text_get_offset_at_point$FUNC
    );
    static final FunctionDescriptor atk_text_get_n_selections$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_n_selections$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_n_selections",
        constants$1217.atk_text_get_n_selections$FUNC
    );
    static final FunctionDescriptor atk_text_get_selection$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_text_get_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_get_selection",
        constants$1217.atk_text_get_selection$FUNC
    );
    static final FunctionDescriptor atk_text_add_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_add_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_add_selection",
        constants$1217.atk_text_add_selection$FUNC
    );
    static final FunctionDescriptor atk_text_remove_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_text_remove_selection$MH = RuntimeHelper.downcallHandle(
        "atk_text_remove_selection",
        constants$1217.atk_text_remove_selection$FUNC
    );
}


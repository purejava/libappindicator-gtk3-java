// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$1232 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1232() {}
    static final FunctionDescriptor atk_relation_set_contains_target$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_contains_target$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_contains_target",
        constants$1232.atk_relation_set_contains_target$FUNC
    );
    static final FunctionDescriptor atk_relation_set_remove$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_remove$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_remove",
        constants$1232.atk_relation_set_remove$FUNC
    );
    static final FunctionDescriptor atk_relation_set_add$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_add$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_add",
        constants$1232.atk_relation_set_add$FUNC
    );
    static final FunctionDescriptor atk_relation_set_get_n_relations$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle atk_relation_set_get_n_relations$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_get_n_relations",
        constants$1232.atk_relation_set_get_n_relations$FUNC
    );
    static final FunctionDescriptor atk_relation_set_get_relation$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_relation_set_get_relation$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_get_relation",
        constants$1232.atk_relation_set_get_relation$FUNC
    );
    static final FunctionDescriptor atk_relation_set_get_relation_by_type$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle atk_relation_set_get_relation_by_type$MH = RuntimeHelper.downcallHandle(
        "atk_relation_set_get_relation_by_type",
        constants$1232.atk_relation_set_get_relation_by_type$FUNC
    );
}


// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$410 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$410() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_atomic_rc_box_acquire",
        constants$5.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_atomic_rc_box_release",
        constants$13.const$1
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(g_atomic_rc_box_release_full$clear_func.class, "apply", constants$13.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_atomic_rc_box_release_full",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_atomic_rc_box_get_size",
        constants$4.const$0
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_ref_count_init",
        constants$13.const$1
    );
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
final class constants$390 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$390() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_option_group_free",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_option_group_ref",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_option_group_unref",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_option_group_add_entries",
        constants$13.const$4
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(g_option_group_set_translate_func$func.class, "apply", constants$5.const$5);
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(g_option_group_set_translate_func$destroy_notify.class, "apply", constants$13.const$1);
}



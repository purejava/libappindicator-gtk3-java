// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2794 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2794() {}
    static final FunctionDescriptor const$0 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_load_surface",
        constants$2794.const$0
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_lookup_by_gicon",
        constants$415.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_lookup_by_gicon_for_scale",
        constants$2018.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_list_icons",
        constants$5.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_icon_theme_list_contexts",
        constants$5.const$2
    );
}


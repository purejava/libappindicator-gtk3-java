// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2510 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2510() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkAppChooserButtonClass.custom_item_activated.class, "apply", constants$13.const$4);
    static final VarHandle const$1 = constants$2509.const$5.varHandle(MemoryLayout.PathElement.groupElement("custom_item_activated"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_new",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_append_separator",
        constants$13.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_app_chooser_button_append_custom_item",
        constants$42.const$1
    );
}



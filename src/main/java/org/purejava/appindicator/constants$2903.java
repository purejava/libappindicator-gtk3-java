// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2903 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2903() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkMessageDialogClass._gtk_reserved4.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$2901.const$5.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_message_dialog_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandleVariadic(
        "gtk_message_dialog_new",
        constants$1888.const$3
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandleVariadic(
        "gtk_message_dialog_new_with_markup",
        constants$1888.const$3
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "gtk_message_dialog_set_image",
        constants$13.const$4
    );
}



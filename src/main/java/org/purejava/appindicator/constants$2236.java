// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2236 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2236() {}
    static final VarHandle const$0 = constants$2234.const$4.varHandle(MemoryLayout.PathElement.groupElement("_gtk_reserved4"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "gtk_menu_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "gtk_menu_new",
        constants$35.const$2
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "gtk_menu_new_from_model",
        constants$5.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(gtk_menu_popup$func.class, "apply", constants$331.const$1);
    static final FunctionDescriptor const$5 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        JAVA_INT
    );
    static final MethodHandle const$6 = RuntimeHelper.downcallHandle(
        "gtk_menu_popup",
        constants$2236.const$5
    );
}



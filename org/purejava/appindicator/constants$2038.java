// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2038 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2038() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_hypertext_get_link_index",
        constants$11.const$4
    );
    static final StructLayout const$1 = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            JAVA_LONG.withName("g_type"),
            JAVA_LONG.withName("g_instance_type")
        ).withName("parent"),
        RuntimeHelper.POINTER.withName("get_image_position"),
        RuntimeHelper.POINTER.withName("get_image_description"),
        RuntimeHelper.POINTER.withName("get_image_size"),
        RuntimeHelper.POINTER.withName("set_image_description"),
        RuntimeHelper.POINTER.withName("get_image_locale")
    ).withName("_AtkImageIface");
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkImageIface.get_image_position.class, "apply", constants$331.const$4);
    static final VarHandle const$3 = constants$2038.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_image_position"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkImageIface.get_image_description.class, "apply", constants$5.const$2);
    static final VarHandle const$5 = constants$2038.const$1.varHandle(MemoryLayout.PathElement.groupElement("get_image_description"));
}


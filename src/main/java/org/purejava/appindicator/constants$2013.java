// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2013 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2013() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_AtkTextIface.get_default_attributes.class, "apply", constants$5.const$2);
    static final VarHandle const$1 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_default_attributes"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkTextIface.get_character_extents.class, "apply", constants$430.const$3);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$430.const$3
    );
    static final VarHandle const$4 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_character_extents"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkTextIface.get_character_count.class, "apply", constants$10.const$5);
}


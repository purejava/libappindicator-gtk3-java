// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2016 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2016() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_AtkTextIface.get_text_after_offset.class, "apply", constants$1425.const$2);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        constants$1425.const$2
    );
    static final VarHandle const$2 = constants$2015.const$3.varHandle(MemoryLayout.PathElement.groupElement("get_text_after_offset"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkTextIface.get_text_at_offset.class, "apply", constants$1425.const$2);
    static final VarHandle const$4 = constants$2015.const$3.varHandle(MemoryLayout.PathElement.groupElement("get_text_at_offset"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkTextIface.get_character_at_offset.class, "apply", constants$11.const$4);
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2011 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2011() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$1421.const$1
    );
    static final VarHandle const$1 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_text_after_offset"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkTextIface.get_text_at_offset.class, "apply", constants$1421.const$1);
    static final VarHandle const$3 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_text_at_offset"));
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_AtkTextIface.get_character_at_offset.class, "apply", constants$11.const$4);
    static final VarHandle const$5 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_character_at_offset"));
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2414 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2414() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GtkEntryBufferClass.get_length.class, "apply", constants$10.const$5);
    static final VarHandle const$1 = constants$2412.const$4.varHandle(MemoryLayout.PathElement.groupElement("get_length"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GtkEntryBufferClass.insert_text.class, "apply", constants$265.const$2);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$265.const$2
    );
    static final VarHandle const$4 = constants$2412.const$4.varHandle(MemoryLayout.PathElement.groupElement("insert_text"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GtkEntryBufferClass.delete_text.class, "apply", constants$49.const$0);
}



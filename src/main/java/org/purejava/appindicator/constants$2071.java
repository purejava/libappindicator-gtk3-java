// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2071 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2071() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_AtkStreamableContentIface.pad2.class, "apply", constants$10.const$5);
    static final VarHandle const$1 = constants$2069.const$1.varHandle(MemoryLayout.PathElement.groupElement("pad2"));
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_AtkStreamableContentIface.pad3.class, "apply", constants$10.const$5);
    static final VarHandle const$3 = constants$2069.const$1.varHandle(MemoryLayout.PathElement.groupElement("pad3"));
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_streamable_content_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_streamable_content_get_n_mime_types",
        constants$10.const$5
    );
}



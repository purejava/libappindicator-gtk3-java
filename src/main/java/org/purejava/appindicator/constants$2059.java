// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2059 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2059() {}
    static final VarHandle const$0 = constants$2058.const$4.varHandle(MemoryLayout.PathElement.groupElement("pad1"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkRelationSetClass.pad2.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$2058.const$4.varHandle(MemoryLayout.PathElement.groupElement("pad2"));
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_relation_set_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "atk_relation_set_new",
        constants$35.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "atk_relation_set_contains",
        constants$11.const$4
    );
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$944 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$944() {}
    static final VarHandle const$0 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_identifier"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GDriveIface.enumerate_identifiers.class, "apply", constants$5.const$2);
    static final VarHandle const$2 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GDriveIface.get_start_stop_type.class, "apply", constants$10.const$5);
    static final VarHandle const$4 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_start_stop_type"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GDriveIface.can_start.class, "apply", constants$10.const$5);
}


// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$940 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$940() {}
    static final VarHandle const$0 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_icon"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GDriveIface.has_volumes.class, "apply", constants$10.const$5);
    static final VarHandle const$2 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("has_volumes"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GDriveIface.get_volumes.class, "apply", constants$5.const$2);
    static final VarHandle const$4 = constants$938.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_volumes"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GDriveIface.is_media_removable.class, "apply", constants$10.const$5);
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1402 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1402() {}
    static final VarHandle const$0 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_name"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GVolumeIface.get_icon.class, "apply", constants$5.const$2);
    static final VarHandle const$2 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_icon"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GVolumeIface.get_uuid.class, "apply", constants$5.const$2);
    static final VarHandle const$4 = constants$1401.const$0.varHandle(MemoryLayout.PathElement.groupElement("get_uuid"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GVolumeIface.get_drive.class, "apply", constants$5.const$2);
}


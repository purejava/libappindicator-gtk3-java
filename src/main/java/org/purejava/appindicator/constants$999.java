// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$999 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$999() {}
    static final VarHandle const$0 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("unmount_mountable_finish"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_GFileIface.eject_mountable.class, "apply", constants$281.const$5);
    static final VarHandle const$2 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("eject_mountable"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GFileIface.eject_mountable_finish.class, "apply", constants$12.const$2);
    static final VarHandle const$4 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("eject_mountable_finish"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GFileIface.mount_enclosing_volume.class, "apply", constants$380.const$0);
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2015 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2015() {}
    static final VarHandle const$0 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_selection"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkTextIface.add_selection.class, "apply", constants$49.const$0);
    static final VarHandle const$2 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("add_selection"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkTextIface.remove_selection.class, "apply", constants$11.const$4);
    static final VarHandle const$4 = constants$2010.const$2.varHandle(MemoryLayout.PathElement.groupElement("remove_selection"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkTextIface.set_selection.class, "apply", constants$608.const$5);
}



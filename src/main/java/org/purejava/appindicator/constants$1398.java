// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$1398 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1398() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GVfsClass.parse_name.class, "apply", constants$5.const$5);
    static final VarHandle const$1 = constants$1396.const$3.varHandle(MemoryLayout.PathElement.groupElement("parse_name"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GVfsClass.local_file_add_info.class, "apply", constants$1398.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1398.const$2
    );
    static final VarHandle const$5 = constants$1396.const$3.varHandle(MemoryLayout.PathElement.groupElement("local_file_add_info"));
}



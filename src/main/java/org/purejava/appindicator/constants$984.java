// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$984 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$984() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(_GFileIface._query_writable_namespaces_finish.class, "apply", constants$7.const$5);
    static final VarHandle const$1 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("_query_writable_namespaces_finish"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.of(JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GFileIface.set_attribute.class, "apply", constants$984.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$984.const$2
    );
    static final VarHandle const$5 = constants$971.const$5.varHandle(MemoryLayout.PathElement.groupElement("set_attribute"));
}


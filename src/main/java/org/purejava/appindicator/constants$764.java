// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$764 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$764() {}
    static final VarHandle const$0 = constants$762.const$3.varHandle(MemoryLayout.PathElement.groupElement("close_fn"));
    static final FunctionDescriptor const$1 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(_GInputStreamClass.read_async.class, "apply", constants$764.const$1);
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        constants$764.const$1
    );
    static final VarHandle const$4 = constants$762.const$3.varHandle(MemoryLayout.PathElement.groupElement("read_async"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_GInputStreamClass.read_finish.class, "apply", constants$166.const$0);
}



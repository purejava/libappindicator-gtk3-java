// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$1369 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1369() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        constants$1368.const$4
    );
    static final VarHandle const$1 = constants$1368.const$3.varHandle(MemoryLayout.PathElement.groupElement("verify_chain"));
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_INT,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_GTlsDatabaseClass.verify_chain_async.class, "apply", constants$1369.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$1369.const$2
    );
    static final VarHandle const$5 = constants$1368.const$3.varHandle(MemoryLayout.PathElement.groupElement("verify_chain_async"));
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_LONG;
final class constants$93 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$93() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "system",
        constants$10.const$5
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "realpath",
        constants$5.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(__compar_fn_t.class, "apply", constants$9.const$0);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(bsearch$__compar.class, "apply", constants$9.const$0);
    static final FunctionDescriptor const$4 = FunctionDescriptor.of(RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "bsearch",
        constants$93.const$4
    );
}



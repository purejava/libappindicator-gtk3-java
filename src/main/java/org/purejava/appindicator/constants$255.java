// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.invoke.MethodHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$255 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$255() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(g_clear_slist$destroy.class, "apply", constants$13.const$1);
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_clear_slist",
        constants$13.const$4
    );
    static final MethodHandle const$2 = RuntimeHelper.upcallHandle(GSourceFunc.class, "apply", constants$10.const$5);
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GSourceOnceFunc.class, "apply", constants$13.const$1);
    static final FunctionDescriptor const$4 = FunctionDescriptor.ofVoid(
        JAVA_INT,
        JAVA_INT,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(GChildWatchFunc.class, "apply", constants$255.const$4);
}



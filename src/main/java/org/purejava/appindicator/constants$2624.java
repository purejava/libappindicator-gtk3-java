// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$2624 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2624() {}
    static final MethodHandle const$0 = RuntimeHelper.upcallHandle(GtkClipboardReceivedFunc.class, "apply", constants$14.const$3);
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(GtkClipboardTextReceivedFunc.class, "apply", constants$14.const$3);
    static final FunctionDescriptor const$2 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        JAVA_LONG,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(GtkClipboardRichTextReceivedFunc.class, "apply", constants$2624.const$2);
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        constants$2624.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(GtkClipboardImageReceivedFunc.class, "apply", constants$14.const$3);
}



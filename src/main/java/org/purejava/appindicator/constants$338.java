// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
final class constants$338 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$338() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "g_mapped_file_free",
        constants$13.const$1
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_markup_error_quark",
        constants$83.const$1
    );
    static final StructLayout const$2 = MemoryLayout.structLayout(
        RuntimeHelper.POINTER.withName("start_element"),
        RuntimeHelper.POINTER.withName("end_element"),
        RuntimeHelper.POINTER.withName("text"),
        RuntimeHelper.POINTER.withName("passthrough"),
        RuntimeHelper.POINTER.withName("error")
    ).withName("_GMarkupParser");
    static final FunctionDescriptor const$3 = FunctionDescriptor.ofVoid(
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER,
        RuntimeHelper.POINTER
    );
    static final MethodHandle const$4 = RuntimeHelper.upcallHandle(_GMarkupParser.start_element.class, "apply", constants$338.const$3);
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        constants$338.const$3
    );
}



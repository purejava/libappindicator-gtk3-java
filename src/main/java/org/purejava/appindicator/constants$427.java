// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$427 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$427() {}
    static final VarHandle const$0 = constants$423.const$4.varHandle(MemoryLayout.PathElement.groupElement("msg_handler"));
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "g_scanner_new",
        constants$5.const$2
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_scanner_destroy",
        constants$13.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_scanner_input_file",
        constants$40.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_scanner_sync_file_offset",
        constants$13.const$1
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_scanner_input_text",
        constants$164.const$5
    );
}



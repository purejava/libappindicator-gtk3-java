// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$365 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$365() {}
    static final VarHandle const$0 = constants$364.const$5.varHandle(MemoryLayout.PathElement.groupElement("partial_magic"));
    static final VarHandle const$1 = constants$364.const$5.varHandle(MemoryLayout.PathElement.groupElement("type"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_variant_parser_get_error_quark",
        constants$83.const$1
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_variant_parse_error_quark",
        constants$83.const$1
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_variant_builder_new",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_variant_builder_unref",
        constants$13.const$1
    );
}


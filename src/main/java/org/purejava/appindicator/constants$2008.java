// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.JAVA_INT;
final class constants$2008 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2008() {}
    static final MethodHandle const$0 = RuntimeHelper.downcallHandle(
        "atk_document_set_attribute_value",
        constants$12.const$2
    );
    static final MethodHandle const$1 = RuntimeHelper.downcallHandle(
        "atk_document_get_current_page_number",
        constants$10.const$5
    );
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "atk_document_get_page_count",
        constants$10.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "atk_text_attribute_register",
        constants$10.const$5
    );
    static final StructLayout const$4 = MemoryLayout.structLayout(
        JAVA_INT.withName("x"),
        JAVA_INT.withName("y"),
        JAVA_INT.withName("width"),
        JAVA_INT.withName("height")
    ).withName("_AtkTextRectangle");
    static final VarHandle const$5 = constants$2008.const$4.varHandle(MemoryLayout.PathElement.groupElement("x"));
}



// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$2010 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$2010() {}
    static final VarHandle const$0 = constants$2009.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_document"));
    static final MethodHandle const$1 = RuntimeHelper.upcallHandle(_AtkDocumentIface.get_document_locale.class, "apply", constants$5.const$2);
    static final VarHandle const$2 = constants$2009.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_document_locale"));
    static final MethodHandle const$3 = RuntimeHelper.upcallHandle(_AtkDocumentIface.get_document_attributes.class, "apply", constants$5.const$2);
    static final VarHandle const$4 = constants$2009.const$2.varHandle(MemoryLayout.PathElement.groupElement("get_document_attributes"));
    static final MethodHandle const$5 = RuntimeHelper.upcallHandle(_AtkDocumentIface.get_document_attribute_value.class, "apply", constants$5.const$5);
}



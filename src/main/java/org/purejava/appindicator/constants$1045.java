// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
final class constants$1045 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1045() {}
    static final VarHandle const$0 = constants$1044.const$5.varHandle(MemoryLayout.PathElement.groupElement("infos"));
    static final VarHandle const$1 = constants$1044.const$5.varHandle(MemoryLayout.PathElement.groupElement("n_infos"));
    static final MethodHandle const$2 = RuntimeHelper.downcallHandle(
        "g_file_attribute_info_list_get_type",
        constants$3.const$5
    );
    static final MethodHandle const$3 = RuntimeHelper.downcallHandle(
        "g_file_attribute_info_list_new",
        constants$35.const$2
    );
    static final MethodHandle const$4 = RuntimeHelper.downcallHandle(
        "g_file_attribute_info_list_ref",
        constants$5.const$2
    );
    static final MethodHandle const$5 = RuntimeHelper.downcallHandle(
        "g_file_attribute_info_list_unref",
        constants$13.const$1
    );
}



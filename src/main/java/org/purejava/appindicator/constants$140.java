// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;

import static java.lang.foreign.ValueLayout.*;
final class constants$140 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$140() {}
    static final VarHandle const$0 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("pr_pid"));
    static final VarHandle const$1 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("pr_ppid"));
    static final VarHandle const$2 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("pr_pgrp"));
    static final VarHandle const$3 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("pr_sid"));
    static final VarHandle const$4 = constants$139.const$2.varHandle(MemoryLayout.PathElement.groupElement("pr_fpvalid"));
    static final StructLayout const$5 = MemoryLayout.structLayout(
        JAVA_BYTE.withName("pr_state"),
        JAVA_BYTE.withName("pr_sname"),
        JAVA_BYTE.withName("pr_zomb"),
        JAVA_BYTE.withName("pr_nice"),
        MemoryLayout.paddingLayout(4),
        JAVA_LONG.withName("pr_flag"),
        JAVA_INT.withName("pr_uid"),
        JAVA_INT.withName("pr_gid"),
        JAVA_INT.withName("pr_pid"),
        JAVA_INT.withName("pr_ppid"),
        JAVA_INT.withName("pr_pgrp"),
        JAVA_INT.withName("pr_sid"),
        MemoryLayout.sequenceLayout(16, JAVA_BYTE).withName("pr_fname"),
        MemoryLayout.sequenceLayout(80, JAVA_BYTE).withName("pr_psargs")
    ).withName("elf_prpsinfo");
}


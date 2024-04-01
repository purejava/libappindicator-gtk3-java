// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.*;
import java.lang.foreign.*;
import java.nio.ByteOrder;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

import static java.lang.foreign.ValueLayout.*;
import static java.lang.foreign.MemoryLayout.PathElement.*;

/**
 * {@snippet lang=c :
 * struct elf_prstatus {
 *     struct elf_siginfo pr_info;
 *     short pr_cursig;
 *     unsigned long pr_sigpend;
 *     unsigned long pr_sighold;
 *     __pid_t pr_pid;
 *     __pid_t pr_ppid;
 *     __pid_t pr_pgrp;
 *     __pid_t pr_sid;
 *     struct timeval pr_utime;
 *     struct timeval pr_stime;
 *     struct timeval pr_cutime;
 *     struct timeval pr_cstime;
 *     elf_gregset_t pr_reg;
 *     int pr_fpvalid;
 * }
 * }
 */
public class elf_prstatus {

    elf_prstatus() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        elf_siginfo.layout().withName("pr_info"),
        app_indicator_h.C_SHORT.withName("pr_cursig"),
        MemoryLayout.paddingLayout(2),
        app_indicator_h.C_LONG.withName("pr_sigpend"),
        app_indicator_h.C_LONG.withName("pr_sighold"),
        app_indicator_h.C_INT.withName("pr_pid"),
        app_indicator_h.C_INT.withName("pr_ppid"),
        app_indicator_h.C_INT.withName("pr_pgrp"),
        app_indicator_h.C_INT.withName("pr_sid"),
        timeval.layout().withName("pr_utime"),
        timeval.layout().withName("pr_stime"),
        timeval.layout().withName("pr_cutime"),
        timeval.layout().withName("pr_cstime"),
        MemoryLayout.sequenceLayout(34, app_indicator_h.C_LONG).withName("pr_reg"),
        app_indicator_h.C_INT.withName("pr_fpvalid"),
        MemoryLayout.paddingLayout(4)
    ).withName("elf_prstatus");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout pr_info$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pr_info"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct elf_siginfo pr_info
     * }
     */
    public static final GroupLayout pr_info$layout() {
        return pr_info$LAYOUT;
    }

    private static final long pr_info$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct elf_siginfo pr_info
     * }
     */
    public static final long pr_info$offset() {
        return pr_info$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct elf_siginfo pr_info
     * }
     */
    public static MemorySegment pr_info(MemorySegment struct) {
        return struct.asSlice(pr_info$OFFSET, pr_info$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct elf_siginfo pr_info
     * }
     */
    public static void pr_info(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pr_info$OFFSET, pr_info$LAYOUT.byteSize());
    }

    private static final OfShort pr_cursig$LAYOUT = (OfShort)$LAYOUT.select(groupElement("pr_cursig"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * short pr_cursig
     * }
     */
    public static final OfShort pr_cursig$layout() {
        return pr_cursig$LAYOUT;
    }

    private static final long pr_cursig$OFFSET = 12;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * short pr_cursig
     * }
     */
    public static final long pr_cursig$offset() {
        return pr_cursig$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * short pr_cursig
     * }
     */
    public static short pr_cursig(MemorySegment struct) {
        return struct.get(pr_cursig$LAYOUT, pr_cursig$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * short pr_cursig
     * }
     */
    public static void pr_cursig(MemorySegment struct, short fieldValue) {
        struct.set(pr_cursig$LAYOUT, pr_cursig$OFFSET, fieldValue);
    }

    private static final OfLong pr_sigpend$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pr_sigpend"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long pr_sigpend
     * }
     */
    public static final OfLong pr_sigpend$layout() {
        return pr_sigpend$LAYOUT;
    }

    private static final long pr_sigpend$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long pr_sigpend
     * }
     */
    public static final long pr_sigpend$offset() {
        return pr_sigpend$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long pr_sigpend
     * }
     */
    public static long pr_sigpend(MemorySegment struct) {
        return struct.get(pr_sigpend$LAYOUT, pr_sigpend$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long pr_sigpend
     * }
     */
    public static void pr_sigpend(MemorySegment struct, long fieldValue) {
        struct.set(pr_sigpend$LAYOUT, pr_sigpend$OFFSET, fieldValue);
    }

    private static final OfLong pr_sighold$LAYOUT = (OfLong)$LAYOUT.select(groupElement("pr_sighold"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * unsigned long pr_sighold
     * }
     */
    public static final OfLong pr_sighold$layout() {
        return pr_sighold$LAYOUT;
    }

    private static final long pr_sighold$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * unsigned long pr_sighold
     * }
     */
    public static final long pr_sighold$offset() {
        return pr_sighold$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * unsigned long pr_sighold
     * }
     */
    public static long pr_sighold(MemorySegment struct) {
        return struct.get(pr_sighold$LAYOUT, pr_sighold$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * unsigned long pr_sighold
     * }
     */
    public static void pr_sighold(MemorySegment struct, long fieldValue) {
        struct.set(pr_sighold$LAYOUT, pr_sighold$OFFSET, fieldValue);
    }

    private static final OfInt pr_pid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pr_pid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __pid_t pr_pid
     * }
     */
    public static final OfInt pr_pid$layout() {
        return pr_pid$LAYOUT;
    }

    private static final long pr_pid$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __pid_t pr_pid
     * }
     */
    public static final long pr_pid$offset() {
        return pr_pid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __pid_t pr_pid
     * }
     */
    public static int pr_pid(MemorySegment struct) {
        return struct.get(pr_pid$LAYOUT, pr_pid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __pid_t pr_pid
     * }
     */
    public static void pr_pid(MemorySegment struct, int fieldValue) {
        struct.set(pr_pid$LAYOUT, pr_pid$OFFSET, fieldValue);
    }

    private static final OfInt pr_ppid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pr_ppid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __pid_t pr_ppid
     * }
     */
    public static final OfInt pr_ppid$layout() {
        return pr_ppid$LAYOUT;
    }

    private static final long pr_ppid$OFFSET = 36;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __pid_t pr_ppid
     * }
     */
    public static final long pr_ppid$offset() {
        return pr_ppid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __pid_t pr_ppid
     * }
     */
    public static int pr_ppid(MemorySegment struct) {
        return struct.get(pr_ppid$LAYOUT, pr_ppid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __pid_t pr_ppid
     * }
     */
    public static void pr_ppid(MemorySegment struct, int fieldValue) {
        struct.set(pr_ppid$LAYOUT, pr_ppid$OFFSET, fieldValue);
    }

    private static final OfInt pr_pgrp$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pr_pgrp"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __pid_t pr_pgrp
     * }
     */
    public static final OfInt pr_pgrp$layout() {
        return pr_pgrp$LAYOUT;
    }

    private static final long pr_pgrp$OFFSET = 40;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __pid_t pr_pgrp
     * }
     */
    public static final long pr_pgrp$offset() {
        return pr_pgrp$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __pid_t pr_pgrp
     * }
     */
    public static int pr_pgrp(MemorySegment struct) {
        return struct.get(pr_pgrp$LAYOUT, pr_pgrp$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __pid_t pr_pgrp
     * }
     */
    public static void pr_pgrp(MemorySegment struct, int fieldValue) {
        struct.set(pr_pgrp$LAYOUT, pr_pgrp$OFFSET, fieldValue);
    }

    private static final OfInt pr_sid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pr_sid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * __pid_t pr_sid
     * }
     */
    public static final OfInt pr_sid$layout() {
        return pr_sid$LAYOUT;
    }

    private static final long pr_sid$OFFSET = 44;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * __pid_t pr_sid
     * }
     */
    public static final long pr_sid$offset() {
        return pr_sid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * __pid_t pr_sid
     * }
     */
    public static int pr_sid(MemorySegment struct) {
        return struct.get(pr_sid$LAYOUT, pr_sid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * __pid_t pr_sid
     * }
     */
    public static void pr_sid(MemorySegment struct, int fieldValue) {
        struct.set(pr_sid$LAYOUT, pr_sid$OFFSET, fieldValue);
    }

    private static final GroupLayout pr_utime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pr_utime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timeval pr_utime
     * }
     */
    public static final GroupLayout pr_utime$layout() {
        return pr_utime$LAYOUT;
    }

    private static final long pr_utime$OFFSET = 48;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timeval pr_utime
     * }
     */
    public static final long pr_utime$offset() {
        return pr_utime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timeval pr_utime
     * }
     */
    public static MemorySegment pr_utime(MemorySegment struct) {
        return struct.asSlice(pr_utime$OFFSET, pr_utime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timeval pr_utime
     * }
     */
    public static void pr_utime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pr_utime$OFFSET, pr_utime$LAYOUT.byteSize());
    }

    private static final GroupLayout pr_stime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pr_stime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timeval pr_stime
     * }
     */
    public static final GroupLayout pr_stime$layout() {
        return pr_stime$LAYOUT;
    }

    private static final long pr_stime$OFFSET = 64;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timeval pr_stime
     * }
     */
    public static final long pr_stime$offset() {
        return pr_stime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timeval pr_stime
     * }
     */
    public static MemorySegment pr_stime(MemorySegment struct) {
        return struct.asSlice(pr_stime$OFFSET, pr_stime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timeval pr_stime
     * }
     */
    public static void pr_stime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pr_stime$OFFSET, pr_stime$LAYOUT.byteSize());
    }

    private static final GroupLayout pr_cutime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pr_cutime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timeval pr_cutime
     * }
     */
    public static final GroupLayout pr_cutime$layout() {
        return pr_cutime$LAYOUT;
    }

    private static final long pr_cutime$OFFSET = 80;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timeval pr_cutime
     * }
     */
    public static final long pr_cutime$offset() {
        return pr_cutime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timeval pr_cutime
     * }
     */
    public static MemorySegment pr_cutime(MemorySegment struct) {
        return struct.asSlice(pr_cutime$OFFSET, pr_cutime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timeval pr_cutime
     * }
     */
    public static void pr_cutime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pr_cutime$OFFSET, pr_cutime$LAYOUT.byteSize());
    }

    private static final GroupLayout pr_cstime$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("pr_cstime"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * struct timeval pr_cstime
     * }
     */
    public static final GroupLayout pr_cstime$layout() {
        return pr_cstime$LAYOUT;
    }

    private static final long pr_cstime$OFFSET = 96;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * struct timeval pr_cstime
     * }
     */
    public static final long pr_cstime$offset() {
        return pr_cstime$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * struct timeval pr_cstime
     * }
     */
    public static MemorySegment pr_cstime(MemorySegment struct) {
        return struct.asSlice(pr_cstime$OFFSET, pr_cstime$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * struct timeval pr_cstime
     * }
     */
    public static void pr_cstime(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pr_cstime$OFFSET, pr_cstime$LAYOUT.byteSize());
    }

    private static final SequenceLayout pr_reg$LAYOUT = (SequenceLayout)$LAYOUT.select(groupElement("pr_reg"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * elf_gregset_t pr_reg
     * }
     */
    public static final SequenceLayout pr_reg$layout() {
        return pr_reg$LAYOUT;
    }

    private static final long pr_reg$OFFSET = 112;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * elf_gregset_t pr_reg
     * }
     */
    public static final long pr_reg$offset() {
        return pr_reg$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * elf_gregset_t pr_reg
     * }
     */
    public static MemorySegment pr_reg(MemorySegment struct) {
        return struct.asSlice(pr_reg$OFFSET, pr_reg$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * elf_gregset_t pr_reg
     * }
     */
    public static void pr_reg(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, pr_reg$OFFSET, pr_reg$LAYOUT.byteSize());
    }

    private static final OfInt pr_fpvalid$LAYOUT = (OfInt)$LAYOUT.select(groupElement("pr_fpvalid"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * int pr_fpvalid
     * }
     */
    public static final OfInt pr_fpvalid$layout() {
        return pr_fpvalid$LAYOUT;
    }

    private static final long pr_fpvalid$OFFSET = 384;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * int pr_fpvalid
     * }
     */
    public static final long pr_fpvalid$offset() {
        return pr_fpvalid$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * int pr_fpvalid
     * }
     */
    public static int pr_fpvalid(MemorySegment struct) {
        return struct.get(pr_fpvalid$LAYOUT, pr_fpvalid$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * int pr_fpvalid
     * }
     */
    public static void pr_fpvalid(MemorySegment struct, int fieldValue) {
        struct.set(pr_fpvalid$LAYOUT, pr_fpvalid$OFFSET, fieldValue);
    }

    /**
     * Obtains a slice of {@code arrayParam} which selects the array element at {@code index}.
     * The returned segment has address {@code arrayParam.address() + index * layout().byteSize()}
     */
    public static MemorySegment asSlice(MemorySegment array, long index) {
        return array.asSlice(layout().byteSize() * index);
    }

    /**
     * The size (in bytes) of this struct
     */
    public static long sizeof() { return layout().byteSize(); }

    /**
     * Allocate a segment of size {@code layout().byteSize()} using {@code allocator}
     */
    public static MemorySegment allocate(SegmentAllocator allocator) {
        return allocator.allocate(layout());
    }

    /**
     * Allocate an array of size {@code elementCount} using {@code allocator}.
     * The returned segment has size {@code elementCount * layout().byteSize()}.
     */
    public static MemorySegment allocateArray(long elementCount, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(elementCount, layout()));
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, Arena arena, Consumer<MemorySegment> cleanup) {
        return reinterpret(addr, 1, arena, cleanup);
    }

    /**
     * Reinterprets {@code addr} using target {@code arena} and {@code cleanupAction) (if any).
     * The returned segment has size {@code elementCount * layout().byteSize()}
     */
    public static MemorySegment reinterpret(MemorySegment addr, long elementCount, Arena arena, Consumer<MemorySegment> cleanup) {
        return addr.reinterpret(layout().byteSize() * elementCount, arena, cleanup);
    }
}

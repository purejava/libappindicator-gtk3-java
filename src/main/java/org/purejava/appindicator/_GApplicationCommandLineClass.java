// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GApplicationCommandLineClass {
 *     struct _GObjectClass parent_class;
 *     void (*print_literal)(struct _GApplicationCommandLine*,char*);
 *     void (*printerr_literal)(struct _GApplicationCommandLine*,char*);
 *     struct _GInputStream* (*get_stdin)(struct _GApplicationCommandLine*);
 *     void* padding[11];
 * };
 * }
 */
public class _GApplicationCommandLineClass {

    public static MemoryLayout $LAYOUT() {
        return constants$748.const$5;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * void (*print_literal)(struct _GApplicationCommandLine*,char*);
     * }
     */
    public interface print_literal {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(print_literal fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$749.const$0, fi, constants$13.const$4, scope);
        }
        static print_literal ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle print_literal$VH() {
        return constants$749.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*print_literal)(struct _GApplicationCommandLine*,char*);
     * }
     */
    public static MemorySegment print_literal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$749.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*print_literal)(struct _GApplicationCommandLine*,char*);
     * }
     */
    public static void print_literal$set(MemorySegment seg, MemorySegment x) {
        constants$749.const$1.set(seg, x);
    }
    public static MemorySegment print_literal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$749.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void print_literal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$749.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static print_literal print_literal(MemorySegment segment, Arena scope) {
        return print_literal.ofAddress(print_literal$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*printerr_literal)(struct _GApplicationCommandLine*,char*);
     * }
     */
    public interface printerr_literal {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(printerr_literal fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$749.const$2, fi, constants$13.const$4, scope);
        }
        static printerr_literal ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$14.const$0.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle printerr_literal$VH() {
        return constants$749.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*printerr_literal)(struct _GApplicationCommandLine*,char*);
     * }
     */
    public static MemorySegment printerr_literal$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$749.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*printerr_literal)(struct _GApplicationCommandLine*,char*);
     * }
     */
    public static void printerr_literal$set(MemorySegment seg, MemorySegment x) {
        constants$749.const$3.set(seg, x);
    }
    public static MemorySegment printerr_literal$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$749.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void printerr_literal$set(MemorySegment seg, long index, MemorySegment x) {
        constants$749.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static printerr_literal printerr_literal(MemorySegment segment, Arena scope) {
        return printerr_literal.ofAddress(printerr_literal$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GInputStream* (*get_stdin)(struct _GApplicationCommandLine*);
     * }
     */
    public interface get_stdin {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(get_stdin fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$749.const$4, fi, constants$5.const$2, scope);
        }
        static get_stdin ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$99.const$0.invokeExact(symbol, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_stdin$VH() {
        return constants$749.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GInputStream* (*get_stdin)(struct _GApplicationCommandLine*);
     * }
     */
    public static MemorySegment get_stdin$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$749.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GInputStream* (*get_stdin)(struct _GApplicationCommandLine*);
     * }
     */
    public static void get_stdin$set(MemorySegment seg, MemorySegment x) {
        constants$749.const$5.set(seg, x);
    }
    public static MemorySegment get_stdin$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$749.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void get_stdin$set(MemorySegment seg, long index, MemorySegment x) {
        constants$749.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_stdin get_stdin(MemorySegment segment, Arena scope) {
        return get_stdin.ofAddress(get_stdin$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(160, 88);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}



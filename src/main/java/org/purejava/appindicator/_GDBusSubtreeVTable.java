// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GDBusSubtreeVTable {
 *     char** (*enumerate)(struct _GDBusConnection*,char*,char*,void*);
 *     struct _GDBusInterfaceInfo** (*introspect)(struct _GDBusConnection*,char*,char*,char*,void*);
 *     struct _GDBusInterfaceVTable* (*dispatch)(struct _GDBusConnection*,char*,char*,char*,char*,void**,void*);
 *     void* padding[8];
 * };
 * }
 */
public class _GDBusSubtreeVTable {

    public static MemoryLayout $LAYOUT() {
        return constants$866.const$3;
    }
    /**
     * {@snippet :
 * char** (*enumerate)(struct _GDBusConnection*,char*,char*,void*);
     * }
     */
    public interface enumerate {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment pattern, java.lang.foreign.MemorySegment callback_data, java.lang.foreign.MemorySegment target, java.lang.foreign.MemorySegment extents);
        static MemorySegment allocate(enumerate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$866.const$4, fi, constants$39.const$1, scope);
        }
        static enumerate ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _pattern, java.lang.foreign.MemorySegment _callback_data, java.lang.foreign.MemorySegment _target, java.lang.foreign.MemorySegment _extents) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$865.const$5.invokeExact(symbol, _pattern, _callback_data, _target, _extents);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle enumerate$VH() {
        return constants$866.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char** (*enumerate)(struct _GDBusConnection*,char*,char*,void*);
     * }
     */
    public static MemorySegment enumerate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$866.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char** (*enumerate)(struct _GDBusConnection*,char*,char*,void*);
     * }
     */
    public static void enumerate$set(MemorySegment seg, MemorySegment x) {
        constants$866.const$5.set(seg, x);
    }
    public static MemorySegment enumerate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$866.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void enumerate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$866.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static enumerate enumerate(MemorySegment segment, Arena scope) {
        return enumerate.ofAddress(enumerate$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GDBusInterfaceInfo** (*introspect)(struct _GDBusConnection*,char*,char*,char*,void*);
     * }
     */
    public interface introspect {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment node, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(introspect fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$867.const$0, fi, constants$330.const$5, scope);
        }
        static introspect ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _node, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$866.const$1.invokeExact(symbol, _connection, _sender, _object_path, _node, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle introspect$VH() {
        return constants$867.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusInterfaceInfo** (*introspect)(struct _GDBusConnection*,char*,char*,char*,void*);
     * }
     */
    public static MemorySegment introspect$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$867.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusInterfaceInfo** (*introspect)(struct _GDBusConnection*,char*,char*,char*,void*);
     * }
     */
    public static void introspect$set(MemorySegment seg, MemorySegment x) {
        constants$867.const$1.set(seg, x);
    }
    public static MemorySegment introspect$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$867.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void introspect$set(MemorySegment seg, long index, MemorySegment x) {
        constants$867.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static introspect introspect(MemorySegment segment, Arena scope) {
        return introspect.ofAddress(introspect$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _GDBusInterfaceVTable* (*dispatch)(struct _GDBusConnection*,char*,char*,char*,char*,void**,void*);
     * }
     */
    public interface dispatch {

        java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment connection, java.lang.foreign.MemorySegment sender, java.lang.foreign.MemorySegment object_path, java.lang.foreign.MemorySegment interface_name, java.lang.foreign.MemorySegment node, java.lang.foreign.MemorySegment out_user_data, java.lang.foreign.MemorySegment user_data);
        static MemorySegment allocate(dispatch fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$867.const$2, fi, constants$494.const$3, scope);
        }
        static dispatch ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _connection, java.lang.foreign.MemorySegment _sender, java.lang.foreign.MemorySegment _object_path, java.lang.foreign.MemorySegment _interface_name, java.lang.foreign.MemorySegment _node, java.lang.foreign.MemorySegment _out_user_data, java.lang.foreign.MemorySegment _user_data) -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$863.const$1.invokeExact(symbol, _connection, _sender, _object_path, _interface_name, _node, _out_user_data, _user_data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle dispatch$VH() {
        return constants$867.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GDBusInterfaceVTable* (*dispatch)(struct _GDBusConnection*,char*,char*,char*,char*,void**,void*);
     * }
     */
    public static MemorySegment dispatch$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$867.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GDBusInterfaceVTable* (*dispatch)(struct _GDBusConnection*,char*,char*,char*,char*,void**,void*);
     * }
     */
    public static void dispatch$set(MemorySegment seg, MemorySegment x) {
        constants$867.const$3.set(seg, x);
    }
    public static MemorySegment dispatch$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$867.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void dispatch$set(MemorySegment seg, long index, MemorySegment x) {
        constants$867.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static dispatch dispatch(MemorySegment segment, Arena scope) {
        return dispatch.ofAddress(dispatch$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(24, 64);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


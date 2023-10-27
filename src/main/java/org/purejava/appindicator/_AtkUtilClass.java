// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _AtkUtilClass {
 *     struct _GObjectClass parent;
 *     unsigned int (*add_global_event_listener)(int (*)(struct _GSignalInvocationHint*,unsigned int,struct _GValue*,void*),char*);
 *     void (*remove_global_event_listener)(unsigned int);
 *     unsigned int (*add_key_event_listener)(int (*)(struct _AtkKeyEventStruct*,void*),void*);
 *     void (*remove_key_event_listener)(unsigned int);
 *     struct _AtkObject* (*get_root)();
 *     char* (*get_toolkit_name)();
 *     char* (*get_toolkit_version)();
 * };
 * }
 */
public class _AtkUtilClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1993.const$0;
    }
    public static MemorySegment parent$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * unsigned int (*add_global_event_listener)(int (*)(struct _GSignalInvocationHint*,unsigned int,struct _GValue*,void*),char*);
     * }
     */
    public interface add_global_event_listener {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(add_global_event_listener fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1993.const$1, fi, constants$9.const$0, scope);
        }
        static add_global_event_listener ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle add_global_event_listener$VH() {
        return constants$1993.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int (*add_global_event_listener)(int (*)(struct _GSignalInvocationHint*,unsigned int,struct _GValue*,void*),char*);
     * }
     */
    public static MemorySegment add_global_event_listener$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1993.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int (*add_global_event_listener)(int (*)(struct _GSignalInvocationHint*,unsigned int,struct _GValue*,void*),char*);
     * }
     */
    public static void add_global_event_listener$set(MemorySegment seg, MemorySegment x) {
        constants$1993.const$2.set(seg, x);
    }
    public static MemorySegment add_global_event_listener$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1993.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void add_global_event_listener$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1993.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_global_event_listener add_global_event_listener(MemorySegment segment, Arena scope) {
        return add_global_event_listener.ofAddress(add_global_event_listener$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*remove_global_event_listener)(unsigned int);
     * }
     */
    public interface remove_global_event_listener {

        void apply(int handle_id);
        static MemorySegment allocate(remove_global_event_listener fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1993.const$3, fi, constants$80.const$1, scope);
        }
        static remove_global_event_listener ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (int _handle_id) -> {
                try {
                    constants$122.const$4.invokeExact(symbol, _handle_id);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle remove_global_event_listener$VH() {
        return constants$1993.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*remove_global_event_listener)(unsigned int);
     * }
     */
    public static MemorySegment remove_global_event_listener$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1993.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*remove_global_event_listener)(unsigned int);
     * }
     */
    public static void remove_global_event_listener$set(MemorySegment seg, MemorySegment x) {
        constants$1993.const$4.set(seg, x);
    }
    public static MemorySegment remove_global_event_listener$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1993.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void remove_global_event_listener$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1993.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static remove_global_event_listener remove_global_event_listener(MemorySegment segment, Arena scope) {
        return remove_global_event_listener.ofAddress(remove_global_event_listener$get(segment), scope);
    }
    /**
     * {@snippet :
 * unsigned int (*add_key_event_listener)(int (*)(struct _AtkKeyEventStruct*,void*),void*);
     * }
     */
    public interface add_key_event_listener {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1);
        static MemorySegment allocate(add_key_event_listener fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1993.const$5, fi, constants$9.const$0, scope);
        }
        static add_key_event_listener ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1) -> {
                try {
                    return (int)constants$12.const$1.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle add_key_event_listener$VH() {
        return constants$1994.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int (*add_key_event_listener)(int (*)(struct _AtkKeyEventStruct*,void*),void*);
     * }
     */
    public static MemorySegment add_key_event_listener$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1994.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int (*add_key_event_listener)(int (*)(struct _AtkKeyEventStruct*,void*),void*);
     * }
     */
    public static void add_key_event_listener$set(MemorySegment seg, MemorySegment x) {
        constants$1994.const$0.set(seg, x);
    }
    public static MemorySegment add_key_event_listener$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1994.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void add_key_event_listener$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1994.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_key_event_listener add_key_event_listener(MemorySegment segment, Arena scope) {
        return add_key_event_listener.ofAddress(add_key_event_listener$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*remove_key_event_listener)(unsigned int);
     * }
     */
    public interface remove_key_event_listener {

        void apply(int handle_id);
        static MemorySegment allocate(remove_key_event_listener fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1994.const$1, fi, constants$80.const$1, scope);
        }
        static remove_key_event_listener ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (int _handle_id) -> {
                try {
                    constants$122.const$4.invokeExact(symbol, _handle_id);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle remove_key_event_listener$VH() {
        return constants$1994.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*remove_key_event_listener)(unsigned int);
     * }
     */
    public static MemorySegment remove_key_event_listener$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1994.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*remove_key_event_listener)(unsigned int);
     * }
     */
    public static void remove_key_event_listener$set(MemorySegment seg, MemorySegment x) {
        constants$1994.const$2.set(seg, x);
    }
    public static MemorySegment remove_key_event_listener$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1994.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void remove_key_event_listener$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1994.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static remove_key_event_listener remove_key_event_listener(MemorySegment segment, Arena scope) {
        return remove_key_event_listener.ofAddress(remove_key_event_listener$get(segment), scope);
    }
    /**
     * {@snippet :
 * struct _AtkObject* (*get_root)();
     * }
     */
    public interface get_root {

        java.lang.foreign.MemorySegment apply();
        static MemorySegment allocate(get_root fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1994.const$3, fi, constants$35.const$2, scope);
        }
        static get_root ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$505.const$0.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_root$VH() {
        return constants$1994.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _AtkObject* (*get_root)();
     * }
     */
    public static MemorySegment get_root$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1994.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _AtkObject* (*get_root)();
     * }
     */
    public static void get_root$set(MemorySegment seg, MemorySegment x) {
        constants$1994.const$4.set(seg, x);
    }
    public static MemorySegment get_root$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1994.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void get_root$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1994.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_root get_root(MemorySegment segment, Arena scope) {
        return get_root.ofAddress(get_root$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_toolkit_name)();
     * }
     */
    public interface get_toolkit_name {

        java.lang.foreign.MemorySegment apply();
        static MemorySegment allocate(get_toolkit_name fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1994.const$5, fi, constants$35.const$2, scope);
        }
        static get_toolkit_name ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$505.const$0.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_toolkit_name$VH() {
        return constants$1995.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_toolkit_name)();
     * }
     */
    public static MemorySegment get_toolkit_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1995.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_toolkit_name)();
     * }
     */
    public static void get_toolkit_name$set(MemorySegment seg, MemorySegment x) {
        constants$1995.const$0.set(seg, x);
    }
    public static MemorySegment get_toolkit_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1995.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void get_toolkit_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1995.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_toolkit_name get_toolkit_name(MemorySegment segment, Arena scope) {
        return get_toolkit_name.ofAddress(get_toolkit_name$get(segment), scope);
    }
    /**
     * {@snippet :
 * char* (*get_toolkit_version)();
     * }
     */
    public interface get_toolkit_version {

        java.lang.foreign.MemorySegment apply();
        static MemorySegment allocate(get_toolkit_version fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1995.const$1, fi, constants$35.const$2, scope);
        }
        static get_toolkit_version ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return () -> {
                try {
                    return (java.lang.foreign.MemorySegment)constants$505.const$0.invokeExact(symbol);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle get_toolkit_version$VH() {
        return constants$1995.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* (*get_toolkit_version)();
     * }
     */
    public static MemorySegment get_toolkit_version$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1995.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* (*get_toolkit_version)();
     * }
     */
    public static void get_toolkit_version$set(MemorySegment seg, MemorySegment x) {
        constants$1995.const$2.set(seg, x);
    }
    public static MemorySegment get_toolkit_version$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1995.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void get_toolkit_version$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1995.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_toolkit_version get_toolkit_version(MemorySegment segment, Arena scope) {
        return get_toolkit_version.ofAddress(get_toolkit_version$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}



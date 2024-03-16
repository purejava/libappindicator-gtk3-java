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
 * struct _GActionMapInterface {
 *     GTypeInterface g_iface;
 *     GAction *(*lookup_action)(GActionMap *, const gchar *);
 *     void (*add_action)(GActionMap *, GAction *);
 *     void (*remove_action)(GActionMap *, const gchar *);
 * }
 * }
 */
public class _GActionMapInterface {

    _GActionMapInterface() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GTypeInterface.layout().withName("g_iface"),
        app_indicator_h.C_POINTER.withName("lookup_action"),
        app_indicator_h.C_POINTER.withName("add_action"),
        app_indicator_h.C_POINTER.withName("remove_action")
    ).withName("_GActionMapInterface");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout g_iface$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("g_iface"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static final GroupLayout g_iface$layout() {
        return g_iface$LAYOUT;
    }

    private static final long g_iface$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static final long g_iface$offset() {
        return g_iface$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static MemorySegment g_iface(MemorySegment struct) {
        return struct.asSlice(g_iface$OFFSET, g_iface$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GTypeInterface g_iface
     * }
     */
    public static void g_iface(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, g_iface$OFFSET, g_iface$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * GAction *(*lookup_action)(GActionMap *, const gchar *)
     * }
     */
    public class lookup_action {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            MemorySegment apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(lookup_action.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(lookup_action.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static MemorySegment invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (MemorySegment) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout lookup_action$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("lookup_action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GAction *(*lookup_action)(GActionMap *, const gchar *)
     * }
     */
    public static final AddressLayout lookup_action$layout() {
        return lookup_action$LAYOUT;
    }

    private static final long lookup_action$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GAction *(*lookup_action)(GActionMap *, const gchar *)
     * }
     */
    public static final long lookup_action$offset() {
        return lookup_action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GAction *(*lookup_action)(GActionMap *, const gchar *)
     * }
     */
    public static MemorySegment lookup_action(MemorySegment struct) {
        return struct.get(lookup_action$LAYOUT, lookup_action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GAction *(*lookup_action)(GActionMap *, const gchar *)
     * }
     */
    public static void lookup_action(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(lookup_action$LAYOUT, lookup_action$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*add_action)(GActionMap *, GAction *)
     * }
     */
    public class add_action {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(add_action.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(add_action.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout add_action$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("add_action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*add_action)(GActionMap *, GAction *)
     * }
     */
    public static final AddressLayout add_action$layout() {
        return add_action$LAYOUT;
    }

    private static final long add_action$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*add_action)(GActionMap *, GAction *)
     * }
     */
    public static final long add_action$offset() {
        return add_action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*add_action)(GActionMap *, GAction *)
     * }
     */
    public static MemorySegment add_action(MemorySegment struct) {
        return struct.get(add_action$LAYOUT, add_action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*add_action)(GActionMap *, GAction *)
     * }
     */
    public static void add_action(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(add_action$LAYOUT, add_action$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*remove_action)(GActionMap *, const gchar *)
     * }
     */
    public class remove_action {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(remove_action.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(remove_action.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout remove_action$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("remove_action"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*remove_action)(GActionMap *, const gchar *)
     * }
     */
    public static final AddressLayout remove_action$layout() {
        return remove_action$LAYOUT;
    }

    private static final long remove_action$OFFSET = 32;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*remove_action)(GActionMap *, const gchar *)
     * }
     */
    public static final long remove_action$offset() {
        return remove_action$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*remove_action)(GActionMap *, const gchar *)
     * }
     */
    public static MemorySegment remove_action(MemorySegment struct) {
        return struct.get(remove_action$LAYOUT, remove_action$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*remove_action)(GActionMap *, const gchar *)
     * }
     */
    public static void remove_action(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(remove_action$LAYOUT, remove_action$OFFSET, fieldValue);
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


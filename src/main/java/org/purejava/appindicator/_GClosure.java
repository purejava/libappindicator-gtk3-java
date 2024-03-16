// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct _GClosure {
 *     guint ref_count : 15;
 *     guint meta_marshal_nouse : 1;
 *     guint n_guards : 1;
 *     guint n_fnotifiers : 2;
 *     guint n_inotifiers : 8;
 *     guint in_inotify : 1;
 *     guint floating : 1;
 *     guint derivative_flag : 1;
 *     guint in_marshal : 1;
 *     guint is_invalid : 1;
 *     void (*marshal)(GClosure *, GValue *, guint, const GValue *, gpointer, gpointer);
 *     gpointer data;
 *     GClosureNotifyData *notifiers;
 * }
 * }
 */
public class _GClosure {

    _GClosure() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.paddingLayout(8),
        app_indicator_h.C_POINTER.withName("marshal"),
        app_indicator_h.C_POINTER.withName("data"),
        app_indicator_h.C_POINTER.withName("notifiers")
    ).withName("_GClosure");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    /**
     * {@snippet lang=c :
     * void (*marshal)(GClosure *, GValue *, guint, const GValue *, gpointer, gpointer)
     * }
     */
    public class marshal {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3, MemorySegment _x4, MemorySegment _x5);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(marshal.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(marshal.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, int _x2, MemorySegment _x3, MemorySegment _x4, MemorySegment _x5) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4, _x5);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout marshal$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("marshal"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*marshal)(GClosure *, GValue *, guint, const GValue *, gpointer, gpointer)
     * }
     */
    public static final AddressLayout marshal$layout() {
        return marshal$LAYOUT;
    }

    private static final long marshal$OFFSET = 8;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*marshal)(GClosure *, GValue *, guint, const GValue *, gpointer, gpointer)
     * }
     */
    public static final long marshal$offset() {
        return marshal$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*marshal)(GClosure *, GValue *, guint, const GValue *, gpointer, gpointer)
     * }
     */
    public static MemorySegment marshal(MemorySegment struct) {
        return struct.get(marshal$LAYOUT, marshal$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*marshal)(GClosure *, GValue *, guint, const GValue *, gpointer, gpointer)
     * }
     */
    public static void marshal(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(marshal$LAYOUT, marshal$OFFSET, fieldValue);
    }

    private static final AddressLayout data$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("data"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gpointer data
     * }
     */
    public static final AddressLayout data$layout() {
        return data$LAYOUT;
    }

    private static final long data$OFFSET = 16;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gpointer data
     * }
     */
    public static final long data$offset() {
        return data$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gpointer data
     * }
     */
    public static MemorySegment data(MemorySegment struct) {
        return struct.get(data$LAYOUT, data$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gpointer data
     * }
     */
    public static void data(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(data$LAYOUT, data$OFFSET, fieldValue);
    }

    private static final AddressLayout notifiers$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("notifiers"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GClosureNotifyData *notifiers
     * }
     */
    public static final AddressLayout notifiers$layout() {
        return notifiers$LAYOUT;
    }

    private static final long notifiers$OFFSET = 24;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GClosureNotifyData *notifiers
     * }
     */
    public static final long notifiers$offset() {
        return notifiers$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GClosureNotifyData *notifiers
     * }
     */
    public static MemorySegment notifiers(MemorySegment struct) {
        return struct.get(notifiers$LAYOUT, notifiers$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GClosureNotifyData *notifiers
     * }
     */
    public static void notifiers(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(notifiers$LAYOUT, notifiers$OFFSET, fieldValue);
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


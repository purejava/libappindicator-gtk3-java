// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.function.Consumer;

import static java.lang.foreign.MemoryLayout.PathElement.groupElement;

/**
 * {@snippet lang=c :
 * struct _GtkEntryCompletionClass {
 *     GObjectClass parent_class;
 *     gboolean (*match_selected)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *);
 *     void (*action_activated)(GtkEntryCompletion *, gint);
 *     gboolean (*insert_prefix)(GtkEntryCompletion *, const gchar *);
 *     gboolean (*cursor_on_match)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *);
 *     void (*no_matches)(GtkEntryCompletion *);
 *     void (*_gtk_reserved0)(void);
 *     void (*_gtk_reserved1)(void);
 *     void (*_gtk_reserved2)(void);
 * }
 * }
 */
public class _GtkEntryCompletionClass {

    _GtkEntryCompletionClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GObjectClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("match_selected"),
        app_indicator_h.C_POINTER.withName("action_activated"),
        app_indicator_h.C_POINTER.withName("insert_prefix"),
        app_indicator_h.C_POINTER.withName("cursor_on_match"),
        app_indicator_h.C_POINTER.withName("no_matches"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved0"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved1"),
        app_indicator_h.C_POINTER.withName("_gtk_reserved2")
    ).withName("_GtkEntryCompletionClass");

    /**
     * The layout of this struct
     */
    public static final GroupLayout layout() {
        return $LAYOUT;
    }

    private static final GroupLayout parent_class$LAYOUT = (GroupLayout)$LAYOUT.select(groupElement("parent_class"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static final GroupLayout parent_class$layout() {
        return parent_class$LAYOUT;
    }

    private static final long parent_class$OFFSET = 0;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static final long parent_class$offset() {
        return parent_class$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static MemorySegment parent_class(MemorySegment struct) {
        return struct.asSlice(parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * GObjectClass parent_class
     * }
     */
    public static void parent_class(MemorySegment struct, MemorySegment fieldValue) {
        MemorySegment.copy(fieldValue, 0L, struct, parent_class$OFFSET, parent_class$LAYOUT.byteSize());
    }

    /**
     * {@snippet lang=c :
     * gboolean (*match_selected)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public class match_selected {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(match_selected.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(match_selected.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout match_selected$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("match_selected"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*match_selected)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static final AddressLayout match_selected$layout() {
        return match_selected$LAYOUT;
    }

    private static final long match_selected$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*match_selected)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static final long match_selected$offset() {
        return match_selected$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*match_selected)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static MemorySegment match_selected(MemorySegment struct) {
        return struct.get(match_selected$LAYOUT, match_selected$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*match_selected)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static void match_selected(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(match_selected$LAYOUT, match_selected$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*action_activated)(GtkEntryCompletion *, gint)
     * }
     */
    public class action_activated {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(action_activated.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(action_activated.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout action_activated$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("action_activated"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*action_activated)(GtkEntryCompletion *, gint)
     * }
     */
    public static final AddressLayout action_activated$layout() {
        return action_activated$LAYOUT;
    }

    private static final long action_activated$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*action_activated)(GtkEntryCompletion *, gint)
     * }
     */
    public static final long action_activated$offset() {
        return action_activated$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*action_activated)(GtkEntryCompletion *, gint)
     * }
     */
    public static MemorySegment action_activated(MemorySegment struct) {
        return struct.get(action_activated$LAYOUT, action_activated$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*action_activated)(GtkEntryCompletion *, gint)
     * }
     */
    public static void action_activated(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(action_activated$LAYOUT, action_activated$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*insert_prefix)(GtkEntryCompletion *, const gchar *)
     * }
     */
    public class insert_prefix {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(insert_prefix.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(insert_prefix.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout insert_prefix$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("insert_prefix"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*insert_prefix)(GtkEntryCompletion *, const gchar *)
     * }
     */
    public static final AddressLayout insert_prefix$layout() {
        return insert_prefix$LAYOUT;
    }

    private static final long insert_prefix$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*insert_prefix)(GtkEntryCompletion *, const gchar *)
     * }
     */
    public static final long insert_prefix$offset() {
        return insert_prefix$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*insert_prefix)(GtkEntryCompletion *, const gchar *)
     * }
     */
    public static MemorySegment insert_prefix(MemorySegment struct) {
        return struct.get(insert_prefix$LAYOUT, insert_prefix$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*insert_prefix)(GtkEntryCompletion *, const gchar *)
     * }
     */
    public static void insert_prefix(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(insert_prefix$LAYOUT, insert_prefix$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*cursor_on_match)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public class cursor_on_match {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, MemorySegment _x1, MemorySegment _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(cursor_on_match.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(cursor_on_match.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, MemorySegment _x1, MemorySegment _x2) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout cursor_on_match$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("cursor_on_match"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*cursor_on_match)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static final AddressLayout cursor_on_match$layout() {
        return cursor_on_match$LAYOUT;
    }

    private static final long cursor_on_match$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*cursor_on_match)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static final long cursor_on_match$offset() {
        return cursor_on_match$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*cursor_on_match)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static MemorySegment cursor_on_match(MemorySegment struct) {
        return struct.get(cursor_on_match$LAYOUT, cursor_on_match$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*cursor_on_match)(GtkEntryCompletion *, GtkTreeModel *, GtkTreeIter *)
     * }
     */
    public static void cursor_on_match(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(cursor_on_match$LAYOUT, cursor_on_match$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*no_matches)(GtkEntryCompletion *)
     * }
     */
    public class no_matches {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(no_matches.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(no_matches.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout no_matches$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("no_matches"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*no_matches)(GtkEntryCompletion *)
     * }
     */
    public static final AddressLayout no_matches$layout() {
        return no_matches$LAYOUT;
    }

    private static final long no_matches$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*no_matches)(GtkEntryCompletion *)
     * }
     */
    public static final long no_matches$offset() {
        return no_matches$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*no_matches)(GtkEntryCompletion *)
     * }
     */
    public static MemorySegment no_matches(MemorySegment struct) {
        return struct.get(no_matches$LAYOUT, no_matches$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*no_matches)(GtkEntryCompletion *)
     * }
     */
    public static void no_matches(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(no_matches$LAYOUT, no_matches$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved0)(void)
     * }
     */
    public class _gtk_reserved0 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved0.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved0.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved0$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved0"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved0)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved0$layout() {
        return _gtk_reserved0$LAYOUT;
    }

    private static final long _gtk_reserved0$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved0)(void)
     * }
     */
    public static final long _gtk_reserved0$offset() {
        return _gtk_reserved0$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved0)(void)
     * }
     */
    public static MemorySegment _gtk_reserved0(MemorySegment struct) {
        return struct.get(_gtk_reserved0$LAYOUT, _gtk_reserved0$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved0)(void)
     * }
     */
    public static void _gtk_reserved0(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved0$LAYOUT, _gtk_reserved0$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public class _gtk_reserved1 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved1.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved1$layout() {
        return _gtk_reserved1$LAYOUT;
    }

    private static final long _gtk_reserved1$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static final long _gtk_reserved1$offset() {
        return _gtk_reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static MemorySegment _gtk_reserved1(MemorySegment struct) {
        return struct.get(_gtk_reserved1$LAYOUT, _gtk_reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved1)(void)
     * }
     */
    public static void _gtk_reserved1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved1$LAYOUT, _gtk_reserved1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public class _gtk_reserved2 {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply();
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid();

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(_gtk_reserved2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(_gtk_reserved2.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr) {
            try {
                 DOWN$MH.invokeExact(funcPtr);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout _gtk_reserved2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("_gtk_reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static final AddressLayout _gtk_reserved2$layout() {
        return _gtk_reserved2$LAYOUT;
    }

    private static final long _gtk_reserved2$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static final long _gtk_reserved2$offset() {
        return _gtk_reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static MemorySegment _gtk_reserved2(MemorySegment struct) {
        return struct.get(_gtk_reserved2$LAYOUT, _gtk_reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*_gtk_reserved2)(void)
     * }
     */
    public static void _gtk_reserved2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(_gtk_reserved2$LAYOUT, _gtk_reserved2$OFFSET, fieldValue);
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


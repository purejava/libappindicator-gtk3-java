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
 * struct _GtkStatusIconClass {
 *     GObjectClass parent_class;
 *     void (*activate)(GtkStatusIcon *);
 *     void (*popup_menu)(GtkStatusIcon *, guint, guint32);
 *     gboolean (*size_changed)(GtkStatusIcon *, gint);
 *     gboolean (*button_press_event)(GtkStatusIcon *, GdkEventButton *);
 *     gboolean (*button_release_event)(GtkStatusIcon *, GdkEventButton *);
 *     gboolean (*scroll_event)(GtkStatusIcon *, GdkEventScroll *);
 *     gboolean (*query_tooltip)(GtkStatusIcon *, gint, gint, gboolean, GtkTooltip *);
 *     void (*__gtk_reserved1)(void);
 *     void (*__gtk_reserved2)(void);
 *     void (*__gtk_reserved3)(void);
 *     void (*__gtk_reserved4)(void);
 * }
 * }
 */
public class _GtkStatusIconClass {

    _GtkStatusIconClass() {
        // Should not be called directly
    }

    private static final GroupLayout $LAYOUT = MemoryLayout.structLayout(
        _GObjectClass.layout().withName("parent_class"),
        app_indicator_h.C_POINTER.withName("activate"),
        app_indicator_h.C_POINTER.withName("popup_menu"),
        app_indicator_h.C_POINTER.withName("size_changed"),
        app_indicator_h.C_POINTER.withName("button_press_event"),
        app_indicator_h.C_POINTER.withName("button_release_event"),
        app_indicator_h.C_POINTER.withName("scroll_event"),
        app_indicator_h.C_POINTER.withName("query_tooltip"),
        app_indicator_h.C_POINTER.withName("__gtk_reserved1"),
        app_indicator_h.C_POINTER.withName("__gtk_reserved2"),
        app_indicator_h.C_POINTER.withName("__gtk_reserved3"),
        app_indicator_h.C_POINTER.withName("__gtk_reserved4")
    ).withName("_GtkStatusIconClass");

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
     * void (*activate)(GtkStatusIcon *)
     * }
     */
    public class activate {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(activate.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(activate.Function fi, Arena arena) {
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

    private static final AddressLayout activate$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("activate"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*activate)(GtkStatusIcon *)
     * }
     */
    public static final AddressLayout activate$layout() {
        return activate$LAYOUT;
    }

    private static final long activate$OFFSET = 136;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*activate)(GtkStatusIcon *)
     * }
     */
    public static final long activate$offset() {
        return activate$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*activate)(GtkStatusIcon *)
     * }
     */
    public static MemorySegment activate(MemorySegment struct) {
        return struct.get(activate$LAYOUT, activate$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*activate)(GtkStatusIcon *)
     * }
     */
    public static void activate(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(activate$LAYOUT, activate$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*popup_menu)(GtkStatusIcon *, guint, guint32)
     * }
     */
    public class popup_menu {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            void apply(MemorySegment _x0, int _x1, int _x2);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.ofVoid(
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(popup_menu.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(popup_menu.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static void invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2) {
            try {
                 DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout popup_menu$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("popup_menu"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*popup_menu)(GtkStatusIcon *, guint, guint32)
     * }
     */
    public static final AddressLayout popup_menu$layout() {
        return popup_menu$LAYOUT;
    }

    private static final long popup_menu$OFFSET = 144;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*popup_menu)(GtkStatusIcon *, guint, guint32)
     * }
     */
    public static final long popup_menu$offset() {
        return popup_menu$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*popup_menu)(GtkStatusIcon *, guint, guint32)
     * }
     */
    public static MemorySegment popup_menu(MemorySegment struct) {
        return struct.get(popup_menu$LAYOUT, popup_menu$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*popup_menu)(GtkStatusIcon *, guint, guint32)
     * }
     */
    public static void popup_menu(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(popup_menu$LAYOUT, popup_menu$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*size_changed)(GtkStatusIcon *, gint)
     * }
     */
    public class size_changed {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(size_changed.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(size_changed.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout size_changed$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("size_changed"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*size_changed)(GtkStatusIcon *, gint)
     * }
     */
    public static final AddressLayout size_changed$layout() {
        return size_changed$LAYOUT;
    }

    private static final long size_changed$OFFSET = 152;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*size_changed)(GtkStatusIcon *, gint)
     * }
     */
    public static final long size_changed$offset() {
        return size_changed$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*size_changed)(GtkStatusIcon *, gint)
     * }
     */
    public static MemorySegment size_changed(MemorySegment struct) {
        return struct.get(size_changed$LAYOUT, size_changed$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*size_changed)(GtkStatusIcon *, gint)
     * }
     */
    public static void size_changed(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(size_changed$LAYOUT, size_changed$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*button_press_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public class button_press_event {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(button_press_event.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(button_press_event.Function fi, Arena arena) {
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

    private static final AddressLayout button_press_event$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("button_press_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*button_press_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static final AddressLayout button_press_event$layout() {
        return button_press_event$LAYOUT;
    }

    private static final long button_press_event$OFFSET = 160;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*button_press_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static final long button_press_event$offset() {
        return button_press_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*button_press_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static MemorySegment button_press_event(MemorySegment struct) {
        return struct.get(button_press_event$LAYOUT, button_press_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*button_press_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static void button_press_event(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(button_press_event$LAYOUT, button_press_event$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*button_release_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public class button_release_event {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(button_release_event.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(button_release_event.Function fi, Arena arena) {
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

    private static final AddressLayout button_release_event$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("button_release_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*button_release_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static final AddressLayout button_release_event$layout() {
        return button_release_event$LAYOUT;
    }

    private static final long button_release_event$OFFSET = 168;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*button_release_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static final long button_release_event$offset() {
        return button_release_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*button_release_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static MemorySegment button_release_event(MemorySegment struct) {
        return struct.get(button_release_event$LAYOUT, button_release_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*button_release_event)(GtkStatusIcon *, GdkEventButton *)
     * }
     */
    public static void button_release_event(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(button_release_event$LAYOUT, button_release_event$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*scroll_event)(GtkStatusIcon *, GdkEventScroll *)
     * }
     */
    public class scroll_event {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(scroll_event.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(scroll_event.Function fi, Arena arena) {
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

    private static final AddressLayout scroll_event$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("scroll_event"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*scroll_event)(GtkStatusIcon *, GdkEventScroll *)
     * }
     */
    public static final AddressLayout scroll_event$layout() {
        return scroll_event$LAYOUT;
    }

    private static final long scroll_event$OFFSET = 176;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*scroll_event)(GtkStatusIcon *, GdkEventScroll *)
     * }
     */
    public static final long scroll_event$offset() {
        return scroll_event$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*scroll_event)(GtkStatusIcon *, GdkEventScroll *)
     * }
     */
    public static MemorySegment scroll_event(MemorySegment struct) {
        return struct.get(scroll_event$LAYOUT, scroll_event$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*scroll_event)(GtkStatusIcon *, GdkEventScroll *)
     * }
     */
    public static void scroll_event(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(scroll_event$LAYOUT, scroll_event$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * gboolean (*query_tooltip)(GtkStatusIcon *, gint, gint, gboolean, GtkTooltip *)
     * }
     */
    public class query_tooltip {

        /**
         * The function pointer signature, expressed as a functional interface
         */
        public interface Function {
            int apply(MemorySegment _x0, int _x1, int _x2, int _x3, MemorySegment _x4);
        }

        private static final FunctionDescriptor $DESC = FunctionDescriptor.of(
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT,
            app_indicator_h.C_INT,
            app_indicator_h.C_POINTER
        );

        /**
         * The descriptor of this function pointer
         */
        public static FunctionDescriptor descriptor() {
            return $DESC;
        }

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(query_tooltip.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(query_tooltip.Function fi, Arena arena) {
            return Linker.nativeLinker().upcallStub(UP$MH.bindTo(fi), $DESC, arena);
        }

        private static final MethodHandle DOWN$MH = Linker.nativeLinker().downcallHandle($DESC);

        /**
         * Invoke the upcall stub {@code funcPtr}, with given parameters
         */
        public static int invoke(MemorySegment funcPtr,MemorySegment _x0, int _x1, int _x2, int _x3, MemorySegment _x4) {
            try {
                return (int) DOWN$MH.invokeExact(funcPtr, _x0, _x1, _x2, _x3, _x4);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        }
    }

    private static final AddressLayout query_tooltip$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("query_tooltip"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * gboolean (*query_tooltip)(GtkStatusIcon *, gint, gint, gboolean, GtkTooltip *)
     * }
     */
    public static final AddressLayout query_tooltip$layout() {
        return query_tooltip$LAYOUT;
    }

    private static final long query_tooltip$OFFSET = 184;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * gboolean (*query_tooltip)(GtkStatusIcon *, gint, gint, gboolean, GtkTooltip *)
     * }
     */
    public static final long query_tooltip$offset() {
        return query_tooltip$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * gboolean (*query_tooltip)(GtkStatusIcon *, gint, gint, gboolean, GtkTooltip *)
     * }
     */
    public static MemorySegment query_tooltip(MemorySegment struct) {
        return struct.get(query_tooltip$LAYOUT, query_tooltip$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * gboolean (*query_tooltip)(GtkStatusIcon *, gint, gint, gboolean, GtkTooltip *)
     * }
     */
    public static void query_tooltip(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(query_tooltip$LAYOUT, query_tooltip$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*__gtk_reserved1)(void)
     * }
     */
    public class __gtk_reserved1 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(__gtk_reserved1.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(__gtk_reserved1.Function fi, Arena arena) {
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

    private static final AddressLayout __gtk_reserved1$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__gtk_reserved1"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved1)(void)
     * }
     */
    public static final AddressLayout __gtk_reserved1$layout() {
        return __gtk_reserved1$LAYOUT;
    }

    private static final long __gtk_reserved1$OFFSET = 192;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved1)(void)
     * }
     */
    public static final long __gtk_reserved1$offset() {
        return __gtk_reserved1$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved1)(void)
     * }
     */
    public static MemorySegment __gtk_reserved1(MemorySegment struct) {
        return struct.get(__gtk_reserved1$LAYOUT, __gtk_reserved1$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved1)(void)
     * }
     */
    public static void __gtk_reserved1(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__gtk_reserved1$LAYOUT, __gtk_reserved1$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*__gtk_reserved2)(void)
     * }
     */
    public class __gtk_reserved2 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(__gtk_reserved2.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(__gtk_reserved2.Function fi, Arena arena) {
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

    private static final AddressLayout __gtk_reserved2$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__gtk_reserved2"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved2)(void)
     * }
     */
    public static final AddressLayout __gtk_reserved2$layout() {
        return __gtk_reserved2$LAYOUT;
    }

    private static final long __gtk_reserved2$OFFSET = 200;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved2)(void)
     * }
     */
    public static final long __gtk_reserved2$offset() {
        return __gtk_reserved2$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved2)(void)
     * }
     */
    public static MemorySegment __gtk_reserved2(MemorySegment struct) {
        return struct.get(__gtk_reserved2$LAYOUT, __gtk_reserved2$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved2)(void)
     * }
     */
    public static void __gtk_reserved2(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__gtk_reserved2$LAYOUT, __gtk_reserved2$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*__gtk_reserved3)(void)
     * }
     */
    public class __gtk_reserved3 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(__gtk_reserved3.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(__gtk_reserved3.Function fi, Arena arena) {
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

    private static final AddressLayout __gtk_reserved3$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__gtk_reserved3"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved3)(void)
     * }
     */
    public static final AddressLayout __gtk_reserved3$layout() {
        return __gtk_reserved3$LAYOUT;
    }

    private static final long __gtk_reserved3$OFFSET = 208;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved3)(void)
     * }
     */
    public static final long __gtk_reserved3$offset() {
        return __gtk_reserved3$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved3)(void)
     * }
     */
    public static MemorySegment __gtk_reserved3(MemorySegment struct) {
        return struct.get(__gtk_reserved3$LAYOUT, __gtk_reserved3$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved3)(void)
     * }
     */
    public static void __gtk_reserved3(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__gtk_reserved3$LAYOUT, __gtk_reserved3$OFFSET, fieldValue);
    }

    /**
     * {@snippet lang=c :
     * void (*__gtk_reserved4)(void)
     * }
     */
    public class __gtk_reserved4 {

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

        private static final MethodHandle UP$MH = app_indicator_h.upcallHandle(__gtk_reserved4.Function.class, "apply", $DESC);

        /**
         * Allocates a new upcall stub, whose implementation is defined by {@code fi}.
         * The lifetime of the returned segment is managed by {@code arena}
         */
        public static MemorySegment allocate(__gtk_reserved4.Function fi, Arena arena) {
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

    private static final AddressLayout __gtk_reserved4$LAYOUT = (AddressLayout)$LAYOUT.select(groupElement("__gtk_reserved4"));

    /**
     * Layout for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved4)(void)
     * }
     */
    public static final AddressLayout __gtk_reserved4$layout() {
        return __gtk_reserved4$LAYOUT;
    }

    private static final long __gtk_reserved4$OFFSET = 216;

    /**
     * Offset for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved4)(void)
     * }
     */
    public static final long __gtk_reserved4$offset() {
        return __gtk_reserved4$OFFSET;
    }

    /**
     * Getter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved4)(void)
     * }
     */
    public static MemorySegment __gtk_reserved4(MemorySegment struct) {
        return struct.get(__gtk_reserved4$LAYOUT, __gtk_reserved4$OFFSET);
    }

    /**
     * Setter for field:
     * {@snippet lang=c :
     * void (*__gtk_reserved4)(void)
     * }
     */
    public static void __gtk_reserved4(MemorySegment struct, MemorySegment fieldValue) {
        struct.set(__gtk_reserved4$LAYOUT, __gtk_reserved4$OFFSET, fieldValue);
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


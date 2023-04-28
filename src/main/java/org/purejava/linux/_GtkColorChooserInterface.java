// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GtkColorChooserInterface {
 *     GTypeInterface base_interface;
 *     void (*get_rgba)(GtkColorChooser*,GdkRGBA*);
 *     void (*set_rgba)(GtkColorChooser*,const GdkRGBA*);
 *     void (*add_palette)(GtkColorChooser*,GtkOrientation,gint,gint,GdkRGBA*);
 *     void (*color_activated)(GtkColorChooser*,const GdkRGBA*);
 *     gpointer padding[12];
 * };
 * }
 */
public class _GtkColorChooserInterface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("base_interface"),
        Constants$root.C_POINTER$LAYOUT.withName("get_rgba"),
        Constants$root.C_POINTER$LAYOUT.withName("set_rgba"),
        Constants$root.C_POINTER$LAYOUT.withName("add_palette"),
        Constants$root.C_POINTER$LAYOUT.withName("color_activated"),
        MemoryLayout.sequenceLayout(12, Constants$root.C_POINTER$LAYOUT).withName("padding")
    ).withName("_GtkColorChooserInterface");
    public static MemoryLayout $LAYOUT() {
        return _GtkColorChooserInterface.$struct$LAYOUT;
    }
    public static MemorySegment base_interface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor get_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor get_rgba_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_rgba_UP$MH = RuntimeHelper.upcallHandle(get_rgba.class, "apply", _GtkColorChooserInterface.get_rgba_UP$FUNC);
    static final FunctionDescriptor get_rgba_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle get_rgba_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkColorChooserInterface.get_rgba_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*get_rgba)(GtkColorChooser*,GdkRGBA*);
     * }
     */
    public interface get_rgba {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(get_rgba fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkColorChooserInterface.get_rgba_UP$MH, fi, _GtkColorChooserInterface.get_rgba$FUNC, scope);
        }
        static get_rgba ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkColorChooserInterface.get_rgba_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle get_rgba$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("get_rgba"));
    public static VarHandle get_rgba$VH() {
        return _GtkColorChooserInterface.get_rgba$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*get_rgba)(GtkColorChooser*,GdkRGBA*);
     * }
     */
    public static MemorySegment get_rgba$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.get_rgba$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*get_rgba)(GtkColorChooser*,GdkRGBA*);
     * }
     */
    public static void get_rgba$set(MemorySegment seg, MemorySegment x) {
        _GtkColorChooserInterface.get_rgba$VH.set(seg, x);
    }
    public static MemorySegment get_rgba$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.get_rgba$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void get_rgba$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkColorChooserInterface.get_rgba$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static get_rgba get_rgba(MemorySegment segment, SegmentScope scope) {
        return get_rgba.ofAddress(get_rgba$get(segment), scope);
    }
    static final FunctionDescriptor set_rgba$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor set_rgba_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_rgba_UP$MH = RuntimeHelper.upcallHandle(set_rgba.class, "apply", _GtkColorChooserInterface.set_rgba_UP$FUNC);
    static final FunctionDescriptor set_rgba_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_rgba_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkColorChooserInterface.set_rgba_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*set_rgba)(GtkColorChooser*,const GdkRGBA*);
     * }
     */
    public interface set_rgba {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_rgba fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkColorChooserInterface.set_rgba_UP$MH, fi, _GtkColorChooserInterface.set_rgba$FUNC, scope);
        }
        static set_rgba ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkColorChooserInterface.set_rgba_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_rgba$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_rgba"));
    public static VarHandle set_rgba$VH() {
        return _GtkColorChooserInterface.set_rgba$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_rgba)(GtkColorChooser*,const GdkRGBA*);
     * }
     */
    public static MemorySegment set_rgba$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.set_rgba$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_rgba)(GtkColorChooser*,const GdkRGBA*);
     * }
     */
    public static void set_rgba$set(MemorySegment seg, MemorySegment x) {
        _GtkColorChooserInterface.set_rgba$VH.set(seg, x);
    }
    public static MemorySegment set_rgba$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.set_rgba$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_rgba$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkColorChooserInterface.set_rgba$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_rgba set_rgba(MemorySegment segment, SegmentScope scope) {
        return set_rgba.ofAddress(set_rgba$get(segment), scope);
    }
    static final FunctionDescriptor add_palette$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor add_palette_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle add_palette_UP$MH = RuntimeHelper.upcallHandle(add_palette.class, "apply", _GtkColorChooserInterface.add_palette_UP$FUNC);
    static final FunctionDescriptor add_palette_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle add_palette_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkColorChooserInterface.add_palette_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*add_palette)(GtkColorChooser*,GtkOrientation,gint,gint,GdkRGBA*);
     * }
     */
    public interface add_palette {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2, int _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(add_palette fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkColorChooserInterface.add_palette_UP$MH, fi, _GtkColorChooserInterface.add_palette$FUNC, scope);
        }
        static add_palette ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2, int __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    _GtkColorChooserInterface.add_palette_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle add_palette$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("add_palette"));
    public static VarHandle add_palette$VH() {
        return _GtkColorChooserInterface.add_palette$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*add_palette)(GtkColorChooser*,GtkOrientation,gint,gint,GdkRGBA*);
     * }
     */
    public static MemorySegment add_palette$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.add_palette$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*add_palette)(GtkColorChooser*,GtkOrientation,gint,gint,GdkRGBA*);
     * }
     */
    public static void add_palette$set(MemorySegment seg, MemorySegment x) {
        _GtkColorChooserInterface.add_palette$VH.set(seg, x);
    }
    public static MemorySegment add_palette$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.add_palette$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void add_palette$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkColorChooserInterface.add_palette$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static add_palette add_palette(MemorySegment segment, SegmentScope scope) {
        return add_palette.ofAddress(add_palette$get(segment), scope);
    }
    static final FunctionDescriptor color_activated$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor color_activated_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle color_activated_UP$MH = RuntimeHelper.upcallHandle(color_activated.class, "apply", _GtkColorChooserInterface.color_activated_UP$FUNC);
    static final FunctionDescriptor color_activated_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle color_activated_DOWN$MH = RuntimeHelper.downcallHandle(
        _GtkColorChooserInterface.color_activated_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*color_activated)(GtkColorChooser*,const GdkRGBA*);
     * }
     */
    public interface color_activated {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(color_activated fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_GtkColorChooserInterface.color_activated_UP$MH, fi, _GtkColorChooserInterface.color_activated$FUNC, scope);
        }
        static color_activated ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _GtkColorChooserInterface.color_activated_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle color_activated$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("color_activated"));
    public static VarHandle color_activated$VH() {
        return _GtkColorChooserInterface.color_activated$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*color_activated)(GtkColorChooser*,const GdkRGBA*);
     * }
     */
    public static MemorySegment color_activated$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.color_activated$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*color_activated)(GtkColorChooser*,const GdkRGBA*);
     * }
     */
    public static void color_activated$set(MemorySegment seg, MemorySegment x) {
        _GtkColorChooserInterface.color_activated$VH.set(seg, x);
    }
    public static MemorySegment color_activated$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_GtkColorChooserInterface.color_activated$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void color_activated$set(MemorySegment seg, long index, MemorySegment x) {
        _GtkColorChooserInterface.color_activated$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static color_activated color_activated(MemorySegment segment, SegmentScope scope) {
        return color_activated.ofAddress(color_activated$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(48, 96);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


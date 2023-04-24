// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _AtkEditableTextIface {
 *     GTypeInterface parent_interface;
 *     gboolean (*set_run_attributes)(AtkEditableText*,AtkAttributeSet*,gint,gint);
 *     void (*set_text_contents)(AtkEditableText*,const gchar*);
 *     void (*insert_text)(AtkEditableText*,const gchar*,gint,gint*);
 *     void (*copy_text)(AtkEditableText*,gint,gint);
 *     void (*cut_text)(AtkEditableText*,gint,gint);
 *     void (*delete_text)(AtkEditableText*,gint,gint);
 *     void (*paste_text)(AtkEditableText*,gint);
 * };
 * }
 */
public class _AtkEditableTextIface {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        MemoryLayout.structLayout(
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_type"),
            Constants$root.C_LONG_LONG$LAYOUT.withName("g_instance_type")
        ).withName("parent_interface"),
        Constants$root.C_POINTER$LAYOUT.withName("set_run_attributes"),
        Constants$root.C_POINTER$LAYOUT.withName("set_text_contents"),
        Constants$root.C_POINTER$LAYOUT.withName("insert_text"),
        Constants$root.C_POINTER$LAYOUT.withName("copy_text"),
        Constants$root.C_POINTER$LAYOUT.withName("cut_text"),
        Constants$root.C_POINTER$LAYOUT.withName("delete_text"),
        Constants$root.C_POINTER$LAYOUT.withName("paste_text")
    ).withName("_AtkEditableTextIface");
    public static MemoryLayout $LAYOUT() {
        return _AtkEditableTextIface.$struct$LAYOUT;
    }
    public static MemorySegment parent_interface$slice(MemorySegment seg) {
        return seg.asSlice(0, 16);
    }
    static final FunctionDescriptor set_run_attributes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor set_run_attributes_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle set_run_attributes_UP$MH = RuntimeHelper.upcallHandle(set_run_attributes.class, "apply", _AtkEditableTextIface.set_run_attributes_UP$FUNC);
    static final FunctionDescriptor set_run_attributes_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle set_run_attributes_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.set_run_attributes_DOWN$FUNC
    );
    /**
     * {@snippet :
 * gboolean (*set_run_attributes)(AtkEditableText*,AtkAttributeSet*,gint,gint);
     * }
     */
    public interface set_run_attributes {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, int _x3);
        static MemorySegment allocate(set_run_attributes fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.set_run_attributes_UP$MH, fi, _AtkEditableTextIface.set_run_attributes$FUNC, scope);
        }
        static set_run_attributes ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, int __x3) -> {
                try {
                    return (int)_AtkEditableTextIface.set_run_attributes_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_run_attributes$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_run_attributes"));
    public static VarHandle set_run_attributes$VH() {
        return _AtkEditableTextIface.set_run_attributes$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * gboolean (*set_run_attributes)(AtkEditableText*,AtkAttributeSet*,gint,gint);
     * }
     */
    public static MemorySegment set_run_attributes$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.set_run_attributes$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * gboolean (*set_run_attributes)(AtkEditableText*,AtkAttributeSet*,gint,gint);
     * }
     */
    public static void set_run_attributes$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.set_run_attributes$VH.set(seg, x);
    }
    public static MemorySegment set_run_attributes$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.set_run_attributes$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_run_attributes$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.set_run_attributes$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_run_attributes set_run_attributes(MemorySegment segment, SegmentScope scope) {
        return set_run_attributes.ofAddress(set_run_attributes$get(segment), scope);
    }
    static final FunctionDescriptor set_text_contents$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor set_text_contents_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_text_contents_UP$MH = RuntimeHelper.upcallHandle(set_text_contents.class, "apply", _AtkEditableTextIface.set_text_contents_UP$FUNC);
    static final FunctionDescriptor set_text_contents_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle set_text_contents_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.set_text_contents_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*set_text_contents)(AtkEditableText*,const gchar*);
     * }
     */
    public interface set_text_contents {

        void apply(java.lang.foreign.MemorySegment tag, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(set_text_contents fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.set_text_contents_UP$MH, fi, _AtkEditableTextIface.set_text_contents$FUNC, scope);
        }
        static set_text_contents ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment _tag, java.lang.foreign.MemorySegment _data) -> {
                try {
                    _AtkEditableTextIface.set_text_contents_DOWN$MH.invokeExact(symbol, _tag, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle set_text_contents$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("set_text_contents"));
    public static VarHandle set_text_contents$VH() {
        return _AtkEditableTextIface.set_text_contents$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*set_text_contents)(AtkEditableText*,const gchar*);
     * }
     */
    public static MemorySegment set_text_contents$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.set_text_contents$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*set_text_contents)(AtkEditableText*,const gchar*);
     * }
     */
    public static void set_text_contents$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.set_text_contents$VH.set(seg, x);
    }
    public static MemorySegment set_text_contents$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.set_text_contents$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void set_text_contents$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.set_text_contents$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static set_text_contents set_text_contents(MemorySegment segment, SegmentScope scope) {
        return set_text_contents.ofAddress(set_text_contents$get(segment), scope);
    }
    static final FunctionDescriptor insert_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor insert_text_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle insert_text_UP$MH = RuntimeHelper.upcallHandle(insert_text.class, "apply", _AtkEditableTextIface.insert_text_UP$FUNC);
    static final FunctionDescriptor insert_text_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle insert_text_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.insert_text_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*insert_text)(AtkEditableText*,const gchar*,gint,gint*);
     * }
     */
    public interface insert_text {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(insert_text fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.insert_text_UP$MH, fi, _AtkEditableTextIface.insert_text$FUNC, scope);
        }
        static insert_text ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    _AtkEditableTextIface.insert_text_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle insert_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("insert_text"));
    public static VarHandle insert_text$VH() {
        return _AtkEditableTextIface.insert_text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*insert_text)(AtkEditableText*,const gchar*,gint,gint*);
     * }
     */
    public static MemorySegment insert_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.insert_text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*insert_text)(AtkEditableText*,const gchar*,gint,gint*);
     * }
     */
    public static void insert_text$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.insert_text$VH.set(seg, x);
    }
    public static MemorySegment insert_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.insert_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void insert_text$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.insert_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static insert_text insert_text(MemorySegment segment, SegmentScope scope) {
        return insert_text.ofAddress(insert_text$get(segment), scope);
    }
    static final FunctionDescriptor copy_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor copy_text_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle copy_text_UP$MH = RuntimeHelper.upcallHandle(copy_text.class, "apply", _AtkEditableTextIface.copy_text_UP$FUNC);
    static final FunctionDescriptor copy_text_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle copy_text_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.copy_text_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*copy_text)(AtkEditableText*,gint,gint);
     * }
     */
    public interface copy_text {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(copy_text fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.copy_text_UP$MH, fi, _AtkEditableTextIface.copy_text$FUNC, scope);
        }
        static copy_text ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    _AtkEditableTextIface.copy_text_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle copy_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("copy_text"));
    public static VarHandle copy_text$VH() {
        return _AtkEditableTextIface.copy_text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*copy_text)(AtkEditableText*,gint,gint);
     * }
     */
    public static MemorySegment copy_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.copy_text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*copy_text)(AtkEditableText*,gint,gint);
     * }
     */
    public static void copy_text$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.copy_text$VH.set(seg, x);
    }
    public static MemorySegment copy_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.copy_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void copy_text$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.copy_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static copy_text copy_text(MemorySegment segment, SegmentScope scope) {
        return copy_text.ofAddress(copy_text$get(segment), scope);
    }
    static final FunctionDescriptor cut_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor cut_text_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cut_text_UP$MH = RuntimeHelper.upcallHandle(cut_text.class, "apply", _AtkEditableTextIface.cut_text_UP$FUNC);
    static final FunctionDescriptor cut_text_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle cut_text_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.cut_text_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*cut_text)(AtkEditableText*,gint,gint);
     * }
     */
    public interface cut_text {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(cut_text fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.cut_text_UP$MH, fi, _AtkEditableTextIface.cut_text$FUNC, scope);
        }
        static cut_text ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    _AtkEditableTextIface.cut_text_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle cut_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("cut_text"));
    public static VarHandle cut_text$VH() {
        return _AtkEditableTextIface.cut_text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*cut_text)(AtkEditableText*,gint,gint);
     * }
     */
    public static MemorySegment cut_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.cut_text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*cut_text)(AtkEditableText*,gint,gint);
     * }
     */
    public static void cut_text$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.cut_text$VH.set(seg, x);
    }
    public static MemorySegment cut_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.cut_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void cut_text$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.cut_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static cut_text cut_text(MemorySegment segment, SegmentScope scope) {
        return cut_text.ofAddress(cut_text$get(segment), scope);
    }
    static final FunctionDescriptor delete_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor delete_text_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle delete_text_UP$MH = RuntimeHelper.upcallHandle(delete_text.class, "apply", _AtkEditableTextIface.delete_text_UP$FUNC);
    static final FunctionDescriptor delete_text_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle delete_text_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.delete_text_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*delete_text)(AtkEditableText*,gint,gint);
     * }
     */
    public interface delete_text {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1, int _x2);
        static MemorySegment allocate(delete_text fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.delete_text_UP$MH, fi, _AtkEditableTextIface.delete_text$FUNC, scope);
        }
        static delete_text ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1, int __x2) -> {
                try {
                    _AtkEditableTextIface.delete_text_DOWN$MH.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle delete_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("delete_text"));
    public static VarHandle delete_text$VH() {
        return _AtkEditableTextIface.delete_text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*delete_text)(AtkEditableText*,gint,gint);
     * }
     */
    public static MemorySegment delete_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.delete_text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*delete_text)(AtkEditableText*,gint,gint);
     * }
     */
    public static void delete_text$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.delete_text$VH.set(seg, x);
    }
    public static MemorySegment delete_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.delete_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void delete_text$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.delete_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static delete_text delete_text(MemorySegment segment, SegmentScope scope) {
        return delete_text.ofAddress(delete_text$get(segment), scope);
    }
    static final FunctionDescriptor paste_text$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final FunctionDescriptor paste_text_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle paste_text_UP$MH = RuntimeHelper.upcallHandle(paste_text.class, "apply", _AtkEditableTextIface.paste_text_UP$FUNC);
    static final FunctionDescriptor paste_text_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle paste_text_DOWN$MH = RuntimeHelper.downcallHandle(
        _AtkEditableTextIface.paste_text_DOWN$FUNC
    );
    /**
     * {@snippet :
 * void (*paste_text)(AtkEditableText*,gint);
     * }
     */
    public interface paste_text {

        void apply(java.lang.foreign.MemorySegment _x0, int _x1);
        static MemorySegment allocate(paste_text fi, SegmentScope scope) {
            return RuntimeHelper.upcallStub(_AtkEditableTextIface.paste_text_UP$MH, fi, _AtkEditableTextIface.paste_text$FUNC, scope);
        }
        static paste_text ofAddress(MemorySegment addr, SegmentScope scope) {
            MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
            return (java.lang.foreign.MemorySegment __x0, int __x1) -> {
                try {
                    _AtkEditableTextIface.paste_text_DOWN$MH.invokeExact(symbol, __x0, __x1);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    static final VarHandle paste_text$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("paste_text"));
    public static VarHandle paste_text$VH() {
        return _AtkEditableTextIface.paste_text$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*paste_text)(AtkEditableText*,gint);
     * }
     */
    public static MemorySegment paste_text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.paste_text$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*paste_text)(AtkEditableText*,gint);
     * }
     */
    public static void paste_text$set(MemorySegment seg, MemorySegment x) {
        _AtkEditableTextIface.paste_text$VH.set(seg, x);
    }
    public static MemorySegment paste_text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)_AtkEditableTextIface.paste_text$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void paste_text$set(MemorySegment seg, long index, MemorySegment x) {
        _AtkEditableTextIface.paste_text$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static paste_text paste_text(MemorySegment segment, SegmentScope scope) {
        return paste_text.ofAddress(paste_text$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


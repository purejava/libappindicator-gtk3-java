// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
/**
 * {@snippet :
 * struct _GTlsInteractionClass {
 *     struct _GObjectClass parent_class;
 *     enum GTlsInteractionResult (*ask_password)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,struct _GError**);
 *     void (*ask_password_async)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     enum GTlsInteractionResult (*ask_password_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
 *     enum GTlsInteractionResult (*request_certificate)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,struct _GError**);
 *     void (*request_certificate_async)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
 *     enum GTlsInteractionResult (*request_certificate_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
 *     void* padding[21];
 * };
 * }
 */
public class _GTlsInteractionClass {

    public static MemoryLayout $LAYOUT() {
        return constants$1374.const$0;
    }
    public static MemorySegment parent_class$slice(MemorySegment seg) {
        return seg.asSlice(0, 136);
    }
    /**
     * {@snippet :
 * enum GTlsInteractionResult (*ask_password)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface ask_password {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2, java.lang.foreign.MemorySegment _x3);
        static MemorySegment allocate(ask_password fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1374.const$1, fi, constants$34.const$5, scope);
        }
        static ask_password ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2, java.lang.foreign.MemorySegment __x3) -> {
                try {
                    return (int)constants$382.const$0.invokeExact(symbol, __x0, __x1, __x2, __x3);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ask_password$VH() {
        return constants$1374.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*ask_password)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment ask_password$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1374.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*ask_password)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void ask_password$set(MemorySegment seg, MemorySegment x) {
        constants$1374.const$2.set(seg, x);
    }
    public static MemorySegment ask_password$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1374.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1374.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password ask_password(MemorySegment segment, Arena scope) {
        return ask_password.ofAddress(ask_password$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*ask_password_async)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface ask_password_async {

        void apply(java.lang.foreign.MemorySegment cell_layout, java.lang.foreign.MemorySegment cell, java.lang.foreign.MemorySegment tree_model, java.lang.foreign.MemorySegment iter, java.lang.foreign.MemorySegment data);
        static MemorySegment allocate(ask_password_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1374.const$3, fi, constants$331.const$1, scope);
        }
        static ask_password_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _cell_layout, java.lang.foreign.MemorySegment _cell, java.lang.foreign.MemorySegment _tree_model, java.lang.foreign.MemorySegment _iter, java.lang.foreign.MemorySegment _data) -> {
                try {
                    constants$916.const$3.invokeExact(symbol, _cell_layout, _cell, _tree_model, _iter, _data);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ask_password_async$VH() {
        return constants$1374.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*ask_password_async)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment ask_password_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1374.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*ask_password_async)(struct _GTlsInteraction*,struct _GTlsPassword*,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void ask_password_async$set(MemorySegment seg, MemorySegment x) {
        constants$1374.const$4.set(seg, x);
    }
    public static MemorySegment ask_password_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1374.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1374.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password_async ask_password_async(MemorySegment segment, Arena scope) {
        return ask_password_async.ofAddress(ask_password_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * enum GTlsInteractionResult (*ask_password_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface ask_password_finish {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(ask_password_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1374.const$5, fi, constants$12.const$2, scope);
        }
        static ask_password_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle ask_password_finish$VH() {
        return constants$1375.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*ask_password_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment ask_password_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1375.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*ask_password_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void ask_password_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1375.const$0.set(seg, x);
    }
    public static MemorySegment ask_password_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1375.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void ask_password_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1375.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static ask_password_finish ask_password_finish(MemorySegment segment, Arena scope) {
        return ask_password_finish.ofAddress(ask_password_finish$get(segment), scope);
    }
    /**
     * {@snippet :
 * enum GTlsInteractionResult (*request_certificate)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,struct _GError**);
     * }
     */
    public interface request_certificate {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4);
        static MemorySegment allocate(request_certificate fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1375.const$1, fi, constants$859.const$1, scope);
        }
        static request_certificate ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4) -> {
                try {
                    return (int)constants$985.const$1.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle request_certificate$VH() {
        return constants$1375.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*request_certificate)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,struct _GError**);
     * }
     */
    public static MemorySegment request_certificate$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1375.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*request_certificate)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,struct _GError**);
     * }
     */
    public static void request_certificate$set(MemorySegment seg, MemorySegment x) {
        constants$1375.const$2.set(seg, x);
    }
    public static MemorySegment request_certificate$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1375.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void request_certificate$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1375.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static request_certificate request_certificate(MemorySegment segment, Arena scope) {
        return request_certificate.ofAddress(request_certificate$get(segment), scope);
    }
    /**
     * {@snippet :
 * void (*request_certificate_async)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public interface request_certificate_async {

        void apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, int _x2, java.lang.foreign.MemorySegment _x3, java.lang.foreign.MemorySegment _x4, java.lang.foreign.MemorySegment _x5);
        static MemorySegment allocate(request_certificate_async fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1375.const$3, fi, constants$584.const$3, scope);
        }
        static request_certificate_async ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, int __x2, java.lang.foreign.MemorySegment __x3, java.lang.foreign.MemorySegment __x4, java.lang.foreign.MemorySegment __x5) -> {
                try {
                    constants$584.const$5.invokeExact(symbol, __x0, __x1, __x2, __x3, __x4, __x5);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle request_certificate_async$VH() {
        return constants$1375.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*request_certificate_async)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static MemorySegment request_certificate_async$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1375.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*request_certificate_async)(struct _GTlsInteraction*,struct _GTlsConnection*,enum GTlsCertificateRequestFlags,struct _GCancellable*,void (*)(struct _GObject*,struct _GAsyncResult*,void*),void*);
     * }
     */
    public static void request_certificate_async$set(MemorySegment seg, MemorySegment x) {
        constants$1375.const$4.set(seg, x);
    }
    public static MemorySegment request_certificate_async$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1375.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void request_certificate_async$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1375.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static request_certificate_async request_certificate_async(MemorySegment segment, Arena scope) {
        return request_certificate_async.ofAddress(request_certificate_async$get(segment), scope);
    }
    /**
     * {@snippet :
 * enum GTlsInteractionResult (*request_certificate_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public interface request_certificate_finish {

        int apply(java.lang.foreign.MemorySegment _x0, java.lang.foreign.MemorySegment _x1, java.lang.foreign.MemorySegment _x2);
        static MemorySegment allocate(request_certificate_finish fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$1375.const$5, fi, constants$12.const$2, scope);
        }
        static request_certificate_finish ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment __x0, java.lang.foreign.MemorySegment __x1, java.lang.foreign.MemorySegment __x2) -> {
                try {
                    return (int)constants$12.const$4.invokeExact(symbol, __x0, __x1, __x2);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle request_certificate_finish$VH() {
        return constants$1376.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*request_certificate_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static MemorySegment request_certificate_finish$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$1376.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTlsInteractionResult (*request_certificate_finish)(struct _GTlsInteraction*,struct _GAsyncResult*,struct _GError**);
     * }
     */
    public static void request_certificate_finish$set(MemorySegment seg, MemorySegment x) {
        constants$1376.const$0.set(seg, x);
    }
    public static MemorySegment request_certificate_finish$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$1376.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void request_certificate_finish$set(MemorySegment seg, long index, MemorySegment x) {
        constants$1376.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static request_certificate_finish request_certificate_finish(MemorySegment segment, Arena scope) {
        return request_certificate_finish.ofAddress(request_certificate_finish$get(segment), scope);
    }
    public static MemorySegment padding$slice(MemorySegment seg) {
        return seg.asSlice(184, 168);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}



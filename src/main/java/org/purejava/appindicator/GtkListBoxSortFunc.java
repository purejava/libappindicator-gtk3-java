// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.*;

/**
 * {@snippet :
 * int (*GtkListBoxSortFunc)(struct _GtkListBoxRow* row1,struct _GtkListBoxRow* row2,void* user_data);
 * }
 */
public interface GtkListBoxSortFunc {

    int apply(java.lang.foreign.MemorySegment a, java.lang.foreign.MemorySegment b, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkListBoxSortFunc fi, SegmentScope scope) {
        return RuntimeHelper.upcallStub(constants$1672.GtkListBoxSortFunc_UP$MH, fi, constants$1672.GtkListBoxSortFunc$FUNC, scope);
    }
    static GtkListBoxSortFunc ofAddress(MemorySegment addr, SegmentScope scope) {
        MemorySegment symbol = MemorySegment.ofAddress(addr.address(), 0, scope);
        return (java.lang.foreign.MemorySegment _a, java.lang.foreign.MemorySegment _b, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (int)constants$1673.GtkListBoxSortFunc_DOWN$MH.invokeExact(symbol, _a, _b, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}


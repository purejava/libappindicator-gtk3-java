// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
/**
 * {@snippet :
 * char* (*GtkCalendarDetailFunc)(struct _GtkCalendar* calendar,unsigned int year,unsigned int month,unsigned int day,void* user_data);
 * }
 */
public interface GtkCalendarDetailFunc {

    java.lang.foreign.MemorySegment apply(java.lang.foreign.MemorySegment calendar, int year, int month, int day, java.lang.foreign.MemorySegment user_data);
    static MemorySegment allocate(GtkCalendarDetailFunc fi, Arena scope) {
        return RuntimeHelper.upcallStub(constants$2557.const$5, fi, constants$1883.const$3, scope);
    }
    static GtkCalendarDetailFunc ofAddress(MemorySegment addr, Arena arena) {
        MemorySegment symbol = addr.reinterpret(arena, null);
        return (java.lang.foreign.MemorySegment _calendar, int _year, int _month, int _day, java.lang.foreign.MemorySegment _user_data) -> {
            try {
                return (java.lang.foreign.MemorySegment)constants$2558.const$0.invokeExact(symbol, _calendar, _year, _month, _day, _user_data);
            } catch (Throwable ex$) {
                throw new AssertionError("should not reach here", ex$);
            }
        };
    }
}



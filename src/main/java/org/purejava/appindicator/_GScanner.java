// Generated by jextract

package org.purejava.appindicator;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct _GScanner {
 *     void* user_data;
 *     unsigned int max_parse_errors;
 *     unsigned int parse_errors;
 *     char* input_name;
 *     struct _GData* qdata;
 *     struct _GScannerConfig* config;
 *     enum GTokenType token;
 *     union _GTokenValue value;
 *     unsigned int line;
 *     unsigned int position;
 *     enum GTokenType next_token;
 *     union _GTokenValue next_value;
 *     unsigned int next_line;
 *     unsigned int next_position;
 *     struct _GHashTable* symbol_table;
 *     int input_fd;
 *     char* text;
 *     char* text_end;
 *     char* buffer;
 *     unsigned int scope_id;
 *     void (*msg_handler)(struct _GScanner*,char*,int);
 * };
 * }
 */
public class _GScanner {

    public static MemoryLayout $LAYOUT() {
        return constants$423.const$4;
    }
    public static VarHandle user_data$VH() {
        return constants$423.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void* user_data;
     * }
     */
    public static MemorySegment user_data$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$423.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void* user_data;
     * }
     */
    public static void user_data$set(MemorySegment seg, MemorySegment x) {
        constants$423.const$5.set(seg, x);
    }
    public static MemorySegment user_data$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$423.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void user_data$set(MemorySegment seg, long index, MemorySegment x) {
        constants$423.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle max_parse_errors$VH() {
        return constants$424.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int max_parse_errors;
     * }
     */
    public static int max_parse_errors$get(MemorySegment seg) {
        return (int)constants$424.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int max_parse_errors;
     * }
     */
    public static void max_parse_errors$set(MemorySegment seg, int x) {
        constants$424.const$0.set(seg, x);
    }
    public static int max_parse_errors$get(MemorySegment seg, long index) {
        return (int)constants$424.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void max_parse_errors$set(MemorySegment seg, long index, int x) {
        constants$424.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle parse_errors$VH() {
        return constants$424.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int parse_errors;
     * }
     */
    public static int parse_errors$get(MemorySegment seg) {
        return (int)constants$424.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int parse_errors;
     * }
     */
    public static void parse_errors$set(MemorySegment seg, int x) {
        constants$424.const$1.set(seg, x);
    }
    public static int parse_errors$get(MemorySegment seg, long index) {
        return (int)constants$424.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void parse_errors$set(MemorySegment seg, long index, int x) {
        constants$424.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle input_name$VH() {
        return constants$424.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* input_name;
     * }
     */
    public static MemorySegment input_name$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$424.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* input_name;
     * }
     */
    public static void input_name$set(MemorySegment seg, MemorySegment x) {
        constants$424.const$2.set(seg, x);
    }
    public static MemorySegment input_name$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$424.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void input_name$set(MemorySegment seg, long index, MemorySegment x) {
        constants$424.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle qdata$VH() {
        return constants$424.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GData* qdata;
     * }
     */
    public static MemorySegment qdata$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$424.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GData* qdata;
     * }
     */
    public static void qdata$set(MemorySegment seg, MemorySegment x) {
        constants$424.const$3.set(seg, x);
    }
    public static MemorySegment qdata$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$424.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void qdata$set(MemorySegment seg, long index, MemorySegment x) {
        constants$424.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle config$VH() {
        return constants$424.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GScannerConfig* config;
     * }
     */
    public static MemorySegment config$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$424.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GScannerConfig* config;
     * }
     */
    public static void config$set(MemorySegment seg, MemorySegment x) {
        constants$424.const$4.set(seg, x);
    }
    public static MemorySegment config$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$424.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void config$set(MemorySegment seg, long index, MemorySegment x) {
        constants$424.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle token$VH() {
        return constants$424.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTokenType token;
     * }
     */
    public static int token$get(MemorySegment seg) {
        return (int)constants$424.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTokenType token;
     * }
     */
    public static void token$set(MemorySegment seg, int x) {
        constants$424.const$5.set(seg, x);
    }
    public static int token$get(MemorySegment seg, long index) {
        return (int)constants$424.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void token$set(MemorySegment seg, long index, int x) {
        constants$424.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment value$slice(MemorySegment seg) {
        return seg.asSlice(48, 8);
    }
    public static VarHandle line$VH() {
        return constants$425.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int line;
     * }
     */
    public static int line$get(MemorySegment seg) {
        return (int)constants$425.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int line;
     * }
     */
    public static void line$set(MemorySegment seg, int x) {
        constants$425.const$0.set(seg, x);
    }
    public static int line$get(MemorySegment seg, long index) {
        return (int)constants$425.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void line$set(MemorySegment seg, long index, int x) {
        constants$425.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle position$VH() {
        return constants$425.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int position;
     * }
     */
    public static int position$get(MemorySegment seg) {
        return (int)constants$425.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int position;
     * }
     */
    public static void position$set(MemorySegment seg, int x) {
        constants$425.const$1.set(seg, x);
    }
    public static int position$get(MemorySegment seg, long index) {
        return (int)constants$425.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void position$set(MemorySegment seg, long index, int x) {
        constants$425.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next_token$VH() {
        return constants$425.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * enum GTokenType next_token;
     * }
     */
    public static int next_token$get(MemorySegment seg) {
        return (int)constants$425.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * enum GTokenType next_token;
     * }
     */
    public static void next_token$set(MemorySegment seg, int x) {
        constants$425.const$2.set(seg, x);
    }
    public static int next_token$get(MemorySegment seg, long index) {
        return (int)constants$425.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void next_token$set(MemorySegment seg, long index, int x) {
        constants$425.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static MemorySegment next_value$slice(MemorySegment seg) {
        return seg.asSlice(72, 8);
    }
    public static VarHandle next_line$VH() {
        return constants$425.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int next_line;
     * }
     */
    public static int next_line$get(MemorySegment seg) {
        return (int)constants$425.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int next_line;
     * }
     */
    public static void next_line$set(MemorySegment seg, int x) {
        constants$425.const$3.set(seg, x);
    }
    public static int next_line$get(MemorySegment seg, long index) {
        return (int)constants$425.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void next_line$set(MemorySegment seg, long index, int x) {
        constants$425.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle next_position$VH() {
        return constants$425.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int next_position;
     * }
     */
    public static int next_position$get(MemorySegment seg) {
        return (int)constants$425.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int next_position;
     * }
     */
    public static void next_position$set(MemorySegment seg, int x) {
        constants$425.const$4.set(seg, x);
    }
    public static int next_position$get(MemorySegment seg, long index) {
        return (int)constants$425.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void next_position$set(MemorySegment seg, long index, int x) {
        constants$425.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle symbol_table$VH() {
        return constants$425.const$5;
    }
    /**
     * Getter for field:
     * {@snippet :
     * struct _GHashTable* symbol_table;
     * }
     */
    public static MemorySegment symbol_table$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$425.const$5.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * struct _GHashTable* symbol_table;
     * }
     */
    public static void symbol_table$set(MemorySegment seg, MemorySegment x) {
        constants$425.const$5.set(seg, x);
    }
    public static MemorySegment symbol_table$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$425.const$5.get(seg.asSlice(index*sizeof()));
    }
    public static void symbol_table$set(MemorySegment seg, long index, MemorySegment x) {
        constants$425.const$5.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle input_fd$VH() {
        return constants$426.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * int input_fd;
     * }
     */
    public static int input_fd$get(MemorySegment seg) {
        return (int)constants$426.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * int input_fd;
     * }
     */
    public static void input_fd$set(MemorySegment seg, int x) {
        constants$426.const$0.set(seg, x);
    }
    public static int input_fd$get(MemorySegment seg, long index) {
        return (int)constants$426.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void input_fd$set(MemorySegment seg, long index, int x) {
        constants$426.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle text$VH() {
        return constants$426.const$1;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static MemorySegment text$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$426.const$1.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* text;
     * }
     */
    public static void text$set(MemorySegment seg, MemorySegment x) {
        constants$426.const$1.set(seg, x);
    }
    public static MemorySegment text$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$426.const$1.get(seg.asSlice(index*sizeof()));
    }
    public static void text$set(MemorySegment seg, long index, MemorySegment x) {
        constants$426.const$1.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle text_end$VH() {
        return constants$426.const$2;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* text_end;
     * }
     */
    public static MemorySegment text_end$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$426.const$2.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* text_end;
     * }
     */
    public static void text_end$set(MemorySegment seg, MemorySegment x) {
        constants$426.const$2.set(seg, x);
    }
    public static MemorySegment text_end$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$426.const$2.get(seg.asSlice(index*sizeof()));
    }
    public static void text_end$set(MemorySegment seg, long index, MemorySegment x) {
        constants$426.const$2.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle buffer$VH() {
        return constants$426.const$3;
    }
    /**
     * Getter for field:
     * {@snippet :
     * char* buffer;
     * }
     */
    public static MemorySegment buffer$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$426.const$3.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * char* buffer;
     * }
     */
    public static void buffer$set(MemorySegment seg, MemorySegment x) {
        constants$426.const$3.set(seg, x);
    }
    public static MemorySegment buffer$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$426.const$3.get(seg.asSlice(index*sizeof()));
    }
    public static void buffer$set(MemorySegment seg, long index, MemorySegment x) {
        constants$426.const$3.set(seg.asSlice(index*sizeof()), x);
    }
    public static VarHandle scope_id$VH() {
        return constants$426.const$4;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned int scope_id;
     * }
     */
    public static int scope_id$get(MemorySegment seg) {
        return (int)constants$426.const$4.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned int scope_id;
     * }
     */
    public static void scope_id$set(MemorySegment seg, int x) {
        constants$426.const$4.set(seg, x);
    }
    public static int scope_id$get(MemorySegment seg, long index) {
        return (int)constants$426.const$4.get(seg.asSlice(index*sizeof()));
    }
    public static void scope_id$set(MemorySegment seg, long index, int x) {
        constants$426.const$4.set(seg.asSlice(index*sizeof()), x);
    }
    /**
     * {@snippet :
 * void (*msg_handler)(struct _GScanner*,char*,int);
     * }
     */
    public interface msg_handler {

        void apply(java.lang.foreign.MemorySegment screen, java.lang.foreign.MemorySegment colors, int n_colors);
        static MemorySegment allocate(msg_handler fi, Arena scope) {
            return RuntimeHelper.upcallStub(constants$426.const$5, fi, constants$164.const$5, scope);
        }
        static msg_handler ofAddress(MemorySegment addr, Arena arena) {
            MemorySegment symbol = addr.reinterpret(arena, null);
            return (java.lang.foreign.MemorySegment _screen, java.lang.foreign.MemorySegment _colors, int _n_colors) -> {
                try {
                    constants$420.const$2.invokeExact(symbol, _screen, _colors, _n_colors);
                } catch (Throwable ex$) {
                    throw new AssertionError("should not reach here", ex$);
                }
            };
        }
    }

    public static VarHandle msg_handler$VH() {
        return constants$427.const$0;
    }
    /**
     * Getter for field:
     * {@snippet :
     * void (*msg_handler)(struct _GScanner*,char*,int);
     * }
     */
    public static MemorySegment msg_handler$get(MemorySegment seg) {
        return (java.lang.foreign.MemorySegment)constants$427.const$0.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * void (*msg_handler)(struct _GScanner*,char*,int);
     * }
     */
    public static void msg_handler$set(MemorySegment seg, MemorySegment x) {
        constants$427.const$0.set(seg, x);
    }
    public static MemorySegment msg_handler$get(MemorySegment seg, long index) {
        return (java.lang.foreign.MemorySegment)constants$427.const$0.get(seg.asSlice(index*sizeof()));
    }
    public static void msg_handler$set(MemorySegment seg, long index, MemorySegment x) {
        constants$427.const$0.set(seg.asSlice(index*sizeof()), x);
    }
    public static msg_handler msg_handler(MemorySegment segment, Arena scope) {
        return msg_handler.ofAddress(msg_handler$get(segment), scope);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, Arena scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}



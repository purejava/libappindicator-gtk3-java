// Generated by jextract

package org.purejava.linux;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
final class constants$1997 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$1997() {}
    static final MemorySegment G_URI_RESERVED_CHARS_GENERIC_DELIMITERS$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String(":/?#[]@");
    static final MemorySegment G_URI_RESERVED_CHARS_SUBCOMPONENT_DELIMITERS$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("!$&\'()*+,;=");
    static final MemorySegment G_URI_RESERVED_CHARS_ALLOWED_IN_PATH_ELEMENT$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("!$&\'()*+,;=:@");
    static final MemorySegment G_URI_RESERVED_CHARS_ALLOWED_IN_PATH$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("!$&\'()*+,;=:@/");
    static final MemorySegment G_URI_RESERVED_CHARS_ALLOWED_IN_USERINFO$SEGMENT = RuntimeHelper.CONSTANT_ALLOCATOR.allocateUtf8String("!$&\'()*+,;=:");
    static final MemorySegment PTHREAD_CANCELED$ADDR = MemorySegment.ofAddress(-1L);
}


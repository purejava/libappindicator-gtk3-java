// Generated by jextract

package org.purejava.appindicator;

import java.lang.invoke.MethodHandle;
import java.lang.foreign.*;

final class constants$470 {

    // Suppresses default constructor, ensuring non-instantiability.
    private constants$470() {}
    static final FunctionDescriptor GFileMeasureProgressCallback$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GFileMeasureProgressCallback_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFileMeasureProgressCallback_UP$MH = RuntimeHelper.upcallHandle(GFileMeasureProgressCallback.class, "apply", constants$470.GFileMeasureProgressCallback_UP$FUNC);
    static final FunctionDescriptor GFileMeasureProgressCallback_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GFileMeasureProgressCallback_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$470.GFileMeasureProgressCallback_DOWN$FUNC
    );
    static final FunctionDescriptor GIOSchedulerJobFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GIOSchedulerJobFunc_UP$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOSchedulerJobFunc_UP$MH = RuntimeHelper.upcallHandle(GIOSchedulerJobFunc.class, "apply", constants$470.GIOSchedulerJobFunc_UP$FUNC);
    static final FunctionDescriptor GIOSchedulerJobFunc_DOWN$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GIOSchedulerJobFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$470.GIOSchedulerJobFunc_DOWN$FUNC
    );
    static final FunctionDescriptor GSimpleAsyncThreadFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final FunctionDescriptor GSimpleAsyncThreadFunc_UP$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSimpleAsyncThreadFunc_UP$MH = RuntimeHelper.upcallHandle(GSimpleAsyncThreadFunc.class, "apply", constants$470.GSimpleAsyncThreadFunc_UP$FUNC);
    static final FunctionDescriptor GSimpleAsyncThreadFunc_DOWN$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GSimpleAsyncThreadFunc_DOWN$MH = RuntimeHelper.downcallHandle(
        constants$470.GSimpleAsyncThreadFunc_DOWN$FUNC
    );
}


package com.android.launcher3;

import android.content.Context;

import com.android.launcher3.util.ResourceBasedOverride;

public interface AppFilter implements ResourceBasedOverride {

    boolean shouldShowApp(String packageName, Context context, boolean isWidgetPanel);

}

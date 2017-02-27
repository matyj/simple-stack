package com.zhuinden.simplestackdemonestedstack.presentation.paths.main.cloudsync.another.internal2;

import com.google.auto.value.AutoValue;
import com.zhuinden.simplestackdemonestedstack.R;
import com.zhuinden.simplestackdemonestedstack.application.Key;
import com.zhuinden.simplestackdemonestedstack.presentation.paths.main.MainView;

/**
 * Created by Zhuinden on 2017.02.26..
 */
@AutoValue
public abstract class Internal2Key
        extends Key {
    @Override
    public int layout() {
        return R.layout.path_internal2;
    }

    @Override
    public String stackIdentifier() {
        return MainView.StackType.CLOUDSYNC.name();
    }

    public static Internal2Key create() {
        return new AutoValue_Internal2Key();
    }
}
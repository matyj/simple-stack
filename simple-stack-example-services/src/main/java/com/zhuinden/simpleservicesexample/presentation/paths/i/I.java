package com.zhuinden.simpleservicesexample.presentation.paths.i;

import com.google.auto.value.AutoValue;
import com.zhuinden.servicetree.ServiceTree;
import com.zhuinden.simpleservicesexample.R;
import com.zhuinden.simpleservicesexample.application.Key;
import com.zhuinden.simpleservicesexample.utils.Child;
import com.zhuinden.simpleservicesexample.utils.MockService;


/**
 * Created by Owner on 2017. 02. 17..
 */

@AutoValue
public abstract class I
        extends Key
        implements Child {
    public abstract Key parent();

    @Override
    public int layout() {
        return R.layout.path_i;
    }

    public static I create(Key parent) {
        return new AutoValue_I(parent);
    }

    @Override
    public void bindServices(ServiceTree.Node node) {
        node.bindService("I", new MockService("I"));
    }
}

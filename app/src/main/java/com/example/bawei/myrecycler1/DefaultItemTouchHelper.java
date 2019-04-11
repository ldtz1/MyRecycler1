package com.example.bawei.myrecycler1;

import android.support.annotation.NonNull;
import android.support.v7.widget.helper.ItemTouchHelper;

public class DefaultItemTouchHelper extends ItemTouchHelper {
    public DefaultItemTouchHelper(@NonNull Callback callback) {
        super(callback);
    }
}

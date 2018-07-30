package com.example.datacache.widget;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;

/**
 * Created by thinkpad on 2018/7/18.
 */
public class ScreenDialog extends AlertDialog{
    public ScreenDialog(Context context) {
        super(context);

    }

    public ScreenDialog(Context context, int themeResId) {
        super(context, themeResId);
    }

    protected ScreenDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }
}

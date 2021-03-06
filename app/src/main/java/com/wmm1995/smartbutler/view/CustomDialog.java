package com.wmm1995.smartbutler.view;

import android.app.Dialog;
import android.content.Context;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

import com.wmm1995.smartbutler.R;

/**
 * Created by Administrator on 2017/2/12.
 * 自定义Dialog
 */

public class CustomDialog extends Dialog{

    //定义属性
    public CustomDialog(Context context, int width, int height, int layout,
                        int style, int gravity, int anim) {
        super(context,style);
        //设置属性
        setContentView(layout);
        Window window = getWindow();
        WindowManager.LayoutParams layoutParams = window.getAttributes();
        layoutParams.width = WindowManager.LayoutParams.MATCH_PARENT;
        layoutParams.height = WindowManager.LayoutParams.WRAP_CONTENT;
        layoutParams.gravity = gravity;
        window.setAttributes(layoutParams);
        window.setWindowAnimations(anim);
    }
}

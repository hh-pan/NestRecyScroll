package com.test.nestrecyscroll;

import android.app.Dialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;


/**
 * Created by Pan on 2018/4/3 0003 22:56
 * Desc:
 */

public class LoadingDialog {

    private static Dialog loadingDialog;

    public static Dialog createDialog(Context context) {
        View v = LayoutInflater.from(context).inflate(R.layout.include_loading_dialog, null);
        loadingDialog = new Dialog(context, R.style.transparent_loading);
        // 创建自定义样式dialog
        loadingDialog.setContentView(v, new LinearLayout.LayoutParams(-1, -1));
        return loadingDialog;
    }
}

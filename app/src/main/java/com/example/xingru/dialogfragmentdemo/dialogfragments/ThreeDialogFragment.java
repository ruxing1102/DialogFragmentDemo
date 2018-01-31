package com.example.xingru.dialogfragmentdemo.dialogfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import com.example.xingru.dialogfragmentdemo.R;

/**
 * Created by xing.ru on 2018/1/30.
 */

public class ThreeDialogFragment extends DialogFragment {

    public static ThreeDialogFragment getInstance() {
        ThreeDialogFragment fragment = new ThreeDialogFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(DialogFragment.STYLE_NORMAL, R.style.CustomDialogShowTypeOne);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dialog_three, container);
        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        getDialog().setCancelable(true);
        getDialog().setCanceledOnTouchOutside(true);

        //设置对话框的显示位置及大小
        WindowManager.LayoutParams attributes = getDialog().getWindow().getAttributes();
        attributes.gravity = Gravity.BOTTOM;
        attributes.width = 600;
        attributes.height = 500;
        getDialog().getWindow().setAttributes(attributes);

    }
}

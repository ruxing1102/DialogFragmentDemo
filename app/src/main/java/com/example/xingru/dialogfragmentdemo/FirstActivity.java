package com.example.xingru.dialogfragmentdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.TextView;

import com.example.xingru.dialogfragmentdemo.dialogfragments.FirstDialogFragment;

/**
 * Created by xing.ru on 2018/1/26.
 */

public class FirstActivity extends FragmentActivity {

    private TextView tv_show_dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        tv_show_dialog = (TextView) findViewById(R.id.tv_show_dialog);
        tv_show_dialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialog();
            }
        });

    }

    private void showDialog() {
        FragmentManager manager = getSupportFragmentManager();
        FirstDialogFragment dialogFragment = new FirstDialogFragment();
        dialogFragment.show(manager, "first_dialog_fragment");
    }
}

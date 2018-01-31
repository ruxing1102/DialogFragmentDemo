package com.example.xingru.dialogfragmentdemo.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.xingru.dialogfragmentdemo.R;
import com.example.xingru.dialogfragmentdemo.dialogfragments.TwoDialogFragment;

/**
 * Created by xing.ru on 2018/1/26.
 */

public class TwoActivity extends AppCompatActivity {

    private TextView tv_show_dialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
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
        TwoDialogFragment dialogFragment = new TwoDialogFragment();
        dialogFragment.show(manager, "first_dialog_fragment");
    }
}

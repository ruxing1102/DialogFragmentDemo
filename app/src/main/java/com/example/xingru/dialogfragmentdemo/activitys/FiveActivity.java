package com.example.xingru.dialogfragmentdemo.activitys;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.xingru.dialogfragmentdemo.R;
import com.example.xingru.dialogfragmentdemo.dialogfragments.FiveDialogFragment;

/**
 * Created by xing.ru on 2018/1/31.
 */

public class FiveActivity extends AppCompatActivity {

    private TextView mTvShowDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);
        mTvShowDialog=(TextView)findViewById(R.id.tv_show_dialog);
        mTvShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FiveDialogFragment.getInstance().show(getSupportFragmentManager(),"show_custom_dialog");
            }
        });
    }
}

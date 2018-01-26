package com.example.xingru.dialogfragmentdemo;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.xingru.dialogfragmentdemo.dialogfragments.FirstDialogFragment;

public class MainActivity extends AppCompatActivity {

    private TextView mTvShowCustomDialogOne;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvShowCustomDialogOne = (TextView) findViewById(R.id.tv_show_custom_dialog_one);
        mTvShowCustomDialogOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }

}

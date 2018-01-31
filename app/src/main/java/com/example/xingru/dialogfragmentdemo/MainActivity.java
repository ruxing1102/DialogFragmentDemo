package com.example.xingru.dialogfragmentdemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.example.xingru.dialogfragmentdemo.activitys.FiveActivity;
import com.example.xingru.dialogfragmentdemo.activitys.FourActivity;
import com.example.xingru.dialogfragmentdemo.activitys.OneActivity;
import com.example.xingru.dialogfragmentdemo.activitys.ThreeActivity;
import com.example.xingru.dialogfragmentdemo.activitys.TwoActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mTvDialogOne;
    private TextView mTvDialogTwo;
    private TextView mTvDialogThree;
    private TextView mTvDialogFour;
    private TextView mTvDialogFive;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTvDialogOne = (TextView) findViewById(R.id.tv_show_dialog_one);
        mTvDialogTwo = (TextView) findViewById(R.id.tv_show_dialog_two);
        mTvDialogThree = (TextView) findViewById(R.id.tv_show_dialog_three);
        mTvDialogFour = (TextView) findViewById(R.id.tv_show_dialog_four);
        mTvDialogFive = (TextView) findViewById(R.id.tv_show_dialog_five);
        mTvDialogOne.setOnClickListener(this);
        mTvDialogTwo.setOnClickListener(this);
        mTvDialogThree.setOnClickListener(this);
        mTvDialogFour.setOnClickListener(this);
        mTvDialogFive.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.tv_show_dialog_one:
                Intent intent_one = new Intent();
                intent_one.setClass(MainActivity.this, OneActivity.class);
                startActivity(intent_one);
                break;
            case R.id.tv_show_dialog_two:
                Intent intent_two = new Intent();
                intent_two.setClass(MainActivity.this, TwoActivity.class);
                startActivity(intent_two);
                break;
            case R.id.tv_show_dialog_three:
                Intent intent_three = new Intent();
                intent_three.setClass(MainActivity.this, ThreeActivity.class);
                startActivity(intent_three);
                break;
            case R.id.tv_show_dialog_four:
                Intent intent_four = new Intent();
                intent_four.setClass(MainActivity.this, FourActivity.class);
                startActivity(intent_four);
                break;
            case R.id.tv_show_dialog_five:
                Intent intent_five = new Intent();
                intent_five.setClass(MainActivity.this, FiveActivity.class);
                startActivity(intent_five);
                break;
        }
    }
}

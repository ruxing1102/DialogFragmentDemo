package com.example.xingru.dialogfragmentdemo.dialogfragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.xingru.dialogfragmentdemo.R;

/**
 * Created by xing.ru on 2018/1/24.
 */

public class FirstDialogFragment extends DialogFragment {

    private EditText et_name;
    private EditText et_school;
    private Button btn_confirm;

    public FirstDialogFragment() {

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_my_dialog, container);
        et_name = (EditText) view.findViewById(R.id.et_name);
        et_school = (EditText) view.findViewById(R.id.et_school);
        btn_confirm = (Button) view.findViewById(R.id.btn_confirm);
        return view;
    }

}

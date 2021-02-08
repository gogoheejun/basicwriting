package com.hjhj.nothingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void clickBtn(View view) {
//        finish();
        //소프트 키패드 없애기
        InputMethodManager imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);  //getLayoutinflater처럼 get으로 안찾아지면 getSystemService하면됨
        imm.hideSoftInputFromWindow(getCurrentFocus().getWindowToken(), 0);
    }
}
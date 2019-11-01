package com.rwz.lifecycle;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * date： 2019/10/31 10:46
 * author： rwz
 * description：
 **/
public class BaseActivity extends AppCompatActivity {

    private final String TAG = "zzz  ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        print(TAG, "onCreate()");
    }

    private void print(String TAG, String text) {
        Log.d(TAG, getClass().getSimpleName() + "#" + text);
    }

    @Override
    protected void onPause() {
        super.onPause();
        print(TAG, "onPause()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        print(TAG, "onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        print(TAG, "onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        print(TAG, "onRestart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        print(TAG, "onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        print(TAG, "onDestroy()");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        print(TAG, "onSaveInstanceState()");
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        print(TAG, "onRestoreInstanceState()");
    }


}

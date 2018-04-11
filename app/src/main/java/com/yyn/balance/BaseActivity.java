package com.yyn.balance;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.yyn.balance.utils.BaseUtil;

public class BaseActivity extends AppCompatActivity {
    private final static String TAG = "BaseActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void onStart() {
        Log.d(TAG, "onStart");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.d(TAG, "onResume");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.d(TAG, "onPause");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.d(TAG, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.d(TAG, "onDestroy");
        super.onDestroy();
    }

    protected boolean setTitleText(String title) {
        if (BaseUtil.isEmptyString(title)) {
            Log.e(TAG, "Input tile is null.");
            return false;
        }

        TextView titleView = (TextView) findViewById(R.id.tv_title);
        if (titleView == null) {
            Log.e(TAG, "Cannot find title view! Please check the view id.");
            return false;
        } else {
            titleView.setText(title);
            return true;
        }
    }

    protected boolean setTitleLeftButton(int resId, View.OnClickListener listener) {
        TextView titleLeft = (TextView) findViewById(R.id.tv_title_left);
        if (titleLeft == null) {
            Log.e(TAG, "Cannot find title left button! Please check the view id.");
            return false;
        } else {
            titleLeft.setText(resId);
            if (listener != null) {
                titleLeft.setOnClickListener(listener);
            }
            return true;
        }
    }

    protected boolean setTitleRightButton(int resId, View.OnClickListener listener) {
        TextView titleRight = (TextView) findViewById(R.id.tv_title_right);
        if (titleRight == null) {
            Log.e(TAG, "Cannot find title right button! Please check the view id.");
            return false;
        } else {
            titleRight.setText(resId);
            if (listener != null) {
                titleRight.setOnClickListener(listener);
            }
            return true;
        }
    }

}

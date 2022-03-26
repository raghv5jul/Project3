package com.wegren.project3;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.wegren.wegren.WegrenApp;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WegrenApp wegrenApp = new WegrenApp();
        wegrenApp.callThisApi(this);
    }
}
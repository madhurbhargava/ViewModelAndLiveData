package com.example.madhurbhargava.viewmodelandlivedata;

import android.arch.lifecycle.ViewModelProvider;
import android.arch.lifecycle.ViewModelProviders;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ChronometerViewModel viewModel = ViewModelProviders.of(this).get(ChronometerViewModel.class);
        Chronometer meter = (Chronometer) findViewById(R.id.textview_chronometer);
        if(viewModel.getmStartTime() == null) {
            long time = SystemClock.elapsedRealtime();
            viewModel.setmStartTime(time);
            meter.setBase(time);
        } else {
            meter.setBase(viewModel.getmStartTime());
        }
        meter.start();
    }
}

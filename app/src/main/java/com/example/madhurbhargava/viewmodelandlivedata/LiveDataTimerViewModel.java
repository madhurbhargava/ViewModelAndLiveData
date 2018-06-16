package com.example.madhurbhargava.viewmodelandlivedata;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.os.SystemClock;

import java.util.Timer;
import java.util.TimerTask;

public class LiveDataTimerViewModel extends ViewModel {

    private final long ONE_SECOND = 1000;
    private final long mInitialTime;

    public MutableLiveData<Long> getElapsedTime() {
        return elapsedTime;
    }

    private MutableLiveData<Long> elapsedTime = new MutableLiveData<>();

    public LiveDataTimerViewModel() {
        mInitialTime = SystemClock.elapsedRealtime();
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
                                      @Override
                                      public void run() {

                                          final long newValue = (SystemClock.elapsedRealtime() - mInitialTime) / 1000;
                                          elapsedTime.postValue(newValue);

                                      }
                                  }, ONE_SECOND, ONE_SECOND);
    }
}

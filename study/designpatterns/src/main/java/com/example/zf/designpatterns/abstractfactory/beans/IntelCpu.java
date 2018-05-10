package com.example.zf.designpatterns.abstractfactory.beans;

import android.util.Log;

public class IntelCpu implements Cpu {

    /**
     *Intel cpu 针脚数
     */
    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        Log.e("==================", "===Intel CPU的针脚数：=>" + pins);
    }
}

package com.example.zf.designpatterns.abstractfactory.beans;

import android.util.Log;

public class AmdCpu implements Cpu {

    /**
     * Intel cpu 针脚数
     */
    private int pins = 0;

    public AmdCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calculate() {
        Log.e("==================", "===Amd CPU的针脚数：=>" + pins);
    }
}

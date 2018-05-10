package com.example.zf.designpatterns.abstractfactory.beans;

import android.util.Log;

public class AmdMainboard implements Mainboard {
    /**
     * CPU插槽的孔数
     */
    private int cpuHoles = 0;

    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }


    @Override
    public void installCPU() {
        Log.e("==================", "===Amd主板的CPU插槽孔数是：=>" + cpuHoles);
    }
}

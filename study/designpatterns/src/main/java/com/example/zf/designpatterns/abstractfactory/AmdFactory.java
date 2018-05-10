package com.example.zf.designpatterns.abstractfactory;

import com.example.zf.designpatterns.abstractfactory.beans.AmdCpu;
import com.example.zf.designpatterns.abstractfactory.beans.AmdMainboard;
import com.example.zf.designpatterns.abstractfactory.beans.Cpu;
import com.example.zf.designpatterns.abstractfactory.beans.Mainboard;

public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}

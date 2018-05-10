package com.example.zf.designpatterns.abstractfactory;

import com.example.zf.designpatterns.abstractfactory.beans.Cpu;
import com.example.zf.designpatterns.abstractfactory.beans.IntelCpu;
import com.example.zf.designpatterns.abstractfactory.beans.IntelMainboard;
import com.example.zf.designpatterns.abstractfactory.beans.Mainboard;

public class IntelFactory implements AbstractFactory{
    @Override
    public Cpu createCpu() {
        return new IntelCpu(175);
    }

    @Override
    public Mainboard createMainboard() {
        return new IntelMainboard(175);
    }
}

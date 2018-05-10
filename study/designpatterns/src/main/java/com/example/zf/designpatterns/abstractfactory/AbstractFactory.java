package com.example.zf.designpatterns.abstractfactory;

import com.example.zf.designpatterns.abstractfactory.beans.Cpu;
import com.example.zf.designpatterns.abstractfactory.beans.Mainboard;

public interface AbstractFactory {

    /**
     * 创建Cpu对象
     * @return
     */
    Cpu createCpu();

    /**
     * 创建主板对象
     * @return
     */
    Mainboard createMainboard();

}

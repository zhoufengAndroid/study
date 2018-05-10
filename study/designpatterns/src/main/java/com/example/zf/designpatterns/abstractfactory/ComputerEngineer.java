package com.example.zf.designpatterns.abstractfactory;

import com.example.zf.designpatterns.abstractfactory.beans.Cpu;
import com.example.zf.designpatterns.abstractfactory.beans.Mainboard;

/**
 * 组装电脑的工程师
 */
public class ComputerEngineer {

    private Cpu cpu=null;
    private Mainboard mainboard=null;

    public void makeComputer(AbstractFactory abstractFactory){
        //首先准备好装机所需要的配件
        prepareHardwares(abstractFactory);
    }

    private void prepareHardwares(AbstractFactory abstractFactory) {
        this.cpu=abstractFactory.createCpu();
        this.mainboard=abstractFactory.createMainboard();

        this.cpu.calculate();
        this.mainboard.installCPU();
    }
}

package com.example.zf.designpatterns.abstractfactory;

import com.example.zf.designpatterns.abstractfactory.beans.Cpu;
import com.example.zf.designpatterns.abstractfactory.beans.Mainboard;

/**
 * 客户端
 */
public class Client {

    /**
     * 开始组装
     */
    public static void startAssembly(){
        //创建装机工程师对象
        ComputerEngineer computerEngineer=new ComputerEngineer();
        //客户选择并创建需要使用的产品对象
        AbstractFactory abstractFactory=new AmdFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        computerEngineer.makeComputer(abstractFactory);
    }
}

package com.zly.learn.factory;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/5/8 14:19
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String c){
        if (c.equalsIgnoreCase("shape")){
            return new ShapeFactory();
        }else if (c.equalsIgnoreCase("color")){
            return new ColorFactory();
        }
        return null;
    }
}

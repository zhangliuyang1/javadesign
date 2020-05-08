package com.zly.learn.factory;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/5/8 11:49
 */
public class ColorFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null){
            return null;
        }
        if (color.equalsIgnoreCase("green")){
            return new CGreen();
        }else if (color.equalsIgnoreCase("red")){
            return new CRed();
        }else if (color.equalsIgnoreCase("blue")){
            return new CBlue();
        }
        return null;
    }
}

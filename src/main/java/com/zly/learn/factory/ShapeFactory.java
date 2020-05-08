package com.zly.learn.factory;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/5/8 11:43
 */
public class ShapeFactory extends AbstractFactory{

    @Override
    public Shape getShape(String shape) {
        if (shape == null){
            return null;
        }
        if (shape.equalsIgnoreCase("CIRCLE")){
            return new SCircle();
        }else if (shape.equalsIgnoreCase("RECTANGLE")){
            return new SRectangle();
        }else if (shape.equalsIgnoreCase("SQUARE")){
            return new SSquare();
        }
        return null;
    }

    @Override
    public Color getColor(String color) {
        return null;
    }
}

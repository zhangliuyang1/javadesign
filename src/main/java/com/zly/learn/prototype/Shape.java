package com.zly.learn.prototype;

/**
 * @Author: zhangliuyang01
 * @Date: 2020/9/4 17:36
 */
public abstract class Shape implements Cloneable {

    private String id;
    protected String type;


    abstract void draw();

    @Override
    public Object clone() {
        try {
            Object clone = super.clone();
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}

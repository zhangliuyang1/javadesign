package com.zly.learn.proxy.jdkproxy;

import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;
import java.lang.reflect.Proxy;

/**
 * 1.jdk动态代理   必须有接口
 * 代理模式是23种设计模式的一种，他是指一个对象A通过持有另一个对象B，可以具有B同样的行为的模式。
 * 为了对外开放协议，B往往实现了一个接口，A也会去实现接口。
 * 但是B是“真正”实现类，A则比较“虚”，他借用了B的方法去实现接口的方法。
 * A虽然是“伪军”，但它可以增强B，在调用B的方法前后都做些其他的事情。
 * Spring AOP就是使用了动态代理完成了代码的动态“织入”。
 *
 *
 * 动态代理步骤：
 * 1.创建一个实现接口InvocationHandler的类，它必须实现invoke方法
 * 2.创建被代理的类以及接口
 * 3.通过Proxy的静态方法
 * newProxyInstance(ClassLoaderloader, Class[] interfaces, InvocationHandler h)创建一个代理
 * 4.通过代理调用方法
 * @Author: zhangliuyang01
 * @Date: 2020/7/22 16:59
 */
public class Client {

    public static void main(String[] args) {
        AbstractSubject subject = null;
        System.setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles","true");

        // RealSubject1 被代理对象
        DynamicProxy<RealSubject1> handler = new DynamicProxy(new RealSubject1());

        // 生成的代理类proxy
        Object proxy = Proxy.newProxyInstance(AbstractSubject.class.getClassLoader(), new Class[]{AbstractSubject.class}, handler);
        // 生成的代理类proxy实际上实现了AbstractSubject接口并且继承了Proxy类
        // proxy持有InvocationHandler的引用，InvocationHandler持有被代理对象的引用
        // proxy.request  -> invocationhandler.invoke -> RealSubject1.request
        // 增强是在InvocationHandler 中做的，前置后置都可以
        Class<?>[] interfaces = proxy.getClass().getInterfaces();
        String name = proxy.getClass().getName();
        String typeName = proxy.getClass().getTypeName();
        subject = (AbstractSubject)proxy;
        subject.request();

        createProxyClassFile();
    }


    private static void createProxyClassFile(){
        String name = "ProxySubject";
        byte[] bytes = ProxyGenerator.generateProxyClass(name, new Class[]{AbstractSubject.class});


        try {
            FileOutputStream os = new FileOutputStream(name + ".class");
            os.write(bytes);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

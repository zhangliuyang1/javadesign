> 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。


这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，在需要的时候更新数据库，以此来减少数据库调用。


1、克隆对象不会调用构造方法
这是因为执行clone方法的时候是直接从内存中去获取数据的，
在第一次创建对象的时候就会把数据在内存保留一份，克隆的时候直接调用就好了

2、访问权限对原型模式无效
原理也很简单，我们是从内存中直接复制的，所以克隆起来也会直接无视，复制相应的内容就好了



3、使用场景
（1）当我们的类初始化需要消耗很多的资源时，就可以使用原型模式，
    因为我们的克隆不会执行构造方法，避免了初始化占有的时间和空间。
（2）一个对象被其她对象访问，并且能够修改时，访问权限都无效了，什么都能修改


"用原型实例指定创建对象的种类，并通过拷贝这些原型创建新的对象"
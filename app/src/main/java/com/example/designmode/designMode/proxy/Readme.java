package com.example.designmode.designMode.proxy;



/**
 * 静态代理
 * (1)先定义一个买票的接口 里面是 买票的方法
 * (2)火车站 实现 买票的接口，实现买票方法
 * (3)抢票软件 实现 买票接口 由于买票都是由火车站发售的，抢票软件仅仅是一个中间人，
 * 我们需要复写买票方法，在里面判断是否有火车站实例，如果没有则new 一个出来，并且在买票成功后
 * 送一个保险，因此我们需要自己写一个 购买保险的方法
 */

/**
 * 动态代理
 * (1)定义一个接口，里面定义一个买票的方法
 * (2)火车站实现 接口，并复写买票方法
 * (3)动态代理类实现 InvocationHandler接口，定义需要被代理的对象，再定义需要放
 * 入的火车站对象，实现invoke()方法，此方法中通过反射拿到火车站的买票方法，在买
 * 票方法后紧接一份保险    无论传入的是哪个火车站，都可以以反射得到里面的买票方法
 */

/**
 * 反射：：：
 * 当我们调用new Person()时，虚拟机就会检查内存中是否加载了Person.class这个字节码文件,
 * 如果没有就会加载，此时这个Class对象也会被加载到内存中，当虚拟机实例化Person对象时，
 * 虚拟机需要知道一些信息（如实例化的类中有什么字段、方法等），这些信息都被保存在class对象中，
 * 所以说class类对于虚拟机来说是一个重要的类。因此在反射中，想要知道Person类的信息，就离不开
 * Class对象了
 */

/**
 * 三种加载Class对象的方法
 * （1）Class clazz = CLass.forName("包名.Person")
 *
 * （2）Person person = new Person("张三")
 *      Class clazz = person.getClass()
 *
 * （3）Class clazz = Person.class
 * https://www.jianshu.com/p/e4c1e6b734ad   里面的反射部分讲的比较清楚
 */

/**
 * 动态代理的不足处：
 * 只能代理interface无法代理Class，因为每个动态生成的代理类都已经继承了Proxy类，
 * 如果再代理class的话，就会出现多继承现象，而java是不支持多继承的。
 */
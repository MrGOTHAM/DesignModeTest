package com.example.designmode.designMode.proxy.activeProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 利用虚拟机自动生成代理类，我们只用调用proxy类的newProxyInstance方法，
 * MyInvocationHandler 需要实现 InvocationHandler接口，然后复写里面的
 * invoke方法，当动态代理类中代理方法被调用时，会执行invoke方法。
 */
public class MyInvocationHandler implements InvocationHandler {
    // 需要被代理的对象
    private Object target;

    // 用于传入目标对象 TrainStation
    public void setTarget(Object target) {
        this.target = target;
    }

    // 当调用代理对象的方法时，invoke 可取而代之。
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 调用了目标对象的方法，也就是火车站对象的买票方法。
        Object result = method.invoke(target, args);
        // 之后再买保险
        buyInsurance();
        return result;
    }

    public void buyInsurance() {
        System.out.println("买了一份保险");
    }
}

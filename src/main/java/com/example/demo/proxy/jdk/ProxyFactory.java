package com.example.demo.proxy.jdk;

import org.springframework.cglib.proxy.Proxy;

/**
 * @author MikeWang
 * @date 2024/2/20 17:03
 */
public class ProxyFactory {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                (proxy, method, args) -> {
                    System.out.println("Before invoking the method...");
                    Object returnValue = method.invoke(target, args);
                    System.out.println("After invoking the method...");
                    return returnValue;
                });
    }
}

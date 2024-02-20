package com.example.demo.proxy.cglib;

/**
 * @author MikeWang
 * @date 2024/2/20 17:10
 */
public class Client {
    public static void main(String[] args) {
        Solver solver = new Solver();
        Solver proxy = (Solver) new ProxyFactory(solver).getProxyInstance();
        proxy.solve();
    }
}

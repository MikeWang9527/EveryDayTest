package com.example.demo.proxy.jdk;

/**
 * @author MikeWang
 * @date 2024/2/20 17:04
 */
public class Client {
    public static void main(String[] args) {
        ISolver solver = new Solver();
        ISolver proxy = (ISolver) new ProxyFactory(solver).getProxyInstance();
        proxy.solve();
    }
}

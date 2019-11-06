package lock;

import java.util.concurrent.atomic.AtomicInteger;

public class CASTest {

    public static void main(String[] args) {
        checkCAS();
    }

    public static void checkCAS(){
        AtomicInteger atomicInteger = new AtomicInteger(5);
        System.out.println(atomicInteger.compareAndSet(5,2019)+ "\t current data is " + atomicInteger.get());
        System.out.println(atomicInteger.compareAndSet(5,2014)+ "\t current data is " + atomicInteger.get());
    }
}

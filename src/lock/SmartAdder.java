package lock;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SmartAdder {

    private volatile int counter;
    private AQSTest lock;

    public SmartAdder() {
        lock = new AQSTest();
    }

    public void increase() {
        lock.lock();
        try {
            counter++;
        } finally {
            lock.unLock();
        }
    }

    public int getCounter() {
        return this.counter;
    }

    public static void main(String[] args) {
        int threadCount = 20;
        int addCount = 100000;
        SmartAdder smartAdder = new SmartAdder();
        CountDownLatch countDownLatch = new CountDownLatch(threadCount);
        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);
        for (int i = 0; i < threadCount * 2; i++) {
            executorService.submit(() -> {
                for (int j = 0; j < addCount; j++) {
                    smartAdder.increase();
                }
                countDownLatch.countDown();
            });
        }
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("count:" + smartAdder.getCounter());
        executorService.shutdown();
    }
}

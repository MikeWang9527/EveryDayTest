import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author MikeWang
 * @date 2024/1/22 10:06
 */
public class ThreadPoolTest {
    private static final ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(64, 64, 0, TimeUnit.MINUTES, new ArrayBlockingQueue<>(32));

    public static void main(String[] args) {
        // List<Integer> list = new ArrayList<>();
        // for (int i = 0; i < 400; i++) {
        //     list.add(i);
        // }
        for (int i = 0; i < 100; i++) {
            // List<List<Integer>> sublist = Lists.partition(list, 400 / 32);
            // int n = sublist.size();
            CountDownLatch countDownLatch = new CountDownLatch(34);
            for (int j = 0; j < 34; j++) {
                threadPoolExecutor.execute(() -> {
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        countDownLatch.countDown();
                    }
                });
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("===============>  详情任务 - 任务处理完成");
        }
        System.out.println("都执行完成了");
    }
}

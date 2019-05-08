package com.example.guzhan.concurrent;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * <p>create at 2019/5/8</p>
 *
 * @author guzhan
 * @since 1.0.0
 */
public class CallableDemo {

    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();
        ArrayList<Future<String>> results = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            // submit() 方法产生 Future
//            Future future = exec.submit(new TaskWithResult(i));
//            System.out.println(future.);
//            results.add(future);
            results.add(exec.submit(new TaskWithResult(i)));
        }
//        System.out.println(results);
        for (Future<String> fs : results)
            try {
                // get() blocks until completion:
                System.out.println(fs.get());
            } catch (InterruptedException e) {
                e.printStackTrace();
                return;
            } catch (ExecutionException e) {
                e.printStackTrace();
            } finally {
                exec.shutdown();
            }
    }
}

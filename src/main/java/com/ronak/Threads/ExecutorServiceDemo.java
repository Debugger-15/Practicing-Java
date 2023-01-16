package com.ronak.Threads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceDemo {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> System.out.println("Running executor service"));
        System.out.println("Done with run method");
        executorService.shutdown();
        // Will give 'RejectedExecutionException' at runtime ->  executorService.submit(() -> System.out.println("executing a thread after shutdown"));
        executorService.awaitTermination(10, TimeUnit.SECONDS);
    }
}

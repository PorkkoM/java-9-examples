package javanine;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public class CompletableFutureExample {

    public static void main(String[] args) throws InterruptedException {
        CompletableFuture.failedFuture(new RuntimeException());
        Executor executor = CompletableFuture.delayedExecutor(2, TimeUnit.SECONDS);
        executor.execute(() -> System.out.println("kuk"));
        Thread.sleep(5);
    }

}

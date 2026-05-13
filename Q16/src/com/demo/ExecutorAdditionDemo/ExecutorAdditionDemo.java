/*Q16. Write a java program by using executor service for finding addition of 51 numbers
create a task for finding addition of 3 numbers and return it
create executorservice with threadpool of size 5 then submit task to executorservice
Add all Futures to get addition.*/


package com.demo.ExecutorAdditionDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class AddTask implements Callable<Integer> {

    int a, b, c;

    public AddTask(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public Integer call() throws Exception {
        return a + b + c;
    }
}

public class ExecutorAdditionDemo {

    public static void main(String[] args) throws Exception {

        // Step 1: Create thread pool of size 5
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Step 2: List to store Future results
        List<Future<Integer>> futures = new ArrayList<>();

        // Step 3: Create tasks for 51 numbers (3 numbers per task)
        // 51 numbers = 17 tasks (15*3 = 45 + remaining handled logically)

        int[] numbers = new int[51];

        // initialize numbers 1 to 51
        for (int i = 0; i < 51; i++) {
            numbers[i] = i + 1;
        }

        // Step 4: Submit tasks (3 numbers per task)
        for (int i = 0; i < 51; i += 3) {

            int a = numbers[i];
            int b = (i + 1 < 51) ? numbers[i + 1] : 0;
            int c = (i + 2 < 51) ? numbers[i + 2] : 0;

            AddTask task = new AddTask(a, b, c);

            Future<Integer> result = executor.submit(task);

            futures.add(result);
        }

        // Step 5: Add all results from Future
        int totalSum = 0;

        for (Future<Integer> f : futures) {
            totalSum += f.get();
        }

        // Step 6: Shutdown executor
        executor.shutdown();

        System.out.println("Total Sum of 51 numbers = " + totalSum);
    }
}

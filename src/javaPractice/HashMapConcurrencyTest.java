package javaPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HashMapConcurrencyTest {
	public static void main(String[] args) throws InterruptedException {
		// STEP 1: Try with HashMap (Expect: Weird results or errors)
		Map<String, Integer> unsafeMap = new HashMap<>();
		runTest(unsafeMap, "HashMap (Unsafe)");

		// STEP 2: Try with ConcurrentHashMap (Expect: Correct result)
		Map<String, Integer> safeMap = new ConcurrentHashMap<>();
		runTest(safeMap, "ConcurrentHashMap (Safe)");
	}

	private static void runTest(Map<String, Integer> map, String label) throws InterruptedException {
		System.out.println("\nTesting: " + label);
		ExecutorService service = Executors.newFixedThreadPool(2); // object pool
// Advantages:		
// Resource Management: It reuses existing threads instead of creating and destroying them. 
// Creating a thread is "expensive" (memory and CPU overhead); a pool keeps them alive.

// Throttling: It limits the number of concurrent threads. If 1,000 tasks come in, a 
//FixedThreadPool(2) ensures only 2 run at a time, preventing your RAM from crashing.

		// Thread 1: Adds 1000 items
		service.execute(() -> {
			for (int i = 0; i < 1000; i++)
				map.put("T1_" + i, i);
		});

		// Thread 2: Adds 1000 items
		service.execute(() -> {
			for (int i = 0; i < 1000; i++)
				map.put("T2_" + i, i);
		});

		service.shutdown();
//		service.awaitTermination(1, TimeUnit.SECONDS);

		System.out.println(label + " final size: " + map.size());
		// For HashMap, this might not be 2000! It might crash or lose data.
	}

	public static void runTestThreads(Map<String, Integer> map, String mapType) throws InterruptedException {
		System.out.println("Testing " + mapType + "...");

		Thread t1 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				map.put("T1_" + i, i);
		});

		Thread t2 = new Thread(() -> {
			for (int i = 0; i < 1000; i++)
				map.put("T2_" + i, i);
		});

		t1.start();
		t2.start();

		// Join ensures the main thread waits for t1 and t2 to finish
		t1.join();
		t2.join();

		System.out.println(mapType + " final size: " + map.size());
		System.out.println("------------------------------");
	}
}
package creationalDesignPattern.objectPoolPattern;

import java.util.ArrayList;
import java.util.List;

public class ResourceManager {
	private List<Resource> freeList = new ArrayList<>();
	private List<Resource> inUseList = new ArrayList<>();
	private static ResourceManager resourceManager = null;

	private int INITIAL_POOL_SIZE = 2;
	private int MAX_POOL_SIZE = 4;

	private ResourceManager() {
		for (int i = 0; i < INITIAL_POOL_SIZE; i++) {
			int randomId = (int) (Math.random() * 100);
			freeList.add(new Resource(randomId, "Resource" + randomId));
		}
	}

	public static ResourceManager getInstance() {
		// synchronized ensures only one thread can enter this block at a time,
		// preventing multiple threads from creating separate instances simultaneously.
		if (resourceManager == null) {
			synchronized (ResourceManager.class) {
				/*
				 * My Question: So even if 2 people enter synchronized, just 1 executes at a
				 * time? Why is someone even able to enter synchronized if someone's already in
				 * -> I am thinking wrong. If there's A and B. Once A is done, B will enter
				 * right! B is not going anywhere!
				 */

				if (resourceManager == null)
					resourceManager = new ResourceManager();
			}
		}
		return resourceManager;
	}

	// If multiple threads call getResource() or releaseResource() simultaneously,
	// lists can get inconsistent.
	public synchronized Resource getResource() {
		Resource resourceToUse = null;
		if (freeList.size() > 0) {
			resourceToUse = freeList.get(0);
			inUseList.add(resourceToUse);
			freeList.remove(resourceToUse);
		} else if (inUseList.size() < MAX_POOL_SIZE) {
			int randomId = (int) (Math.random() * 100);
			resourceToUse = new Resource(randomId, "Resource" + randomId);
			inUseList.add(resourceToUse);
		} else {
			System.out.println("Out of resources, plz wait");
		}
		return resourceToUse;
	}

	public synchronized void releaseResource(Resource resource) {
		System.out.println("Removed resource: " + resource.getId());
		inUseList.remove(resource);
		freeList.add(resource);
	}
}

/**
 * Threads: You think about: Race conditions 🧩 Deadlocks 🔒 Thread pool sizes
 * ⚙️ Synchronization and shared state 🧠
 * 
 * ✅ It’s powerful. ❌ But, yeah — it’s scary and error-prone.
 * 
 * 
 * (For below just ask for eg) Modern concurrency (JS & Python): Tasks run
 * concurrently, not in parallel, using an event loop and async/await. Each task
 * yields control while waiting (I/O etc.), so others can run. This avoids
 * threads, locks, and deadlocks, making concurrency simple and safe.
 * 
 * 
 */
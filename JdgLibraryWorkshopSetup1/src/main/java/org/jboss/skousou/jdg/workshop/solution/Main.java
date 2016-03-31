package org.jboss.skousou.jdg.workshop.solution;

import org.infinispan.Cache;
import org.infinispan.manager.DefaultCacheManager;

public class Main {

	public static void main(String[] args) {
		// Task 1 - Create an Embedded Cache with the default configuration
		Cache<Object, Object> cache = new DefaultCacheManager().getCache();
		
		// Task 2 - Print Cache Status
		System.out.println(cache.getStatus());

		// Task 3 - Stop Cache and Print Status
		cache.stop();
		System.out.println(cache.getStatus());
		
		// Task 4 -  Can you re-start the Cache?
		cache.start();
		System.out.println(cache.getStatus());
	
		// Thread not terminating - manager still running
		cache.getCacheManager().stop();
	}

}

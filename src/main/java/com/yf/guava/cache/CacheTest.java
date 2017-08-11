package com.yf.guava.cache;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import org.junit.Test;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;

public class CacheTest {
	
	/**
	 * expireAfterAccess  在指定时间没有读写的情况下失效，一旦发生读写，失效时间重置
	 * expireAfterWrite  在写入指定时间之后失效
	 * @throws ExecutionException
	 */
	
	@Test
	public void useCache() throws ExecutionException {
		LoadingCache<String, String> cache = CacheBuilder.newBuilder().initialCapacity(10)
				.expireAfterAccess(2, TimeUnit.HOURS).build(new CacheLoader<String, String>() {
					public String load(String key) throws Exception {
						return "a" + key;
					}
				});
		String a = cache.get("a");
		String b = cache.get("b");
		String c = cache.get("c");
		String d = cache.get("a");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}

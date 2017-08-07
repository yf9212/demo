package com.yf.guava;

import java.util.Collection;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class Collections2Test {
	
	@Test
	public void test() {
		List<Boolean>  list=Lists.newArrayList(true,false,true,false,true);
		System.out.println(list);
		Collection<Boolean> coll=Collections2.filter(list, new  Predicate<Boolean>() {
			public boolean apply(Boolean input) {
				return input;
			}
		});
		System.out.println(coll);
		System.out.println(list);
	}
}

package com.yf.guava.collect;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.TreeMultimap;
import com.google.common.primitives.Ints;
import com.yf.guava.User;

public class MapsTest {
	public List<User> buildUsers() {
		return Lists.newArrayList(new User(1, "杨一"), new User(2, "李二"), new User(3, "张三"), new User(4, "王四"));
	}

	/**
	 * 需要返回ID是唯一的，否则会引起异常
	 */
	@Test
	public void uniqueIndex() {
		ImmutableMap<String, User> immutableMap = Maps.uniqueIndex(buildUsers(), new Function<User, String>() {
			public String apply(User input) {
				return input.getId().toString();
				/*
				 * if(input.getId()>2){ return "greatThanTwo"; }else{ return
				 * "lessThanTwo"; }
				 */
			}
		});
		ImmutableMap<String, Collection<User>> map = immutableMap.asMultimap().asMap();
		System.out.println(map);
	}

	@Test
	public void index() {
		ImmutableListMultimap<String, User> listMultimap = Multimaps.index(buildUsers(), new Function<User, String>() {
			public String apply(User input) {
				if (input.getId() > 2) {
					return "greatThanTwo";
				} else {
					return "lessThanTwo";
				}
			}
		});
		Map<String, List<User>> map = Multimaps.asMap(listMultimap);
		System.out.println(map);
	}

	@Test
	public void invertFrom() {
		TreeMultimap<Integer, String> treemultimap = TreeMultimap.create();
		ArrayListMultimap<String, Integer> multimap = ArrayListMultimap.create();
		multimap.putAll("b", Ints.asList(2, 4, 6));
		multimap.putAll("a", Ints.asList(4, 2, 1));
		multimap.putAll("c", Ints.asList(2, 5, 3));
		TreeMultimap<Integer, String> invert = Multimaps.invertFrom(multimap, treemultimap);
		System.out.println(invert);

	}

}

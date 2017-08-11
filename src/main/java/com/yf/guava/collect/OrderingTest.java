package com.yf.guava.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;
import com.yf.guava.User;

public class OrderingTest {

	public List<User> getUsers() {
		List<User> users = Lists.newArrayList();
		users.add(new User(4, "陈六"));
		users.add(new User(1, "张三"));
		users.add(new User(3, "王五"));
		users.add(new User(2, "李四"));
		return users;
	}

	public <T> void display(Collection<T> coll) {
		for (T t : coll) {
			System.out.println(t);
		}
	}

	public void displayPreSort() {
		System.out.println("------------排序前------------");
	}

	public void displayAftSort() {
		System.out.println("------------排序后------------");
	}

	public <T> void sort(List<T> list, Ordering<T> ordering) {
		displayPreSort();
		display(list);
		Collections.sort(list, ordering);
		displayAftSort();
		display(list);
	}

	@Test
	public void orderAsc() {
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		});
		List<User> list = getUsers();
		sort(list, ordering);
	}

	@Test
	public void orderDesc() {
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		}).reverse();
		List<User> list = getUsers();
		sort(list, ordering);
	}

	@Test
	public void oderAscNullFirst() {
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		}).nullsFirst();
		List<User> list = getUsers();
		list.add(null);
		sort(list, ordering);
	}

	@Test
	public void OrderAscNullLast() {
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		}).nullsLast();
		List<User> list = getUsers();
		list.add(null);
		sort(list, ordering);
	}

	@Test
	public void greateOf() {
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		}).nullsLast();
		List<User> user = ordering.greatestOf(getUsers(), 2);
		display(user);
	}
	
	@Test
	public void leastOf() {
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		}).nullsLast();
		List<User> user = ordering.leastOf(getUsers(), 2);
		display(user);
	}
	
	@Test
	public void  sortCopy(){
		Ordering<User> ordering = Ordering.natural().onResultOf(new Function<User, Comparable<Integer>>() {
			public Comparable<Integer> apply(User input) {
				return input.getId();
			}
		}).nullsLast();
		List<User> usr=getUsers();
		List<User> user = ordering.sortedCopy(usr);
		display(usr);
		display(user);
	}
	
	@Test
	public void sort(){
		Collections.sort(getUsers());
	}
	
}

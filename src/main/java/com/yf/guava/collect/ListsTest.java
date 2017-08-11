package com.yf.guava.collect;

import java.util.List;

import org.junit.Test;

import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.yf.guava.User;

public class ListsTest {
	
	public List<User>  buildUsers(){
		return	Lists.newArrayList(new User(1,"杨一"),new User(2,"李二"),new User(3,"张三"),new User(4,"王四"));
	}
	
	@Test
	public  void  transform(){
		List<String>  names=  Lists.transform(buildUsers(), new Function<User, String>() {
			public String apply(User input) {
				return input.getName();
			}
		});
		System.out.println(names);
	}
	
	@Test
	public void filter(){
		List<User>  filterResult=Lists.newArrayList(Collections2.filter(buildUsers(), new Predicate<User>() {
			public boolean apply(User input) {
				return input.getId()>2;
			}
		}));
		System.out.println(filterResult);
	}
	
	@Test
	public void partition(){
		List<List<User>>  users=Lists.partition(buildUsers(), 2);
		System.out.println(users);
	}
	
	@Test
	public  void reverse(){
		List<User> list=	Lists.reverse(buildUsers());
		System.out.println(list);
	}
}

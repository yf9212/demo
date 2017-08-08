package com.yf.guava.joiner;

import java.util.Map;

import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class JoinerTest {
	/**
	 * 忽略null
	 */
	@Test
	public void joinSkipNull(){
		Joiner joiner=Joiner.on(":").skipNulls();
		String reuslt=joiner.join(Lists.newArrayList("Tom","Jam",null,"kim"));
		System.out.println(reuslt);
	}
	
	/**
	 * null替换为指定值
	 */
	@Test
	public void joinUseForNull(){
		Joiner joiner=Joiner.on(":").useForNull("default");
		String reuslt=joiner.join(Lists.newArrayList("Tom","Jam",null,"kim"));
		System.out.println(reuslt);
	}
	
	@Test
	public void  joinMap(){
		Map<String,String> map= Maps.newHashMap();
		map.put("a", "b");
		map.put("b","C");
		String value=Joiner.on(",").withKeyValueSeparator(":").join(map);
		System.out.println(value);
	}
}

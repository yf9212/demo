package com.yf.guava.joiner;

import java.util.Map;

import com.google.common.collect.Sets;
import org.junit.Test;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

/**
 * @author yangfeng
 * @date 2017-08-01
 * @
 */
public class JoinerTest {
	/**
	 * 忽略null
	 */
	@Test
	public void joinSkipNull(){
		Joiner joiner=Joiner.on(":").skipNulls();
		String result=joiner.join(Lists.newArrayList("Tom","Jam",null,"kim"));
		System.out.println(result);
	}
	
	/**
	 * null替换为指定值
	 */
	@Test
	public void joinUseForNull(){
		Joiner joiner=Joiner.on(":").useForNull("default");
		String result=joiner.join(Lists.newArrayList("Tom","Jam",null,"kim"));
		System.out.println(result);
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

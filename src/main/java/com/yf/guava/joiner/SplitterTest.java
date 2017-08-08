package com.yf.guava.joiner;

import java.util.List;
import java.util.regex.Pattern;

import org.junit.Test;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

public class SplitterTest {
	@Test
	public void splitterString() {
		List<String> list = Lists.newArrayList(Splitter.on(",").omitEmptyStrings().split("aaaaa,aaaa,aaaa,a,a,a,a,"));
		System.out.println(list);
	}

	@Test
	public void spliteterChar() {
		List<String> list = Lists.newArrayList(Splitter.on(',').omitEmptyStrings().split("aaaaa,aaaa,aaaa,a,a,a,a,"));
		System.out.println(list);
	}

	@Test
	public void splitterCharMatcher() {
		Splitter splitter = Splitter.on(CharMatcher.BREAKING_WHITESPACE);
		List<String>  list=Lists.newArrayList(splitter.omitEmptyStrings().split(" A  A B C DF E EA s  d"));
		System.out.println(list);
	}
	
	@Test
	public void splitterPattern(){
		Splitter splitter=Splitter.on(Pattern.compile("AB")).omitEmptyStrings().trimResults();
		List<String> list=Lists.newArrayList(splitter.split("AABACAFDVBAUVQAVAVBABC"));
		System.out.println(list);
	}
}

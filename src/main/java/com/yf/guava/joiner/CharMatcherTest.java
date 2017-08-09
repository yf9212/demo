package com.yf.guava.joiner;

import org.junit.Test;

import com.google.common.base.CharMatcher;

public class CharMatcherTest {
	
	private  CharMatcher  LETTER=new CharMatcher() {
		@Override
		public boolean matches(char c) {
			return inRange('a', 'z').or(inRange('A', 'Z')).matches(c);
		}
	};
	
	/**
	 * 移除
	 */
	@Test
	public  void  remove(){
		System.out.println(CharMatcher.DIGIT.removeFrom("921Abca1"));
	}
	
	/**
	 * 保留
	 */
	@Test
	public void retain(){
		System.out.println(CharMatcher.DIGIT.retainFrom("921Abca1"));
	}
	
	@Test
	public void or(){
		System.out.println(CharMatcher.DIGIT.or(CharMatcher.JAVA_LETTER).retainFrom("小子好玩不啊a,bc3"));
	}
	
	@Test
	public  void javaLetter(){
		System.out.println(CharMatcher.JAVA_LETTER.retainFrom("傻不拉几"));
	}
	
	@Test
	public  void  letter(){
		System.out.println(LETTER.retainFrom("a傻不拉几b1"));	
	}

	/**
	 * 只保留数字
	 */
	@Test
	public void digit() {
		String result = CharMatcher.DIGIT.retainFrom("921Abca1");
		System.out.println(result);
	}
	
	@Test
	public void javaDigit(){
		String result = CharMatcher.JAVA_DIGIT.retainFrom("921Abca1");
		System.out.println(result);
	}
	
	/**
	 * 移除特殊控制符
	 */
	@Test
	public void javaIsoControl(){
		String result = CharMatcher.JAVA_ISO_CONTROL.removeFrom("");
		System.out.println(result);
	}
}

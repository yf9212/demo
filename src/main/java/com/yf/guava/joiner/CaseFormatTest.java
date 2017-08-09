package com.yf.guava.joiner;

import org.junit.Test;

import com.google.common.base.CaseFormat;

/**
 * LOWER_CAMEL 首字符小写驼峰 
 * LOWER_HYPHEN 小写连字符
 * LOWER_UNDERSCORE 小写下划线
 * UPPER_CAMEL 首字母大写驼峰 
 * UPPER_UNDERSCORE 大写下划线
 * 
 * @author yang.f3
 *
 */
public class CaseFormatTest {
	
	@Test
	public void lowerCamel() {
		System.out.println(CaseFormat.LOWER_CAMEL.to(CaseFormat.UPPER_CAMEL, "lowercamel"));
		System.out.println(CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, "upper_underscore"));
	}

}

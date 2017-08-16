package com.yf.designPattern.chain;

public interface Filter {
	boolean  doFilter(String msg,FilterChain chain);
}

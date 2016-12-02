package com.yf.designPattern.builder;

import java.math.BigDecimal;

public interface Item {
	public String  name();
	public Packing  packing();
	public BigDecimal  price();
}

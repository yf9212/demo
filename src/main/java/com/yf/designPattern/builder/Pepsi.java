package com.yf.designPattern.builder;

import java.math.BigDecimal;

public class Pepsi extends ClodDrink {

	@Override
	public String name() {
		return "pepsi";
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal(3);
	}

}

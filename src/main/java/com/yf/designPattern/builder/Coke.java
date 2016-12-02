package com.yf.designPattern.builder;

import java.math.BigDecimal;

public class Coke extends ClodDrink {

	@Override
	public String name() {
		return "coke";
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal(3);
	}

}

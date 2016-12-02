package com.yf.designPattern.builder;

import java.math.BigDecimal;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "chicken burger";
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal(50);
	}

}

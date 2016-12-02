package com.yf.designPattern.builder;

import java.math.BigDecimal;

public class VegBurger extends Burger {

	@Override
	public String name() {
		return "veg  burger";
	}

	@Override
	public BigDecimal price() {
		return new BigDecimal(25);
	}

}

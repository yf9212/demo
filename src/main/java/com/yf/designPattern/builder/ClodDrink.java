package com.yf.designPattern.builder;

import java.math.BigDecimal;

public abstract class ClodDrink implements Item {

	public abstract String name();

	public Packing packing() {
		return new Bottle();
	}

	public abstract BigDecimal price();

}

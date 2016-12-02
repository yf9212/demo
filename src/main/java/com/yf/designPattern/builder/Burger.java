package com.yf.designPattern.builder;

import java.math.BigDecimal;

public  abstract class Burger  implements  Item{

	public abstract String name(); 

	public Packing packing() {
		return new Wrapper();
	}

	public  abstract BigDecimal price();

}

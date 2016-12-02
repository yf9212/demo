package com.yf.designPattern.builder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Meal {
	private List<Item> items=new ArrayList<Item>();
	
	public void addItem(Item item){
		this.items.add(item);
	}
	
	public BigDecimal  getCost(){
		BigDecimal  cost=BigDecimal.ZERO;
		for (Item item : items) {
			cost.add(item.price());
		}
		return cost;
	}
	
	public void showItems(){
		for (Item item : items) {
			System.out.print("Item:" +item.name());
			System.out.print(", Packing:" + item.packing().pack());
			System.out.println(", Price:" +item.price());
		}
	}
}

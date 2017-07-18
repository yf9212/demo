package com.yf.designPattern.iterator;

import java.util.Iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;

	public Waitress(PancakeHouseMenu pancakeHouseMenu,DinerMenu dinerMenu) {
		this.pancakeHouseMenu=pancakeHouseMenu;
		this.dinerMenu=dinerMenu;
	}
	
	public void  printMenu(){
		Iterator<MenuItem> pancakeHouseIterator=pancakeHouseMenu.createIterator();
		Iterator<MenuItem> dinerIterator=dinerMenu.createIterator();
		System.out.println("MENU\n----\nBREATFAST");
		printMenu(pancakeHouseIterator);
		System.out.println("\n LUNCH");
		printMenu(dinerIterator);
	}

	public  void printMenu(Iterator<MenuItem> iterator) {
		while(iterator.hasNext()){
			MenuItem menuItem=	iterator.next();
			System.out.print(menuItem.getName()+ ", ");
			System.out.print(menuItem.getPrice()+" --");
			System.out.println(menuItem.getDescription());
		}
	}
}

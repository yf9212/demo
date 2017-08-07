package com.yf.guava;

import java.util.Map;

import org.junit.Test;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class TableTest {
	private Table<Integer, Integer, String> buildTable() {
		Table<Integer, Integer, String> table = HashBasedTable.create();
		table.put(1, 1, "1:1");
		table.put(1, 2, "1:2");
		table.put(2, 1, "2:1");
		table.put(2, 2, "2:2");
		return table;
	}

	@Test
	public void getRow() {
		Map<Integer, String> rowValue = buildTable().row(1);
		System.out.println(rowValue);
	}

	@Test
	public void getCell() {
		Map<Integer, String> rowValue = buildTable().column(2);
		System.out.println(rowValue);
	}

	@Test
	public void getValue() {
		String value = buildTable().get(3, 1);
		System.out.println(value);
	}
}

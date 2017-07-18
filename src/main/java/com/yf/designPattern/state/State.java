package com.yf.designPattern.state;

public interface State {
	/**
	 * 投入代币
	 */
	public void insertQuarter();

	/**
	 * 退出代币
	 */
	public void ejectQuarter();

	/**
	 * 转动曲柄
	 */
	public void turnCrank();

	/**
	 * 发放糖果
	 */
	public void dispense();
}

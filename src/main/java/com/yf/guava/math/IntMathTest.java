package com.yf.guava.math;

import java.math.RoundingMode;

import org.junit.Test;

import com.google.common.math.IntMath;

public class IntMathTest {
	
	@Test
	public void add(){
		System.out.println(Integer.MAX_VALUE);
		System.out.println(IntMath.checkedAdd(12333, 1111111));
		//System.out.println(IntMath.checkedAdd(2147483647, 2147483647));//arithmeticException
	}
	
	@Test
	public void  multi(){
		System.out.println(IntMath.checkedMultiply(30, 60));
	}
	
	/**
	 * 
	UP：远离零方向舍入   10/3=4  -10/3=-4
	DOWN：向零方向舍入（去尾法）	10/3=3  -10/3=-3
	FLOOR：向负无限大方向舍入	 10/3=3 -10/3=-4
	CEILING：向正无限大方向舍入 10/3=4  -10/3=-3
	UNNECESSARY：不需要舍入， 如果用此模式进行舍入， 应直接抛出ArithmeticException
	HALF_UP：四舍五入
	HALF_DOWN：向最近的整数舍入， 其中x.5向零方向舍入
	HALF_EVEN：向最近的整数舍入， 其中x.5向相邻的偶数舍入
	 */
	@Test
	public void  div(){
		System.out.println(IntMath.divide(10, 3, RoundingMode.UP));
		System.out.println(IntMath.divide(-10, 3, RoundingMode.UP));
		System.out.println(IntMath.divide(10, 3, RoundingMode.DOWN));
		System.out.println(IntMath.divide(-10, 3, RoundingMode.DOWN));
		System.out.println(IntMath.divide(10, 3, RoundingMode.FLOOR));
		System.out.println(IntMath.divide(-10, 3, RoundingMode.FLOOR));
		System.out.println(IntMath.divide(10, 3, RoundingMode.CEILING));
		System.out.println(IntMath.divide(-10, 3, RoundingMode.CEILING));
		System.out.println(IntMath.divide(5, 2, RoundingMode.HALF_UP));
		System.out.println(IntMath.divide(-5, 2, RoundingMode.HALF_UP));
		System.out.println(IntMath.divide(5, 2, RoundingMode.HALF_DOWN));
		System.out.println(IntMath.divide(-5, 2, RoundingMode.HALF_DOWN));
		
	}
}

package com.yf.guava.collect;

import java.util.Set;

import org.junit.Test;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class SetsTest {
	
	@Test
	public void  intersection(){//交集
		Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
		Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");

		SetView<String> setView = Sets.intersection(wordsWithPrimeLength, primes);
		System.out.println(setView.immutableCopy());
	}
	
	/**
	 * 并集：
	 */
	@Test
	public void  union(){
		Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
		Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
		SetView<String> setView  =Sets.union(wordsWithPrimeLength, primes);
		System.out.println(setView);
	}
	
	/**
	 * 差集 属于A，但不属于B。
	 */
	@Test
	public void difference(){
		Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
		Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
		SetView<String> setView =Sets.difference(wordsWithPrimeLength, primes);
		System.out.println(setView);
	}
	
	/**
	 * 对称差集。
	 */
	@Test
	public  void  symmetricDiffercence(){
		Set<String> wordsWithPrimeLength = ImmutableSet.of("one", "two", "three", "six", "seven", "eight");
		Set<String> primes = ImmutableSet.of("two", "three", "five", "seven");
		SetView<String> setView =Sets.symmetricDifference(wordsWithPrimeLength, primes);
		System.out.println(setView);
	}
	
	
	 
}

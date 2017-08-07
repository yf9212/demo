package com.yf.guava;

import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Strings;

public class OptionalTest {
	public static void main(String[] args) {
		Optional<Integer> inte=	Optional.of(5);
		Optional<User>  us= Optional.absent();
		us.or(new User());
		System.out.println(us.get());
		System.out.println(inte.isPresent());
		System.out.println(us.isPresent());
		Objects.firstNonNull(null, new  User());
		Strings.nullToEmpty("");
	}
}

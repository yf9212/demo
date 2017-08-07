package com.yf.guava;

import static com.google.common.base.Preconditions.checkNotNull;

import com.google.common.base.Objects;
import com.google.common.collect.ComparisonChain;

public class User implements Comparable<User> {
	private Integer id;
	private String name;
	

	public User() {
	}

	public User(Integer id, String name) {
		super();
		this.id = checkNotNull(id);
		this.name = checkNotNull(name);
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return Objects.toStringHelper(this).add("id", getId()).add("name", getName()).toString();
	}
	
	public int compareTo(User o) {
		return ComparisonChain.start().compare(this.getId(), o.getId()).compare(this.getName(), o.getName())
				.result();
	}
	
}

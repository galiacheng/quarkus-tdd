package com.redhat.tdd;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TDDService {
	private final List<Item> items = List.of(new Item(1L, "Hello"));

	public List<Item> getAllItems() {
		return this.items;
	}
}

package com.redhat.tdd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TDDServiceTests {
	TDDService service = new TDDService();

	@Test
	public void getAllItems() {
		var items = this.service.getAllItems();
		assertTrue(items.size() == 1);

		var item = items.get(0);
		assertNotNull(item);
		assertEquals(1L, item.getId());
		assertEquals("Hello", item.getMessage());
	}
}

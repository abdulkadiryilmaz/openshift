package com.cosighter.rest.adapter;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.cosighter.rest.adapter.CosighterRestAdapter;

public class CosighterRestAdapterTest {
	@Test
	public void simple() {
		CosighterRestAdapter impl = new CosighterRestAdapter();
		assertNotNull(impl);
	}

}

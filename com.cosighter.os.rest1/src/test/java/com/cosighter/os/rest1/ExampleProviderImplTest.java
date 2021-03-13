package com.cosighter.os.rest1;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.cosighter.os.rest1.Rest1ServiceImpl;

public class ExampleProviderImplTest {
	@Test
	public void simple() {
		Rest1ServiceImpl impl = new Rest1ServiceImpl();
		assertNotNull(impl);
	}

}

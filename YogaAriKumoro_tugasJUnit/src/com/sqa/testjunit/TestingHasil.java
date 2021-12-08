package com.sqa.testjunit;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestingHasil {
	
	MainApp formula;

	@Before
	public void setUp() throws Exception {
		formula = new MainApp();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testHasil() {
		assertEquals("Test hasil",40.0, formula.hasil(200.0f, 5.0f ), 0.0);
	}
	
	@Test
	public final void testHasil2() {
		assertEquals("Test hasil",107.3333333, formula.hasil("abc"f, "def"f ), 0.0);
	}
	
	@Test
	public final void testHasil3() {
		assertEquals("Test hasil",40.2, formula.hasil(-201.0f, -5.0f ), 0.0);
	}
	
	@Test
	public final void testHasil4() {
		assertEquals("Test hasil",63.875, formula.hasil(.0f, .0f ), 0.0);
	}

}

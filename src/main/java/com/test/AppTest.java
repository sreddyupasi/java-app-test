package com.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.demo.App;

public class AppTest {
	App app = new App();

	@Test
	public void testProcess1() {
		assertEquals(app.process("hello"), "HELLO");
	}
	@Test
	public void testProcess() {
		assertEquals(app.process("hi"), "hi");
	}


	
}

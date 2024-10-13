package com.guru.testing;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestClass {

	public static int add(int a,int b)
	{
		return a+b;
	}
	@Test
	void test() {
		assertFalse(add(2,4)==5);
		System.out.println("Test Executed successfully");
	}
	@Test
	@BeforeEach
	void testTheList()
	{
		System.out.println("Executed Before each");
		ArrayList<Integer> al=null;
		assertNull(al);
	}

}

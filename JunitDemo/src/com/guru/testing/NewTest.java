package com.guru.testing;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NewTest {

	@Test
	@Disabled
	public void test()
	{
		System.out.println("Hello");
		//fail("not passed");
	}
	@Test
	@DisplayName("Junit test for addition")
	public void add()
	{
		int res=5;
		System.out.println("From add");
		assertEquals(res,2+3);
	}
	
	@BeforeEach
	public void display()
	{
		System.out.println("Before Each test");
	}
	
	@BeforeAll
	public static  void beforeAll()
	{
		System.out.println("Before all");
	}
	
	@AfterAll
	public static void afterAll()
	{
		System.out.println("After All");
		
	}
	
	@Test
	public void testAssertEquals()
	{
		assertNotEquals(6,5);
	}
	
	@Test
	@DisplayName("assertFalse")
	public void testassertFalse()
	{
		assertFalse(10<3);
	}
	
	@Test
	@DisplayName("assertAll")
	public void testAssertAll()
	{
		assertAll("All",
			()->assertEquals("hello","hello")	,
			()->assertTrue(0>-9),
			()->assertFalse(0<9));
	}
	
	

}

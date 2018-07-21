package com.umangbudhwar.tdd.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import com.umangbudhwar.tdd.Addition;

public class AdditionTest {
	
	static Addition addition;
	
	@BeforeClass
	public static void beforeClass()
	{
		addition = new Addition();
	}

	@Test
	public void testThatAdditionClassIsPresent() {
		assertNotNull(addition);
	}
	
	@Test
	public void testThatAddMethodIsPresent()
	{
		addition.add(2,2);
	}
	
	@Test
	public void testThatAddMethodReturnsInt()
	{
		int s = addition.add(2,2);
	}
	
	@Test
	public void testThat2Plus2Is4()
	{
		int s = addition.add(2,2);
		assertEquals(4, s);
	}
	
	@Test
	public void testThat2Plus3Is5()
	{
		int s = addition.add(2,3);
		assertEquals(5, s);
	}
	
	@Test
	public void testThatAddMethodTakesMultipleArgument()
	{
		addition.add(2,2,6);
	}
	
	@Test
	public void testThatAddMethodReturnsCorrectResult()
	{
		int s = addition.add(2,3,4,5);
		assertEquals(14, s);
	}
	

}

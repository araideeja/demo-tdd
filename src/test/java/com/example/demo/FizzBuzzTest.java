package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {
	FizzBuzz fizzBuss = new FizzBuzz();
	
	@Test
	public void should_return_1_when_1() {
		String actualResult = fizzBuss.display(1);
		assertEquals("1", actualResult);
	}
	@Test
	public void should_return_2_when_2() {
		String actualResult = fizzBuss.display(2);
		assertEquals("2", actualResult);
	}
	@Test
	public void should_return_fizz_when_3() {
		String actualResult = fizzBuss.display(3);
		assertEquals("fizz", actualResult);
	}
	@Test
	public void should_return_4_when_4() {
		String actualResult = fizzBuss.display(4);
		assertEquals("4", actualResult);
	}
	@Test
	public void should_return_5_when_5() {
		String actualResult = fizzBuss.display(5);
		assertEquals("buzz", actualResult);
	}
	@Test
	public void should_return_fizz_when_6() {
		String actualResult = fizzBuss.display(6);
		assertEquals("fizz", actualResult);
	}
	@Test
	public void should_return_7_when_7() {
		String actualResult = fizzBuss.display(7);
		assertEquals("7", actualResult);
	}
	@Test
	public void should_return_8_when_8() {
		String actualResult = fizzBuss.display(8);
		assertEquals("8", actualResult);
	}
	@Test
	public void should_return_fizz_when_9() {
		String actualResult = fizzBuss.display(9);
		assertEquals("fizz", actualResult);
	}
	@Test
	public void should_return_buzz_when_10() {
		String actualResult = fizzBuss.display(10);
		assertEquals("buzz", actualResult);
	}
	@Test
	public void should_return_11_when_11() {
		String actualResult = fizzBuss.display(11);
		assertEquals("11", actualResult);
	}
	@Test
	public void should_return_fizz_when_12() {
		String actualResult = fizzBuss.display(12);
		assertEquals("fizz", actualResult);
	}
	@Test
	public void should_return_13_when_13() {
		String actualResult = fizzBuss.display(13);
		assertEquals("13", actualResult);
	}
	@Test
	public void should_return_14_when_14() {
		String actualResult = fizzBuss.display(14);
		assertEquals("14", actualResult);
	}
	@Test
	public void should_return_fizzbuzz_when_15() {
		String actualResult = fizzBuss.display(15);
		assertEquals("fizzbuzz", actualResult);
	}
}

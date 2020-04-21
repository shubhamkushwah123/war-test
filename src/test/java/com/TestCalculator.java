package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;



@RunWith(JUnitPlatform.class)
class TestCalculator {
	
	@Test
	public void testSum() {
		int a =10;
		int b =20;
		int sum = a+b;
		Calculator calc = new Calculator();
		int actualSum = calc.sum(a, b);
		assertEquals(sum, actualSum);
	}
	
	@Test
	public void printHello() {
		System.out.println("hello");
	}
	
	@Test
    @DisplayName("My First Test")
    void myFirstTest(TestInfo testInfo) {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.sum(5, 5));
    }

}

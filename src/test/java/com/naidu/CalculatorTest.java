package com.naidu;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.naidu.unit_testing.Calculator;

@RunWith(SpringRunner.class)
@SpringBootTest
class CalculatorTest {

	//private static Calculator calc=null;

//	@BeforeClass
//	public static void init() {
//		calc = new Calculator();
//	}
//
//	@AfterClass
//	public static void destroy() {
//		calc = null;
//	}

	@Test
	public void testAdd() {
		Calculator calc = new Calculator();
		Integer actualResult = calc.add(10, 20);
		Integer expectedResult = 30;
		assertEquals(expectedResult, actualResult);

	}

//	@Test
//	public void testMultiply() {
//		Integer actualResult = calc.multiply(10, 20);
//		Integer expectedResult = 200;
//		assertEquals(expectedResult, actualResult);
//
//	}
//
//	@Test
//	public void testSubtraction() {
//		Integer actualResult = calc.subtraction(20, 10);
//		Integer expectedResult = 10;
//		assertEquals(expectedResult, actualResult);
//
//	}

}

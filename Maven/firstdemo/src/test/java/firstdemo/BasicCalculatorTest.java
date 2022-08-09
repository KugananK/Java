//package firstdemo;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import firstDemo.com.qa.main.*;
//
//public class BasicCalculatorTest {
//	BasicCalculator calc = new BasicCalculator();
//	
//	@Test
//	public void addSumTest() {
//		int x = 1;
//		int y = 2;
//		int z = 3;
//		int result;
//		
//		result = calc.addSum(x, y, z);
//		
//		Assertions.assertEquals(6, result);
//	}
//	
//	@Test
//	public void subSumTest() {
//		int x = 10;
//		int y = 5;
//		int result;
//		
//		result = calc.subSum(x, y);
//		
//		Assertions.assertEquals(5, result);
//	}
//	
//	
	
	
	
//}
//	// Exercise - Write tests to test the following statements:
//// 5 * 10 = 50
//	@Test
//	public void fifty() {
//		int num1 = 5;
//		int num2 = 10;
//		int result = num1 * num2;
//		Assertions.assertTrue(50 == result);
//		}
//	
//	@Test
//	public void addThree() {
//		int x = 1;
//		int y = 2;
//		int z = 3;
//		int result = x + y + z;
//		Assertions.assertEquals(6, result);
//	}
//	
//	@Test
//	public void notEquals() {
//		int a = 20;
//		int b = 16;
//		int result = a - b;
//		Assertions.assertNotEquals(5, result);
//	}
//	
//	@Test
//	public void stringTest() {
//		String h = "hello";
//		String w = " world";
//		String result = h + w;
//		Assertions.assertEquals("hello world", result);
//	}
//	
//	@Test
//	public void divTest() {
//		int x = 12;
//		int y = 4;
//		int result = x / y;
//		Assertions.assertEquals(3, result);
//	}
//	
//	@Test
//	public void modulusTest() {
//		float x = 15f;
//		float y = 4f;
//		float result = x % y;
//		Assertions.assertEquals(3, result);
//	}
//	
//	@Test
//	public void multGreaterTest() {
//		int x = 17;
//		int y = 2;
//		int z = 25;
//		boolean result = (x * y) > z;
//		Assertions.assertTrue(result);
//	}
//	
//	@Test
//	public void multiplyGreaterTest() {
//		int resultInt;
//		boolean result;
//		
//		resultInt = 17 * 2;
//		
//		result = (resultInt > 25);
//		
//		Assertions.assertTrue(resultInt > 25);
//		Assertions.assertEquals(true, result);
//	}
//	
//	@Test
//	public void evenTest() {
//		int num = 12;
//		String result;
//		
//		if(num % 2 == 0) {
//			result = "EVEN";
//		} else {
//			result = "ODD";
//		}
//		Assertions.assertEquals("EVEN", result);
//	}
//	
//	@Test
//	public void oddTest() {
//		int num = 12;
//		String result;
//		
//		if(num % 2 == 0) {
//			result = "EVEN";
//		} else {
//			result = "ODD";
//		}
//		Assertions.assertEquals("ODD", result);
//	}
//}
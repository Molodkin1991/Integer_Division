package com.foxminded;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class IntegerDivisionTests {
		IntegerDivision integerDivision = new IntegerDivision();

	@Test
	void divisionInteger_shouldReturnOne_whenGivenSameIntegers() {
		assertEquals("1", integerDivision.divide("22","22"));
	}
	@Test
	void divisionInteger_shouldReturnNegativeInteger_whenGivenPositiveIntegerAndNegativeDivide() {
		assertEquals("-11", integerDivision.divide("22","-2"));
	}
	@Test
	void divisionInteger_shouldReturnPositiveInteger_whenGivenNegativeIntegerAndNegativeDivide() {
		assertEquals("11", integerDivision.divide("-22","-2"));
	}
}

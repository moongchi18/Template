package com.example.demo.utils;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculateTest {

	@Test
	void test() {
		System.out.println(Calculate.PLUS.calc(20L, 4));;
		System.out.println(Calculate.MINUS.calc(20L, 4));;
		System.out.println(Calculate.MULITIPLY.calc(20L, 4));;
	}

}

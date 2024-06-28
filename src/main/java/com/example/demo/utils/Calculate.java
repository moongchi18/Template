package com.example.demo.utils;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public enum Calculate {
	PLUS((x, y) -> x + y),
	MINUS((x, y) -> x - y),
	MULITIPLY((x, y) -> x * y);
	
	private BiFunction<Long, Long, Long> exp;
	
	
	
	private Calculate(BinaryOperator<Long> exp) {
		this.exp = exp;
	}


	public Long calc(long x, long y) {
		return this.exp.apply(x, y);
	}
}

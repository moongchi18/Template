package com.example.demo.utils;

import lombok.AccessLevel;
import lombok.Builder;

@Builder
public class Constructor {
	private int mandatoryVal;
	private int optionalVal;
	
	public static ConstructorBuilder builder(int mandatoryVal) {
		return new ConstructorBuilder().mandatoryVal(mandatoryVal);
	}
}

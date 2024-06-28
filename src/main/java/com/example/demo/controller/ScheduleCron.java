package com.example.demo.controller;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum ScheduleCron {
	EVERY_MINUTE("0 * * * * *");
	
	public final String exp;
}

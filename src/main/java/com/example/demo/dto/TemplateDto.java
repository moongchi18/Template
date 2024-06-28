package com.example.demo.dto;

import java.util.regex.Pattern;

import com.example.demo.history.FieldPrinter;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
public class TemplateDto implements FieldValidator, FieldPrinter {

	@NotNull
	private int index;
	@NotBlank
	private String name;
	
	@Override
	public boolean hasErrors() {
		return this.isInvalidIndex()
				&& this.isInvalidName();
	}
	
	public boolean isInvalidIndex() {
		return !(index > Integer.MAX_VALUE);
	}
	
	public boolean isInvalidName() {
//		@FIXME 위치 개선 필요
		String patternString = "^[a-zA-Z]{1,100}$"; 
		
		Pattern p = Pattern.compile(patternString);
		return !p.matcher(name).matches();
	}
}

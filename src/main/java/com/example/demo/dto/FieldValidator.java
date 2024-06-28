package com.example.demo.dto;

public interface FieldValidator {
	/**
	 * @apiNote @Override 메서드 내에 유효성 검사를 직접 구현하지 않고 유효성 검사 메서드들을 실행시키고 최종 결과를 반환하도록 구현 권장  
	 * @return
	 */
	public boolean hasErrors();
}

package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.TemplateDto;
import com.example.demo.history.ExecutionHistory;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@EnableScheduling
public class TemplateController {
	
	@Value("${custom.enval}")
	private String env1; 
	@Value("${spring.config.activate.onProfile}")
	private String env2; 

	@PostMapping("/test")
	@ExecutionHistory
	public ResponseEntity<?> getSample(@Valid @RequestBody TemplateDto dto, BindingResult br){
		log.info(dto.toString());
		if(br.hasErrors()) {
			log.info("[GET_SAMPLE] ERROR - REQUEST_PARAMS_ERROR :{}", br.getFieldError());
		} else if(dto.hasErrors()) {
			log.info("[GET_SAMPLE] ERROR - REQUEST_PARAMS_ERROR :{}", dto.toString());
		}
		
//		1. 호출 이력 
		
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	@Scheduled(cron = "${custom.cron.everyFiveSecond}")
	public void test() {
		log.info("SCHEDULE_EXECUTE : {}, {}", env2, env1);
		
	}
//	@Scheduled(cron = ScheduleCron.EVERY_MINUTE.exp)
//	public void test2() {
//		log.info("SCHEDULE_EXECUTE : {}, {}", env2, env1);
//		
//	}
}

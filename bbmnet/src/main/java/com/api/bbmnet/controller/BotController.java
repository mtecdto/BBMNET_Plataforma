package com.api.bbmnet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.bbmnet.form.BotRequestForm;
import com.api.bbmnet.service.BotService;

@RestController
@RequestMapping("/bot")
public class BotController {

	@Autowired
	private BotService botService;
	
	@GetMapping("/request/{id}")
	public ResponseEntity<BotRequestForm> getBotRequest(@PathVariable("id") Long idEdital){
		
		BotRequestForm botForm = botService.getEditalAndCredencial(idEdital);
		
		return ResponseEntity.status(HttpStatus.OK).body(botForm);
		
	}
	
}

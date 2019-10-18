package com.dc.boot.actuator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.boot.actuator.model.Instrument;

@RestController
@RequestMapping("/instrument")
public class InstrumentController {

	@GetMapping()
	public String randomUUID() {
		return UUID.randomUUID().toString();
	}
	
	@GetMapping("/details")
	public void getInstrumentDetails() {
		List<Instrument> instruments = new ArrayList<>();
		
		Instrument instance = new Instrument();
		
		
	}
}

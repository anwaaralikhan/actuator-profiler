package com.dc.boot.actuator.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dc.boot.actuator.annotations.EnableInstrumentation;
import com.dc.boot.actuator.model.Instrument;

@RestController
@RequestMapping("/instrument")
public class InstrumentController {

	
	@GetMapping()
	@EnableInstrumentation
	public String randomUUID() {
		return UUID.randomUUID().toString();
	}
	
	@GetMapping("/details")
	@EnableInstrumentation
	public List<Instrument> getInstrumentDetails() {
		List<Instrument> instruments = new ArrayList<>();
		instruments.add(new Instrument("Test1", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test2", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test3", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test4", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test5", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test6", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test7", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test8", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test9", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		instruments.add(new Instrument("Test10", 5L, 5L, 5L, 5L, 5L, 5L, 5L));
		return instruments;
	}
}

package com.codingdojo.controllers;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class DojoController {

	@RequestMapping ("/{language}")
	public String dojoController(@PathVariable ("language") String lan) {
		if (lan.equals("dojo")) {
			return "The dojo is awesome!";
		}
		if (lan.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California.";
		}
		if (lan.equals("san-jose")) {
			return "SJ dojo is the headquarters.";
		}
		else{
			return "The dojo has not been set";
		}
	}
}

package guru.springframework.cothascoffee.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.cothascoffee.services.CoffeeService;
import guru.springframework.cothascoffee.web.model.CoffeeDto;

@RequestMapping("/api/v1/coffee")
@RestController
public class CoffeeController {
	
	private final CoffeeService coffeeService;
	
	public CoffeeController(CoffeeService coffeeService) {
		this.coffeeService = coffeeService;
	}

	@GetMapping({"/{coffeeId}"})
	public ResponseEntity<CoffeeDto> getCoffee(@PathVariable("coffeeId") UUID coffeeId){
		return new ResponseEntity<>(coffeeService.getCoffeeById(coffeeId), HttpStatus.OK);
		
	}
	
}

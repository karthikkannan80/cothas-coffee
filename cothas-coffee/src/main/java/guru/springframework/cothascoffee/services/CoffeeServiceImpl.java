package guru.springframework.cothascoffee.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import guru.springframework.cothascoffee.web.model.CoffeeDto;

@Service
public class CoffeeServiceImpl implements CoffeeService {

	@Override
	public CoffeeDto getCoffeeById(UUID coffeeId) {
		return CoffeeDto.builder().id(UUID.randomUUID())
				.coffeeName("")
				.coffeeStyle("")
				.build();
	}
	
}

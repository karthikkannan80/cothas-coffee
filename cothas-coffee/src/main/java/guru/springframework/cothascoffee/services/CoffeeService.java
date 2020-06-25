package guru.springframework.cothascoffee.services;

import java.util.UUID;

import guru.springframework.cothascoffee.web.model.CoffeeDto;

public interface CoffeeService {

	CoffeeDto getCoffeeById(UUID coffeeId);

}

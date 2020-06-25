package guru.springframework.cothascoffee.web.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CoffeeDto {
	
	private UUID id;
	private String coffeeName;
	private String coffeeStyle;
	private Long upc;
	

}

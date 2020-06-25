package guru.springframework.cothascoffee.services;

import guru.springframework.cothascoffee.web.model.CustomerDto;

import javax.xml.ws.Response;
import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);
}

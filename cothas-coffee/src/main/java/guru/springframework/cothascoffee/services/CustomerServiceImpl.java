package guru.springframework.cothascoffee.services;

import guru.springframework.cothascoffee.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import javax.xml.ws.Response;
import java.util.UUID;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Jeff Weiner")
                .build();
    }
}

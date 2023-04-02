package siegjor.springrestmvc.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import siegjor.springrestmvc.model.Customer;
import siegjor.springrestmvc.services.CustomerService;

import java.util.List;
import java.util.UUID;

@RequestMapping("/api/v1/customer")
@AllArgsConstructor
@RestController
public class CustomerController {
    final CustomerService customerService;

    @RequestMapping(method = RequestMethod.GET)
    List<Customer> listCustomers() {
        return customerService.listCustomers();
    }

    @RequestMapping(value = "{customerId}", method = RequestMethod.GET)
    Customer getCustomerById(@PathVariable("customerId") UUID id) {
        return customerService.getCustomerById(id);
    }
}

package eu.dorsum.gyak_app.controller;


import eu.dorsum.gyak_app.model.Customer;
import eu.dorsum.gyak_app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {


    //TODO customer service létrehozás

    @Autowired
    private CustomerService customerService;


    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getCustomers() {
        List<Customer> customers = customerService.getCustomers();
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    @GetMapping("/customerByName")
    public ResponseEntity<Customer> getCustomerByName(@RequestParam String name) {
        Customer customer = customerService.getCustomerByName(name);
        return new ResponseEntity<>(customer, HttpStatus.OK);
    }

    @PostMapping("/customer")
    public ResponseEntity<?> insertCustomer(@RequestBody Customer customer) {
        customerService.insertCustomer(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/customer")
    public ResponseEntity<?> updateCustomer(@RequestBody Customer customer) {
        customerService.updateCustomer(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

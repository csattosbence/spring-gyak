package eu.dorsum.gyak_app.controller;


import eu.dorsum.gyak_app.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    //TODO customer service létrehozás

    @GetMapping("/customer")
    public ResponseEntity<List<Customer>> getCustomers() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }



    @PostMapping("/customer")
    public ResponseEntity<List<Customer>> insertCustomer(@RequestBody Customer customer) {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}

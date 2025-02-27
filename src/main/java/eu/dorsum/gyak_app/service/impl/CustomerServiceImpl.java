package eu.dorsum.gyak_app.service.impl;

import eu.dorsum.gyak_app.model.Customer;
import eu.dorsum.gyak_app.repository.CustomerRepository;
import eu.dorsum.gyak_app.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void insertCustomer(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerByName(String name) {
        return customerRepository.findByName(name);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Optional<Customer> result = customerRepository.findById(customer.getId());
        if (result.isPresent()) {
            customerRepository.save(customer);
        }

    }

}

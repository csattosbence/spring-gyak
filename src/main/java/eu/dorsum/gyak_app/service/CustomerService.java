package eu.dorsum.gyak_app.service;

import eu.dorsum.gyak_app.model.Customer;
import eu.dorsum.gyak_app.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public interface CustomerService {

    public List<Customer> getCustomers();

    public void insertCustomer(Customer customer);

    Customer getCustomerByName(String name);

    void updateCustomer(Customer customer);
}

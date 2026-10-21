package com.app.service;

import java.util.List;
import com.app.entity.Customer;

public interface CustomerService {
    List<Customer> getCustomers();
    void saveCustomer(Customer customer);
    Customer getCustomer(int customerId);
    void deleteCustomer(int customerId);
}
package com.app.service;

import java.util.List;

import com.app.dao.CustomerDAO;
import com.app.entity.Customer;

public class CustomerServiceImpl implements CustomerService{
	private final CustomerDAO customerDAO;
	
	public CustomerServiceImpl(CustomerDAO customerDAO) {
		this.customerDAO=customerDAO;
	};
	

	@Override
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	public void saveCustomer(Customer customer) {
		customerDAO.saveCustomer(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		return customerDAO.getCustomer(id);
	}

	@Override
	public void deleteCustomer(int id) {
		customerDAO.deleteCustomer(id);
		
	}

}

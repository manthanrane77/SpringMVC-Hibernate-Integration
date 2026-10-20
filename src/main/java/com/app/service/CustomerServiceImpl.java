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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

}

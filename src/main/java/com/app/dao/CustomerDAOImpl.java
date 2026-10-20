package com.app.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.app.entity.Customer;


public class CustomerDAOImpl implements CustomerDAO{
	private final SessionFactory sessionFactory;
	
	public CustomerDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory=sessionFactory;
	}

	@Override
	public List<Customer> getCustomers() {
		Session session=sessionFactory.getCurrentSession();
		
		return session.createQuery("from customer orderby lastName",Customer.class).getResultList();
	}

	@Override
	public void saveCustomer(Customer customer) {
		Session session=sessionFactory.getCurrentSession();
		session.merge(customer);
		
	}

	@Override
	public Customer getCustomer(int id) {
		Session session=sessionFactory.getCurrentSession();
		return session.get(Customer.class, id);
		
	}

	@Override
	public void deleteCustomer(int id) {
		Session session=sessionFactory.getCurrentSession();
		Customer customer=session.get(Customer.class, id);
		if(customer != null) {
			session.remove(customer);
		}
		
		
	}

}

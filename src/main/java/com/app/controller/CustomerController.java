package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	private final CustomerService customerService;
	
	public CustomerController(CustomerService customerService) {
		this.customerService=customerService;
		
	}
	
	@GetMapping("/list")
	public String listCustomer(Model model) {
		model.addAttribute("customer", customerService.getCustomers());
		return "list-customer";
	}
	
	  @GetMapping("/showForm")
	    public String showForm(Model model) {
	        model.addAttribute("customer", new Customer());
	        return "customer-form";
	    }
	  
	  @PostMapping("/saveCustomer")
	    public String saveCustomer(
	            @ModelAttribute("customer") Customer customer) {
	        customerService.saveCustomer(customer);
	        return "redirect:/customer/list";
	    }
	  
	  @GetMapping("/showFormForUpdate")
	    public String showUpdateForm(
	            @RequestParam("customerId") int customerId,
	            Model model) {

	        Customer customer = customerService.getCustomer(customerId);
	        model.addAttribute("customer", customer);
	        return "customer-form";
	    }
	  
	  
	  @GetMapping("/delete")
	    public String deleteCustomer(
	            @RequestParam("customerId") int customerId) {

	        customerService.deleteCustomer(customerId);
	        return "redirect:/customer/list";
	    }
	  

}

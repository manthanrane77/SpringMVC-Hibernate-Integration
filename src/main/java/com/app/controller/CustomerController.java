package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.app.entity.Customer;
import com.app.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Show all customers
    @GetMapping("/list")
    public String listCustomers(Model model) {
        model.addAttribute("customers", customerService.getCustomers());
        return "list-customer";
    }

    // Display a blank form for adding a customer
    @GetMapping("/showForm")
    public String showFormForAdd(Model model) {
        model.addAttribute("customer", new Customer());
        return "customer-form";
    }

    // Save a new customer or an edited customer
    @PostMapping("/saveCustomer")
    public String saveCustomer(@ModelAttribute("customer") Customer customer) {
        customerService.saveCustomer(customer);
        return "redirect:/customer/list";
    }

    // Load a customer into the form for editing
    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(
            @RequestParam("customerId") int customerId,
            Model model) {

        Customer customer = customerService.getCustomer(customerId);

        if (customer == null) {
            return "redirect:/customer/list";
        }

        model.addAttribute("customer", customer);
        return "customer-form";
    }

    // Delete a customer
    @GetMapping("/delete")
    public String deleteCustomer(
            @RequestParam("customerId") int customerId) {

        customerService.deleteCustomer(customerId);
        return "redirect:/customer/list";
    }
}
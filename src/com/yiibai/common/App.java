package com.yiibai.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yiibai.customer.dao.CustomerDAO;
import com.yiibai.customer.model.Customer;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	 
        CustomerDAO customerDAO = (CustomerDAO) context.getBean("customerDAO");
        Customer customer = new Customer(1, "yiibai", 29);
        customerDAO.insert(customer);
        customer = new Customer(2, "yiibai1", 23);
        customerDAO.insert(customer);
        customer = new Customer(3, "yiibai2", 23);
        customerDAO.insert(customer);
    	
        Customer customer1 = customerDAO.findByCustomerId(3);
        System.out.println(customer1);
        
    }
}

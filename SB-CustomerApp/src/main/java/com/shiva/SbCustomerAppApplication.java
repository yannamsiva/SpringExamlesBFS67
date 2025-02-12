package com.shiva;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.shiva.entity.Customer;
import com.shiva.repo.CustomerRepo;

@SpringBootApplication
public class SbCustomerAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(SbCustomerAppApplication.class, args);
		
		CustomerRepo custImpl = ctx.getBean(CustomerRepo.class);
		/*
		 * //save the data into the database
		 * 
		 * Customer c=new Customer(); c.setCname("lilly"); c.setCadd("usa"); Customer
		 * cust = custImpl.save(c); if(cust!=null) {
		 * System.out.println("Record inserted success fully");
		 * 
		 * System.out.println(cust.getCno()+"\t"+cust.getCname()+"\t"+cust.getCadd()); }
		 * else { System.out.println("Record not inserted check once"); }
		 */
		
		/*
		 * //fetch the data using customerno
		 * 
		 * Optional<Customer> byId = custImpl.findById(10); Customer c=null;
		 * if(byId.isPresent()) { c=byId.get();
		 * System.out.println(c.getCno()+"\t"+c.getCname()+"\t"+c.getCadd()); } else {
		 * System.out.println("Record not found"); }
		 */
		
	/*	//using cname fetch the data
		Optional<Customer> byCname = custImpl.findByCname("shiva");
		
		Customer c=null;
		if(byCname.isPresent()) {
			c=byCname.get();
			System.out.println(c.getCno()+"\t"+c.getCname()+"\t"+c.getCadd());
		}
			else
				System.out.println("Record not found");
		}*/
		
List<String> customerNames = custImpl.getCustomerNames();
customerNames.stream().forEach(System.out::println);

	}
}



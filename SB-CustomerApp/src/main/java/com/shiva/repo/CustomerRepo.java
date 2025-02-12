package com.shiva.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.shiva.entity.Customer;
@Repository
public interface CustomerRepo extends JpaRepository<Customer, Integer> {

	//findByXXX mehtods
	
	Optional<Customer>findByCname(String cname);
	
	Optional<Customer>findByCnameAndCadd(String cname,String cadd);
	
	//Query Methods(JPQL)
	//@Query("select cname from Customer")
	@Query(value  = "select cname  from customers",nativeQuery = true)
	List<String> getCustomerNames();
	
	
}

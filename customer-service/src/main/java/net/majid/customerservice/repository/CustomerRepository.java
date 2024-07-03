package net.majid.customerservice.repository;

import net.majid.customerservice.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository  extends JpaRepository <Customer,Long>  {
}

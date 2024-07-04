package net.majid.customerservice;

import net.majid.customerservice.entities.Customer;
import net.majid.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(CustomerRepository customerRepository){
        return args -> {
            List <Customer> customerList=List.of(
                    Customer.builder()
                            .firstName("Sami")
                            .lasName("CHADAD")
                            .email("sami@gmail.com")
                            .build(),
                    Customer.builder()
                            .firstName("Loujayne")
                            .lasName("LOUJAYNE")
                            .email("louajayne@gmail.com")
                            .build(),
                    Customer.builder()
                            .firstName("Majid")
                            .lasName("CHADAD")
                            .email("majid@gmail.com")
                            .build(),
                    Customer.builder()
                            .firstName("Ourssoula")
                            .lasName("SIKAL")
                            .email("sikal@gmail.com")
                            .build()
            );
            customerRepository.saveAll(customerList);
        };
    }
}

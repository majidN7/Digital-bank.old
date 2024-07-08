package net.majid.accountservice.entities;

import jakarta.persistence.*;
import lombok.*;
import net.majid.accountservice.enums.AccountType;
import net.majid.accountservice.model.Customer;

import java.time.LocalDate;

@Entity
@Getter @Setter @ToString @AllArgsConstructor @NoArgsConstructor @Builder
public class BankAccount {
    @Id
    private String accountId;
    private Double balance;
    private LocalDate   createdAt;
    private String currency;
    @Enumerated(EnumType.STRING)
    private AccountType type;
    @Transient
    private Customer customer;
    private Long customerId;
}

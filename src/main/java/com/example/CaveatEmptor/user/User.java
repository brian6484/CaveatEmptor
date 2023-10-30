package com.example.CaveatEmptor.user;

import com.example.CaveatEmptor.address.Address;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "USERS")
public class User {
    @Id
    @GeneratedValue
    private Long id;

    private String username;
    private LocalDate registrationDate;
    private String email;
    private int level;

    @Embedded
    private Address address;

    @Embedded
    @AttributeOverride(name = "street",
            column = @Column(name = "BILLING_STREET"))
    @AttributeOverride(name = "zipcode",
            column = @Column(name = "BILLING_ZIPCODE", length = 5))
    @AttributeOverride(name = "city",
            column = @Column(name = "BILLING_CITY"))
    private Address billingAddress;



}

package com.example.CaveatEmptor.address;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor
public class Address {
    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String zipcode;

    private String city;

}

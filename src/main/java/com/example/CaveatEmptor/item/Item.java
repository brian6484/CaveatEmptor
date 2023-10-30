package com.example.CaveatEmptor.item;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.hibernate.annotations.ColumnTransformer;
import org.hibernate.annotations.Formula;

@Entity
public class Item {
    @Id
    @GeneratedValue
    private Long id;

    @Formula("CONCAT(SUBSTR(DESCRIPTION,1,12), '...')")
    private String shortDescription;

    @Column(name = "IMPERIALWEIGHT")
    @ColumnTransformer(
            read = "IMPERIALWEIGHT/2.20462",
            write = "? * 2.20462")
    private double metricWeight;

}

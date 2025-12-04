package com.pasalo_WS_101_Lab.__20.WS_101;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private Double price;

    @ManyToMany(mappedBy = "products")
    private List<Invoice> invoices;

    // Getters & Setters
}


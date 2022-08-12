package com.adam.simplecrud.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @Column(length = 150,nullable = false)
    private String name;

    @Column(length = 100,nullable = false)
    private String brand;

    @Column(nullable = false)
    private Double price;
}

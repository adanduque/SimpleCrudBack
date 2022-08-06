package com.adam.simplecrud.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSaleDetail;

    @ManyToOne
    @JoinColumn(name = "id_sale",nullable = false,foreignKey = @ForeignKey(name = "FK_SALE_DETAILS"))
    private Sale idSale;

    @ManyToOne
    @JoinColumn(name = "id_product",nullable = false,foreignKey = @ForeignKey(name = "FK_PRODUCT_DETAILS"))
    private Product idProduct;

    @Column(nullable = false)
    private Integer quantity;

}

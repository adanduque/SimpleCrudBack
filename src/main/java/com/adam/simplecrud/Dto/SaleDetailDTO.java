package com.adam.simplecrud.Dto;

import com.adam.simplecrud.Model.Product;
import com.adam.simplecrud.Model.Sale;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDetailDTO {

    @EqualsAndHashCode.Include
    private Integer idSaleDetail;

    @NotNull
    private Sale idSale;

    @NotNull
    private Product idProduct;

    @NotNull
    private Integer quantity;
}

package com.adam.simplecrud.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    @EqualsAndHashCode.Include
    private Integer idProduct;

    @NotNull
    @Size(min = 3, message = "{name.size}")
    private String name;

    @NotNull
    @Size(min = 5, message = "{brand.size}")
    private String brand;
}

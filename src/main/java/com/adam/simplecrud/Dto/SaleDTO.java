package com.adam.simplecrud.Dto;

import com.adam.simplecrud.Model.Person;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SaleDTO {
    @EqualsAndHashCode.Include
    private Integer idSale;

    @NotNull
    private LocalDateTime datetime;

    @NotNull
    private Person idPerson	;

    @NotNull
    private Integer total;
}

package com.adam.simplecrud.Dto;

import com.adam.simplecrud.Model.Person;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class SaleDTO {
    @EqualsAndHashCode.Include
    private Integer idSale;

    @NotNull
    private LocalDateTime datetime;

    @NotNull
    private Person person	;

    @NotNull
    private Integer total;

    @NotNull
    private List<SaleDetailDTO> details;
}

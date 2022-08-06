package com.adam.simplecrud.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    @EqualsAndHashCode.Include
    private Integer idPerson;

    @NotNull
    @Size(min = 3, message = "{firstname.size}")
    private String firstname;

    @NotNull
    @Size(min = 3, message = "{lastname.size}")
    private String lastname;

}

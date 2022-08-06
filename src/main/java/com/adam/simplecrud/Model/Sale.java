package com.adam.simplecrud.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    private LocalDateTime datetime;

    @ManyToOne
    @JoinColumn(name = "id_person",nullable = false,foreignKey = @ForeignKey(name = "FK_SALE_PERSON"))
    //FK_SALE_PERSON
    private Person idPerson	;

    @Column(nullable = false)
    private Integer total;
}

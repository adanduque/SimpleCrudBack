package com.adam.simplecrud.Model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Sale {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idSale;

    private LocalDateTime datetime;

    @ManyToOne
    @JoinColumn(name = "id_person",nullable = false,foreignKey = @ForeignKey(name = "FK_SALE_PERSON"))
    //FK_SALE_PERSON
    private Person person	;

    @Column(nullable = false)
    private Integer total;

    @OneToMany(fetch = FetchType.EAGER,mappedBy = "sale", cascade = {CascadeType.ALL }, orphanRemoval = true)
    private List<SaleDetail> details =new ArrayList<>();;
}

package com.mercadona.BackendPromotionProduits.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "CATEGORIE")
public class Categorie {
    @Id

    @ManyToMany
    @JoinTable(name = "categorie_produit",
            joinColumns = @JoinColumn(name = "idCategorie"),
            inverseJoinColumns = @JoinColumn(name = "idProduit")
    )
    private List<Categorie> categories = new ArrayList<>();


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "LIBELLE_CATEGORIE")
    private String libelleCategorie;
}

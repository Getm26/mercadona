package com.mercadona.BackendPromotionProduits.service;

import com.mercadona.BackendPromotionProduits.model.Produit;

import java.util.List;

public interface ProduitService {

    Produit creerProduit(Produit produit);

    List<Produit> lireProduit();

    Produit modifierProduit(Long id, Produit produit);

    String supprimerProduit(Long id);

}

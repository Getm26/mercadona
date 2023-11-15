package com.mercadona.BackendPromotionProduits.controller;

import com.mercadona.BackendPromotionProduits.model.Produit;
import com.mercadona.BackendPromotionProduits.service.ProduitService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@RestController
@RequestMapping("/produit")
@AllArgsConstructor
public class ProduitController {

    private final ProduitService produitService;

    @PostMapping("/create")
    public Produit create(@RequestBody Produit produit){
        return produitService.creerProduit(produit);
    }

    @GetMapping("/read")
    public List<Produit> read(){
        return produitService.lireProduit();
    }

    @PutMapping("/update/{id}")
    public Produit update(@PathVariable Long id, @RequestBody Produit produit){
        return produitService.modifierProduit(id,produit);
    }

    @DeleteMapping("/delete")
    public  String delete(@PathVariable Long id){
        return produitService.supprimerProduit(id);

    }
}

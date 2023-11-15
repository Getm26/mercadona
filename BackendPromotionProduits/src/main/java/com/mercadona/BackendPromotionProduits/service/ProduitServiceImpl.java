package com.mercadona.BackendPromotionProduits.service;

import com.mercadona.BackendPromotionProduits.model.Produit;
import com.mercadona.BackendPromotionProduits.repository.ProduitRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.security.core.parameters.P;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitServiceImpl implements ProduitService {

    private final ProduitRepository produitRepository;

    @Override
    public Produit creerProduit(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public List<Produit> lireProduit() {
        return produitRepository.findAll();
    }

    @Override
    public Produit modifierProduit(Long id, Produit produit) {
        return produitRepository.findById(id)
                .map(p ->{
                    p.setPrixProduit(produit.getPrixProduit());
                    p.setLibelleProduit(produit.getLibelleProduit());
                    p.setDescription(produit.getDescription());
                    return produitRepository.save(produit);
                }).orElseThrow();

    }

    @Override
    public String supprimerProduit(Long id) {
        produitRepository.deleteById(id);
        return "le Produit est Supprimé";
    }
}

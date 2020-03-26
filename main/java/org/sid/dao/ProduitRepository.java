package org.sid.dao;

import org.sid.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface ProduitRepository extends JpaRepository<Produit,Long> {
    @Query("select p from Produit p where p.designation like :x and p.prix>:y")
    public List<Produit> chercherProduits(
            @Param("x")String mc, @Param("y")double prixMin);
}

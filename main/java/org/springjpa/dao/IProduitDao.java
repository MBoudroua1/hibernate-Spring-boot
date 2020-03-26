package org.springjpa.dao;
import org.springjpa.Produit;
import java.util.List;

public interface IProduitDao {
    public Produit saveProduit(Produit p);
    public List<Produit> findAll();
    public Produit findOne(Long id);
    public void remove(Long id);
    public void update(Long id);
    public List<Produit> findByDesignation(String des);

}

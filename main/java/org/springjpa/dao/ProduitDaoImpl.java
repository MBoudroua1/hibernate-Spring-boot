package org.springjpa.dao;

import org.springframework.stereotype.Repository;
import org.springjpa.Produit;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class ProduitDaoImpl implements IProduitDao {
    public ProduitDaoImpl(){
        System.out.println("###################################");
        System.out.println("##Instanciation de ProduitDaoImpl##");
        System.out.println("###################################");
    }
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public Produit saveProduit(Produit p) {
        entityManager.persist(p);
        return p;
    }


    @Override
    public List<Produit> findAll() {
        Query req = entityManager.createQuery("select p from Produit p");

        return req.getResultList();
    }

    @Override
    public Produit findOne(Long id) {
        Produit p = entityManager.find(Produit.class, id);
        return p;
    }

    @Override
    public void remove(Long id) {
        Produit p = entityManager.find(Produit.class, id);
        entityManager.remove(p);
        System.out.println("removed");
    }

    @Override
    public void update(Long id) {
        entityManager.merge(id);
    }

    @Override
    public List<Produit> findByDesignation(String des) {
        Query req = entityManager.createQuery("select p from Produit p where p.designation like x");
        req.setParameter("x", des);
        return req.getResultList();
    }

}

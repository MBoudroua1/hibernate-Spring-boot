package org.sid;

import org.sid.dao.ProduitRepository;
import org.sid.entities.Produit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
class SpringHibernateApplication{
    public static void main(String[] args) {
        ApplicationContext ctx =  SpringApplication.run(SpringHibernateApplication.class, args);
        ProduitRepository produitRepository =  ctx.getBean(ProduitRepository.class);
        produitRepository.save(new Produit("Ordinateur", 50,1L));
        produitRepository.save(new Produit("TV", 250,2L));
        produitRepository.save(new Produit("TV", 70,3L));
        List<Produit> produitList = produitRepository.findAll();
        for (Produit produit: produitList) {
            System.out.println(produit.getDesignation());

        }



    }
}

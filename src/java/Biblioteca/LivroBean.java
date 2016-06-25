/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Biblioteca;

import javax.faces.bean.ManagedBean;
import javax.persistence.EntityManager;




/**
 *
 * @author alfredo
 */
@ManagedBean
public class LivroBean {
    
   private Livro livro = new Livro();
    
   public Livro getLivro() {
        return this.livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public void salva(Livro livro){
        
        EntityManager em = JPAUtil.getEntityManager();
        em.getTransaction().begin();
        
        em.persist(livro);
        
        em.getTransaction().commit();
        em.close();
    }
           
}
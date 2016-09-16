/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Peter
 */
public class Facade {

    private EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAexamprep1PU");

    public void addPerson(Person p) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    public Person findPerson(int key) {
        EntityManager em = emf.createEntityManager();
        Person p;
        
        em.getTransaction().begin();
        p = em.find(Person.class, key);
        em.getTransaction().commit();
        
        return p;
    }

    public void deletePerson(Person p) {
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        em.remove(p);
        em.getTransaction().commit();
    }

}

package com.SavingAccount.SavingAccount.Repositories;

import javax.persistence.EntityManager;

import com.SavingAccount.SavingAccount.Models.ahorroDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class SavingaccountJPA {
    @Autowired
    private EntityManager em;
 
    /*
     * Method to fetch all employees from the db.
     * @return
     */
    @SuppressWarnings("unchecked")
    public Iterable<ahorroDTO> getAllEmployees() {
        return em.createNamedStoredProcedureQuery("procedure-one").getResultList();
    }
 
}

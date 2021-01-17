package com.SavingAccount.SavingAccount.Controller;

import com.SavingAccount.SavingAccount.Models.ahorroDTO;
import com.SavingAccount.SavingAccount.Repositories.SavingaccountJPA;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/deposit-account")
public class SavingaccountContr {
    @Autowired
    SavingaccountJPA     savingjpa;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @GetMapping("/saving")
    public Iterable<ahorroDTO> getAll() {
        logger.debug("Get all employees.");
        return savingjpa.getAllEmployees();
    }

}

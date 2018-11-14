package org.cnam.sample.domain;

import java.math.BigDecimal;
import java.util.UUID;

public class Account {
    public UUID idAccount, idCustomer;
    public BigDecimal solde;


    public Account()
    {}

    public Account(UUID idAccount, UUID idCustomer, BigDecimal solde)
    {
        this.idAccount = idAccount;
        this.idCustomer = idCustomer;
        this.solde = solde;
    }

/*    public Account(UUID idAccount, UUID idCustomer)
    {
        this.idAccount = idAccount;
        this.idCustomer = idCustomer;
        this.solde = 0;
    }*/
}
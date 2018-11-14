package org.cnam.sample.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table (name = "ACCOUNT")

public class AccountModel {
    @Id
    @Column(name ="idAccount")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID idAccount;

    @Column(name="idCustomer")
    private UUID idCustomer;

    @Column(name="solde")
    private BigDecimal solde;

    public AccountModel() {
    }

    public AccountModel(UUID idAccount, UUID idCustomer, BigDecimal solde) {
        this.idAccount = idAccount;
        this.idCustomer = idCustomer;
        this.solde = solde;
    }

    public UUID getIdAccount() {
        return idAccount;
    }
    public void setIdAccount(UUID idAccount) {
        this.idAccount = idAccount;
    }

    public UUID getIdCustomer() {
        return idCustomer;
    }
    public void setIdCustomer(UUID idCustomer) {
        this.idCustomer = idCustomer;
    }

    public BigDecimal getSolde()
    {
        return solde;
    }
    public void setSolde(BigDecimal solde) {
        this.solde = solde;
    }




}
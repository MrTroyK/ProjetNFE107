package org.cnam.sample.dto.Response;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountSoldeResponseDto
{
    private UUID idAccount;
    public BigDecimal solde;

    public AccountSoldeResponseDto(){ }
    public AccountSoldeResponseDto(UUID idAccount)
    {
        this.idAccount = idAccount;
        this.solde = solde;
    }

}

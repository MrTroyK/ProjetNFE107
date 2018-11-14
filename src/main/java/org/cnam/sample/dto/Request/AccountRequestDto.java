// Les Services font des Requests et nous on envoi des Response

package org.cnam.sample.dto.Request;

import java.math.BigDecimal;
import java.util.UUID;

public class AccountRequestDto {

    public UUID idCustomer, idAccount ;
    public BigDecimal solde;

    public AccountRequestDto() {}
    public AccountRequestDto(UUID idCustomer)
    {
        this.idCustomer = idCustomer;
    }



    }


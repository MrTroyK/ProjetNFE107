package org.cnam.sample.dto.Response;

import java.util.UUID;

public class AccountResponseDto {

    public UUID idAccount;

    public AccountResponseDto(UUID idAccount)
    {
        this.idAccount = idAccount;
    }

}
package org.cnam.sample.controller;

import org.cnam.sample.domain.Account;
import org.cnam.sample.dto.SavePersonRequest;
import org.cnam.sample.dto.SavePersonResponse;
import org.cnam.sample.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService personService;



    /*@PostMapping
    public List<SavePersonResponse> savePerson(final SavePersonRequest savePersonRequest){
        final Account person = new Account()
        final List<Account> personList = personService.savePerson(person);

        return null;

    }*/
}
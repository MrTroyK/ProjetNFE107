package org.cnam.sample.service;

import org.cnam.sample.domain.Account;
import org.cnam.sample.model.AccountModel;
import org.cnam.sample.repository.AccountRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.UUID;


@Service
public class AccountService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccountService.class);

    @Autowired
    private AccountRepository accountRepository;

    public Account createAccount(UUID idAccount,UUID idCustomer)
    {
        BigDecimal solde = new BigDecimal(0);
        AccountModel accountModel = new AccountModel(idAccount,idCustomer, solde);
        AccountModel accountModelSaved = accountRepository.save(accountModel);
        return new Account(accountModelSaved.getIdAccount(), accountModelSaved.getIdCustomer(), accountModelSaved.getSolde());
    }

    public Account createAccount(UUID idAccount,UUID idCustomer,BigDecimal solde)
    {
        AccountModel accountModel = new AccountModel(idAccount,idCustomer, solde);
        AccountModel accountModelSaved = accountRepository.save(accountModel);
        return new Account(accountModelSaved.getIdAccount(), accountModelSaved.getIdCustomer(), accountModelSaved.getSolde());
    }

    /*public Account getAccount(UUID idCustomer)
    {
        AccountModel AccountModelFound = accountRepository.findAll(idCustomer);

        return new Sample (sampleModelFound.getId(),sampleModelFound.getData());
    }*/



    /*public List<Account> savePerson(final Account person){
        final AccountModel personModel = new AccountModel();
        personModel.setName(person.name);
        personRepository.save(personModel);

        final List<AccountModel> personModelList = personRepository.findAll();

        return personModelList.stream()
                .map(it -> new Account(it.getName()))
                .collect(Collectors.toList());
    }*/
}
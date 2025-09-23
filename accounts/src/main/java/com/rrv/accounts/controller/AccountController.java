package com.rrv.accounts.controller;

import com.rrv.accounts.modal.Account;
import com.rrv.accounts.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController("api/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping()
    public List<Account> getAccounts(){
        return accountService.getAccounts();
    }

    @GetMapping("{id}")
    public Account getAccountById(@PathVariable int id){
        return accountService.getAccountById(id);
    }

    @PostMapping()
    public Account createAccount(@RequestBody Account account){
        return accountService.createAccount(account);
    }

    @PutMapping()
    public Account updateAccount(@RequestBody Account account){
        return accountService.updateAccount(account);
    }

    @DeleteMapping("{id}")
    public void deleteAccount(@PathVariable int id){
        accountService.deleteAccount(id);
    }


}

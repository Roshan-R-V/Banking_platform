package com.rrv.ledger.controller;

import com.rrv.ledger.modal.Ledger;
import com.rrv.ledger.service.LedgerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LedgerController {

    @Autowired
    LedgerService service;

    @GetMapping
    public List<Ledger> getLedgers(){
        return service.getLedgers();
    }

    @GetMapping("{id}")
    public Ledger getLedger(@PathVariable int id){
        return service.getLedger(id);
    }

    @PostMapping
    public Ledger createLedger(Ledger ledger){
        return service.createLedger(ledger);
    }

    @PutMapping
    public Ledger updateLedger(Ledger ledger){
        return service.updateLedger(ledger);
    }

    @DeleteMapping
    public void deleteLedger(int id){
        service.deleteLedger(id);
    }
}

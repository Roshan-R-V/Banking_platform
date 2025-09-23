package com.rrv.ledger.service;

import com.rrv.ledger.modal.Ledger;
import com.rrv.ledger.repository.LedgerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LedgerService {

    @Autowired
    LedgerRepository repo;

    public List<Ledger> getLedgers(){
        return repo.findAll();
    }

    public Ledger getLedger(Integer id){
        return repo.findById(id).orElse(new Ledger());
    }

    public Ledger createLedger(Ledger ledger){
        return repo.save(ledger);
    }

    public Ledger updateLedger(Ledger ledger){
        return repo.save(ledger);
    }

    public void deleteLedger(Integer id){
        repo.deleteById(id);
    }


}

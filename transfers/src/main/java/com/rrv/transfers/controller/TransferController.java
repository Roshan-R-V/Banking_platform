package com.rrv.transfers.controller;

import com.rrv.transfers.modal.Transfer;
import com.rrv.transfers.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/transfers")
public class TransferController {

    @Autowired
    private TransferService transferService;

    @GetMapping
    public List<Transfer> getAllTransfers() {
        return transferService.getAllTransfers();
    }

    @GetMapping("{id}")
    public Transfer getTransferById(@PathVariable int id) {
        return transferService.getTransferById(id);
    }

    @PostMapping
    public Transfer createTransfer(@RequestBody Transfer transfer) {
        return transferService.createTransfer(transfer);
    }

    @PutMapping
    public Transfer updateTransfer(@RequestBody Transfer transfer) {
        return transferService.updateTransfer(transfer);
    }

    @DeleteMapping
    public void deleteTransferById(@PathVariable int id) {
        transferService.deleteTransferById(id);
    }


}

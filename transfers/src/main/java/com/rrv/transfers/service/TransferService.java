package com.rrv.transfers.service;

import com.rrv.transfers.modal.Transfer;
import com.rrv.transfers.repository.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {

    @Autowired
    private TransferRepository transferRepository;

    public Transfer createTransfer(Transfer transfer) {
        return transferRepository.save(transfer);
    }

    public List<Transfer> getAllTransfers() {
        return transferRepository.findAll();
    }
    public Transfer getTransferById(int id) {
        return transferRepository.findById(id).get();
    }
    public Transfer updateTransfer(Transfer transfer) {
        return transferRepository.save(transfer);
    }
    public void deleteTransferById(int id) {
        transferRepository.deleteById(id);
    }
}

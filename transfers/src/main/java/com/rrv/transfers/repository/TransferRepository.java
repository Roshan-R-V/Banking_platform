package com.rrv.transfers.repository;

import com.rrv.transfers.modal.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Integer> {
}

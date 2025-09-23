package com.rrv.ledger.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Currency;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ledger {
    @Id
    private int id;
    private int transactionId;
    private int debit_account_id;
    private int credit_account_id;
    private Currency currency;
    private Double amount;
    private LocalDateTime transfer_at;
}

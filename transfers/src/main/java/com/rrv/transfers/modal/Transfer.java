package com.rrv.transfers.modal;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
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
public class Transfer {
    @Id
    @GeneratedValue
    private long id;
    private int from_account_id;
    private int to_account_id;
    private Currency currency;
    private double amount;
    private String status;
    private String idem_key;
    private String request_hash;
    private LocalDateTime transfer_at;
}

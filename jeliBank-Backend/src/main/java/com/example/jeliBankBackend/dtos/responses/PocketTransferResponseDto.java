package com.example.jeliBankBackend.dtos.responses;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PocketTransferResponseDto {
    private int accountNumber;
    private int pocketNumber;
    private double amount;

    public PocketTransferResponseDto(int accountNumber, int pocketNumber, double amount) {
        this.accountNumber = accountNumber;
        this.pocketNumber = pocketNumber;
        this.amount = amount;
    }
}

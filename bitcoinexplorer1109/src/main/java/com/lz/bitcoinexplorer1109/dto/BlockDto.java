package com.lz.bitcoinexplorer1109.dto;

import com.lz.bitcoinexplorer1109.po.Block;

import java.util.List;

public class BlockDto extends Block {
    private List<TransactionDto> transactionDtos;

    public List<TransactionDto> getTransactionDtos() {
        return transactionDtos;
    }

    public void setTransactionDtos(List<TransactionDto> transactionDtos) {
        this.transactionDtos = transactionDtos;
    }
}

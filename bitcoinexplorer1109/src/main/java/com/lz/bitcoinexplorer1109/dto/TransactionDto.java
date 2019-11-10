package com.lz.bitcoinexplorer1109.dto;

import com.lz.bitcoinexplorer1109.po.TransactionRecord;
import com.lz.bitcoinexplorer1109.po.Transcation;

import java.util.List;

public class TransactionDto extends Transcation {
    private List<TransactionRecord> transactionRecords;

    public List<TransactionRecord> getTransactionRecords() {
        return transactionRecords;
    }

    public void setTransactionRecords(List<TransactionRecord> transactionRecords) {
        this.transactionRecords = transactionRecords;
    }
}

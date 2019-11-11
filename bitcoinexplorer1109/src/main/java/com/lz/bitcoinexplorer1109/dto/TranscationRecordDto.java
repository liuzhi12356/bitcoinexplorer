package com.lz.bitcoinexplorer1109.dto;

import com.lz.bitcoinexplorer1109.po.TransactionRecord;

import java.util.List;

public class TranscationRecordDto  {
    private int trans;
    private List<TransactionRecord> transactionRecords;

    public int getTrans() {
        return trans;
    }

    public void setTrans(int trans) {
        this.trans = trans;
    }

    public List<TransactionRecord> getTransactionRecords() {
        return transactionRecords;
    }

    public void setTransactionRecords(List<TransactionRecord> transactionRecords) {
        this.transactionRecords = transactionRecords;
    }

    public TranscationRecordDto() {
    }

    public TranscationRecordDto(int trans, List<TransactionRecord> transactionRecords) {
        this.trans = trans;
        this.transactionRecords = transactionRecords;
    }
}

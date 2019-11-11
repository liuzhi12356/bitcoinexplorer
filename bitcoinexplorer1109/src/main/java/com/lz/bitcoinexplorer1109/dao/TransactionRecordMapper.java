package com.lz.bitcoinexplorer1109.dao;

import com.lz.bitcoinexplorer1109.po.TransactionRecord;

import java.util.List;

public interface TransactionRecordMapper {
    int insert(TransactionRecord record);

    int insertSelective(TransactionRecord record);

    List<TransactionRecord> getByaddress(String address);
}
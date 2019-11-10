package com.lz.bitcoinexplorer1109.dao;

import com.lz.bitcoinexplorer1109.po.transactionRecord;

public interface transactionRecordMapper {
    int insert(transactionRecord record);

    int insertSelective(transactionRecord record);
}
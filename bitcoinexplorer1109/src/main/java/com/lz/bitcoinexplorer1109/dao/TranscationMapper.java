package com.lz.bitcoinexplorer1109.dao;

import com.lz.bitcoinexplorer1109.dto.TransactionDto;
import com.lz.bitcoinexplorer1109.po.Transcation;

public interface TranscationMapper {
    int insert(Transcation record);

    int insertSelective(Transcation record);

    TransactionDto gettranscationByHash(String hash);
}
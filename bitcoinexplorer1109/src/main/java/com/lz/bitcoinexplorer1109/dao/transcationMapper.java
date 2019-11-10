package com.lz.bitcoinexplorer1109.dao;

import com.lz.bitcoinexplorer1109.po.transcation;

public interface transcationMapper {
    int insert(transcation record);

    int insertSelective(transcation record);
}
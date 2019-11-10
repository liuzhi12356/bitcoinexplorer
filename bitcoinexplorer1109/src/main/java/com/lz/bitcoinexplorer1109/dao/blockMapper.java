package com.lz.bitcoinexplorer1109.dao;

import com.lz.bitcoinexplorer1109.po.block;

public interface blockMapper {
    int insert(block record);

    int insertSelective(block record);
}
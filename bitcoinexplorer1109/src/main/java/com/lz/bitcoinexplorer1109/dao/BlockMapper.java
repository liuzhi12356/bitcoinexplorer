package com.lz.bitcoinexplorer1109.dao;

import com.lz.bitcoinexplorer1109.dto.BlockDto;
import com.lz.bitcoinexplorer1109.po.Block;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BlockMapper {
    int insert(Block record);

    int insertSelective(Block record);
    List<Block> blocks();

    BlockDto getBlockByHash(@Param("hash") String hash);
}
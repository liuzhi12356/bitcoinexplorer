package com.lz.bitcoinexplorer1109.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lz.bitcoinexplorer1109.dao.BlockMapper;
import com.lz.bitcoinexplorer1109.dto.BlockDto;
import com.lz.bitcoinexplorer1109.po.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@RestController
@RequestMapping("/block")
@EnableAutoConfiguration
public class BlockController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private BlockMapper blockMapper;

    @RequestMapping("/blocks")
    public PageInfo<Block> blocks(){
        PageHelper.startPage(1,20);
        List<Block> blocks = blockMapper.blocks();
        PageInfo<Block> blockPageInfo = new PageInfo<>(blocks);
        return blockPageInfo;
    }

    @RequestMapping("/{hash}")
    public BlockDto blockdto(@PathVariable String hash){
        BlockDto dto=blockMapper.getBlockByHash(hash);
        return dto;
    }
}

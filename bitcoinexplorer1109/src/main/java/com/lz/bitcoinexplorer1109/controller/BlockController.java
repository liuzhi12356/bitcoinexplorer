package com.lz.bitcoinexplorer1109.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lz.bitcoinexplorer1109.api.BitcoinApi;
import com.lz.bitcoinexplorer1109.api.JsonRpcClientBitcoin;
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
    @Autowired
    private JsonRpcClientBitcoin jsonRpcClientBitcoin;
    @Autowired
    private BitcoinApi bitcoinApi;

    /***
     * 区块列表
     * @return
     */
    @RequestMapping("/blocks")
    public PageInfo<Block> blocks(){
        PageHelper.startPage(1,20);
        List<Block> blocks = blockMapper.blocks();
        PageInfo<Block> blockPageInfo = new PageInfo<>(blocks);
        return blockPageInfo;
    }

    /***
     *
     * @param hash
     * @return
     * 区块详情
     */

    @RequestMapping("/{hash}")
    public BlockDto blockdto(@PathVariable String hash){
        BlockDto dto=blockMapper.getBlockByHash(hash);
        return dto;
    }

    /**
     * 获取最新区块
     * @return
     * @throws Throwable
     */
    @RequestMapping("/bestblock")
    public Object bestblock() throws Throwable {
        String bestBlockhash = jsonRpcClientBitcoin.getBestBlockhash();
       String temphash=bestBlockhash;

           JSONObject block = bitcoinApi.getBlock(temphash);

       return block;
    }
}

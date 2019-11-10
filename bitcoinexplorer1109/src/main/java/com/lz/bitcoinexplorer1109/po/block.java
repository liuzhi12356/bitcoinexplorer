package com.lz.bitcoinexplorer1109.po;

import java.util.Date;

public class block {
    private Integer blockId;

    private String hash;

    private Double difficulty;

    private Integer trans;

    private Integer height;

    private Integer version;

    private Date time;

    private Double transactionVolume;

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getTrans() {
        return trans;
    }

    public void setTrans(Integer trans) {
        this.trans = trans;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getTransactionVolume() {
        return transactionVolume;
    }

    public void setTransactionVolume(Double transactionVolume) {
        this.transactionVolume = transactionVolume;
    }
}
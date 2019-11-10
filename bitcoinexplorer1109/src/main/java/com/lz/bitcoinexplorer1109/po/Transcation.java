package com.lz.bitcoinexplorer1109.po;

import java.util.Date;

public class Transcation {
    private Integer transcationId;

    private String hash;

    private Date time;

    private Double totalInput;

    private Double totalOutput;

    private Integer blockId;

    private Double fees;

    private Integer confirmations;

    public Integer getTranscationId() {
        return transcationId;
    }

    public void setTranscationId(Integer transcationId) {
        this.transcationId = transcationId;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash == null ? null : hash.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getTotalInput() {
        return totalInput;
    }

    public void setTotalInput(Double totalInput) {
        this.totalInput = totalInput;
    }

    public Double getTotalOutput() {
        return totalOutput;
    }

    public void setTotalOutput(Double totalOutput) {
        this.totalOutput = totalOutput;
    }

    public Integer getBlockId() {
        return blockId;
    }

    public void setBlockId(Integer blockId) {
        this.blockId = blockId;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public Integer getConfirmations() {
        return confirmations;
    }

    public void setConfirmations(Integer confirmations) {
        this.confirmations = confirmations;
    }
}
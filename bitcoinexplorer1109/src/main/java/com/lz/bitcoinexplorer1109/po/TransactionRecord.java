package com.lz.bitcoinexplorer1109.po;

public class TransactionRecord {
    private Integer index;

    private String address;

    private Double amcount;

    private Boolean type;

    private Integer txid;

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getAmcount() {
        return amcount;
    }

    public void setAmcount(Double amcount) {
        this.amcount = amcount;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Integer getTxid() {
        return txid;
    }

    public void setTxid(Integer txid) {
        this.txid = txid;
    }
}
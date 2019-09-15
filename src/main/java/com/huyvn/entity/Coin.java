package com.huyvn.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Coin {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String name;
    private double baseAsset;
    private double quoteAsset;
    private double lastPrice;
    private double volumn24h;
    private String marketId;
    private long createdAt;
    private long updatedAt;
    private int status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseAsset() {
        return baseAsset;
    }

    public void setBaseAsset(double baseAsset) {
        this.baseAsset = baseAsset;
    }

    public double getQuoteAsset() {
        return quoteAsset;
    }

    public void setQuoteAsset(double quoteAsset) {
        this.quoteAsset = quoteAsset;
    }

    public double getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(double lastPrice) {
        this.lastPrice = lastPrice;
    }

    public double getVolumn24h() {
        return volumn24h;
    }

    public void setVolumn24h(double volumn24h) {
        this.volumn24h = volumn24h;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(long createdAt) {
        this.createdAt = createdAt;
    }

    public long getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(long updatedAt) {
        this.updatedAt = updatedAt;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

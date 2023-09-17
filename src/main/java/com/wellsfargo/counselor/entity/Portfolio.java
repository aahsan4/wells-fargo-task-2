package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
public class Portfolio {

    @Id
    @GeneratedValue()
    private long portfolioId;
    @Column(nullable = false)
    private String portfolioName;

    @Column(nullable = false)
    private Long clientId;
    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(String portfolioName, Long clientId, String creationDate) {
        this.portfolioName = portfolioName;
        this.clientId = clientId;
        this.creationDate = creationDate;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(long portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}

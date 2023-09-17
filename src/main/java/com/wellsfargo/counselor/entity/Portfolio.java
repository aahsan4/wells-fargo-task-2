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

    @ManyToOne
    private Client client;
    
    @Column(nullable = false)
    private String creationDate;

    protected Portfolio() {

    }

    public Portfolio(Client client, String portfolioName, Long clientId, String creationDate) {
        this.client = client;
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

    public Client getCLient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }
}

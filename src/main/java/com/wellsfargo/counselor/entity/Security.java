package com.wellsfargo.counselor.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;
    
    @Column(nullable = false)
    private String securityName;
    
    @ManyToOne
    private Portfolio portfolio;

    @Column(nullable = false)
    private String categoryName;

    @Column(nullable = false)
    private float purchasePrice;
    
    @Column(nullable = false)
    private String purchaseDate;
    
    @Column(nullable = false)
    private float quantity;

    protected Security() {

    }

    public Security(Portfolio portfolio, String securityName, Long portfolioId, String categoryName, float purchasePrice, String purchaseDate, float quantity) {
        this.portfolio = portfolio;
        this.securityName = securityName;
        this.portfolioId = portfolioId;
        this.categoryName = categoryName;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(float purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }
}

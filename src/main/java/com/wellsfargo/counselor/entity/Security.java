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
    @Column(nullable = false)
    private Long portfolioId;

    @Column(nullable = false)
    private String categoryName;

    @Column(nullable = false)
    private Long purchasePrice;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private Long quantity;

    protected Security() {

    }

    public Security(String securityName, Long portfolioId, String categoryName, Long purchasePrice, String purchaseDate, Long quantity) {
        this.securityName = securityName;
        this.portfolioId = portfolioId;
        this.categoryName = categoryName;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
    }
}

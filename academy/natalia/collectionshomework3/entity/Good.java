package com.academy.natalia.collectionshomework3.entity;

import java.util.Objects;

public class Good {
    private String goodType;
    private String goodName;
    private String goodModel;
    private int goodPrice;
    private int goodYearOfProduction;
    private double goodWeight;

        public Good(String goodType, String goodName, String goodModel, int goodPrice, int goodYearOfProduction, double goodWeight) {
        this.goodType = goodType;
        this.goodName = goodName;
        this.goodModel = goodModel;
        this.goodPrice = goodPrice;
        this.goodYearOfProduction = goodYearOfProduction;
        this.goodWeight = goodWeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Good)) return false;
        Good good = (Good) o;
        return getGoodPrice() == good.getGoodPrice() && getGoodYearOfProduction() == good.getGoodYearOfProduction() && Double.compare(good.getGoodWeight(), getGoodWeight()) == 0 && getGoodType().equals(good.getGoodType()) && getGoodName().equals(good.getGoodName()) && getGoodModel().equals(good.getGoodModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGoodType(), getGoodName(), getGoodModel(), getGoodPrice(), getGoodYearOfProduction(), getGoodWeight());
    }

    @Override
    public String toString() {
        return "Good{}";
    }

    public String getGoodType() {
        return goodType;
    }

    public void setGoodType(String goodType) {
        this.goodType = goodType;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    public String getGoodModel() {
        return goodModel;
    }

    public void setGoodModel(String goodModel) {
        this.goodModel = goodModel;
    }

    public int getGoodPrice() {
        return goodPrice;
    }

    public void setGoodPrice(int goodPrice) {
        this.goodPrice = goodPrice;
    }

    public int getGoodYearOfProduction() {
        return goodYearOfProduction;
    }

    public void setGoodYearOfProduction(int goodYearOfProduction) {
        this.goodYearOfProduction = goodYearOfProduction;
    }

    public double getGoodWeight() {
        return goodWeight;
    }

    public void setGoodWeight(double goodWeight) {
        this.goodWeight = goodWeight;
    }
}





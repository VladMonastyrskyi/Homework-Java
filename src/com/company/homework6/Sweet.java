package com.company.homework6;

public class Sweet {
    private double weight;
    private double sugar;
    private String name;

    public Sweet(double weight, double sugar, String name) {
        this.weight = weight;
        this.sugar = sugar;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSugar() {
        return sugar;
    }

    public void setSugar(double sugar) {
        this.sugar = sugar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sweet{" +
                "weight=" + weight +
                ", sugar=" + sugar +
                ", name='" + name + '\'' +
                '}';
    }
}

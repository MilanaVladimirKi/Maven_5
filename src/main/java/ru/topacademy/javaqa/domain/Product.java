package ru.topacademy.javaqa.domain;

public class Product {
    protected int ID;
    protected String name;
    protected int price;

    public Product(int ID, String name, int price) {
        this.ID = ID;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }
}


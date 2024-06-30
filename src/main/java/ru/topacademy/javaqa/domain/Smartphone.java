package ru.topacademy.javaqa.domain;

public class Smartphone extends Product {
    public String manufacturer;

    public Smartphone(int ID, String name, int price, String manufacturer) {
        super(ID, name, price);
        this.manufacturer = manufacturer;
    }
}

package ru.topacademy.javaqa.domain;

public class Smartphone extends Product {
    public String manufacturer;

    public Smartphone(int ID, String name, int price, String manufacturer) {
        super(ID, name, price);
        this.manufacturer = manufacturer;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}

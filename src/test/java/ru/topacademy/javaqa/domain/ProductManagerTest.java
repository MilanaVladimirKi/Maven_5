package ru.topacademy.javaqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductManagerTest {

    Book item1 = new Book(1, "Девочка с земли", 250, "Кир Булычев");
    Book item2 = new Book(2, "Светлана", 200, "Василий Жукоский");
    Smartphone item3 = new Smartphone(3, "Galaxy S24", 150000, "Samsung");
    Book item4 = new Book(4, "Вино из одуванчиков", 370, "Рей Бредбери");
    Book item5 = new Book(5, "Девочка из рода ОХара", 420, "Рита Тейлор");
    ProductRepository repo = new ProductRepository();
    ProductManager manager = new ProductManager(repo);

    @BeforeEach
    public void setUp() {
        manager.add(item1);
        manager.add(item2);
        manager.add(item3);
        manager.add(item4);
        manager.add(item5);
    }

    @Test
    public void testSearchBook() {
        Product[] expected = {item1, item5};
        Product[] actual = manager.searchBy("Девочка");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchSmartphone() {
        Product[] expected = {item3};
        Product[] actual = manager.searchBy("Galaxy");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchEmpty() {
        Product[] expected = {};
        Product[] actual = manager.searchBy("Nokia");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testRemove() {
        Product[] expected = {};
        manager.remuveByID(3);
        Product[] actual = manager.searchBy("Galaxy");
        Assertions.assertArrayEquals(expected, actual);
    }
}

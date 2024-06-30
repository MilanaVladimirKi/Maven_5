package ru.topacademy.javaqa.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductRepositoryTest {

    Book item1 = new Book(1, "Девочка с земли", 250, "Кир Булычев");
    Book item2 = new Book(2, "Светлана", 200, "Василий Жукоский");
    Smartphone item3 = new Smartphone(3, "Galaxy S24", 150000, "Samsung");

    @Test
    public void test() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(item2.getID());

        Product[] expected = {item1, item3};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void successDelete() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);
        repo.removeById(3);

        Product[] expected = {item1, item2};
        Product[] actual = repo.getItems();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void unSuccessDelete() {
        ProductRepository repo = new ProductRepository();
        repo.save(item1);
        repo.save(item2);
        repo.save(item3);

        Assertions.assertThrows(NotFoundException.class, ()-> {
            repo.removeById(10);
        });
    }

}

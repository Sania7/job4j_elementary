package ru.job4j.oop;

public class LiquidationProduct  {
    private Product product;



    public LiquidationProduct(String name, int price) {
        product = new Product(name, price);
    }


    @Override
    public String label() {
    return product.label();
    }

}

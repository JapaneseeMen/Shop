package ru.netology.product;
public class Product {
    public Product(int Id, String name, int price) {
        this.Id = Id;
        this.name = name;
        this.price = price;
    }

    protected int Id;
    protected String name;
    protected int price;
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}

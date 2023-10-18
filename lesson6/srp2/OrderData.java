package ru.geekbrains.lesson6.srp2;

public class OrderData {
    private String clientName;
    private String product;
    private int qnt;
    private double price;

    public OrderData(String clientName, String product, int qnt, double price) {
        this.clientName = clientName;
        this.product = product;
        this.qnt = qnt;
        this.price = price;
    }

    public String getClientName() {
        return clientName;
    }

    public String getProduct() {
        return product;
    }

    public int getQnt() {
        return qnt;
    }

    public double getPrice() {
        return price;
    }
}
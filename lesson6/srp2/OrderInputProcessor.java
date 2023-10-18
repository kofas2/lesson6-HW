package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class OrderInputProcessor {
    private Scanner scanner;

    public OrderInputProcessor(Scanner scanner) {
        this.scanner = scanner;
    }

    public OrderData promptForOrderData() {
        String clientName = prompt("Client name: ");
        String product = prompt("Product: ");
        int qnt = Integer.parseInt(prompt("Quantity: "));
        double price = Double.parseDouble(prompt("Price: "));

        return new OrderData(clientName, product, qnt, price);
    }

    private String prompt(String message) {
        System.out.print(message);
        return scanner.nextLine();
    }
}
package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        OrderInputProcessor inputProcessor = new OrderInputProcessor(scanner);
        OrderData orderData = inputProcessor.promptForOrderData();

        OrderJsonExporter jsonExporter = new OrderJsonExporter();
        jsonExporter.exportToJson(orderData, "order.json");
    }
}

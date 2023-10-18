package ru.geekbrains.lesson6.srp2;

import java.io.FileWriter;
import java.io.IOException;

public class OrderJsonExporter {
    public void exportToJson(OrderData orderData, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {
            writer.write("{\n");
            writer.write("\"clientName\":\"" + orderData.getClientName() + "\",\n");
            writer.write("\"product\":\"" + orderData.getProduct() + "\",\n");
            writer.write("\"qnt\":" + orderData.getQnt() + ",\n");
            writer.write("\"price\":" + orderData.getPrice() + "\n");
            writer.write("}\n");
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
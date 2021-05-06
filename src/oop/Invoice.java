package oop;

import java.util.ArrayList;

public class Invoice {
    private static class Item { // вложенный класс
        String description;
        int quantity;
        double unitPrice;

        double price() {return quantity * unitPrice;}

    }

    public void addItem(String description, int quantity, double unitPrices) {
        Item newItem = new Item();
        newItem.description = description;
        newItem.quantity = quantity;
        newItem.unitPrice = unitPrices;
        items.add(newItem);
    }

    private ArrayList<Item> items  = new ArrayList<>();
}

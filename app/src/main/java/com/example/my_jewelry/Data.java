package com.example.my_jewelry;

import java.util.ArrayList;

public class Data {
    private static ArrayList<OrderJewel> orders = new ArrayList<>();

    public static void save(OrderJewel oj) {
        orders.add(oj);
    }

    public static ArrayList<OrderJewel> get() {
        return orders;
    }
}

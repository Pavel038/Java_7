package org.example;

import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actualMin = service.minSales(sales);
        System.out.println(actualMin);


    }
}
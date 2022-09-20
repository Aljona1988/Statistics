package ru.netology.java.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticServiceTest {
    @Test
    public void testSum() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.sum(sales);
        long expected = 180;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testAverage() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actual = service.average(sales);
        long expected = 15;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxMonth() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.max(sales);
        int expected = 7;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinMonth() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.min(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMidLowMonth() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.lowMonth(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMidHighMonth() {
        StatisticService service = new StatisticService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = service.highMonth(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

package ru.netology.java.javaqamvn.services;

public class StatisticService {
    public long sum(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;

        }
        return amount;
    }

    public long average(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount += sale;

        }
        return amount / 12;
    }

    public int max(long[] sales) {
        long maxSale = sales[0];
        int maxMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= maxSale) {
                maxSale = sales[i];
                maxMonth = i;
            }
        }
        return maxMonth;
    }

    public int min(long[] sales) {
        long minSale = sales[0];
        int minMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= minSale) {
                minSale = sales[i];
                minMonth = i;
            }
        }
        return minMonth;

    }

    public int lowMonth(long[] sales) {
        long average = average(sales);
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale < average) {
                amountMonth++;
            }

        }

        return amountMonth;
    }

    public int highMonth(long[] sales) {
        long average = average(sales);
        int amountMonth = 0;
        for (long sale : sales) {
            if (sale > average) {
                amountMonth++;
            }

        }

        return amountMonth;
    }
}
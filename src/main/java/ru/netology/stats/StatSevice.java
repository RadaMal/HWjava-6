package ru.netology.stats;

public class StatSevice {

    public long sum(long[] sales) {
        long totalSale = 0;
        for (long sale : sales) {
            totalSale += sale;
        }
        return totalSale;
    }

    public long average(long[] sales) {
        return sum(sales) / sales.length;
    }

    public int monthMaximumSales(long[] sales) {
        int monthMaximumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthMaximumSales]) {
                monthMaximumSales = i;
            }
        }
        return monthMaximumSales + 1;
    }

    public int monthMinimumSales(long[] sales) {
        int monthMinimumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthMinimumSales]) {
                monthMinimumSales = i;
            }
        }
        return monthMinimumSales;
    }

    public int saleBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int saleHighAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
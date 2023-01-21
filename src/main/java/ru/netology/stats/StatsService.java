package ru.netology.stats;

public class StatsService {
    public long calcSalesSum(long[] sales) {
        long salesSum = 0;
        for (int i = 0; i < sales.length; i++) {
            salesSum = salesSum + sales[i];
        }
        return salesSum;
    }
    public long calcAverageSales(long[] sales) {
        long salesSum = calcSalesSum(sales);
        long averageSales = salesSum / sales.length;
        return averageSales;
    }
    public int calcMaxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int calcMinSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int calcLowerThanAverage (long[] sales) {
        long averageSales = calcAverageSales(sales);
        int iterationsCounter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                iterationsCounter++;
            }
        }
        return iterationsCounter;
    }
    public int calcHigherThanAverage (long[] sales) {
        long averageSales = calcAverageSales(sales);
        int iterationsCounter = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                iterationsCounter++;
            }
        }
        return iterationsCounter;
    }
}

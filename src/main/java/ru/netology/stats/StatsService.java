package ru.netology.stats;


public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }

        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }

        return maxMonth + 1;
    }

    public long sumSales(long[] sales) {
        long sumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumSales = sumSales + sales[i];

        }
        return sumSales;

    }


    public long averageSumSales(long[] sales) {
        long totalSumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumSales = sumSales(sales);

        }
        return totalSumSales / sales.length;
    }


    public long minAverageSumSalesMonth(long[] sales) {
        long totalSumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumSales = sumSales(sales);
        }
        long averageSales = averageSumSales(sales);
        long minAverageSumSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSales) {
                minAverageSumSalesMonth = minAverageSumSalesMonth + 1;

            }
        }
        return minAverageSumSalesMonth;

    }


    public long overAverageSumSalesMonth(long[] sales) {
        long totalSumSales = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSumSales = sumSales(sales);
        }
        long averageSales = averageSumSales(sales);
        long overAverageSumSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                overAverageSumSalesMonth = overAverageSumSalesMonth + 1;
            }
        }
        return overAverageSumSalesMonth;
    }
}


package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void minSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int actualMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void maxSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int actualMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void sumSale() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 21, 19, 20, 7, 14, 14, 18};
        long expectedSum = 181;
        long actualSum = service.sumSales(sales);
        Assertions.assertEquals(expectedSum, actualSum);

    }

    @Test
    public void averageSumSales() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long expectedAverageSumSales = 6;
        long actualAverageSumSales = service.averageSumSales(sales);
        Assertions.assertEquals(expectedAverageSumSales, actualAverageSumSales);
    }


    @Test
    public void minAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long expectedMinAverageSumSalesMonth = 5;
        long actualMinAverageSumSales = service.minAverageSumSalesMonth(sales);
        Assertions.assertEquals(expectedMinAverageSumSalesMonth, actualMinAverageSumSales);
    }

    @Test
    public void overAverageSumSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        long expectedOverAverageSumSalesMonth = 6;
        long actualOverAverageSumSalesMonth = service.overAverageSumSalesMonth(sales);
        Assertions.assertEquals(expectedOverAverageSumSalesMonth, actualOverAverageSumSalesMonth);
    }


}

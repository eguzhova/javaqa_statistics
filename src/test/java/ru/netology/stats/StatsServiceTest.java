package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSalesTotal() {
        {
            StatsService service = new StatsService();

            // подготавливаем данные:
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 180;

            // вызываем целевой метод:
            int actual = service.salesTotal(sales);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }
    }

    @Test
    void shouldCalculateSalesAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.salesAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindHighestSalesMonth() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = service.highestSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLowestSalesMonth() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = service.lowestSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverageSalesMonths() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.aboveAverageSalesMonths(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void underAverageSalesMonths() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = service.underAverageSalesMonths(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
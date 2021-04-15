package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void shouldCalculateSalesTotal() {
        {
            // подготавливаем данные:
            int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int expected = 180;

            // вызываем целевой метод:
            int actual = StatsService.salesTotal(sales);

            // производим проверку (сравниваем ожидаемый и фактический):
            assertEquals(expected, actual);
        }
    }

    @Test
    void shouldCalculateSalesAverage() {

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        double actual = StatsService.salesAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindHighestSalesMonth() {

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        // вызываем целевой метод:
        int actual = StatsService.highestSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldFindLowestSalesMonth() {

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        // вызываем целевой метод:
        int actual = StatsService.lowestSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateAboveAverageSalesMonths() {

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        // вызываем целевой метод:
        int actual = StatsService.aboveAverageSalesMonths(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateUnderAverageSalesMonths() {

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18,};
        int expected = 5;

        // вызываем целевой метод:
        int actual = StatsService.underAverageSalesMonths(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
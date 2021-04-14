package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void salesTotal() {
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
    void salesAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        // вызываем целевой метод:
        int actual = service.salesAverage (sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }
}
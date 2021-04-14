package ru.netology.stats;

public class StatsService {

    //Метод рассчета суммы продаж за все месяцы
    public static int salesTotal (int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    //Метод расчета среднего значения продаж за все месяцы
    public static int salesAverage (int [] sales) {
        int total = 0;
        int month = 0;
        for (int sale : sales) {
            total += sale;
            month ++;
        }
        return total / month;
    }

}

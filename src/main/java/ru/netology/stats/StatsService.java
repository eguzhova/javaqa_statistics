package ru.netology.stats;

public class StatsService {

    //Метод рассчета суммы продаж за все месяцы
    public int salesTotal(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    //Метод расчета среднего значения продаж за все месяцы
    public int salesAverage(int[] sales) {
        return salesTotal(sales)/ sales.length;
    }

    //Метод нахождения месяца с пиком продаж
    public int highestSalesMonth(int[] sales) {
        int month = 0;
        int monthCount = 0;
        int highestSale = sales[1];
        for (int sale : sales) {
            monthCount++;
            if (highestSale <= sale) {
                month = monthCount;
                highestSale = sale;
            }
        }
        return month;
    }

    //Метод нахождения месяца с наименьшими продажами
    public int lowestSalesMonth(int[] sales) {
        int month = 0;
        int monthCount = 0;
        int lowestSale = sales[1];
        for (int sale : sales) {
            monthCount++;
            if (lowestSale >= sale) {
                month = monthCount;
                lowestSale = sale;
            }
        }
        return month;
    }

    //Метод вычисления количества месяцев с продажами выше среднего
    public int aboveAverageSalesMonths(int[] sales) {
        int average = salesAverage (sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average)
                month ++;
        }
        return month;
    }

    //Метод вычисления количества месяцев с продажами ниже среднего
    public int underAverageSalesMonths (int[] sales) {
        int average = salesAverage (sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average)
                month++;
        }
        return month;
    }
}

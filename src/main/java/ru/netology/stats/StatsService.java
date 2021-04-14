package ru.netology.stats;

public class StatsService {

    //Метод рассчета суммы продаж за все месяцы
    public static int salesTotal(int[] sales) {
        int total = 0;
        for (int sale : sales) {
            total += sale;
        }
        return total;
    }

    //Метод расчета среднего значения продаж за все месяцы
    public static int salesAverage(int[] sales) {
        int total = 0;
        int month = 0;
        for (int sale : sales) {
            total += sale;
            month++;
        }
        return total / month;
    }

    //Метод нахождения месяца с пиком продаж
    public static int highestSalesMonth(int[] sales) {
        int month = 0;
        int monthCount = 0;
        int previousSale = sales[1];
        for (int sale : sales) {
            monthCount++;
            if (previousSale <= sale) {
                month = monthCount;
                previousSale = sale;
            }
        }
        return month;
    }

    //Метод нахождения месяца с наименьшими продажами
    public static int lowestSalesMonth(int[] sales) {
        int month = 0;
        int monthCount = 0;
        int previousSale = sales[1];
        for (int sale : sales) {
            monthCount++;
            if (previousSale >= sale) {
                month = monthCount;
                previousSale = sale;
            }
        }
        return month;
    }

    //Метод вычисления количества месяцев с продажами выше среднего
    public static int aboveAverageSalesMonths(int[] sales) {
        StatsService service = new StatsService();
        int average = service.salesAverage (sales);
        int month = 0;
        for (int sale : sales) {
            if (sale > average) {
                month ++;
            }
        }
        return month;
    }

    //Метод вычисления количества месяцев с продажами ниже среднего
    public static int underAverageSalesMonths (int[] sales) {
        StatsService service = new StatsService();
        int average = service.salesAverage (sales);
        int month = 0;
        for (int sale : sales) {
            if (sale < average) {
                month ++;
            }
        }
        return month;
    }
}

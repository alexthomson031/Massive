package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;
        // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1;

    }

    public int maxSales(long[] sales) {
        int maxMonth = 0; // номер месяца с максимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { // значит, в рассматриваемом i-м месяце продаж, больше
                maxMonth = i;

            }
        }

        return maxMonth + 1;

    }

    public long CalculateAllSum(long[] Sales) {
        long Sum = 0;
        for (long Sale : Sales) {
            Sum += Sale;
        }
        return Sum;
    }

    public int midSales(long[] sales) {
        long a = 0;
        long midSales = sales[0];

        for (int i = 0; i < sales.length; i++) {
            midSales = midSales + sales[i];
            a = midSales / 12;

        }
        return (int) a;

    }

    public long summaryAboveMonth(long[] sales) {
        long averageMonth = 0;
        for (long Sale : sales) {
            if (Sale < midSales(sales)) {
                averageMonth++;
            }
        }
        return averageMonth;
    }

    public long summaryBelowMonth(long[] sales) {
        long averageBelowMonth = 0;
        for (long Sale : sales) {
            if (Sale > midSales(sales)) {
                averageBelowMonth++;
            }
        }
        return averageBelowMonth;
    }
}
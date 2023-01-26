package ru.netology.stats;

public class StatsService {
    //Сумму всех продаж
    public int salesAmount(int[] sales) {
        int sum = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        return sum;
    }

    //Среднюю сумму продаж в месяц
    public int averageSalesAmount(long[] sales) {
        long sum = 0;
        int averageNumberOfSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sum = sum + sales[i];
        }
        averageNumberOfSales = (int) (sum / sales.length);
        return averageNumberOfSales;
    }

    //Номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму.
    public int maxSales(long[] sales) {
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

    //Номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму.
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    //Количество месяцев, в которых продажи были выше среднего.
    public int monthsWithAboveAverageSales(long[] sales) {
        int numberOfMonths = 0;
        long sum = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum)
                numberOfMonths++;

        }
        return numberOfMonths;
    }


    //Количество месяцев, в которых продажи были ниже среднего.
    public int monthsWithBelowAverageSales(long[] sales) {
        int numberOfMonths = 0;
        long sum = averageSalesAmount(sales);

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sum) {
                numberOfMonths++;
            }
        }

        return numberOfMonths;
    }
}




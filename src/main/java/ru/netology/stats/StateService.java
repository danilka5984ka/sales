package ru.netology.stats;

public class StateService {

    public int sum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }

        return sum;
    }

    public int averageSum(int[] sales) {

        int sum = 0;
        int average;
        for (int sale : sales) {
            sum += sale;
        }
        average = sum / sales.length;
        return average;
    }

    public int maxSales(int[] sales) {
        int max = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int belowAverage(int[] sales) {
        int belowAverage = 0;
        int average = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        average = sum / sales.length;

        for (int sale : sales) {
            if (sale < average) {
                belowAverage = belowAverage + 1;
            }
        }
        return belowAverage;
    }

    public int aboveAverage(int[] sales) {
        int aboveAverage = 0;
        int average = 0;
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        average = sum / sales.length;

        for (int sale : sales) {
            if (sale > average) {
                aboveAverage = aboveAverage + 1;
            }
        }
        return aboveAverage;
    }
}



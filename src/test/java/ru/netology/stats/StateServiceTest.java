package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StateServiceTest {

    @Test
    public void shouldSum() {
        StateService manager = new StateService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.sum(sales);
        int expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldAverageSum() {
        StateService manager = new StateService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.averageSum(sales);
        int expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / sales.length;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldFindMax() {
        StateService manager = new StateService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.maxSales(sales);
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMin() {
        StateService manager = new StateService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.minSales(sales);
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldBelowAverage() {
        StateService manager = new StateService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.belowAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldAboveAverage() {
        StateService manager = new StateService();

        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int actual = manager.aboveAverage(sales);
        int expected = 5;

        Assertions.assertEquals(expected, actual);
    }
}

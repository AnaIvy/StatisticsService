package ru.netology.statistic;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void testfindMaxIfMaxFirst() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void testfindMaxIfMaxInMidle() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 30, 8, 6, 11, 11, 12};
        long expected = 30;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
package com.entregaintroducao.counts;

import junit.framework.TestCase;
import org.joda.time.LocalDate;
import org.junit.Test;

public class DayCounterTest extends TestCase {

    @Test
    public void testGetNumberOfDaysUntilOtherDate() {
        LocalDate date = new LocalDate("2020-08-28");
        LocalDate otherDate = new LocalDate("2020-09-07");
        DayCounter dayCounter = new DayCounter(date);
//        assertEquals(10, dayCounter.getNumberOfDaysUntilOtherDate(otherDate));
        assertEquals(4, dayCounter.getNumberOfDaysUntilOtherDate(otherDate));
    }

    @Test
    public void testGetNumberOfDaysUntilChristmas() {
        LocalDate date = new LocalDate("2020-08-28");
        LocalDate christmasDate = new LocalDate("2020-12-25");
        DayCounter dayCounter = new DayCounter(date);
//        assertEquals(119, dayCounter.getNumberOfDaysUntilChristmas(christmasDate));
        assertEquals(0, dayCounter.getNumberOfDaysUntilChristmas(christmasDate));
    }
}
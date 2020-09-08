package com.entregaintroducao.counts;

import junit.framework.TestCase;
import org.joda.time.LocalDate;
import org.junit.Test;

public class DayCounterTest extends TestCase {

    @Test
    public void testGetNumberOfDaysBetweenTwoDates() {
        LocalDate startDate = new LocalDate("2020-08-28");
        LocalDate endDate = new LocalDate("2020-09-07");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals("2020-08-28 - 2020-09-07 must be 10 days", 10, getNumberOfDays);
    }

    @Test
    public void testStartDateIsBeforeEndDate() {
        LocalDate startDate = new LocalDate("2019-09-25");
        LocalDate endDate = new LocalDate("2020-09-25");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        boolean startDateIsBeforeEndDate = dayCounter.startDateIsBeforeEndDate();
        assertEquals("2019-09-25 - 2020-09-25 must be true", true, startDateIsBeforeEndDate);
    }

}
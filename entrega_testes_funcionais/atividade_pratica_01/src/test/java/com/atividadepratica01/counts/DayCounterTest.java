package com.atividadepratica01.counts;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayCounterTest {

    @Test
    void testOneWeekPeriod() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-08-28");
        LocalDate endDate = new LocalDate("2020-09-07");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals(7, getNumberOfDays);
    }

    @Test
    void testBiWeeklyPeriod() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-08-28");
        LocalDate endDate = new LocalDate("2020-09-07");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals(15, getNumberOfDays);
    }

    @Test
    void testOneMonthPeriod() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-08-28");
        LocalDate endDate = new LocalDate("2020-09-07");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals(30, getNumberOfDays);
    }
}
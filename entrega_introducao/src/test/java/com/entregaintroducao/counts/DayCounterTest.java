package com.entregaintroducao.counts;

import junit.framework.TestCase;
import org.joda.time.LocalDate;
import org.junit.Test;

public class DayCounterTest extends TestCase {

    @Test
    public void testGetNumberOfDaysBetweenTwoDates() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-08-28");
        LocalDate endDate = new LocalDate("2020-09-07");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        // Comparar se os dias declarados são iguais ao que vem na função
        assertEquals("2020-08-28 - 2020-09-07 must be 10 days", 10, getNumberOfDays);
    }

    @Test
    public void testStartDateIsBeforeEndDate() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2019-09-25");
        LocalDate endDate = new LocalDate("2020-09-25");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a verificação quando a primeira data é menor que a segunda
        boolean startDateIsBeforeEndDate = dayCounter.startDateIsBeforeEndDate();
        // Comparar se o primeiro dia é menor que o segundo dia
        assertEquals("2019-09-25 - 2020-09-25 must be true", true, startDateIsBeforeEndDate);
    }

}
package com.atividadepratica01.counts;

import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayCounterTest {

    /*
        Partindo da funcionalidade realizada na primeira entrega, contar os dias entre dois inputs do usuário e verificar se a
        primeira data é menor que a segunda. Nesta atividade será demonstrada o uso do TDD e partições de equivalência, porém utilizando-se somente
        da funcionalidade de contar os dias entre as duas datas

        Serão três partições de equivalência testadas:
            -> Testar se o número de dias entre as duas datas equivale a um período de uma semana (7 dias);
            -> Testar se o número de dias entre as duas datas equivale a um período de quinze dias (15 dias);
            -> Testar se o número de dias entre as duas datas equivale a um período de um mês (30 dias).
     */

    @Test
    void testOneWeekPeriod() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-09-01");
        LocalDate endDate = new LocalDate("2020-09-08");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals(7, getNumberOfDays);
    }

    @Test
    void test15DayPeriod() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-09-01");
        LocalDate endDate = new LocalDate("2020-09-16");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals(15, getNumberOfDays);
    }

    @Test
    void testOneMonthPeriod() {
        // Declarando variáveis e propriedades do objeto
        LocalDate startDate = new LocalDate("2020-09-01");
        LocalDate endDate = new LocalDate("2020-10-01");
        DayCounter dayCounter = new DayCounter(startDate, endDate);
        // Armazenando a quantidade de dias na variável
        int getNumberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
        assertEquals(30, getNumberOfDays);
    }
}
package com.atividadepratica01.counts;

import org.joda.time.LocalDate;
import org.joda.time.Period;
import org.joda.time.PeriodType;

public class DayCounter {
    public LocalDate startDate;
    public LocalDate endDate;

    public DayCounter(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Função que retorna o número de dias entre as datas do objeto
    public int getNumberOfDaysBetweenTwoDates() {
        Period period = new Period(this.startDate, this.endDate, PeriodType.days());
        int numberOfDays = period.getDays();
        return numberOfDays;
    }

    // Função que retorna um valor booleano verificando se a primeira data é menor que a segunda
    public boolean startDateIsBeforeEndDate() {
        boolean isBefore = this.startDate.isBefore(this.endDate);
        return isBefore;
    }
}

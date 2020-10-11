package com.atividadepratica01.counts;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class DayCounter {
    public LocalDate startDate;
    public LocalDate endDate;

    public DayCounter(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Função que retorna o número de dias entre as datas do objeto
    public int getNumberOfDaysBetweenTwoDates() {
        return 0;
    }

    // Função que retorna um valor booleano verificando se a primeira data é menor que a segunda
    public boolean startDateIsBeforeEndDate() {
        boolean isBefore = this.startDate.isBefore(this.endDate);
        return isBefore;
    }
}

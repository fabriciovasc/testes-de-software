package com.entregaintroducao.counts;

import org.joda.time.Days;
import org.joda.time.LocalDate;

public class DayCounter {
    public LocalDate startDate;
    public LocalDate endDate;

    public DayCounter(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Retornar o startDate
    public LocalDate getStartDate() {
        return startDate;
    }

    // Definir um startDate
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    // Retornar o endDate
    public LocalDate getEndDate() {
        return endDate;
    }

    // Definir um endDate
    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    // Função que retorna o número de dias entre as datas do objeto
    public int getNumberOfDaysBetweenTwoDates() {
        int numberOfDays = Days.daysBetween(this.startDate, this.endDate).getDays();
        return numberOfDays;
    }

    // Função que retorna um valor booleano verificando se a primeira data é menor que a segunda
    public boolean startDateIsBeforeEndDate() {
        boolean isBefore = this.startDate.isBefore(this.endDate);
        return isBefore;
    }

}

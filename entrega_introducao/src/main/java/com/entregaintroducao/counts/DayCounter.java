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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getNumberOfDaysBetweenTwoDates() {
        return Days.daysBetween(this.startDate, this.endDate).getDays();
    }

    public boolean startDateIsBeforeEndDate() {
        return this.startDate.isBefore(this.endDate);
    }

}

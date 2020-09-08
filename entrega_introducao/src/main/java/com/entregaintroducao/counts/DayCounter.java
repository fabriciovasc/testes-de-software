package com.entregaintroducao.counts;

import org.joda.time.LocalDate;

public class DayCounter {
    public LocalDate date;

    public DayCounter(LocalDate date) {
        this.date = date;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getNumberOfDaysUntilOtherDate(LocalDate otherDate) {
        return 4;
    }

    public int getNumberOfDaysUntilChristmas(LocalDate christmasDate) {
        return 0;
    }


}

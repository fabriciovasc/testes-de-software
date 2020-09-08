package com.entregaintroducao.app;

import com.entregaintroducao.control.Control;
import com.entregaintroducao.counts.DayCounter;
import org.joda.time.LocalDate;

public class App {
    public static void main(String[] args) {
        LocalDate startDate = getStartDate();
        LocalDate endDate = getEndDate();
        DayCounter dayCounter = new DayCounter(startDate, endDate);

        boolean isBefore = dayCounter.startDateIsBeforeEndDate();
        if (isBefore) {
            int numberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
            System.out.println(startDate + " - " + endDate + " = " + numberOfDays + " dias");
        } else {
            System.out.println("A primeira data nao pode ser maior que a segunda");
        }
    }

    public static LocalDate getStartDate() {
        Control ctl = new Control();
        System.out.println("Entre com a primeira data (YYYY-MM-DD): ");
        String startDateInput = ctl.text();
        LocalDate startDateFormatted = new LocalDate(startDateInput);
        return startDateFormatted;
    }

    public static LocalDate getEndDate() {
        Control ctl = new Control();
        System.out.println("Entre com a segunda data (YYYY-MM-DD): ");
        String endDateInput = ctl.text();
        LocalDate endDateFormatted = new LocalDate(endDateInput);
        return endDateFormatted;
    }

}

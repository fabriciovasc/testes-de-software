package com.entregaintroducao.app;

import com.entregaintroducao.control.Control;
import com.entregaintroducao.counts.DayCounter;
import org.joda.time.LocalDate;

public class App {
    public static void main(String[] args) {
        // Criar variáveis e o objeto com as propriedades do constructor
        LocalDate startDate = getStartDate();
        LocalDate endDate = getEndDate();
        DayCounter dayCounter = new DayCounter(startDate, endDate);

        // Verificar se a primeira data não é maior que a segunda
        boolean isBefore = dayCounter.startDateIsBeforeEndDate();
        if (isBefore) {
            //  Armazenar o número de dias entre as duas datas em uma variável
            int numberOfDays = dayCounter.getNumberOfDaysBetweenTwoDates();
            System.out.println(startDate + " - " + endDate + " = " + numberOfDays + " dias");
        } else {
            System.out.println("A primeira data nao pode ser maior que a segunda");
        }
    }

    public static LocalDate getStartDate() {
        // Declarando objeto da variável de controle de input
        Control ctl = new Control();
        System.out.println("Entre com a primeira data (YYYY-MM-DD): ");
        String startDateInput = ctl.text();
        // Formatar data em string para um Local Date e retornar
        LocalDate startDateFormatted = new LocalDate(startDateInput);
        return startDateFormatted;
    }

    public static LocalDate getEndDate() {
        // Declarando objeto da variável de controle de input
        Control ctl = new Control();
        System.out.println("Entre com a segunda data (YYYY-MM-DD): ");
        String endDateInput = ctl.text();
        // Formatar data em string para um Local Date e retornar
        LocalDate endDateFormatted = new LocalDate(endDateInput);
        return endDateFormatted;
    }

}

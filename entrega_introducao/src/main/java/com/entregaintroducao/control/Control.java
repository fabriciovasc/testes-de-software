package com.entregaintroducao.control;

import java.util.Scanner;

public class Control {
    public Scanner scanner;

    public Control() {
        scanner = new Scanner(System.in);
    }

    // Função para retornar um input digitado em número
    public int option() {
        int op = scanner.nextInt();
        return op;
    }

    // Função para retornar um input digitado em string
    public String text() {
        String t = scanner.nextLine();
        return t;
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
    }
}

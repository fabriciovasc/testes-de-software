package com.entregaintroducao.menu;

import java.util.Scanner;

public class Control {
    public Scanner scanner;

    public Control() {
        scanner = new Scanner(System.in);
    }

    public int option() {
        int op = scanner.nextInt();
        return op;
    }

    public String text() {
        String t = scanner.nextLine();
        return t;
    }

    @Override
    protected void finalize() throws Throwable {
        scanner.close();
    }
}

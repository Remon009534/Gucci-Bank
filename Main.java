package com.company;

public class Main {


    public static void main(String[] args) {
        Bank b1 = new Bank("Remon", "Student Account", 1000);

        b1.withdrawAmount(500);

        b1.showinfo();
    }
}

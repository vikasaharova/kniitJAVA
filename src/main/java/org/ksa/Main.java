package org.ksa;
public class Main {
    public static void main (String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.print(i);
            if (i < 100) {
                System.out.print(", ");

            }
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }
}


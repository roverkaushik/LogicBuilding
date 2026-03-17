package org.example.phaseone.levelthree;

public class Question7_PhOne {
    public static void main(String[] args) {
        int Amount = 1900;
        if (Amount % 100 == 0) {
            System.out.println("Amount can be divided into 2000, 500, and 100 notes");
            int note2000 = Amount / 2000;
            Amount %= 2000;
            int note500 = Amount / 500;
            Amount %= 500;
            int note100 = Amount / 100;
            System.out.println("2000 notes: " + note2000);
            System.out.println("500 notes: " + note500);
            System.out.println("100 notes: " + note100);
        } else {
            System.out.println("Cannot be evenly divided using 2000, 500, 100 notes");
        }
    }
}

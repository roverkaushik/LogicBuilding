package org.example.phaseone.leveltwo;

public class Question1_PhOne {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        if((a + b > c) && (a + c > b) && (b + c > a)){
            System.out.println("Valid Triangle");
        }
        else {
            System.out.println("Not Valid Triangle");
        }
    }

}

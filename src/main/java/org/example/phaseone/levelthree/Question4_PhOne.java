package org.example.phaseone.levelthree;

public class Question4_PhOne {
    public static void main(String[] args) {
        int num = -1111;

        if (num <= 0) {
            System.out.println("No Negative num allowed " + num);
            return;
        }
            if (num >= 0 && num <= 9) {
                System.out.println("Single Digit");
            } else if (num >= 10 && num <= 99) {
                System.out.println("Double Digit");
            } else {
                System.out.println("Multi-Digit");
            }
        }
    }


package org.example.phaseone.levelthree;

public class Question10_PhOne {
    public static void main(String[] args) {
        int num = 25;

        if (num <= 0) {
            System.out.println("Invalid num, give greater than 0 " + num);
            return;
        }

        boolean isPerfect = false;

        for (int i = 1; i * i <= num; i++) {
            if (i * i == num) {
                isPerfect = true;
                break; // ✅ stop early
            }
        }

        if (isPerfect) {
            System.out.println("Perfect Square " + num);
        } else {
            System.out.println("Not Perfect Square " + num);
        }
    }
}

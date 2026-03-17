package org.example.phaseone;

public class Question10_PhOne {
    public static void main(String[] args) {

        char ch = '%';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Uppercase letter");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase letter");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Digit");
        } else {
            System.out.println("Special character");
        }
    }
}

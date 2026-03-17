package org.example.phaseone.leveltwo;

public class Question2_PhOne {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 5;

        boolean validchecker = isValidTriangle(a, b, c);

        if (validchecker) {
            if ((a == b) && (b == c)) {
                System.out.println("Equilateral Triangle");
            } else if ((a == b) || (b == c) || (a == c)) {
                System.out.println("Isosceles Triangle");
            } else if ((a != b) && (b != c) && (a != c)) {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Invalid, Not a triangle");
        }
    }

    private static boolean isValidTriangle(int a, int b, int c) {
        if((a + b > c) && (a + c > b) && (b + c > a)){
           return true;
        }
        else {
            return false;
        }
    }
}

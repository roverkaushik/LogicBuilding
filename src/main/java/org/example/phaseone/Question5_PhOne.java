package org.example.phaseone;

public class Question5_PhOne {
    public static void main(String[] args) {
        int year = 1900;
        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
    }
}

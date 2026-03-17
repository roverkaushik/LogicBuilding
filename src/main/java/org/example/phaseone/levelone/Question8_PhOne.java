package org.example.phaseone.levelone;

public class Question8_PhOne {
    public static void main(String[] args) {
       int temp = -1;

        if(temp >= 40){
            System.out.println("Hot Climate");
        } else if (temp >= 30 && temp <= 39) {
            System.out.println("Warm Climate");
        } else if (temp >= 0 && temp <= 29 ) {
            System.out.println("Cold Climate");
        } else{
            System.out.println("Freezing Climate");
        }
    }
}

package org.example.phaseone.levelthree;

public class Question5_PhOne {
    public static void main(String[] args) {
        int num = 77;
        int tens = num%10;
        if(num%7==0 || tens == 7 ){
        System.out.println("multiple of 7 or ends with 7");
        }
        else {
            System.out.println("not multiple of 7 or ends with 7");
        }
    }
}

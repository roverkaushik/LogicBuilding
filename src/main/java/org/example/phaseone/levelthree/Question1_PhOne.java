package org.example.phaseone.levelthree;

public class Question1_PhOne {
    public static void main(String[] args) {
        int num=111;
        int units = num%10;
        int tens = (num/10)%10;
        int hundreds = (num/100)%10;

        if(units!=tens && units!=hundreds && tens!=hundreds){
            System.out.println("Num is distinct");
        }else {
            System.out.println("Not distinct");
        }
    }
}

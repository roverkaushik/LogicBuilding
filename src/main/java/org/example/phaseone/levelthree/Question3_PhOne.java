package org.example.phaseone.levelthree;

public class Question3_PhOne {
    public static void main(String[] args) {
        int num=5355;
        int units = num%10;
        int thousands = (num/1000)%10;

        if(units == thousands){
            System.out.println("First and Last digit is same "+num);
        }
        else {
            System.out.println("Not same "+num);
        }
    }
}

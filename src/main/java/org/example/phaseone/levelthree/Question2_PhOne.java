package org.example.phaseone.levelthree;

public class Question2_PhOne {
    public static void main(String[] args) {
        int num=235;
        int units = num%10;
        int tens = (num/10)%10;
        int hundreds = (num/100)%10;

        if(tens > units && tens > hundreds){
            System.out.println("Middle digit "+tens+" is largest num");
        }else  if(tens < units && tens < hundreds) {
            System.out.println("Middle digit "+tens+" is Smallest num");
        }
        else {
            System.out.println("Neither");
        }
    }
}

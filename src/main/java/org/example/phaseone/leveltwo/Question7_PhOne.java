package org.example.phaseone.leveltwo;

public class Question7_PhOne {
    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 2;
        if(num1%2 == 0 && num2%2==0){
            System.out.println("Both the numbers are even");
        }else if(num1%2!=0 && num2%2!=0){
            System.out.println("Both the numbers are odd");
        }
        else {
        System.out.println("One is even and one is odd");
    }
    }
}

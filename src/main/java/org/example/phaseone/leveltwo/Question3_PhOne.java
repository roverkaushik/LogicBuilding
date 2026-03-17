package org.example.phaseone.leveltwo;

public class Question3_PhOne {
    public static void main(String[] args) {
        int mark = 88;

        if(mark >= 90){
            System.out.println("A+");
        }
        else if (mark >=80 && mark <= 89){
            System.out.println("A");
        }
        else if (mark >=70 && mark <= 79){
            System.out.println("B");
        }
        else if (mark >=60 && mark <= 69){
            System.out.println("C");
        }
        else if (mark >=50 && mark <= 59){
            System.out.println("C");
        } else {
            System.out.println("F - Fail");
        }
    }
}

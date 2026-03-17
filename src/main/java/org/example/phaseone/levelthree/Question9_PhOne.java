package org.example.phaseone.levelthree;

public class Question9_PhOne {
    public static void main(String[] args) {
        int angle1 = 100;
        int angle2 = 80;

        if((angle1+angle2)<180) {
            int angle3 = 180 - (angle1 + angle2);
            System.out.println(" third Angle is : " + angle3);
        }
        else {
            System.out.println("Invalid");
        }
    }
}


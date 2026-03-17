package org.example.phaseone.levelthree;

public class Question6_PhOne {
    public static void main(String[] args) {
        int x = 0;
        int y = -4;

        if(x > 0 && y > 0){
            System.out.println("First Quadrant");
        }
        else if(x > 0 && y < 0){
            System.out.println("Fourth Quadrant");
        }
        else if(x < 0 && y < 0){
            System.out.println("Third Quadrant");
        }
        else if(x < 0 && y > 0){
            System.out.println("Second Quadrant");
        }
        else if(x == 0 && y == 0){
            System.out.println("Lies on Axis");
        }
        else if (x == 0){
            System.out.println("On Y axis");
        }
        else if (y == 0){
            System.out.println("On X axis");
        }
    }
}

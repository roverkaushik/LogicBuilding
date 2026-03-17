package org.example.phaseone.leveltwo;

public class Question5_PhOne {
    public static void main(String[] args) {
        int hour = 17;
        if(hour > 0){
            if(hour > 1 && hour <=4 || hour >=23 ){
                System.out.println("Good mid night");
            }
            else if (hour >5 && hour <=10){
                System.out.println("Good morning");
            }
            else if (hour >10 && hour <=12){
                System.out.println("Good noon");
            }
            else if (hour >=13 && hour <=16){
                System.out.println("Good afternoon");
            }
            else if (hour >=17 && hour <=19){
                System.out.println("Good evening");
            }
            else if (hour >=20 && hour <=22){
                System.out.println("Good night");
            }
        }
    }

}

package org.example.phaseone.levelone;

import java.util.HashMap;
import java.util.Map;

public class Question9_PhOne {
    public static void main(String[] args) {
        char C = 'W';
        HashMap<Character,Boolean> map = new HashMap<>();
        map.put('A',true);
        map.put('E',true);
        map.put('I',true);
        map.put('O',true);
        map.put('U',true);

        if(map.containsKey(C)){
System.out.println("Its a Vowel");
        }else {
            System.out.println("Consonant");
        }
    }
}

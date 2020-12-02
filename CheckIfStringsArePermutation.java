package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
       String s1 = "abab";
       String s2 = "caba";

       HashMap<String, Integer> map = new HashMap<>();

       for(int i=0; i<s1.length();i++){
           if(map.containsKey(String.valueOf(s1.charAt(i)))) {

               int value = map.get(String.valueOf(s1.charAt(i)));
               value = value + 1;
               map.put(String.valueOf(s1.charAt(i)), value);

           }
           else {
               map.put(String.valueOf(s1.charAt(i)), 1);
           }
       }

       for(int i=0; i<s2.length();i++){
           if(map.containsKey(String.valueOf(s2.charAt(i)))) {
               int value = map.get(String.valueOf(s2.charAt(i)));
               value = value - 1;
               map.put(String.valueOf(s2.charAt(i)), value);
           }
           else
               System.out.println("False");
       }

       int len = 0;

       for(String key: map.keySet()){
           if(map.get(key) != 0) {
               System.out.println("False");
               break;
           }
           else {
                len ++;
           }
       }
       if(len == map.keySet().size())
           System.out.println("True");



    }
}

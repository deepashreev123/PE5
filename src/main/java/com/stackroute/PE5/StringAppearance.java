/*Write a program where an array of strings is input and output is a Map<String,boolean> where
        each different string is a key and its value is true if that string appears 2 or more times in the array
        Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
        Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/



package com.stackroute.PE5;


import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAppearance {


        public String checkAppearance (String input){
            if (input == null) return null;
            List<String> stringList = Arrays.asList(input.split("[\\W_]+"));
            Map<String, Integer> map = new HashMap<>();
            for (String each : stringList) {
                if (map.containsKey(each)) {
                    map.replace(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }

            // new HashMap for desired output

            Map<String, Boolean> booleanMap = new HashMap<>();
            for (String each : map.keySet()) {
                if (map.get(each) >= 2) {
                    booleanMap.put(each, true);
                } else {
                    booleanMap.put(each, false);
                }
            }
            return booleanMap.toString();
        }
    public static void main(String args[]) {
            StringAppearance appearance=new StringAppearance();
        String arr[] = {"a","b","c","d","a","c","c","b"};
        String actual=appearance.checkAppearance(String.join(" ",arr)).replaceAll("="," : ");
        System.out.println(actual);
    }}
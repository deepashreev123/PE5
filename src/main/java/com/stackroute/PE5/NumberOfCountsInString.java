/*Write a program to find the number of counts in the following String. Store the output in
        Map<String,Integer> as key value pair.
        Input : String str = “one one -one___two,,three,one @three*one?two”;
        Output : {"one":5 , "two":2, "three" :2}*/



package com.stackroute.PE5;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NumberOfCountsInString {
        public String checkFrequency(String input) {

            if (input == null) return null;
            List<String> stringList = Arrays.asList(input.split("[\\W_]+"));//split string
            Map<String, Integer> map = new HashMap<>();
            for (String each : stringList) {
                if (map.containsKey(each)) {//checks if given key is there or not
                    map.replace(each, map.get(each) + 1);
                } else {
                    map.put(each, 1);
                }
            }
            return map.toString();
        }


    public static void main(String args[]){
        NumberOfCountsInString count=new NumberOfCountsInString();
        String result=count.checkFrequency("one one -one___two,,three,one @three*one?two");
        System.out.println(result);
        }
}
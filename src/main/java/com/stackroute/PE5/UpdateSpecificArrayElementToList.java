/*Write a Java program to update specific array element by given element and empty the array list.
        Input: [Apple, Grape, Melon, Berry]
        Output: [Kiwi, Grape, Mango, Berry]
        Array list after removing all elements []*/


package com.stackroute.PE5;
import java.util.ArrayList;
import java.util.Arrays;
public class UpdateSpecificArrayElementToList {

        public void replace () {
            //creating arrayList
            ArrayList<String> listNames = new ArrayList<String>();
            listNames.add("apple");
            listNames.add("grape");
            listNames.add("melon");
            listNames.add("berry");
            System.out.println(listNames);  //displaying original list
            listNames.set(0, "kiwi");
            listNames.set(2, "mango");

            System.out.println(listNames);  //displaying modified list
            listNames.clear();
            System.out.println(listNames);
        }

    public static void main(String[] args) {
        UpdateSpecificArrayElementToList list=new UpdateSpecificArrayElementToList();
        list.replace();
}}

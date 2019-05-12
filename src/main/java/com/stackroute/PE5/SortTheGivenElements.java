/*rite a program to implement set interface which sorts the given randomly ordered names in

        ascending order. Convert the sorted set in to an array list
        Input : Harry Olive Alice Bluto Eugene
        Output :
        Sorted Set : Alice Bluto Eugene Harry Olive
        Array list from Set : Alice Bluto Eugene Harry Olive*/


package com.stackroute.PE5;
import java.util.*;
public class SortTheGivenElements {
    public void sorting(){
        // Create a list of strings
        ArrayList<String> arraylist = new ArrayList<String>();
        arraylist.add("harry");
        arraylist.add("bluto");
        arraylist.add("olive");
        arraylist.add("alice");
        arraylist.add("eugene");

        /* Collections.sort method is sorting the
        elements of ArrayList in ascending order. */
        Collections.sort(arraylist);

        // Let us print the sorted list
        System.out.println("List after the use of" +
                " Collection.sort() :\n" + arraylist);
    }
    public static void main(String[] args){
        SortTheGivenElements sort=new SortTheGivenElements();
        sort.sorting();
    }
}


/*Create a Student class that represents the following information of a student: id, name, and age
        all the member variables should be private .
        a. Implement `getter and setter` .
        b. Create a `StudentSorter` class that implements `Comparator interface` .
        c. Write a class `Maintest` create Student class object(minimum 5)
        d. Add these student object into a List of type Student .
        e. Sort the list based on their age in decreasing order, for student having
        same age, sort based on their name.
        f. For students having same name and age, sort them according to their ID.*/


package com.stackroute.PE5;

import java.util.Comparator;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentInformation {
    private String id;
    private String name;
    private int age;

    StudentInformation(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public String getID() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }
}

//Implementing a comparator interface
class StudentSorter implements Comparator {

    StudentSorter() {
    }

    public int compare(Object o1, Object o2) {

        StudentInformation s1 = (StudentInformation)o1;
        StudentInformation s2 = (StudentInformation)o2;

        if (s1.getAge() == s2.getAge()) {

            int answer = s1.getName().compareTo(s2.getName());
            return answer == 0 ? s1.getID().compareTo(s2.getID()) : answer;
        }
        else
        {
            return s1.getAge() > s2.getAge() ? 1 : -1;
        }
    }
}

//Printing the array in sorted manner
class Main{
    Main() {
    }

    public static void main(String[] args) {

        List<StudentInformation> listofstudents = new ArrayList();

        listofstudents.add(new StudentInformation("112", "asha", 20));
        listofstudents.add(new StudentInformation("117", "Anu", 25));
        listofstudents.add(new StudentInformation("115", "Savi", 25));
        listofstudents.add(new StudentInformation("119", "Anand", 25));
        listofstudents.add(new StudentInformation("110", "Raj", 29));

        Collections.sort(listofstudents, new StudentSorter());

        for(int i = 0; i < listofstudents.size(); ++i) {

            PrintStream var1 = System.out;
            String var2 = ((StudentInformation)listofstudents.get(i)).getID();
            var1.println(var2 + " " + ((StudentInformation)listofstudents.get(i)).getName() + " " + ((StudentInformation)listofstudents.get(i)).getAge());
        }

    }
}



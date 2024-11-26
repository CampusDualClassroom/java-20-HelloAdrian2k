package com.campusdual.classroom;

import javax.print.Doc;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("John","Smith"));
        personList.add(new Teacher("María","Montessori","Educación"));
        personList.add(new PoliceOfficer("Jake","Peralta","B-99"));
        personList.add(new Doctor("Gregory","House","Nefrología e infectología"));
        return personList;
    }

    public static void showPeopleDetails(List<Person> stringList) {
       for(Person p : stringList){
           p.getDetails();
       }
    }

    public static void main(String[] args) {
        List<Person> stringList = getPeopleList();
        showPeopleDetails(stringList);
    }

}

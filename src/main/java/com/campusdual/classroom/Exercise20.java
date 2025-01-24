package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    //creamos una lista con elementos de tipo Person
    public static List<Person> getPeopleList() {

        List<Person> stringList = new ArrayList<>();
        stringList.add(new Person("John", "Smith"));
        stringList.add(new Teacher("Maria", "Montessori", "Educacion"));
        stringList.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        stringList.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return stringList;
    }

    //recorremos la lista y mostramos los detalles
    public static void showPeopleDetails(List<Person> stringList) {
        for (Person p : stringList) {
            p.getDetails();
        }
    }

    public static void main(String[] args) {
        showPeopleDetails(getPeopleList()); //refactorizado
    }


}

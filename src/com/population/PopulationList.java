package com.population;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class PopulationList {

    public static void main(String[] args) {
        Scanner f = new Scanner(System.in);
        List<Person> listFemale = new ArrayList<>();
        List<Person> listMale = new ArrayList<>();

        System.out.println("Please insert you name and gender:");
        Person a = new Person(f.next(), f.next());
        if (a.getGender().equalsIgnoreCase("female")) {
            listFemale.add(a);
        } else {
            listMale.add(a);
        }
        System.out.println("Female list: " + listFemale + "\n");
        System.out.println("Male list: " + listMale);
    }
}

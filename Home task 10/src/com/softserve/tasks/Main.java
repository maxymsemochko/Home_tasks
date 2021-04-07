package com.softserve.tasks;

import java.util.*;

public class Main {
    public static <E> Set union(Set set1, Set set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;

    }

    public static <E> Set intersect(Set set1, Set<String> set2) {
        Set<E> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }


    public static void main(String[] args) {

        Set <String> set1 = new HashSet<>();
        set1.add("1");
        set1.add("0");
        set1.add("3");
        set1.add("4");
        set1.add("5");
        set1.add("6");

        Set <String> set2 = new HashSet<>();
        set2.add("0");
        set2.add("1");
        set2.add("13");
        set2.add("15");
        set2.add("8");
        set2.add("21");

        System.out.println(union(set1,set2));
        System.out.println();
        System.out.println(intersect(set1,set2));

        //          Task 2

        Map<String, String> persons = new HashMap<String, String>();
        Set set = new HashSet<Object>(persons.values());


        persons.put("Semochko", "Max");
        persons.put("Nadiak", "Ostap");
        persons.put("Kopyna", "Ilya");
        persons.put("Bahur", "Yuri");
        persons.put("Kozyar", "Lubomir");
        persons.put("Savka", "Andriy");
        persons.put("Koman", "Adam");
        persons.put("Yakimets", "Danylo");
        persons.put("Zinchuk", "Danylo");
        persons.put("Mulyarchick", "Bogdan");



        if (persons.size()>set.size())
        {
            System.out.println("There is persons with same name");
        }else{ System.out.println("There is no persons with same name");}

        persons.values().removeIf(value->value.contains("Danylo"));

        System.out.println(persons);
    }


}

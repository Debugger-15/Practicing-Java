package com.ronak.java8;

import com.ronak.model.Students;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicatesUsingJava8 {
    static List<Students> students = new ArrayList<>();


    public static void main(String[] args) {

        students.add(new Students(1, "Ronak", 30));
        students.add(new Students(2, "Reba", 54));
        students.add(new Students(3, "Ronak", 31));

        Set<String> uniqueNames = new HashSet<>();

        List<String> names = students.stream().map(student -> student.getName()).collect(Collectors.toList());
        Set<String> finalUniqueNames = uniqueNames;
        uniqueNames = names.stream().filter(name -> !finalUniqueNames.add(name)).collect(Collectors.toSet());
        System.out.println(uniqueNames);

        Map<String, Long> map = names.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);
    }


}

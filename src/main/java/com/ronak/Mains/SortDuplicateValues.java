package com.ronak.Mains;

import java.util.*;
import java.util.stream.Collectors;

public class SortDuplicateValues {
    public static void main(String[] args) {
        int[] array = new int[]{20, 10, 32, 40, 32, 20, 10, 32, 2, 98, 212, 212};
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : array) {
            if (map.containsKey(i)) {
                Integer count = map.get(i);
                map.put(i, count + 1);
            } else {
                map.put(i, 1);
            }
        }
        Set<Integer> set = map.entrySet().stream().filter(entry -> entry.getValue() > 1).map(e -> e.getKey()).collect(Collectors.toSet());
        List<Integer> result = set.stream().collect(Collectors.toList());
        Collections.sort(result);
        System.out.println(" duplicate values " + result);
    }
}

package com.pavitra.backTracking;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        // Creating a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Adding key-value pairs to the TreeMap
        treeMap.put("One", 1);
        treeMap.put("Five", 5);
        treeMap.put("Three", 3);
        treeMap.put("Ten", 10);

        // Displaying the entries in sorted order based on keys
        System.out.println("TreeMap entries: " + treeMap);

        // Removing an entry
        treeMap.remove("Three");

        // Displaying the updated TreeMap
        System.out.println("Updated TreeMap entries: " + treeMap);

        // Finding the ceiling and floor keys
        System.out.println("Ceiling for 'Four': " + treeMap.ceilingKey("Four"));
        System.out.println("Floor for 'Four': " + treeMap.floorKey("Four"));
    }
}

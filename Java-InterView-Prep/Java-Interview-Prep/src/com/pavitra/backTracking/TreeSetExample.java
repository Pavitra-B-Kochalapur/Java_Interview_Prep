package com.pavitra.backTracking;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // Creating a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Adding elements to the TreeSet
        treeSet.add(10);
        treeSet.add(5);
        treeSet.add(20);
        treeSet.add(15);

        // Displaying the elements in natural order (sorted)
        System.out.println("TreeSet elements: " + treeSet);

        // Removing an element
        treeSet.remove(5);

        // Displaying the updated TreeSet
        System.out.println("Updated TreeSet elements: " + treeSet);

        // Finding the ceiling and floor values
        System.out.println("Ceiling for 12: " + treeSet.ceiling(12));
        System.out.println("Floor for 12: " + treeSet.floor(12));
    }
}




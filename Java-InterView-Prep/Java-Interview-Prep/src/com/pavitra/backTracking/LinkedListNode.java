package com.pavitra.backTracking;

import java.util.LinkedList;

public class LinkedListNode {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<>();
		//int m = list.size()/2;
		list.add(24);
		list.add(66);
		list.add(9);
		list.addFirst(89);
		list.addLast(98);
		list.add(2, 11);
		list.remove(3);
		list.remove(2);
		list.remove(0);
		System.out.println(list.indexOf(98));
		System.out.println(list + "-> "+"head" );
		
	}

}

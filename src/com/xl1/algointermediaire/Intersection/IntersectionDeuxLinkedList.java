package com.xl1.algointermediaire.Intersection;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.stream.Collectors;

public class IntersectionDeuxLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list1 = new LinkedList<>();
        list1.add("apple");
        list1.add("banana");
        list1.add("orange");

        LinkedList<String> list2 = new LinkedList<>();
        list2.add("banana");
        list2.add("kiwi");
        list2.add("apple");
        
        LinkedList<String> intersectionResult = commonList(list1, list2);
        intersectionResult.forEach(e -> System.out.println(e));

	}
	public static LinkedList<String> commonList(LinkedList<String> list1, LinkedList<String> list2){
		
		//LinkedList<String> intersection = new LinkedList<>(list1);
		//intersection.retainAll(list2);
		
		LinkedList<String> intersection = list1.stream().filter(list2::contains).collect(Collectors.toCollection(LinkedList::new));

		return intersection;
		
	}

}

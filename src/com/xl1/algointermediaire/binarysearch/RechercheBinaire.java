package com.xl1.algointermediaire.binarysearch;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class RechercheBinaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int RechercherCible(List<Integer> ints, Integer cible) {
		Integer[] intsToArray = ints.stream().mapToInt(Integer::intValue).sorted().boxed().toArray(Integer[]::new);
		int index = Arrays.binarySearch(intsToArray, cible);
		
		if(index >=0) {
			return index;
		}else {
			return -1;
		}
		
	}

}

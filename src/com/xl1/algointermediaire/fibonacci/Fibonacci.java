package com.xl1.algointermediaire.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
	public static int[] seq = new int[10];
	private static Map<Integer, Integer> memoizationMap = new HashMap<>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(fibonacci(7));
		System.out.println("---sequence---");
		//for (int i = 0; i < seq.length; i++) {
			//System.out.println(seq[i]);
		//}
		
		for(Map.Entry<Integer, Integer> ent : memoizationMap.entrySet()){
			System.out.println(ent.getValue());
		}
		

	}
	
	public static int fibonacci1(int n) {
		if(n==0) {
			seq[n] = 0;
			return seq[0];
		}else if(n==1 || n ==2) {
			seq[n-1] = 1;
			return seq[n-1];
		}else {
			seq[n-1] = fibonacci(n-1)+fibonacci(n-2);
			return seq[n-1];
		}
		
	}
	
	

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        // Vérifier si la valeur a déjà été calculée
        if (memoizationMap.containsKey(n)) {
            return memoizationMap.get(n);
        }

        // Calculer la valeur en utilisant la programmation dynamique
        int resultat = fibonacci(n - 1) + fibonacci(n - 2);

        // Stocker la valeur calculée pour une utilisation ultérieure
        memoizationMap.put(n, resultat);

        return resultat;
    }

}

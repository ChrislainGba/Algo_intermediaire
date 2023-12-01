package com.xl1.algointermediaire.tri;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TriOjets {

	public static void main(String[] args) {
		List<Personne> personnes = List.of(new Personne("Trach", 10, 800.18), new Personne("Minpik", 11, 690.60), new Personne("Xl1", 9, 750.89));
		trierPersonnes(personnes);
	}
	
	static List<Personne> trierPersonnes(List<Personne> personnes){
		
		//Collections.sort(personnes, Comparator.comparingInt(Personne::getAge));
		List<Personne> personnesParAgeCroissant = personnes.stream().sorted(Comparator.comparingInt(Personne::getAge)).collect(Collectors.toList());
		personnesParAgeCroissant.forEach(p -> System.out.println(p));
		System.out.println("***********");
		List<Personne> personnesParParSalaireDecroissant = personnes.stream().sorted(Comparator.comparingDouble(Personne::getSalaire).reversed()).collect(Collectors.toList());
		personnesParParSalaireDecroissant.forEach(p -> System.out.println(p));
		System.out.println("***********");
		List<Personne> personnesParNomCroissant = personnes.stream().sorted(Comparator.comparing(Personne::getNom)).collect(Collectors.toList());
		personnesParNomCroissant.forEach(p -> System.out.println(p));
		System.out.println("===***********===");
		
		List<Personne> personnesFullTrie = personnes.stream().sorted(Comparator.comparingDouble(Personne::getSalaire).reversed().thenComparingInt(Personne::getAge).thenComparing(Personne::getNom)).collect(Collectors.toList());
		personnesFullTrie.forEach(p -> System.out.println(p));
		
		return personnes;
		
		
		
	}

}

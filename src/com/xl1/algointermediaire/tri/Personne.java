package com.xl1.algointermediaire.tri;

public class Personne {
	private String nom;
    private int age;
    private double salaire;
    
	

	public Personne(String nom, int age, double salaire) {
		super();
		this.nom = nom;
		this.age = age;
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "{'non:"+nom+", age:"+age+", salaire:"+salaire+"}";
	}
    
	
    
}

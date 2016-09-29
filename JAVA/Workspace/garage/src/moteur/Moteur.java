package moteur;

import java.io.Serializable;

public class Moteur implements Serializable{
	// Attributs
	private TypeMoteur type;
	private String cylindre;
	private double prix;
	
	// GEtters & Setters
	public double getPrix(){
		return prix;
	}
	
	public void setType(TypeMoteur type){
		this.type = type;
	}
	
	// Constructeur
	public Moteur(String cylindre, double prix){
		this.cylindre = cylindre;
		this.prix = prix;
	}
	
	// toString
	public String toString(){
		return type + " " + cylindre + " (" + prix + "€)";
	}
}

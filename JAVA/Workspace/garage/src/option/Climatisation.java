package option;

import java.io.Serializable;

public class Climatisation implements Option, Serializable{
	// Attributs
	private double prix = 347.3;
	
	// Getters & Setters
	public double getPrix(){
		return prix;
	}
	
	public String toString(){
		return "Climatisation (" + prix + "€)";
	}
	
}

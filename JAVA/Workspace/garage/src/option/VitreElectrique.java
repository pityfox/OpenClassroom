package option;

import java.io.Serializable;

public class VitreElectrique implements Option, Serializable{
	// Attributs
	private double prix = 212.35;
	
	// Getters & Setters
	public double getPrix(){
		return prix;
	}
	
	public String toString(){
		return "Vitre électrique (" + prix + "€)";
	}
}

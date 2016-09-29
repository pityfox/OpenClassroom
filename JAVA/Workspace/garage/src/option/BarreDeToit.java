package option;

import java.io.Serializable;

public class BarreDeToit implements Option, Serializable {
	// Attributs
	private double prix = 29.9;
	
	// Getters & Setters
	public double getPrix(){
		return prix;
	}
	
	public String toString(){
		return "Barre de toit (" + prix + "€)";
	}
}

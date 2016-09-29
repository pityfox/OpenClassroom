package option;

import java.io.Serializable;

public class SiegeChauffant implements Option, Serializable {
	// Attributs
	private double prix = 562.9;
	
	// Getters & Setters
	public double getPrix(){
		return prix;
	}
	
	public String toString(){
		return "Siège chauffant (" + prix + "€)";
	}
}

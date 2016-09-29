package option;

import java.io.Serializable;

public class GPS implements Option, Serializable{
	// Attributs
	private double prix = 113.5;

	// Getters & Setters
	public double getPrix(){
		return prix;
	}
	
	public String toString(){
		return "GPS (" + prix + "€)";
	}
}

package vehicule;

import java.io.Serializable;
import java.util.*;

import moteur.*;
import option.*;

public class Vehicule implements Serializable{
	// Attributs
	private double prix;
	private String nom;
	private ArrayList<Option> options = new ArrayList<Option>();
	protected Marque nomMarque;
	private Moteur moteur;
	
	// Setters & Getters
	public Marque getMarque(){
		return nomMarque;
	}
	
	public List<Option> getOptions(){
		return options;
	}
	
	public double getPrix(){
		return prix;
	}
	
	public void setMoteur(Moteur moteur){
		this.moteur = moteur;
		this.prix += moteur.getPrix();
	}
	
	// Methodes
	public void addOption(Option opt){
		this.options.add(opt);
		this.prix += opt.getPrix();
	}
	
	// toString
	public String toString(){
		return "+ Voiture " + nomMarque + " : " + this.getClass().getSimpleName() + " Moteur " + moteur + " " + options.toString() + " d'une valeur totale de " + prix +" €";
	}
}

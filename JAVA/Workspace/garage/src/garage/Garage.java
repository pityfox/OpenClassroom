package garage;

import vehicule.*;

import java.io.*;
import java.util.*;

public class Garage implements Serializable {
	// Attributs
	private ArrayList<Vehicule> voitures = new ArrayList<Vehicule>();

	// Constructeurs
	public Garage(){
		chargerGarage();
	}

	// Methodes
	// Ajout nouvelle voiture
	public void addVoiture(Vehicule voit){
		voitures.add(voit);
		sauvegarderGarage();
	}

	// Serialisation du garage
	private void sauvegarderGarage(){
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(
					new BufferedOutputStream(
							new FileOutputStream(
									new File("garage.txt"))));
			oos.writeObject(this);
			oos.close();
		}catch (Exception e){
			e.printStackTrace();
		}
	}

	// Deserialisation du garage
	private void chargerGarage(){
		ObjectInputStream ois;
		try{
			if(new File("garage.txt").exists()){
				ois = new ObjectInputStream(
						new BufferedInputStream(
								new FileInputStream(
										new File("garage.txt"))));

				Object o = ois.readObject();
				if(o instanceof Garage){
					Garage newGarage = (Garage) o;
					this.voitures = newGarage.voitures;
					newGarage = null;
				}
				ois.close();
			} else{
				throw new GarageException();
			}
		}
		catch (GarageException g){
			System.err.println(g.getMessage());
		}
		catch (Exception e){
		}
	}

	// toString
	public String toString(){
		String listeVoitures = 
				"***************************\n"
						+ "*  Garage OpenClassrooms  *\n"
						+ "***************************\n";
		for(Vehicule voiture:voitures)
			listeVoitures += voiture.toString()+"\n";
		return listeVoitures;
	}
}

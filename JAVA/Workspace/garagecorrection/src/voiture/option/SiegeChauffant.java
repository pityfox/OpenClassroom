package voiture.option;

public class SiegeChauffant implements Option {

	public String toString() {
		return "Si�ge chauffant (" + getPrix() + "�)";
	}

	public Double getPrix() {
		return 562.90d;
	}

}

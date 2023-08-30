package entity;

import dataStructur.User;
import dataStructur.UserStatus;

public class Medecin extends User {
	public String prof;
	

	public Medecin(int id, String nom, UserStatus users, String prof) {//Appel de constructeur de superClass via mot clé super
		super(id, nom, users);
		this.prof = prof;
	}



@Override
public void afficher() {// Appel method de super class afficher et faire une redefenission
	System.out.println("je suis Medecin");
}
	
	

}

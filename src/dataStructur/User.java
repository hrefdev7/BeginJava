package dataStructur;

public class User {
	public int id; //ENCAPSULER LES ATTRIBUT USER 
	public String nom;
	UserStatus users;
	
	public User(int id, String nom, UserStatus users) {
		
		this.id = id;
		this.nom = nom;
		this.users = users;
	}
	public void  afficher()
	{
		System.out.println("je suis un User");
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", nom=" + nom + ", users=" + users + "]";
	}
	
	
}

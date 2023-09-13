package dataStructur;

import java.util.ArrayList;
import java.util.List;

import entity.Medecin;

/**
* @author Achref Hawari
 *
 */
public class Test2 {
public static void main(String[] args) {//:cal the jvm
	
	User us =new User(1, "Achref",UserStatus.ACTIVE);
	
	User us1 =new User(2, "AHMED",UserStatus.DELETED);
	User us2 =new User(3, "MOHAMED",UserStatus.PENDING);

	User us3 =new User(4, "ALI",UserStatus.INACTIVE);
	User i=new Medecin(24, "KIOL",UserStatus.DELETED,"j");
	List<User> listusern=new ArrayList<User>();
	listusern.add(us);
	listusern.add(us1);
	listusern.add(us2);
	listusern.add(us3);
	listusern.add(i);

	for(User uss:listusern) {
		System.out.println(uss.toString());
		
	}
System.out.println("*****************************************************************");
	
	Medecin md =new Medecin(5,"IO",UserStatus.DELETED,"pediatre");
	md.afficher();
	us.afficher();

listusern.add(md);
for(User uss:listusern) {
	System.out.println(uss.toString());


}



}




}

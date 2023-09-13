package dataStructur;

import java.util.Arrays;

/**
* @author Achref Hawari
 *
 */
public class Test {

	public static void main(String[] args) {
		for (UserStatus us :UserStatus.values())  {     System.out.println(us);  }
        
        System.out.println("**************************************************");

        for (DaysOfWeekEnum day : DaysOfWeekEnum.values()) { 
            System.out.println(day); 
        }
        System.out.println("**************************************************");

        
        Arrays.asList(DaysOfWeekEnum.values())
        .forEach(day -> System.out.println(day));
        
        System.out.println("**************************************************");
        
        UserStatus userStatus = UserStatus.INACTIVE;
        
        switch (userStatus) { 
      
                case ACTIVE:
                        System.out.println("Active");
                        break;
                case PENDING:
                        System.out.println("Pending");
                        break;
                case INACTIVE:
                        System.out.println("Inactive");
                        break;
                case DELETED:
                        System.out.println("DELETED");
     }
      

}
}
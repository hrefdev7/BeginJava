package dataStructur;

import java.util.Stack;


public class Test3 {
	
	public static void main(String[] args)
    {
		
    User u=new User(44, "MED",UserStatus.INACTIVE);
    User u1=new User(45, "ALI",UserStatus.DELETED);
    User u2=new User(46, "DEF",UserStatus.INACTIVE);
    User u4=new User(47, "SAF",UserStatus.INACTIVE);

	// si nous utilisons une stack, la sortie sera [1, 2, 3]
    Stack<Integer> stack = new Stack<>();
    Stack<User> stack2 = new Stack<>();
 
    // si nous utilisons deque, la sortie sera [3, 2, 1]
    // Deque<Integer> stack = new ArrayDeque<>();
    stack2.push(u);
    stack2.push(u1);
    stack2.push(u2);
    stack2.push(u4);

    stack.push(1);
    stack.push(2);
    stack.push(3);

    // 1. Utilisation d'un itérateur pour parcourir une stack
    
    java.util.Iterator<Integer> itr = stack.iterator();
    // hasNext() renvoie vrai si la stack a plus d'éléments
    while (itr.hasNext())
    {
        // next() renvoie l'élément suivant dans l'itération
        System.out.println(itr.next());
    }
     //3. Java 8 - récupérez le flux et utilisez une expression lambda
    System.out.println("Programmation fonctionnel Expression Lamda");
    stack.stream().forEach(S -> System.out.println(S));
    
    System.out.println("Programmation fonctionnel Expression Lamda");
    stack2.stream().forEach(S -> System.out.println(S));
    
    }

	
}

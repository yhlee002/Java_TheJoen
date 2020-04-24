package test2;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class fdfd {
	
	  public static void main(String[] args) {
		  Map<String, User> person = new HashMap<String, User>();
		  Scanner sc = new Scanner(System.in);
		  User[] user = new User[5];
		  String[] id = new String[5];
		  String name;
		  int age;
			  for(int i=0; i<5; i++) {
				  
				  user[i] = new User();
				  
				  System.out.println("Id 입력");
			      id[i] = sc.next();
			      System.out.println(id[i]);
			      
			      System.out.println("이름 : ");
			      name = sc.next();
			      System.out.println(name);
			      user[i].setName(name);
			      System.out.println(user[i].getName());
			      
			      System.out.println("나이 : ");
			      age = sc.nextInt();
			      user[i].setAge(age);
			      
			      person.put(id[i], user[i]);
			  }
		      
		  Set<String> ids = person.keySet();
		  Collection<User> users = person.values();
		  System.out.println(ids);
		  System.out.println(users);
		  
		  sc.close();
	  }
}

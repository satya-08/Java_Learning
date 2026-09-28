package FileHandling.Deserialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test {
	public static void main(String[] args) {
		Person p1=new Person(101, "Satya", 22);
		
		try {
			FileInputStream fin=new FileInputStream("person.txt");
			ObjectInputStream in=new ObjectInputStream(fin);
			Person person =(Person) in.readObject();
			
			System.out.println(p1+"|||||"+person);
			System.out.println(p1.name);
			System.out.println(person.name);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}

package FileHandling.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import FileHandling.Deserialization.Person;

public class Test {
	
	public static void main(String[] args) throws FileNotFoundException {
		Person p1=new Person(101,"satya",22);
		System.out.println(new java.io.File("person.txt").getAbsolutePath());
		// Serilize it
		try {
		FileOutputStream fout=new FileOutputStream("person.txt");
		ObjectOutputStream out=new ObjectOutputStream(fout);
		out.writeObject(p1);
		out.close();
		fout.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}

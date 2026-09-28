package FileHandling.Deserialization;
import java.io.Serializable;

public class Person implements Serializable{

	
	private static final long serialVersionUID=1L;
	int id;
	String name;
	int age;
	public Person(int id, String name,int age) {
		super();
		this.id = id;
		this.name = name;
		this.age=age;
	}
	

}
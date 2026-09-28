package FileHandling.Streams.InputStreams.ObjectInputStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectInputStreamExample {
    static void main(String[] args) throws IOException, ClassNotFoundException {
        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("emp.data"));
        Employee obj= (Employee) ois.readObject();
        System.out.print(obj);
    }
}

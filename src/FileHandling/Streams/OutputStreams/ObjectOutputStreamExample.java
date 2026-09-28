package FileHandling.Streams.OutputStreams;

import FileHandling.Streams.InputStreams.ObjectInputStream.Employee;

import java.io.*;

public class ObjectOutputStreamExample {

    public static void main(String[] args) throws Exception {

        Employee e =new Employee(101,"Satya");

        ObjectOutputStream oos =new ObjectOutputStream(new FileOutputStream("emp.data"));

        oos.writeObject(e);

        oos.close();
    }
}
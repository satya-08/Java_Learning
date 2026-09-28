package Streams.InputStreams.ObjectInputStream;

import java.io.Serializable;

public class Employee implements Serializable {
    private int emp_id;
    private String name;

    public Employee(int emp_id, String name) {
        this.emp_id = emp_id;
        this.name = name;
    }
}

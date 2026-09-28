package FileHandling.MyFiles;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
    static void main(String[] args) throws IOException {
        FileWriter file=new FileWriter("Student.txt");

        file.write("Satyanarayana");
        file.write("B.Tech");
        file.close();
    }
}

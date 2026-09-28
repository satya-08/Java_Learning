package FileHandling.MyFiles;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    static void main(String[] args) throws IOException {
        File file=new File("Student.txt");

        if(file.createNewFile()){
            System.out.print("File created successfully");
        }else{
            System.out.print("FIle Already Existed");
        }
    }
}

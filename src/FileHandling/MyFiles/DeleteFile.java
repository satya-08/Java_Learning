package FileHandling.MyFiles;

import java.io.File;

public class DeleteFile {
    static void main(String[] args) {
        File file=new File("Student.txt");
        if(file.delete()){
            System.out.print("File Deleted");
        }
    }
}

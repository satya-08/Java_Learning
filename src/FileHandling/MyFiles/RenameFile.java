package FileHandling.MyFiles;

import java.io.File;

public class RenameFile {
    static void main(String[] args) {
        File oldfile=new File("Student.txt");
        File newfile=new File("Employee.txt");
        oldfile.renameTo(newfile);
    }
}

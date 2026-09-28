package FileHandling.MyFiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    static void main(String[] args) throws FileNotFoundException {
        File file=new File("Student.txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        scanner.close();
    }
}

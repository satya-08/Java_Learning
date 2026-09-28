
package FileHandling.MyFiles;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendData {
    static void main(String[] args) throws IOException {
        FileWriter file=new FileWriter("Student.txt",true);
        file.write("Java Developer Intern at Jocata");
        file.close();

        File file1=new File("Student.txt");
        Scanner scanner=new Scanner(file1);
        while(scanner.hasNextLine()){
            System.out.println("\n"+scanner.nextLine());
        }
        scanner.close();
    }
}

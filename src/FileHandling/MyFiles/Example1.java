package FileHandling.MyFiles;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class Example1 {
    static void main(String[] args) throws IOException {
        String str="abc";
        byte[] b=str.getBytes();
        ByteArrayInputStream obj1=new ByteArrayInputStream(b);
        ByteArrayOutputStream obj2=null;
        for(int i=0;i<2;i++){
            int c;
            while((c=obj1.read())!=-1){
                if(i==0){
                    System.out.println((Character.toUpperCase((char)c)));
                    obj2.write((char)c);
                }
            }
            System.out.println(obj2);
        }

    }
}

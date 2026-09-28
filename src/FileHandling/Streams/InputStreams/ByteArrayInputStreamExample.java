package Streams.InputStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    static void main(String[] args) throws IOException {
        byte[] arr={83,103,105,106};
        ByteArrayInputStream bais=new ByteArrayInputStream(arr);
        int data;
        while((data=bais.read())!=-1){
            System.out.println(data);
        }
        bais.close();

        // Real Time Spring API
        // String json =
        //        "{\"name\":\"Satya\"}";
        //        byte[] bytes = json.getBytes();
        //``
    }
}

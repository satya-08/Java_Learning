package FileHandling.Streams.OutputStreams;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        bos.write('A');
        bos.write('B');
        bos.write('C');
        System.out.println(bos.toString());
    }
}

package Streams.OutputStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileOutputStreamExample {
    static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("emp.data");
        fos.write("Anu 102".getBytes());
        fos.close();
    }
}

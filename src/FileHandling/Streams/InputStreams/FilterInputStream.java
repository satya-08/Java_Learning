package Streams.InputStreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FilterInputStream {
    static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("sample.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);

    }
}

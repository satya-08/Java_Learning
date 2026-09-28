package Streams.OutputStreams;

import Streams.InputStreams.ByteArrayInputStreamExample;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class OutputStreamDemo{
    static void main(String[] args) throws IOException {
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        bos.write(65);
        byte[] arr={'B','C','D'};
        bos.write(arr);
        byte[] arr2={'Z','E','F','G','H'};
        bos.write(arr2,1,3);
        bos.flush();
        System.out.println(bos.toString());
        bos.close();
    }
}

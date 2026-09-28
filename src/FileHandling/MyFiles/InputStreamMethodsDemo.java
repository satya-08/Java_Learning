package FileHandling.MyFiles;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class InputStreamMethodsDemo{
    static void main(String[] args) throws IOException {
//        String str="ABCDEFGHIJ";
//        ByteArrayInputStream is=new ByteArrayInputStream(str.getBytes());
//
//        // Read Method
//        System.out.println("First Byte: "+(char)is.read());
//        int ch=is.read();
//        System.out.println("Second Byte: "+ch);
//        System.out.println("Second Byte: "+(char)ch);
//
//        // Byte Array
//        byte[] arr=new byte[5];
//        is.read(arr);
//        System.out.println("Byte Array: "+new String(arr));
//
//        // Available
//        System.out.println("Available Bytes: "+is.available());
//
//        // Mark supproted
//        System.out.println(is.markSupported());
//        // mark
//        is.mark(2);
//
//        // Skip
//        is.skip(2);

        String data = "ABCDEFGHIJ";

        ByteArrayInputStream is =
                new ByteArrayInputStream(data.getBytes());

// available()
        System.out.println("Available Bytes : "
                + is.available());

// markSupported()
        System.out.println("Mark Supported : "
                + is.markSupported());

// mark()
        is.mark(20);

// read()
        System.out.println("First Byte : "
                + (char)is.read());

// read(byte[])
        byte[] arr = new byte[3];
        is.read(arr);

        System.out.println("Array Data : "
                + new String(arr));

// skip()
        is.skip(2);

        System.out.println("After Skip : "
                + (char)is.read());

// reset()
        is.reset();

        System.out.println("After Reset : "
                + (char)is.read());

        System.out.println("Remaining Bytes : "
                + is.available());

        is.close();

    }
}

package day05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class COPY {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("a.txt");
        FileOutputStream fos = new FileOutputStream("b.txt");
        byte[] b = new byte[1024];
        int len = 0;
        while((len = fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fis.close();
        fos.close();


    }
}

package examples;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx {
    public static void main(String[] args) {
        FileInputStream fis = null;
        File file;

        try {
            file = new File("src/fosEx.txt");
            fis = new FileInputStream(file);
            int data = fis.read();
            while (data != -1) {
                System.out.println((char) data);
                data = fis.read();
            }
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
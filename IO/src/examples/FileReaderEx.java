package examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderEx {
    public static void main(String[] args){
    FileReader fr = null;
    File file;

    try{
        file = new File("src/pwEx.txt");
        fr = new FileReader(file);

        int data = fr.read();
        while (data != -1){
            System.out.println((char) data);
            data = fr.read();
        }

    } catch(FileNotFoundException e){
        e.printStackTrace();
        System.out.println("File not found");
    } catch (IOException e){
        e.printStackTrace();
        System.out.println("Read was interrupted.");
    } catch (Exception e){
        e.printStackTrace();
    } finally{
        try{
            fr.close();
        } catch (IOException e){
            e.printStackTrace();

        }
    }
    }
}
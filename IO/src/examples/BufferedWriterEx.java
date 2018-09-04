package examples;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWriterEx {
    public static void main(String[] args){
    FileWriter fr = null;
    BufferedWriter bw = null;
    File file;

    try{
        file = new File ("src/bwEx.txt");
        fr = new FileWriter(file);
        bw = new BufferedWriter(fr);

        String content = "Some content to write\n";
        bw.write(content);
        bw.write("abc 123");

        System.out.println("Done");
        bw.flush();
        bw.close();
        fr.close();
    } catch (Exception e){
        e.printStackTrace();
    } finally{
        try{
            bw.close();
            fr.close();
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    }
}

package examples;

import java.io.*;

public class BufferedReaderEx {

    public static void main(String[] args){
    FileReader fr = null;
    BufferedReader br = null;
    File file;

    try{
        file = new File("src/bwEx.txt");
        fr = new FileReader(file);
        br = new BufferedReader(fr);

        String sCurrentLine;
        while ((sCurrentLine = br.readLine()) != null);{
            System.out.println(sCurrentLine);
        }
        br.close();
        fr.close();

    } catch(FileNotFoundException e){
        e.printStackTrace();
        System.out.println("File not found");
    } catch (IOException e){
        e.printStackTrace();
        System.out.println("Read was interrupted.");
    } catch (Exception e){
        e.printStackTrace();
    } finally {
        try {
            br.close();
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }
}
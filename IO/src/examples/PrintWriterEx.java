package examples;

import java.io.File;
import java.io.PrintWriter;

public class PrintWriterEx {
    public static void main(String[] args){
    PrintWriter pw = null;
    File file;

    try{
        file = new File ("src/pwEx.txt");
        pw = new PrintWriter(file);

        pw.println(true);
        pw.println(123);
        pw.println(123.456);
        pw.printf("Product name is %s and its price is %d", "iPhone", 1000);

        pw.flush();
        pw.close();
        System.out.println("Done");
    } catch (Exception e){
        e.printStackTrace();
    } finally{
        pw.close();
    }
    }
}
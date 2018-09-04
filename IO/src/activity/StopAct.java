package activity;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;

public class StopAct {
    public static void main(String[] args) {
        PrintWriter pw = null;
        FileReader fr = null;
        File file;


        try {
            file = new File("src/stop.txt");
            pw = new PrintWriter(file);

            pw.println("Enter characters, 'q' to quit.");

            pw.flush();
            pw.close();


            fr = new FileReader(file);
            int data = fr.read();
            char ch = 0;

            while ((data != -1) && ch != 'q') {
                ch = (char) data;
                System.out.println(ch);
                data = fr.read();
            }
            fr.close();


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            pw.close();
        }

    }}
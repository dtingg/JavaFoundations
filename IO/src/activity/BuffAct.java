package activity;

import java.io.*;
import java.util.Scanner;

public class BuffAct {
    public static void main(String[] args){

        FileWriter fw = null;
        BufferedWriter bw = null;
        FileReader fr = null;
        BufferedReader br = null;
        File file;

        //Initiate scanner
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = in.nextLine();

        try{
            file = new File ("src/name.txt");
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            String content = "Users name is: \n";
            bw.write(content);
            bw.write(name);

            bw.flush();
            bw.close();
            fw.close();

            fr = new FileReader(file);
            br = new BufferedReader(fr);
            String sCurrentLine;
            int lineCount = 0;
            while ((sCurrentLine = br.readLine()) != null){
                if (lineCount == 1){
                    System.out.println(("Thanks for the name " + sCurrentLine));
                }
            lineCount ++;

            }
            br.close();
            fr.close();

        } catch (Exception e){
            e.printStackTrace();
        } finally {
            try {
                in.close();
                bw.close();
                fw.close();
                fr.close();
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
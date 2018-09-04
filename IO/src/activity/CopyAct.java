package activity;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyAct {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        File file1 = new File("src/file1.txt");
        File file2 = new File("src/file2.txt");

        String content = "Activity Copy Act";

        try {
            fos = new FileOutputStream(file1);

            //if the file doesn't exist, then create it
            if (!file1.exists()) {
                file1.createNewFile();
            }

            byte[] contentinBytes = content.getBytes();
            fos.write(contentinBytes);
            fos.flush();
            fos.close();

            fis = new FileInputStream(file1);
            fos = new FileOutputStream(file2);

            int data;

            while ((data = fis.read()) != -1) {
                fos.write(data);
            }
            fos.flush();
            fis.close();
            fos.close();
            System.out.println("Done");

        } catch (Exception e){
            e.printStackTrace();

        } finally{
            try{
                fis.close();
                fos.close();
            } catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
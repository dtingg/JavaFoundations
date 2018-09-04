package examples;

import java.io.File;
import java.io.FileOutputStream;

public class FileOutputStreamEx {
    public static void main(String[] args){
    FileOutputStream fos = null;
    File file;
    String content = "This is some text 123\n";

    try{
        file = new File("src/fosEx.txt");
        fos = new FileOutputStream(file);

        //if the file does not exist, then create
        if(!file.exists()){
            file.createNewFile();
        }
        byte [] contentInBytes = content.getBytes();

        fos.write(contentInBytes);
        fos.flush();
        fos.close();
        System.out.println("Done");
    } catch (Exception e){
        e.printStackTrace();
    } finally{
        if (fos != null) {
            try{
                fos.close();
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    }
}
package examples;

public class MyException extends Exception {
    String str;

    public MyException(String str){
        this.str = str;
    }

    public String toString(){
        return ("MyException occurred: " + str);
    }
}
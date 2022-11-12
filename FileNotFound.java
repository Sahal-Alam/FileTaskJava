import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound{
    public static void main (String args[]){
        try{
            FileInputStream fin = new FileInputStream("in.txt");
    }
        catch(FileNotFoundException filenotfoundexception ){
            System.out.println(filenotfoundexception);
        }
    }
}
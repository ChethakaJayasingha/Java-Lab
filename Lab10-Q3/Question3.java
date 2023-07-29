import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {

        try{
            File f1=new File("\"C:\\Users\\chethaka\\Downloads\\JAVA\\Lab10\\Question3\\Java.txt\"");
            Scanner w=new Scanner(f1);

            while (w.hasNextLine()){
                String l=w.nextLine();
                System.out.println(l);
            }
            w.close();
        }catch(FileNotFoundException a){
            System.out.println(a.getMessage());
        }
    }
}

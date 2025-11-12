import java.io.*;

public class SimpleReadWrite {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("data.txt");
            fw.write("Hello, this is a sample file content.\nWelcome to File Handling in Java!");
            fw.close();
            
            FileReader fr = new FileReader("data.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("\nRishika Sharma 24csu173");
    }
}

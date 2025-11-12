import java.io.File;
import java.io.IOException;

public class FileCheck {
    public static void main(String[] args) {
        File file = new File("testfile.txt");

        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("File created: " + file.getName());
            } catch (IOException e) {
                System.out.println("Error creating file: " + e.getMessage());
            }
        }

        if (file.exists()) {
            if (file.isFile()) {
                System.out.println(file.getName() + " is a file.");
            } else if (file.isDirectory()) {
                System.out.println(file.getName() + " is a directory.");
            }
        } else {
            System.out.println("File or directory does not exist.");
        }

        System.out.println("Rishika Sharma 24csu173");
    }
}

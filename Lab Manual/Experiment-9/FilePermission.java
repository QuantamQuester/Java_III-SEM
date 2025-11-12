import java.io.File;

public class FilePermission {
    public static void main(String[] args) {
        File file = new File("testfile.txt");
        
        if (file.exists()) {
            file.setReadable(true);
            file.setWritable(true);
            file.setExecutable(false);
            System.out.println("Permissions changed successfully.");
        } else {
            System.out.println("File not found.");
        }
        
        System.out.println("Rishika Sharma 24csu173");
    }
}

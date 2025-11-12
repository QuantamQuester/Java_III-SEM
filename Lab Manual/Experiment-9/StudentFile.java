import java.io.*;

public class StudentFile {
    public static void main(String[] args) {
        String filename = "student.txt";
        
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(filename));
            bw.write("SerialNo\tFirstName\tCGPA\tGrade\n");
            bw.write("1\tRishika\t9.2\tA\n");
            bw.write("2\tPulkit\t8.7\tB\n");
            bw.write("3\tBhavya\t9.8\tA\n");
            bw.close();
            
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Rishika Sharma 24csu173");
    }
}

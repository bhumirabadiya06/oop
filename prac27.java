 import java.io.*;

public class prac27 {
    public static void main(String[] args) {
        FileWriter fw = null;
        BufferedReader br = null;

        try {
            // Writing student records to file
            fw = new FileWriter("students.txt");
            fw.write("101 Rahul 85\n");
            fw.write("102 Priya 90\n");
            fw.write("103 Amit 78\n");
            System.out.println("Student records written successfully.\n");

            fw.close();

            // Reading student records from file
            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("IO Exception occurred: " + e.getMessage());
        } finally {
            try {
                if (fw != null)
                    fw.close();
                if (br != null)
                    br.close();
            } catch (IOException e) {
                System.out.println("Error closing file.");
            }
        }
    }
}
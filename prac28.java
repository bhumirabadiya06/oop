import java.io.*;

public class prac28 {
    public static void main(String[] args) {
        int lines = 0, words = 0, chars = 0;

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;

            while ((line = br.readLine()) != null) {
                lines++;

                String[] wordArray = line.trim().split("\\s+");
                if (!line.trim().isEmpty()) {
                    words += wordArray.length;
                }

                chars += line.replace(" ", "").length();
            }

            br.close();

            System.out.println("Total Lines: " + lines);
            System.out.println("Total Words: " + words);
            System.out.println("Total Characters: " + chars);

        } catch (FileNotFoundException e) {
            System.out.println("File data.txt not found.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }
}
    

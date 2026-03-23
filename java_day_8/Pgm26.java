import java.io.*;

public class Pgm26 {
    public static void main(String[] args) {
        try {
       
            FileWriter fw = new FileWriter("test.txt");
            fw.write("Hello, this is my first file.\n");
            fw.write("Learning Java file handling.");
            fw.close();

            System.out.println("Data written to file.");

            FileReader fr = new FileReader("test.txt");
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\nReading from file:");

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error: " + e);
        }
    }
}

import java.io.*;
import java.util.Scanner;

public class Pgm26 {
    public static void main(String[] args) {
        try {

	    Scanner sc = new Scanner(System.in);
            System.out.println("Enter The String To Write to the File : ");
	    String str = sc.nextLine();
            FileWriter fw = new FileWriter("test.txt");
            fw.write(str);
            fw.close();

            System.out.println("Data written to file.");


	    FileInputStream fin = new FileInputStream("test.txt");
            FileOutputStream fout = new FileOutputStream("destination.txt");

            int data;

            while ((data = fin.read()) != -1) {
                fout.write(data);
            }

            fin.close();
            fout.close();

            System.out.println("File copied successfully.");




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



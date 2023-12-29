import java.io.*;
import java.util.Scanner;

public class FileOperations {
    private String path;

    public FileOperations(){
        path = "FileOperations.txt";
    }

    public FileOperations(String path){
        this.path = path;
    }

    public void FileWriter(){

        Scanner sc = new Scanner(System.in);
        String text_line = "1";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {

            while (true) {

                text_line = sc.nextLine();
                writer.write(text_line);
                writer.newLine();

                if(text_line.isEmpty()) {

                    break;

                }

            }
            System.out.println("Data was loaded!");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();

        }
    }

    public void FileWriterAppend(){

        Scanner sc = new Scanner(System.in);
        String text_line = "1";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {

            while (true) {

                text_line = sc.nextLine();
                writer.write(text_line);
                writer.newLine();

                if(text_line.isEmpty()) {

                    break;

                }

            }
            System.out.println("Data was loaded!");

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();

        }
    }

    public void FileReader() {

        String line;

        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {

            while ((line =reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

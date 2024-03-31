package BasicNotepad;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Writer {
    public void writer(){
        String text;
        Scanner scanner = new Scanner(System.in);
        System.out.println("New notes : ");
        text = scanner.nextLine();

        try {
            PrintWriter output = new PrintWriter(new FileWriter("BasicNotepad.txt", true));
            output.append(text).append("\n");
            output.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }



}

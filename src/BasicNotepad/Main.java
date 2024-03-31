package BasicNotepad;

import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {


        Creator creator = new Creator("BasicNotepad.txt");
        creator.creatorOfFiles();

        Scanner scanner = new Scanner(System.in);
        int option;
        while(true){
        System.out.println("1 : Write ");
        System.out.println("2 : Read ");
        System.out.println("3 : Exit ");

        System.out.print("Chose : ");
        option = scanner.nextInt();

            switch (option){

                case 1:
                    Writer writer = new Writer();
                    writer.writer();
                    break;
                case 2:
                    Reader reader = new Reader();
                    reader.readerOfFiles();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
            }

        }





    }

    }

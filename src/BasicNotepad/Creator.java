package BasicNotepad;

import java.io.File;
import java.io.IOException;

public class Creator {
    private String name;

    public Creator(String name) {
        this.name = name;
    }

    public void creatorOfFiles(){
        try {
            File file = new File("BasicNotepad.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("Notepad opened.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.getMessage();
        }
    }


    public void fileCreator(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

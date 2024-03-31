package BasicNotepad;
import java.io.FileReader;

public class Reader {
    public void readerOfFiles(){
        try {
            FileReader input = new FileReader("BasicNotepad.txt");

            int data = input.read();
            while (data != -1) {
                System.out.print((char) data);
                data = input.read();
            }

            input.close();
        } catch (Exception e) {
            e.getStackTrace();
        }
    }
}

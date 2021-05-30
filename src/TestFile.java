import java.io.*;
import java.util.List;

public class TestFile {
    public static void main(String[] args) {
        FileManagement fileManagement=new FileManagement();

        List<String> contents=null;
        try {
            fileManagement.writeFile("file.txt","Bai nay lam ve file");
            contents=fileManagement.readFile("file.txt");
            for (String line:contents) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package csv;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        DemoCSV demoCSV=new DemoCSV();
        try {
            demoCSV.writeFile("demo.csv",new Teacher("Toan",20));
            Teacher teacher=demoCSV.readFile("demo.csv");
            System.out.println(teacher);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

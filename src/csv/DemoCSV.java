package csv;

import java.io.*;

public class DemoCSV {
    void writeFile(String path,Teacher teacher) throws IOException {
        FileWriter fr=new FileWriter(path);
        BufferedWriter bf=new BufferedWriter(fr);
        bf.write(teacher.getName()+","+teacher.getAge());
        bf.close();
        fr.close();
    }
    Teacher readFile(String path) throws IOException {
        FileReader fw=new FileReader(path);
        BufferedReader bw=new BufferedReader(fw);
        String content=bw.readLine();
        String[] values=content.split(",");
        Teacher teacher=new Teacher(values[0],Integer.parseInt(values[1]));
        return teacher;
    }
}

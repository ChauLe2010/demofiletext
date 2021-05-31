import java.io.*;
import java.util.List;

public class ObjectFile {
    void writeObjectFile(String path, List<Student> students) throws IOException {
        FileOutputStream fos=new FileOutputStream(path);
        ObjectOutputStream ous=new ObjectOutputStream(fos);
        ous.writeObject(students);
        ous.close();
        fos.close();
    }
    List<Student> readObjectFile(String path) throws IOException, ClassNotFoundException {
        FileInputStream fis=new FileInputStream(path);
        ObjectInputStream ois=new ObjectInputStream(fis);
        List<Student> students=(List<Student>)ois.readObject();
        return students;
    }

}

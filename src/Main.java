import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ObjectFile of=new ObjectFile();
        try {
            List<Student> students=new ArrayList<Student>();
            students.add(new Student("Ngoc Anh",19,"HP"));
            students.add(new Student("Tuan Anh",19,"HP"));
            students.add(new Student("Nam Anh",19,"HP"));
            students.add(new Student("Bao Anh",19,"HP"));
            of.writeObjectFile("demo.dat",students);

            List<Student> studentsCopy=new ArrayList<Student>();
            studentsCopy=of.readObjectFile("demo.dat");
            for (Student s:studentsCopy) {
                System.out.println(s);

            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

import java.io.*;

public class BinaryFile {
    public static void main(String[] args) {
        int[] values= {1,2,3,4,5};
        //FileInputStream fis=new FileInputStream()
        try {
            FileOutputStream fos=new FileOutputStream("demo.dat");
            DataOutputStream dos=new DataOutputStream(fos);
            for(int value:values){
                dos.write(value);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fis=new FileInputStream("demo.dat");
            DataInputStream dis=new DataInputStream(fis);
            int content;
            while((content=dis.read())!=-1){
                System.out.println(content);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

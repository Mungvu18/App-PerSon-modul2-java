import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadAndWriteFile {
    public static Object readFile(String pathName){
         Object obj = null;
        try {
            FileInputStream fis = new FileInputStream(pathName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            obj = ois.readObject();
            ois.close();
            fis.close();
        }catch (Exception e){
            System.out.println(e);
        }
        return obj;
    }
    public static void writeFile(String pathName,Object obj){
        try{
            FileOutputStream fos = new FileOutputStream(pathName);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            fos.close();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}

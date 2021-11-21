package iofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Control {

    public static <T> void write(String file, List<T> arr) { // ???
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(arr);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static <T> List<T> read(String file) { // ???
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            list = (List<T>) in.readObject();
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }
}

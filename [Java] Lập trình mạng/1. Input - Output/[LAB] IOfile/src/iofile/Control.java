package iofile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Control {

    public static <T> void write(String file, List<T> arr) { 
	
	// static để có thể được truy cập trực tiếp ở các lớp khác mà không phải khởi tạo
	// <T> linh hoạt - cũng là một kiểu dữ liệu, cụ thể ở đây là SinhViên, có thể viết: List<T> arr = List<SinhVien> arr nhưng sẽ mất tính tổng quát
	// muốn dùng List<T> arr thì phải khai báo <T> ở Public static <T>... 
        
	try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));
            out.writeObject(arr);
            out.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static <T> List<T> read(String file) { 
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2.controlller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nxulu
 */
public class IO {
    public synchronized static <T> List<T> doc(String file) {
        List<T> res = new ArrayList<>();
        try {
            ObjectInputStream i = new ObjectInputStream(new FileInputStream(file));
            res = (List<T>) i.readObject();
            i.close();
            
        } catch (IOException | ClassNotFoundException e) {
        }
        return res;
    }
    
    public synchronized static <T> void viet(String file, List<T> res) {
      
        try {
            ObjectOutputStream i = new ObjectOutputStream(new FileOutputStream(file));
            i.writeObject(res);
            i.close();
            
        } catch (IOException e) {
        }
    
    }
}

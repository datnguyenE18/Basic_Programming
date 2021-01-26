/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 0
 */
public class IO {
    public static <T> List<T> doc(String file) {
        List<T> list = new ArrayList<>();
        try {
            ObjectInputStream i = new ObjectInputStream(new FileInputStream(file));
            list = (List<T> ) i.readObject();
            i.close();
        } catch (Exception e) {
        }
        return list;
    }
    
    public static <T> void viet(String file,List<T> list) {
        try {
            ObjectOutputStream i = new ObjectOutputStream(new FileOutputStream(file));
            i.writeObject(list);
        } catch (Exception e) {
        }
    }
}

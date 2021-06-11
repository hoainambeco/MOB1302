/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author namxg
 */
public class XFile {
    public static Object readObject(String path){
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            Object object = ois.readObject();
            ois.close();
            return object;
        } 
        catch (Exception e) {
            e.printStackTrace();
            System.out.println("Đọc dữ liệu thất bại");
        }
        return null;
    }
    public static Object writeObject(String path, Object object){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(object);
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Ghi dữ liệu thất bại");
        }
        return null;
    }
    public static byte[] read(String path){
        try{
            FileInputStream fis = new FileInputStream(path);
            int n = fis.available();
            byte[] data = new byte[n];
            fis.read(data);
            fis.close();
            return data;
        } catch (Exception e){
            e.printStackTrace();
            System.out.println("Đọc File thất bại");
        }
        return null;
    }
    public static void write(String path, byte[] data){
        try (FileOutputStream fos = new FileOutputStream(path);){
            fos.write(data);
            fos.close();
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println("Ghi file thất bại");
        }
    }

    public static void write(String path, String noidung) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

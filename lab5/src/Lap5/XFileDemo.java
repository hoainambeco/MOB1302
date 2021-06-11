/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5;

import Lap5.utils.XFile;

/**
 *
 * @author namxg
 */
public class XFileDemo {
    public static void main(String[] args) {
        String path = "src/Lap5/Demo.txt";
        byte[] data = XFile.read(path);
        XFile.write(path, "Nguyễn Hoài Nam".getBytes());
        System.out.println("đọc dữ liệu: " + new String(data));
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5;

import Lap5.utils.XFile;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author namxg
 */
public class Lab5EX2 {

    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Tuấn", 5.5, "CNTT"));
        list.add(new Student("Cường", 7.5, "TKTW"));
        list.add(new Student("Hạnh", 8.5, "CNTT"));
        XFile.writeObject("src/Lap5/Demo.txt", list);
        List<Student> list2 = (List<Student>) XFile.readObject("src/Lap5/Demo.txt");
        for (Student student : list2) {
            System.out.println("họ tên: " + student.name);
            System.out.println("Điểm: " + student.marks);
            System.out.println("Ngành học: " + student.major);
            System.out.println("Hạnh Kiểm: " + student.getGrade());
            System.out.println("Học Bổng: " + student.isBonus());
            System.out.println("================================");
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lap5;

import java.io.Serializable;

/**
 *
 * @author namxg
 */
public class Student implements Serializable{
    public String name;
    public Double marks;
    public String major;

    public String getGrade() {
        if (this.marks < 3) {
            return "Kém";
        }
        if (this.marks < 5) {
            return "Yếu";
        }
        if (this.marks < 6.5) {
            return "Trung Bình";
        }
        if (this.marks < 7.5) {
            return "Khá";
        }
        if (this.marks < 9) {
            return "Giỏi";
        }
        return "Xuất Sắc";
    }

    public boolean isBonus() {
        return this.marks >= 7.5;
    }

    public Student() {
    }

    public Student(String name, Double marks, String major) {
        this.name = name;
        this.marks = marks;
        this.major = major;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMarks() {
        return marks;
    }

    public void setMarks(Double marks) {
        this.marks = marks;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void xuatThongTin() {
        System.out.printf("%s - %f - %s\n", this.name, this.marks, this.major);
    }
}

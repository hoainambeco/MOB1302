/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3_QLNV;

import java.io.Serializable;

/**
 *
 * @author namxg
 */
public class Sraff implements Serializable{
    public String FullName;
    public double salary;

    public Sraff() {
    }

    public Sraff(String FullName, double salary) {
        this.FullName = FullName;
        this.salary = salary;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

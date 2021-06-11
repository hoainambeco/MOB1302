/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import utils.XFile;

/**
 *
 * @author namxg
 */
public class EmployeeList {
    private String path ="src/NhanVien.txt";
    private ArrayList<Employee> list = new ArrayList<>();
    
    public void saveToFile(){
        XFile.writeObject(path, list);
    }
    public void LoadFromFile(){
        list = (ArrayList<Employee>) XFile.readObject(path);
    }
    
    private int index = 0;
    public String getCurrentInfo(){
        return "Record " + (index +1 ) + "of " + list.size();
    }
    public void VTNV(Employee emp){
        index = list.indexOf(emp);
    }
    public void frist(){
        if(index >0){
            index =0;
        }
    }
    public void back(){
        if(index >0){
            index --;
        }
    }
    public void next(){
        if(index <list.size()-1){
            index ++;
        }
    }
    public void last(){
            index = list.size()-1;
    }
    public int getEmployeeIndex(){
        return index;
    }
    public Employee getCurrentEmployee(){
        if(list.size() == 0){
            return null;
        }
        return list.get(index);
    }
    public boolean Update(Employee emp){
        Employee existedEmp= findByID(emp.getEmployeeID());
        boolean flag = false;
        if (existedEmp != null) {
            existedEmp.setName(emp.getName());
            existedEmp.setAge(emp.getAge());
            existedEmp.setEmail(emp.getEmail());
            existedEmp.setSalary(emp.getSalary());
            return true;
        }
        return flag;
    }
    public void FillToTable(DefaultTableModel tblModel){
        tblModel.setRowCount(0);
        for (Employee employee : list) {
            Object[] row = new Object[]{
                employee.getEmployeeID(),employee.getName(),employee.getAge(),employee.getEmail(),employee.getSalary()
            };
            tblModel.addRow(row);
        }
        tblModel.fireTableDataChanged();
    }
    public void add(Employee emp){
        this.list.add(emp);
    }
    public Employee findByID(String employeeID){
        for (Employee employee : list) {
            if(employee.getEmployeeID().equalsIgnoreCase(employeeID)){
                return employee;
            }
        }
        return null;
    }
    public boolean deleteByID(String employeeID){
        for (Employee employee : list) {
            if(employee.getEmployeeID().equals(employeeID)){
                this.list.remove(employee);
                return true;
            }
        }
        return false;
    }
    public Employee getByViTri(int viTri) {return this.list.get(viTri);}
}

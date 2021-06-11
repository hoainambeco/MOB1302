/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi7;

/**
 *
 * @author namxg
 */
public class SinhVienPoly {
    private String Name;
    private String Code;

    public SinhVienPoly() {
    }

    public SinhVienPoly(String Name, String Code) {
        this.Name = Name;
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }
    
    public String toString(){
        return this.getName() + " - " + this.getCode();
    }
}

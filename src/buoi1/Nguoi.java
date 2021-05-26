/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

/**
 *
 * @author tiennh
 */
public class Nguoi {
    // Thuộc tính
    private String hoTen;
    private int gioiTinh;
    private String queQuan;
    private String diaChi;
    private String maSV;
    private String chuyenNganh;

    // Phương thức
    public Nguoi() {
        // Contructor -> dùng để tạo ra đối tượng
    }

    public Nguoi(String hoTen, int gioiTinh, String queQuan, String diaChi, String maSV, String chuyenNganh) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.diaChi = diaChi;
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    
    
    public void xuatThongTin()
    {
        System.out.printf("%s - %d - %s - %s\n", this.hoTen, this.gioiTinh, this.queQuan, this.diaChi);
    }
}

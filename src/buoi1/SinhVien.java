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
public class SinhVien extends Nguoi {
    private String maSV;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String chuyenNganh, String hoTen, int gioiTinh, String queQuan, String diaChi) {
        super(hoTen, gioiTinh, queQuan, diaChi);
        this.maSV = maSV;
        this.chuyenNganh = chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }
    
    @Override
    public void xuatThongTin()
    {
        super.xuatThongTin();
        System.out.printf("%s - %s\n", this.maSV, this.chuyenNganh);
    }
    
    public void xuatThongTin(int tuoi)
    {
        System.out.println("Tuổi: " + tuoi);
    }
    
    public void xuatThongTin(String hoTenBo, String hoTenMe)
    {
        System.out.println("Họ tên bố: " + hoTenBo);
        System.out.println("Họ tên mẹ: " + hoTenMe);
    }
}

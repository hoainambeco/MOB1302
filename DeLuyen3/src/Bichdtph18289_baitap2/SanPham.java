/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bichdtph18289_baitap2;

/**
 *
 * @author bichdo
 */
public class SanPham {
    private String tenSp;
    private String maSp;
    private String danhMuc;
    private String donGia;

    public SanPham() {
    }

    public SanPham(String tenSp, String maSp, String danhMuc, String donGia) {
        this.tenSp = tenSp;
        this.maSp = maSp;
        this.danhMuc = danhMuc;
        this.donGia = donGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getManSp() {
        return maSp;
    }

    public void setManSp(String manSp) {
        this.maSp = manSp;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public String getDonGia() {
        return donGia;
    }

    public void setDonGia(String donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "SanPham{" + "tenSp=" + tenSp + ", manSp=" + maSp + ", danhMuc=" + danhMuc + ", donGia=" + donGia + '}';
    }
    
    

}

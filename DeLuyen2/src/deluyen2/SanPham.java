/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deluyen2;

/**
 *
 * @author namxg
 */
public class SanPham {
    private String TenSP;
    private String MaSP;
    private String DanhMuc;
    private String TinhTrang;
    private int DonGia;

    public SanPham() {
    }

    public SanPham(String TenSP, String MaSP, String DanhMuc, String TinhTrang, int DonGia) {
        this.TenSP = TenSP;
        this.MaSP = MaSP;
        this.DanhMuc = DanhMuc;
        this.TinhTrang = TinhTrang;
        this.DonGia = DonGia;
    }

    public String getTenSP() {
        return TenSP;
    }

    public void setTenSP(String TenSP) {
        this.TenSP = TenSP;
    }

    public String getMaSP() {
        return MaSP;
    }

    public void setMaSP(String MaSP) {
        this.MaSP = MaSP;
    }

    public String getDanhMuc() {
        return DanhMuc;
    }

    public void setDanhMuc(String DanhMuc) {
        this.DanhMuc = DanhMuc;
    }

    public String getTinhTrang() {
        return TinhTrang;
    }

    public void setTinhTrang(String TinhTrang) {
        this.TinhTrang = TinhTrang;
    }

    public int getDonGia() {
        return DonGia;
    }

    public void setDonGia(int DonGia) {
        this.DonGia = DonGia;
    }
}

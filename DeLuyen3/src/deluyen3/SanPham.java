/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deluyen3;

import java.io.Serializable;

/**
 *
 * @author namxg
 */
public class SanPham implements Serializable{
    private String TenSP;
    private String MaSP;
    private String DanhMucSP;
    private Double GiaSP;

    public SanPham() {
    }

    public SanPham(String TenSP, String MaSP, String DanhMucSP, Double GiaSP) {
        this.TenSP = TenSP;
        this.MaSP = MaSP;
        this.DanhMucSP = DanhMucSP;
        this.GiaSP = GiaSP;
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

    public String getDanhMucSP() {
        return DanhMucSP;
    }

    public void setDanhMucSP(String DanhMucSP) {
        this.DanhMucSP = DanhMucSP;
    }

    public Double getGiaSP() {
        return GiaSP;
    }

    public void setGiaSP(Double GiaSP) {
        this.GiaSP = GiaSP;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.ArrayList;

/**
 *
 * @author tiennh
 */
public class QuanLyDanhSach implements QuanLy
{
    private ArrayList<Nguoi> danhSach;
    
    public QuanLyDanhSach() {
        this.danhSach = new ArrayList<Nguoi>();
    }
    
    @Override
    public void them(Nguoi nguoi)
    {
        this.danhSach.add(nguoi);
    }

    @Override
    public boolean xoa(int viTri) {
        this.danhSach.remove(viTri);
        return true;
    }

    @Override
    public ArrayList<Nguoi> xuatDanhSach() {
        return this.danhSach;
    }

    @Override
    public Nguoi getByViTri(int viTri) {
        return this.danhSach.get(viTri);
    }
    @Override
    public void taoSVao(){
        SinhVien sv1 = new SinhVien("PH14161","MOB","Nguyễn Hoài Nam",1,"HN","VP");
        SinhVien sv2 = new SinhVien("PH14162","udpm","Nguyễn Hoài chinh",0,"HN","VP");
        SinhVien sv3 = new SinhVien("PH14162","MOB","Nguyễn Hoài phúc",1,"HN","VP");
        
        this.danhSach.add(sv1);
        this.danhSach.add(sv2);
        this.danhSach.add(sv3);
    }
}

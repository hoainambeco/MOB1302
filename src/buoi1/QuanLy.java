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
public interface QuanLy {
    public void them(Nguoi nguoi);
    
    public boolean xoa(int viTri);
    
    public ArrayList<Nguoi> xuatDanhSach();
    
    public Nguoi getByViTri(int viTri);
    
    public void taoSVao();
}

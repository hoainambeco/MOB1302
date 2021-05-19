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
public class MainClass {
    public static void main(String[] args) {
        SinhVien sv = new SinhVien(
            "PH12345",
            "UDPM",
            "Nguyen Van A",
            1,
            "Ha Noi",
            "Ha Noi"
        );
        
        sv.xuatThongTin();
        
        sv.xuatThongTin(19);
        sv.xuatThongTin("Nguyen Van B", "Tran Thi C");

        QuanLy ql = new QuanLyDanhSach();
//        ql.them(sv);
    }
}

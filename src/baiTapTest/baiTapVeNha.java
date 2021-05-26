/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baiTapTest;

import buoi1.Nguoi;
import buoi1.QuanLy;
import buoi1.QuanLyDanhSach;
import buoi1.SinhVien;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author namxg
 */
public class baiTapVeNha extends javax.swing.JFrame {

    /**
     * Creates new form baiTapVeNha
     */
    
    private QuanLy qlsv;
    
    public baiTapVeNha() {
        initComponents();
        this.qlsv = new QuanLyDanhSach();
        khoiTaoUI();
        hienThiJtable();
    }
    private void khoiTaoUI(){
        this.txtName.setText("");
        this.txtCode.setText("");
        this.txtQueQuan.setText("");
        this.rdoNam.setSelected(true);
        this.cboCN.removeAllItems();        // xóa các thông tin trong comboBox
        this.cboCN.addItem("UDPM");
        this.cboCN.addItem("MOB");
        this.cboCN.addItem("TKW");
        this.cboCN.addItem("TKDH");
        
    }
    
    private void hienThiJtable(){
        ArrayList<Nguoi> listSV  = this.qlsv.xuatDanhSach();
        DefaultTableModel dtm = (DefaultTableModel)this.tblStudenrs.getModel();
        dtm.setRowCount(0);
        for (int i = 0; i < listSV.size(); i++) {
            SinhVien sv = (SinhVien) listSV.get(i);
            Object[] rowData = new Object[]{
                sv.getMaSV(),
                sv.getHoTen(),
                sv.getGioiTinh() == 1 ? "Nam" : "Nữ",
                sv.getChuyenNganh(),
                sv.getQueQuan()
            };
            dtm.addRow(rowData);
        }
    }
    
    private void hienthi(){
        int row = this.tblStudenrs.getSelectedRow();
        if(row == -1){
            return ;
        }else{
           this.txtName.setText(this.qlsv.getByViTri(row).getHoTen());
           this.txtQueQuan.setText(this.qlsv.getByViTri(row).getQueQuan());
           this.txtCode.setText(this.qlsv.getByViTri(row).getMaSV());
           if(this.qlsv.getByViTri(row).getGioiTinh() == 1){
               this.rdoNam.setSelected(true);
           }else if(this.qlsv.getByViTri(row).getGioiTinh() == 0){
               this.rdoNu.setSelected(true);
           }
           for(int i=0;i<this.cboCN.getItemCount();i++){
               if(this.cboCN.getItemAt(i)
                       .equals(this.qlsv.getByViTri(row).getChuyenNganh())){
                   this.cboCN.setSelectedIndex(i);
               }
           }
           
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rdoGroup = new javax.swing.ButtonGroup();
        lblHoTen = new javax.swing.JLabel();
        lblQLSV = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblCode = new javax.swing.JLabel();
        txtCode = new javax.swing.JTextField();
        lblQueQuan = new javax.swing.JLabel();
        txtQueQuan = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        cboCN = new javax.swing.JComboBox<>();
        lblGioitinh = new javax.swing.JLabel();
        rdoNam = new javax.swing.JRadioButton();
        rdoNu = new javax.swing.JRadioButton();
        btnADD = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDeleteFrom = new javax.swing.JButton();
        btnSVAO = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudenrs = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblHoTen.setText("Họ Tên");

        lblQLSV.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lblQLSV.setText("Quản lý sinh viên");
        lblQLSV.setAlignmentY(0.0F);

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lblCode.setText("Mã SV");

        txtCode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodeActionPerformed(evt);
            }
        });

        lblQueQuan.setText("Quê Quán");

        txtQueQuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtQueQuanActionPerformed(evt);
            }
        });

        jLabel1.setText("Chuyên ngành");

        cboCN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "UDPM", "MOB", "TKW", "TKDH" }));
        cboCN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCNActionPerformed(evt);
            }
        });

        lblGioitinh.setText("Giới tính");

        rdoGroup.add(rdoNam);
        rdoNam.setText("Nam");
        rdoNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNamActionPerformed(evt);
            }
        });

        rdoGroup.add(rdoNu);
        rdoNu.setText("Nữ");
        rdoNu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoNuActionPerformed(evt);
            }
        });

        btnADD.setText("Thêm");
        btnADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnADDActionPerformed(evt);
            }
        });

        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnEdit.setText("Sửa");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDeleteFrom.setText("Xóa From");
        btnDeleteFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFromActionPerformed(evt);
            }
        });

        btnSVAO.setText("Tạo SV ảo");
        btnSVAO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSVAOActionPerformed(evt);
            }
        });

        tblStudenrs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SV", "Họ tên", "Giới tính", "Chuyên ngành", "Quê Quán"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblStudenrs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStudenrsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblStudenrs);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(lblGioitinh)
                            .addGap(18, 18, 18)
                            .addComponent(rdoNam)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(rdoNu))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnADD)
                            .addGap(34, 34, 34)
                            .addComponent(btnEdit)
                            .addGap(41, 41, 41)
                            .addComponent(btnDelete)
                            .addGap(32, 32, 32)
                            .addComponent(btnDeleteFrom)
                            .addGap(49, 49, 49)
                            .addComponent(btnSVAO))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblCode)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCode))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(lblHoTen)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(61, 61, 61)
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cboCN, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(283, 283, 283)
                                    .addComponent(lblQueQuan)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(lblQLSV)
                                    .addGap(41, 41, 41)))
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblQLSV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHoTen)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCode)
                            .addComponent(txtCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblQueQuan)
                            .addComponent(txtQueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cboCN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblGioitinh)
                    .addComponent(rdoNam)
                    .addComponent(rdoNu))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnADD)
                    .addComponent(btnDelete)
                    .addComponent(btnEdit)
                    .addComponent(btnDeleteFrom)
                    .addComponent(btnSVAO))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtCodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodeActionPerformed

    private void txtQueQuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtQueQuanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtQueQuanActionPerformed

    private void cboCNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCNActionPerformed

    private void rdoNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNamActionPerformed

    private void rdoNuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoNuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoNuActionPerformed

    private void btnADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnADDActionPerformed
        String hoTen = this.txtName.getText();
        String maSV = this.txtCode.getText();
        String quequan = this.txtQueQuan.getText();
        String chuyenNganh = this.cboCN.getSelectedItem().toString();
        boolean isNam = this.rdoNam.isSelected();
        boolean isNu = this.rdoNu.isSelected();
        int gioiTinh = isNam == true ? 1 : 0;
        if (hoTen.length()==0 || maSV.length()== 0 || quequan.length()==0 ){
            JOptionPane.showMessageDialog(this,"không được để trống","lỗi", JOptionPane.ERROR_MESSAGE);
            return ;
        }
        DefaultTableModel dtm = (DefaultTableModel)this.tblStudenrs.getModel();
        dtm.setRowCount(0); 
        SinhVien sv = new SinhVien(maSV, chuyenNganh, hoTen, gioiTinh, quequan, quequan);
        this.qlsv.them(sv);
        this.hienThiJtable();
        this.khoiTaoUI();
//        DefaultTableModel dtm = (DefaultTableModel)this.tblStudenrs.getModel();
//        Object[] rowData = new Object[]{code,Name,Gioitinh,chuyennganh,quequan};
//        dtm.addRow(rowData);
    }//GEN-LAST:event_btnADDActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        int row = this.tblStudenrs.getSelectedRow();
        if(row == -1){
            return ;
        }
        this.qlsv.xoa(row);
        this.btnADDActionPerformed(evt);
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        ArrayList<Nguoi> listSV  = this.qlsv.xuatDanhSach();
        int row = this.tblStudenrs.getSelectedRow();
        if (row == -1 )
        {
            return;
        }
        else{
            this.qlsv.xoa(row);
            this.hienThiJtable();
            return;
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnDeleteFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFromActionPerformed
        // TODO add your handling code here:
        this.khoiTaoUI();
    }//GEN-LAST:event_btnDeleteFromActionPerformed

    private void btnSVAOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSVAOActionPerformed
        // TODO add your handling code here:
        this.qlsv.taoSVao();
        this.hienThiJtable();
    }//GEN-LAST:event_btnSVAOActionPerformed

    private void tblStudenrsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStudenrsMouseClicked
        // TODO add your handling code here:
        this.hienthi();
//        int row = this.tblStudenrs.getSelectedRow();
//        if (row == -1){
//            return;
//        }
//        else{
//            this.txtName.setText(this.qlsv.getByViTri(row).getHoTen());
//            this.txtQueQuan.setText(this.qlsv.getByViTri(row).getQueQuan());
//            this.txtCode.setText(this.qlsv.getByViTri(row).getmaSV());
//            if (this.qlsv.getByViTri(row).getGioiTinh()== 0) {
//                this.rdoNam.setSelected(true);
//            }
//            else{
//                this.rdoNu.setSelected(true);
//            }
//            
//        }
    }//GEN-LAST:event_tblStudenrsMouseClicked

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(baiTapVeNha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(baiTapVeNha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(baiTapVeNha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(baiTapVeNha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new baiTapVeNha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnADD;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnDeleteFrom;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSVAO;
    private javax.swing.JComboBox<String> cboCN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCode;
    private javax.swing.JLabel lblGioitinh;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblQLSV;
    private javax.swing.JLabel lblQueQuan;
    private javax.swing.ButtonGroup rdoGroup;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JTable tblStudenrs;
    private javax.swing.JTextField txtCode;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtQueQuan;
    // End of variables declaration//GEN-END:variables
}
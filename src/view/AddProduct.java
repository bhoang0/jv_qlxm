/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import dao.XeSoDAO;
import dao.XeMayDAO;
import dao.TayGaDAO;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.XeSo;
import model.XeMay;
import model.TayGa;

/**
 *
 * @author bao hoang
 */
public class AddProduct extends javax.swing.JDialog {

    /**
     * Creates new form ThemSP
     */
    private ProductForm owner;

    public AddProduct(javax.swing.JInternalFrame parent, javax.swing.JFrame owner, boolean modal) {
        super(owner, modal);
        this.owner = (ProductForm) parent;
        initComponents();
        setLocationRelativeTo(null);
        txtMaSanPham.setText(createIdXS());
    }

    private AddProduct(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTenSanPham = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txttenDongCo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtphanKhoi = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttieuThuNL = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtdoCaoYen = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        cbxloaisp = new javax.swing.JComboBox<>();
        btnAddProduct = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        xeso = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txtdungTichbinhXang = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtphienBan = new javax.swing.JTextField();
        tayga = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        txtcongSuat = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtkhoiLuong = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtXuatXu = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Thêm sản phẩm mới");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(204, 204, 204), new java.awt.Color(255, 204, 153)));

        jLabel2.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel2.setText("Mã sản phẩm");

        txtMaSanPham.setEditable(false);
        txtMaSanPham.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel3.setText("Tên sản phẩm");

        txtTenSanPham.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel4.setText("Đơn giá");

        txtDonGia.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel6.setText("Tên động cơ");

        txttenDongCo.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel7.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel7.setText("Phân khối");

        txtphanKhoi.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel8.setText("Tiêu thụ nhiên liệu");

        txttieuThuNL.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel9.setText("Độ cao yên");

        txtdoCaoYen.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel10.setText("Loại sản phẩm");

        cbxloaisp.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        cbxloaisp.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "XeSo", "TayGa" }));
        cbxloaisp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxloaispItemStateChanged(evt);
            }
        });
        cbxloaisp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxloaispActionPerformed(evt);
            }
        });
        cbxloaisp.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                cbxloaispPropertyChange(evt);
            }
        });

        btnAddProduct.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));
        btnAddProduct.setFont(new java.awt.Font("UTM Avo", 0, 16)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setText("Thêm sản phẩm");
        btnAddProduct.setBorder(null);
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnCancel.setBackground(new java.awt.Color(211, 211, 211));
        btnCancel.setFont(new java.awt.Font("UTM Avo", 0, 16)); // NOI18N
        btnCancel.setText("Huỷ");
        btnCancel.setBorder(null);
        btnCancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        jPanel3.setLayout(new java.awt.CardLayout());

        xeso.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel11.setText("Dung tích bình xăng");

        txtdungTichbinhXang.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        jLabel12.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel12.setText("Phiên bản");

        txtphienBan.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N

        javax.swing.GroupLayout xesoLayout = new javax.swing.GroupLayout(xeso);
        xeso.setLayout(xesoLayout);
        xesoLayout.setHorizontalGroup(
            xesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtdungTichbinhXang)
            .addGroup(xesoLayout.createSequentialGroup()
                .addGroup(xesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 84, Short.MAX_VALUE))
            .addComponent(txtphienBan)
        );
        xesoLayout.setVerticalGroup(
            xesoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(xesoLayout.createSequentialGroup()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdungTichbinhXang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtphienBan, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(xeso, "card2");

        tayga.setBackground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel13.setText("Công suất");

        jLabel14.setFont(new java.awt.Font("SF Pro Display", 0, 16)); // NOI18N
        jLabel14.setText("Khối lượng");

        javax.swing.GroupLayout taygaLayout = new javax.swing.GroupLayout(tayga);
        tayga.setLayout(taygaLayout);
        taygaLayout.setHorizontalGroup(
            taygaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcongSuat)
            .addComponent(txtkhoiLuong)
            .addGroup(taygaLayout.createSequentialGroup()
                .addGroup(taygaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 76, Short.MAX_VALUE))
        );
        taygaLayout.setVerticalGroup(
            taygaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(taygaLayout.createSequentialGroup()
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtcongSuat, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtkhoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(tayga, "card2");

        jLabel15.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        jLabel15.setText("Xuất xứ");

        txtXuatXu.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        txtXuatXu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtXuatXuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(221, 221, 221)
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(91, 91, 91)
                                .addComponent(txttieuThuNL, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(224, 224, 224))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtXuatXu)
                                        .addGap(91, 91, 91)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtdoCaoYen, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtphanKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(91, 91, 91)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttenDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbxloaisp, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(43, 43, 43))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel6))
                    .addComponent(jLabel10))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttenDongCo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxloaisp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel7))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtphanKhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel8))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttieuThuNL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel15)))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtdoCaoYen, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtXuatXu, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 880, 400));

        jPanel2.setBackground(javax.swing.UIManager.getDefaults().getColor("Actions.Grey"));

        jLabel1.setFont(new java.awt.Font("UTM Avo", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("THÊM SẢN PHẨM MỚI");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(jLabel1)
                .addContainerGap(312, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxloaispItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxloaispItemStateChanged
        // TODO add your handling code here:
        if (cbxloaisp.getSelectedItem().equals("XeSo")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.first(jPanel3);
            txtMaSanPham.setText(createIdXS());
        }

        if (cbxloaisp.getSelectedItem().equals("TayGa")) {
            CardLayout productCategory = (CardLayout) jPanel3.getLayout();
            productCategory.last(jPanel3);
            txtMaSanPham.setText(createIdTG());
        }
    }//GEN-LAST:event_cbxloaispItemStateChanged

    private void cbxloaispActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxloaispActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxloaispActionPerformed

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
        String maXe = txtMaSanPham.getText();
        String tenXe = txtTenSanPham.getText();
        double dongia = 0;
        double dungTichbinhXang = 0;
        boolean valid = true;
        try {
            dongia = Double.parseDouble(txtDonGia.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đơn giá ở dạng số !");
            valid = false;
        }
        String tenDongCo = txttenDongCo.getText();
        String phanKhoi = txtphanKhoi.getText();
        String tieuThuNL = txttieuThuNL.getText();
        String doCaoYen = txtdoCaoYen.getText();
        String xuatxu = txtXuatXu.getText();
        int trangThai = 1;
        if (cbxloaisp.getSelectedItem().equals("XeSo")) {
            try {
                dungTichbinhXang = Double.parseDouble(txtdungTichbinhXang.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập dung tích bình xăng ở dạng số !");
                valid = false;
            }
            String phienBan = txtphienBan.getText();
            if (maXe.equals("") && tenXe.equals("") && tenDongCo.equals("") && phanKhoi.equals("") && tieuThuNL.equals("") && doCaoYen.equals("") && xuatxu.equals("") && phienBan.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !");
                valid = false;
            } else if (valid) {
                XeSo xs = new XeSo(dungTichbinhXang, phienBan, maXe, tenXe, 0, dongia, tenDongCo, phanKhoi, xuatxu, doCaoYen, tieuThuNL,trangThai);
                try {
                    XeSoDAO.getInstance().insert(xs);
                    this.dispose();
                    JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !");
                    owner.loadDataToTable();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this, "Thêm sản phẩm thất bại !");
                }
            }
        }
        if (cbxloaisp.getSelectedItem().equals("TayGa")) {
            String congSuat = txtcongSuat.getText();
            int khoiLuong = 0;
            try {
                khoiLuong = Integer.parseInt(txtkhoiLuong.getText());
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập khối lượng ở dạng số !");
                valid = false;
            }
            if (maXe.equals("") && tenXe.equals("") && tenDongCo.equals("") && phanKhoi.equals("") && tieuThuNL.equals("") && doCaoYen.equals("") && xuatxu.equals("") && congSuat.equals("")) {
                JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin !");
                valid = false;
            } else if (valid) {
                TayGa tayga = new TayGa(congSuat, khoiLuong, maXe, tenXe, 0, dongia, tenDongCo, phanKhoi, xuatxu, doCaoYen, tieuThuNL,trangThai);
                TayGaDAO.getInstance().insert(tayga);
                this.dispose();
                JOptionPane.showMessageDialog(this, "Thêm sản phẩm thành công !");
                owner.loadDataToTable();
            }
        }
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtXuatXuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtXuatXuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtXuatXuActionPerformed

    private void cbxloaispPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_cbxloaispPropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxloaispPropertyChange

    /**
     * @param args the command line arguments
     */
    public String createIdTG() {
        ArrayList<XeMay> xmAll = XeMayDAO.getInstance().selectAll();
        ArrayList<XeMay> tgAll = new ArrayList<XeMay>();
        for (XeMay xeMay : xmAll) {
            if (xeMay.getMaXe().contains("TG")) {
                tgAll.add(xeMay);
            }
        }
        int i = tgAll.size();
        String check ="check";
        while(check.length()!=0){
            i++;
            for (XeMay xeMay : tgAll) {
                if(xeMay.getMaXe().equals("TG"+i)){
                    check="";
                }
            }
            if(check.length()==0){
                check ="check";
            } else {
                check = "";
            }
        }
        return "TG" + i;
    }

    public String createIdXS() {
        ArrayList<XeMay> xmAll = XeMayDAO.getInstance().selectAll();
        ArrayList<XeMay> xsAll = new ArrayList<XeMay>();
        for (XeMay xeMay : xmAll) {
            if (xeMay.getMaXe().contains("XS")) {
                xsAll.add(xeMay);
            }
        }
        int i = xsAll.size();
        String check ="check";
        while(check.length()!=0){
            i++;
            for (XeMay xeMay : xsAll) {
                if(xeMay.getMaXe().equals("XS"+i)){
                    check="";
                }
            }
            if(check.length()==0){
                check ="check";
            } else {
                check = "";
            }
        }
        return "XS" + i;
    }

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
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AddProduct dialog = new AddProduct(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnCancel;
    private javax.swing.JComboBox<String> cbxloaisp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel xeso;
    private javax.swing.JPanel tayga;
    private javax.swing.JTextField txttenDongCo;
    private javax.swing.JTextField txtkhoiLuong;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtphienBan;
    private javax.swing.JTextField txtdoCaoYen;
    private javax.swing.JTextField txtdungTichbinhXang;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtcongSuat;
    private javax.swing.JTextField txtphanKhoi;
    private javax.swing.JTextField txttieuThuNL;
    private javax.swing.JTextField txtTenSanPham;
    private javax.swing.JTextField txtXuatXu;
    // End of variables declaration//GEN-END:variables
}

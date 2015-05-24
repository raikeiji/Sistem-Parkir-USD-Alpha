/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view.admin;

import com.control.editmember.EditMemberControl;
import com.model.Member;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author rai
 */
public class DaftarUpdateMemberForm extends javax.swing.JFrame {

    /**
     * Creates new form DaftarMemberForm
     */
    public DaftarUpdateMemberForm() {
        initComponents();
        tampilanawal();
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
        jLabel1 = new javax.swing.JLabel();
        jLabelTitle1 = new javax.swing.JLabel();
        jLabelLogoSistemParkir = new javax.swing.JLabel();
        jLabelUSD = new javax.swing.JLabel();
        jPanelPengunjung = new javax.swing.JPanel();
        jLabelyy = new javax.swing.JLabel();
        jLabelxx = new javax.swing.JLabel();
        jTextFieldNoID = new javax.swing.JTextField();
        jTextFieldNama = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSaldo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaAlamat = new javax.swing.JTextArea();
        jButtonSimpan = new javax.swing.JButton();
        jButtonBatal = new javax.swing.JButton();
        jButtonKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pendaftaran Member");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 2, 15)); // NOI18N
        jLabel1.setText("FORM PENDAFTARAN MEMBER");

        jLabelTitle1.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabelTitle1.setText("SISTEM PARKIR UNIVERSITAS SANATA DHARMA");

        jLabelLogoSistemParkir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo_48px.png"))); // NOI18N

        jLabelUSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/logo sadhar_48px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelLogoSistemParkir)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUSD)
                        .addGap(29, 29, 29))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelLogoSistemParkir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelUSD, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanelPengunjung.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Form Entri Data Member", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Abyssinica SIL", 2, 10))); // NOI18N

        jLabelyy.setText("Nama");

        jLabelxx.setText("No Id");

        jTextFieldNoID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNoIDMouseClicked(evt);
            }
        });
        jTextFieldNoID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNoIDActionPerformed(evt);
            }
        });
        jTextFieldNoID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNoIDKeyTyped(evt);
            }
        });

        jTextFieldNama.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldNamaMouseClicked(evt);
            }
        });

        jLabel2.setText("Alamat");

        jLabel3.setText("Saldo");

        jTextFieldSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldSaldoMouseClicked(evt);
            }
        });
        jTextFieldSaldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSaldoActionPerformed(evt);
            }
        });

        jTextAreaAlamat.setColumns(20);
        jTextAreaAlamat.setRows(5);
        jTextAreaAlamat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextAreaAlamatMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTextAreaAlamat);

        javax.swing.GroupLayout jPanelPengunjungLayout = new javax.swing.GroupLayout(jPanelPengunjung);
        jPanelPengunjung.setLayout(jPanelPengunjungLayout);
        jPanelPengunjungLayout.setHorizontalGroup(
            jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPengunjungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelPengunjungLayout.createSequentialGroup()
                        .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelxx)
                            .addComponent(jLabelyy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNoID, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelPengunjungLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSaldo)))
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelPengunjungLayout.setVerticalGroup(
            jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPengunjungLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanelPengunjungLayout.createSequentialGroup()
                        .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelxx)
                                .addComponent(jTextFieldNoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelyy))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelPengunjungLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextFieldSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonSimpan.setText("Simpan");
        jButtonSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimpanActionPerformed(evt);
            }
        });

        jButtonBatal.setText("Batal");
        jButtonBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBatalActionPerformed(evt);
            }
        });

        jButtonKeluar.setText("Keluar");
        jButtonKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelPengunjung, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonKeluar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonSimpan)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelPengunjung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButtonBatal)
                            .addComponent(jButtonSimpan))
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonKeluar)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNoIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNoIDMouseClicked
        jTextFieldNoID.setText("");
    }//GEN-LAST:event_jTextFieldNoIDMouseClicked

    private void jTextFieldNoIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNoIDActionPerformed

    }//GEN-LAST:event_jTextFieldNoIDActionPerformed

    private void jTextFieldNamaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldNamaMouseClicked
        jTextFieldNama.setText("");
    }//GEN-LAST:event_jTextFieldNamaMouseClicked

    private void jButtonSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimpanActionPerformed
        Member mb = new Member();
        mb.setId_member(jTextFieldNoID.getText());
        mb.setNama_member(jTextFieldNama.getText());
        mb.setAlamat(jTextAreaAlamat.getText());
        mb.setSaldo(jTextFieldSaldo.getText());
        try {
            if (EditMemberControl.getKoneksiEditMember().cekDataMember(mb)) {
//                System.out.println("Pendaftaran gagal, member sudah terdaftar");
//                EditMemberControl.getKoneksiEditMember().updateDataMember(mb);
//                System.out.println("Update Data Berhasil");
//                EditMemberControl.getKoneksiEditMember().hapusDataMember(mb);
//                System.out.println("Hapus Data Member Berhasil");

//                JOptionPane.showMessageDialog(rootPane, "Pendaftaran gagal, member sudah terdaftar");
                int selectedOption = JOptionPane.showConfirmDialog(null,
                        "Pendaftaran gagal, member sudah terdaftar, apakah anda ingin mengupdate?",
                        "Update",
                        JOptionPane.YES_NO_OPTION);
                if (selectedOption == JOptionPane.YES_OPTION) {
                    EditMemberControl.getKoneksiEditMember().updateDataMember(mb);
                    JOptionPane.showMessageDialog(rootPane, "Update Data Berhasil");
                    tampilanawal();
                }
            } else {
//                EditMemberControl.getKoneksiEditMember().pendaftaranMemberBaru(mb);
//                System.out.println("Pendaftaran Berhasil");
//                System.out.println("Update Data Gagal, member belum terdaftar");
//                System.out.println("Hapus Data Member Gagal, data tidak ditemukan");
                EditMemberControl.getKoneksiEditMember().pendaftaranMemberBaru(mb);
                JOptionPane.showMessageDialog(rootPane, "Pendaftaran Berhasil");

            }

        } catch (SQLException ex) {
            System.out.println("Kueri gagal : " + ex.getMessage());
        }
    }//GEN-LAST:event_jButtonSimpanActionPerformed

    private void jTextFieldNoIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNoIDKeyTyped
//        Member mb = new Member();
//        mb.setId_member(jTextFieldNoID.getText());
//        mb.setNama_member(jTextFieldNama.getText());
//        mb.setAlamat(jTextAreaAlamat.getText());
//        mb.setSaldo(jTextFieldSaldo.getText());
//        try {
//            EditMemberControl.getKoneksiEditMember().cekDataMember(mb);
//            jTextFieldNama.setText(mb.getNama_member());
//            jTextFieldSaldo.setText(mb.getSaldo());
//            jTextAreaAlamat.setText(mb.getAlamat());
//        } catch (Exception e) {
//            System.err.println("error : "+e);
//        }
    }//GEN-LAST:event_jTextFieldNoIDKeyTyped

    private void jTextFieldSaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSaldoActionPerformed
        jTextFieldSaldo.setText("");
    }//GEN-LAST:event_jTextFieldSaldoActionPerformed

    private void jTextAreaAlamatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextAreaAlamatMouseClicked
        jTextAreaAlamat.setText("");
    }//GEN-LAST:event_jTextAreaAlamatMouseClicked

    private void jTextFieldSaldoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldSaldoMouseClicked
        jTextFieldSaldo.setText("");
    }//GEN-LAST:event_jTextFieldSaldoMouseClicked

    private void jButtonBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBatalActionPerformed
        tampilanawal();
    }//GEN-LAST:event_jButtonBatalActionPerformed

    private void jButtonKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKeluarActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButtonKeluarActionPerformed

    private void tampilanawal() {
        jTextFieldNoID.setText("Input Nomor ID");
        jTextFieldNoID.setPreferredSize(jTextFieldNoID.getPreferredSize());
        jTextFieldNoID.setForeground(Color.GRAY);
        jTextFieldNama.setText("Input nama");
        jTextFieldNama.setPreferredSize(jTextFieldNama.getPreferredSize());
        jTextFieldNama.setForeground(Color.GRAY);
        jTextFieldSaldo.setText("Input saldo");
        jTextFieldSaldo.setPreferredSize(jTextFieldNama.getPreferredSize());
        jTextFieldSaldo.setForeground(Color.GRAY);
        jTextAreaAlamat.setText("Input alamat");
        jTextAreaAlamat.setPreferredSize(jTextFieldNama.getPreferredSize());
        jTextAreaAlamat.setForeground(Color.GRAY);
    }

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
            java.util.logging.Logger.getLogger(DaftarUpdateMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DaftarUpdateMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DaftarUpdateMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DaftarUpdateMemberForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DaftarUpdateMemberForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBatal;
    private javax.swing.JButton jButtonKeluar;
    private javax.swing.JButton jButtonSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelLogoSistemParkir;
    private javax.swing.JLabel jLabelTitle1;
    private javax.swing.JLabel jLabelUSD;
    private javax.swing.JLabel jLabelxx;
    private javax.swing.JLabel jLabelyy;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelPengunjung;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaAlamat;
    private javax.swing.JTextField jTextFieldNama;
    private javax.swing.JTextField jTextFieldNoID;
    private javax.swing.JTextField jTextFieldSaldo;
    // End of variables declaration//GEN-END:variables
}
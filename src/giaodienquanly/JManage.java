package giaodienquanly;

import baitaptuan1.Bai11;
import baitaptuan1.Bai110;
import baitaptuan1.Bai111;
import baitaptuan1.Bai112;
import baitaptuan1.Bai113;
import baitaptuan1.Bai114;
import baitaptuan1.Bai115;
import baitaptuan1.Bai116;
import baitaptuan1.Bai12;
import baitaptuan1.Bai13;
import baitaptuan1.Bai14;
import baitaptuan1.Bai15;
import baitaptuan1.Bai16;
import baitaptuan1.Bai17;
import baitaptuan1.Bai18;
import baitaptuan1.Bai19;
import baitaptuan2.Bai21;
import baitaptuan2.Bai210;
import baitaptuan2.Bai211;
import baitaptuan2.Bai212;
import baitaptuan2.Bai213;
import baitaptuan2.Bai22;
import baitaptuan2.Bai23;
import baitaptuan2.Bai24;
import baitaptuan2.Bai25;
import baitaptuan2.Bai26;
import baitaptuan2.Bai27;
import baitaptuan2.Bai28;
import baitaptuan2.Bai29;
import baitaptuan3.Bai31;
import baitaptuan3.Bai310;
import baitaptuan3.Bai311;
import baitaptuan3.Bai312;
import baitaptuan3.Bai313;
import baitaptuan3.Bai314;
import baitaptuan3.Bai315;
import baitaptuan3.Bai316;
import baitaptuan3.Bai32;
import baitaptuan3.Bai33;
import baitaptuan3.Bai34;
import baitaptuan3.Bai35;
import baitaptuan3.Bai36;
import baitaptuan3.Bai37;
import baitaptuan3.Bai38;
import baitaptuan3.Bai39;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JManage extends javax.swing.JFrame implements ActionListener {

    public JManage() {
        initComponents();
        btn11.addActionListener(this);     //bắt sự kiện của nút
        btn12.addActionListener(this);
        btn13.addActionListener(this);
        btn14.addActionListener(this);
        btn15.addActionListener(this);
        btn16.addActionListener(this);
        btn17.addActionListener(this);
        btn18.addActionListener(this);
        btn19.addActionListener(this);
        btn110.addActionListener(this);
        btn111.addActionListener(this);
        btn112.addActionListener(this);
        btn113.addActionListener(this);
        btn114.addActionListener(this);
        btn115.addActionListener(this);
        btn116.addActionListener(this);
        btn21.addActionListener(this);
        btn22.addActionListener(this);
        btn23.addActionListener(this);
        btn24.addActionListener(this);
        btn25.addActionListener(this);
        btn26.addActionListener(this);
        btn27.addActionListener(this);
        btn28.addActionListener(this);
        btn29.addActionListener(this);
        btn210.addActionListener(this);
        btn211.addActionListener(this);
        btn212.addActionListener(this);
        btn213.addActionListener(this);
        btn31.addActionListener(this);
        btn32.addActionListener(this);
        btn33.addActionListener(this);
        btn34.addActionListener(this);
        btn35.addActionListener(this);
        btn36.addActionListener(this);
        btn37.addActionListener(this);
        btn38.addActionListener(this);
        btn39.addActionListener(this);
        btn310.addActionListener(this);
        btn311.addActionListener(this);
        btn312.addActionListener(this);
        btn313.addActionListener(this);
        btn314.addActionListener(this);
        btn315.addActionListener(this);
        btn316.addActionListener(this);

        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btn17 = new javax.swing.JButton();
        btn18 = new javax.swing.JButton();
        btn19 = new javax.swing.JButton();
        btn110 = new javax.swing.JButton();
        btn111 = new javax.swing.JButton();
        btn112 = new javax.swing.JButton();
        btn113 = new javax.swing.JButton();
        btn114 = new javax.swing.JButton();
        btn115 = new javax.swing.JButton();
        btn116 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btn21 = new javax.swing.JButton();
        btn22 = new javax.swing.JButton();
        btn23 = new javax.swing.JButton();
        btn24 = new javax.swing.JButton();
        btn25 = new javax.swing.JButton();
        btn26 = new javax.swing.JButton();
        btn27 = new javax.swing.JButton();
        btn28 = new javax.swing.JButton();
        btn29 = new javax.swing.JButton();
        btn210 = new javax.swing.JButton();
        btn211 = new javax.swing.JButton();
        btn212 = new javax.swing.JButton();
        btn213 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btn31 = new javax.swing.JButton();
        btn32 = new javax.swing.JButton();
        btn33 = new javax.swing.JButton();
        btn34 = new javax.swing.JButton();
        btn35 = new javax.swing.JButton();
        btn36 = new javax.swing.JButton();
        btn37 = new javax.swing.JButton();
        btn39 = new javax.swing.JButton();
        btn38 = new javax.swing.JButton();
        btn310 = new javax.swing.JButton();
        btn311 = new javax.swing.JButton();
        btn312 = new javax.swing.JButton();
        btn313 = new javax.swing.JButton();
        btn314 = new javax.swing.JButton();
        btn315 = new javax.swing.JButton();
        btn316 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);

        btn11.setText("Bài 1");

        btn12.setText("Bài 2");
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setText("Bài 3");

        btn14.setText("Bài 4");

        btn15.setText("Bài 5");

        btn16.setText("Bài 6");

        btn17.setText("Bài 7");

        btn18.setText("Bài 8");

        btn19.setText("Bài 9");

        btn110.setText("Bài 10");

        btn111.setText("Bài 11");

        btn112.setText("Bài 12");

        btn113.setText("Bài 13");

        btn114.setText("Bài 14");

        btn115.setText("Bài 15");

        btn116.setText("Bài 16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn19, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn113, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn114, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn110, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn13, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(btn111, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btn115, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn112, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn116, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn11)
                    .addComponent(btn12)
                    .addComponent(btn13)
                    .addComponent(btn14))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn15)
                    .addComponent(btn16)
                    .addComponent(btn17)
                    .addComponent(btn18))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn19)
                    .addComponent(btn110)
                    .addComponent(btn111)
                    .addComponent(btn112))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn113)
                    .addComponent(btn114)
                    .addComponent(btn115)
                    .addComponent(btn116))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tuần 1", jPanel1);

        btn21.setText("Bài 1");

        btn22.setText("Bài 2");

        btn23.setText("Bài 3");

        btn24.setText("Bài 4");

        btn25.setText("Bài 5");

        btn26.setText("Bài 6");

        btn27.setText("Bài 7");

        btn28.setText("Bài 8");

        btn29.setText("Bài 9");

        btn210.setText("Bài 10");

        btn211.setText("Bài 11");

        btn212.setText("Bài 12");

        btn213.setText("Bài 13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn21, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btn25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                            .addComponent(btn26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn210, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btn23, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn211, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(btn27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn28, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                                .addComponent(btn212, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btn24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btn213, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(62, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn21)
                    .addComponent(btn22)
                    .addComponent(btn23)
                    .addComponent(btn24))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn25)
                    .addComponent(btn26)
                    .addComponent(btn27)
                    .addComponent(btn28))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn29)
                    .addComponent(btn210)
                    .addComponent(btn211)
                    .addComponent(btn212))
                .addGap(40, 40, 40)
                .addComponent(btn213)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Tuần 2", jPanel2);

        btn31.setText("Bài 1");

        btn32.setText("Bài 2");

        btn33.setText("Bài 3");
        btn33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn33ActionPerformed(evt);
            }
        });

        btn34.setText("Bài 4");

        btn35.setText("Bài 5");

        btn36.setText("Bài 6");

        btn37.setText("Bài 7");

        btn39.setText("Bài 9");

        btn38.setText("Bài 8");

        btn310.setText("Bài 10");

        btn311.setText("Bài 11");

        btn312.setText("Bài 12");

        btn313.setText("Bài 13");

        btn314.setText("Bài 14");

        btn315.setText("Bài 15");

        btn316.setText("Bài 16");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn35, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn313, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn32, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn310, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn36, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn314, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn315, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btn311, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn38, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
                    .addComponent(btn34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn312, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn316, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn31)
                    .addComponent(btn32)
                    .addComponent(btn33)
                    .addComponent(btn34))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn35)
                    .addComponent(btn36)
                    .addComponent(btn37)
                    .addComponent(btn38))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn39)
                    .addComponent(btn310)
                    .addComponent(btn311)
                    .addComponent(btn312))
                .addGap(40, 40, 40)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn313)
                    .addComponent(btn314)
                    .addComponent(btn315)
                    .addComponent(btn316))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Tuần 3", jPanel3);

        jLabel1.setText("QUẢN LÝ BÀI TẬP TUẦN 1, 2, 3");

        jLabel2.setText("Đào Trọng Vui: 20181075");

        jLabel3.setText("Mã lớp: 709155 ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(195, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 459, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(171, 171, 171))
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(179, 179, 179)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)))
                .addGap(34, 34, 34)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(97, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn33ActionPerformed

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
            java.util.logging.Logger.getLogger(JManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JManage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JManage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn110;
    private javax.swing.JButton btn111;
    private javax.swing.JButton btn112;
    private javax.swing.JButton btn113;
    private javax.swing.JButton btn114;
    private javax.swing.JButton btn115;
    private javax.swing.JButton btn116;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn17;
    private javax.swing.JButton btn18;
    private javax.swing.JButton btn19;
    private javax.swing.JButton btn21;
    private javax.swing.JButton btn210;
    private javax.swing.JButton btn211;
    private javax.swing.JButton btn212;
    private javax.swing.JButton btn213;
    private javax.swing.JButton btn22;
    private javax.swing.JButton btn23;
    private javax.swing.JButton btn24;
    private javax.swing.JButton btn25;
    private javax.swing.JButton btn26;
    private javax.swing.JButton btn27;
    private javax.swing.JButton btn28;
    private javax.swing.JButton btn29;
    private javax.swing.JButton btn31;
    private javax.swing.JButton btn310;
    private javax.swing.JButton btn311;
    private javax.swing.JButton btn312;
    private javax.swing.JButton btn313;
    private javax.swing.JButton btn314;
    private javax.swing.JButton btn315;
    private javax.swing.JButton btn316;
    private javax.swing.JButton btn32;
    private javax.swing.JButton btn33;
    private javax.swing.JButton btn34;
    private javax.swing.JButton btn35;
    private javax.swing.JButton btn36;
    private javax.swing.JButton btn37;
    private javax.swing.JButton btn38;
    private javax.swing.JButton btn39;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn11)) {
            btn11Click();
        } else if (e.getSource().equals(btn12)) {
            btn12Click();
        } else if (e.getSource().equals(btn13)) {
            btn13Click();
        } else if (e.getSource().equals(btn14)) {
            btn14Click();
        } else if (e.getSource().equals(btn15)) {
            btn15Click();
        } else if (e.getSource().equals(btn16)) {
            btn16Click();
        } else if (e.getSource().equals(btn17)) {
            btn17Click();
        } else if (e.getSource().equals(btn18)) {
            btn18Click();
        } else if (e.getSource().equals(btn19)) {
            btn19Click();
        } else if (e.getSource().equals(btn110)) {
            btn110Click();
        } else if (e.getSource().equals(btn111)) {
            btn111Click();
        } else if (e.getSource().equals(btn112)) {
            btn112Click();
        } else if (e.getSource().equals(btn113)) {
            btn113Click();
        } else if (e.getSource().equals(btn114)) {
            btn114Click();
        } else if (e.getSource().equals(btn115)) {
            btn115Click();
        } else if (e.getSource().equals(btn116)) {
            btn116Click();
        } else if (e.getSource().equals(btn21)) {
            btn21Click();
        } else if (e.getSource().equals(btn22)) {
            btn22Click();
        } else if (e.getSource().equals(btn23)) {
            btn23Click();
        } else if (e.getSource().equals(btn24)) {
            btn24Click();
        } else if (e.getSource().equals(btn25)) {
            btn25Click();
        } else if (e.getSource().equals(btn26)) {
            btn26Click();
        } else if (e.getSource().equals(btn27)) {
            btn27Click();
        } else if (e.getSource().equals(btn28)) {
            btn28Click();
        } else if (e.getSource().equals(btn29)) {
            btn29Click();
        } else if (e.getSource().equals(btn210)) {
            btn210Click();
        } else if (e.getSource().equals(btn211)) {
            btn211Click();
        } else if (e.getSource().equals(btn212)) {
            btn212Click();
        } else if (e.getSource().equals(btn213)) {
            btn213Click();
        } else if (e.getSource().equals(btn31)) {
            btn31Click();
        } else if (e.getSource().equals(btn32)) {
            btn32Click();
        } else if (e.getSource().equals(btn33)) {
            btn33Click();
        } else if (e.getSource().equals(btn34)) {
            btn34Click();
        } else if (e.getSource().equals(btn35)) {
            btn35Click();
        } else if (e.getSource().equals(btn36)) {
            btn36Click();
        } else if (e.getSource().equals(btn37)) {
            btn37Click();
        } else if (e.getSource().equals(btn38)) {
            btn38Click();
        } else if (e.getSource().equals(btn39)) {
            btn39Click();
        } else if (e.getSource().equals(btn310)) {
            btn310Click();
        } else if (e.getSource().equals(btn311)) {
            btn311Click();
        } else if (e.getSource().equals(btn312)) {
            btn312Click();
        } else if (e.getSource().equals(btn313)) {
            btn313Click();
        } else if (e.getSource().equals(btn314)) {
            btn314Click();
        } else if (e.getSource().equals(btn315)) {
            btn315Click();
        } else {
            btn316Click();
        }
    }

    public void btn11Click() {
        new Bai11().setVisible(true);
        this.dispose();
    }

    public void btn12Click() {
        new Bai12().setVisible(true);
        this.dispose();
    }

    public void btn13Click() {
        new Bai13().setVisible(true);
        this.dispose();
    }

    public void btn14Click() {
        new Bai14().setVisible(true);
        this.dispose();
    }

    public void btn15Click() {
        new Bai15().setVisible(true);
        this.dispose();
    }

    public void btn16Click() {
        new Bai16().setVisible(true);
        this.dispose();
    }

    public void btn17Click() {
        new Bai17().setVisible(true);
        this.dispose();
    }

    public void btn18Click() {
        new Bai18().setVisible(true);
        this.dispose();
    }

    public void btn19Click() {
        new Bai19().setVisible(true);
        this.dispose();
    }

    public void btn110Click() {
        new Bai110().setVisible(true);
        this.dispose();
    }

    public void btn111Click() {
        new Bai111().setVisible(true);
        this.dispose();
    }

    public void btn112Click() {
        new Bai112().setVisible(true);
        this.dispose();
    }

    public void btn113Click() {
        new Bai113().setVisible(true);
        this.dispose();
    }

    public void btn114Click() {
        new Bai114().setVisible(true);
        this.dispose();
    }

    public void btn115Click() {
        new Bai115().setVisible(true);
        this.dispose();
    }

    public void btn116Click() {
        new Bai116().setVisible(true);
        this.dispose();
    }

    public void btn21Click() {
        new Bai21().setVisible(true);
        this.dispose();
    }

    public void btn22Click() {
        new Bai22().setVisible(true);
        this.dispose();
    }

    public void btn23Click() {
        new Bai23().setVisible(true);
        this.dispose();
    }

    public void btn24Click() {
        new Bai24().setVisible(true);
        this.dispose();
    }

    public void btn25Click() {
        new Bai25().setVisible(true);
        this.dispose();
    }

    public void btn26Click() {
        new Bai26().setVisible(true);
        this.dispose();
    }

    public void btn27Click() {
        new Bai27().setVisible(true);
        this.dispose();
    }

    public void btn28Click() {
        new Bai28().setVisible(true);
        this.dispose();
    }

    public void btn29Click() {
        new Bai29().setVisible(true);
        this.dispose();
    }

    public void btn210Click() {
        new Bai210().setVisible(true);
        this.dispose();
    }

    public void btn211Click() {
        new Bai211().setVisible(true);
        this.dispose();
    }

    public void btn212Click() {
        new Bai212().setVisible(true);
        this.dispose();
    }

    public void btn213Click() {
        new Bai213().setVisible(true);
        this.dispose();
    }

    public void btn31Click() {
        new Bai31().setVisible(true);
        this.dispose();
    }

    public void btn32Click() {
        new Bai32().setVisible(true);
        this.dispose();
    }

    public void btn33Click() {
        new Bai33().setVisible(true);
        this.dispose();
    }

    public void btn34Click() {
        new Bai34().setVisible(true);
        this.dispose();
    }

    public void btn35Click() {
        new Bai35().setVisible(true);
        this.dispose();
    }

    public void btn36Click() {
        new Bai36().setVisible(true);
        this.dispose();
    }

    public void btn37Click() {
        new Bai37().setVisible(true);
        this.dispose();
    }

    public void btn38Click() {
        new Bai38().setVisible(true);
        this.dispose();
    }

    public void btn39Click() {
        new Bai39().setVisible(true);
        this.dispose();
    }

    public void btn310Click() {
        new Bai310().setVisible(true);
        this.dispose();
    }

    public void btn311Click() {
        new Bai311().setVisible(true);
        this.dispose();
    }

    public void btn312Click() {
        new Bai312().setVisible(true);
        this.dispose();
    }

    public void btn313Click() {
        new Bai313().setVisible(true);
        this.dispose();
    }

    public void btn314Click() {
        new Bai314().setVisible(true);
        this.dispose();
    }

    public void btn315Click() {
        new Bai315().setVisible(true);
        this.dispose();
    }

    public void btn316Click() {
        new Bai316().setVisible(true);
        this.dispose();
    }

}

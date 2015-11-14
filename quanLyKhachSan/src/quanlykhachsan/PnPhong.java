/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlykhachsan;

import Objects.Phong_Cls;
import java.awt.Color;
import java.awt.Cursor;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author naruto
 */
public class PnPhong extends javax.swing.JPanel {

    /**
     * Creates new form PnPhong
     */
    private boolean cfShow;//dung de hien thi len  neu no la true
    Phong_Cls phong;
    quanlykhachsan qlks;

    public PnPhong(boolean cfShow, Phong_Cls phong, Color c,quanlykhachsan qlks) {
        initComponents();
        this.cfShow = cfShow;
        this.phong = phong;
        this.qlks = qlks;
//        this.setBackground(c);
        if (!cfShow) {
            this.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        } else {
            //SET ANH
            if (this.phong.getTinhtrang().equals("có khách")) {
                this.setLbAnh(new ImageIcon(getClass().getResource("/Image/PEOPLE (2).png")));
            } else if (this.phong.getTinhtrang().equals("con trong")) {
                this.setLbAnh(new ImageIcon(getClass().getResource("/Image/1447369035_go-home.png")));
            } else {
                this.setLbAnh(new ImageIcon(getClass().getResource("/Image/Warning (2).png")));
            }
            //SET TEN
            this.setLbNamePhong(this.phong.getLoai() + this.phong.getSo());
        }
    }

    public JLabel getLbAnh() {
        return lbAnh;
    }

    public JLabel getLbNamePhong() {
        return lbNamePhong;
    }

    public void setLbAnh(ImageIcon icon) {
        this.lbAnh.setIcon(icon);
    }

    public void setLbNamePhong(String lbNamePhong) {
        this.lbNamePhong.setText("  " + lbNamePhong);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbAnh = new javax.swing.JLabel();
        lbNamePhong = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 102, 204)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        lbNamePhong.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lbNamePhong.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbAnh, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNamePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(lbAnh, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNamePhong, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code here:
        if (cfShow) {
            new ShowPhong(this.phong,this.qlks).show();
        }
    }//GEN-LAST:event_formMouseReleased

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        if (cfShow) {
            this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        }
    }//GEN-LAST:event_formMouseEntered


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbAnh;
    private javax.swing.JLabel lbNamePhong;
    // End of variables declaration//GEN-END:variables
}

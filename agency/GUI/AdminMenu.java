/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package travel.agency.GUI;

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author sony
 */
public class AdminMenu extends java.awt.Dialog {

    /**
     * Creates new form AdminMenu
     */
    public AdminMenu(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane(){ private Image image;
            {
                try {
                    image = ImageIO.read(new File("C:\\Users\\sony\\Desktop\\inside2.jpg"));
                } catch (IOException
                    e) {
                    e.printStackTrace();
                }
            }

            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
            }};
            ShowCostomer = new javax.swing.JButton();
            ShowFlights = new javax.swing.JButton();
            exit = new javax.swing.JButton();
            jLabel1 = new javax.swing.JLabel();
            addFlight = new javax.swing.JButton();
            reply = new javax.swing.JButton();
            addEmployee = new javax.swing.JButton();
            jButton1 = new javax.swing.JButton();

            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent evt) {
                    closeDialog(evt);
                }
            });

            ShowCostomer.setBackground(new java.awt.Color(153, 51, 255));
            ShowCostomer.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            ShowCostomer.setForeground(new java.awt.Color(255, 255, 255));
            ShowCostomer.setText("مشاهده لیست مشتری ها");
            ShowCostomer.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ShowCostomerActionPerformed(evt);
                }
            });

            ShowFlights.setBackground(new java.awt.Color(153, 51, 255));
            ShowFlights.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            ShowFlights.setForeground(new java.awt.Color(255, 255, 255));
            ShowFlights.setText("مشاهده لیست پروازها");
            ShowFlights.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ShowFlightsActionPerformed(evt);
                }
            });

            exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/agency/GUI/exit-icon.gif"))); // NOI18N
            exit.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    exitActionPerformed(evt);
                }
            });

            jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/travel/agency/GUI/arman.png"))); // NOI18N
            jLabel1.setText("jLabel1");

            addFlight.setBackground(new java.awt.Color(153, 51, 255));
            addFlight.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
            addFlight.setForeground(new java.awt.Color(255, 255, 255));
            addFlight.setText("افزودن پرواز");
            addFlight.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addFlightActionPerformed(evt);
                }
            });

            reply.setBackground(new java.awt.Color(153, 51, 255));
            reply.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            reply.setForeground(new java.awt.Color(255, 255, 255));
            reply.setText("پاسخ به پیام ها");
            reply.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    replyActionPerformed(evt);
                }
            });

            addEmployee.setBackground(new java.awt.Color(153, 51, 255));
            addEmployee.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            addEmployee.setForeground(new java.awt.Color(255, 255, 255));
            addEmployee.setText("افزودن کارمند");
            addEmployee.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addEmployeeActionPerformed(evt);
                }
            });

            jButton1.setBackground(new java.awt.Color(153, 51, 255));
            jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("بررسی درخواست ها");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
            jDesktopPane1.setLayout(jDesktopPane1Layout);
            jDesktopPane1Layout.setHorizontalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addGap(477, 477, 477)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 506, Short.MAX_VALUE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                            .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ShowFlights, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ShowCostomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addFlight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(reply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(addEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(199, 199, 199))))
            );
            jDesktopPane1Layout.setVerticalGroup(
                jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jDesktopPane1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel1)
                    .addGap(36, 36, 36)
                    .addComponent(addFlight, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(34, 34, 34)
                    .addComponent(ShowFlights, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(37, 37, 37)
                    .addComponent(ShowCostomer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(36, 36, 36)
                    .addComponent(reply, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(40, 40, 40)
                    .addComponent(addEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(43, 43, 43)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                    .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49))
            );
            jDesktopPane1.setLayer(ShowCostomer, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(ShowFlights, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(exit, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(addFlight, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(reply, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(addEmployee, javax.swing.JLayeredPane.DEFAULT_LAYER);
            jDesktopPane1.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jDesktopPane1)
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        setVisible(false);
        dispose();
        System.exit(1);
    }//GEN-LAST:event_closeDialog

    private void addFlightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFlightActionPerformed
        this.setVisible(false);
        new AddFlight(null, true).setVisible(true);
    }//GEN-LAST:event_addFlightActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        this.setVisible(false);
        new EnterFrame().setVisible(true);
    }//GEN-LAST:event_exitActionPerformed

    private void ShowCostomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowCostomerActionPerformed
        this.setVisible(false);
        new ShowCustomerList(null, true).setVisible(true);
    }//GEN-LAST:event_ShowCostomerActionPerformed

    private void ShowFlightsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowFlightsActionPerformed
        this.setVisible(false);
        new ShowFlightList(null, true).setVisible(true);
    }//GEN-LAST:event_ShowFlightsActionPerformed

    private void replyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_replyActionPerformed
        this.setVisible(false);
        new ReplyMessages(null, true).setVisible(true);
    }//GEN-LAST:event_replyActionPerformed

    private void addEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeActionPerformed
       this.setVisible(false);
       new AddStaff(null, true).setVisible(true);
    }//GEN-LAST:event_addEmployeeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new ReplyRequest(null, true).setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AdminMenu dialog = new AdminMenu(new java.awt.Frame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShowCostomer;
    private javax.swing.JButton ShowFlights;
    private javax.swing.JButton addEmployee;
    private javax.swing.JButton addFlight;
    private javax.swing.JButton exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton reply;
    // End of variables declaration//GEN-END:variables
}

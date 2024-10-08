/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import BO.MatriculaBO;
import Entidad.Matricula;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabiola Mora
 */
public class MatriculaVista extends javax.swing.JFrame {
    
    private MatriculaBO aBO = new MatriculaBO();

    /**
     * Creates new form Matricula
     */
    public MatriculaVista() {
        initComponents();
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        ID = new javax.swing.JLabel();
        IDEstudiante = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        txtIDEstudiante = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Limipiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("ESCUELA LENGUAJE BD");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ESCUELA (2).png"))); // NOI18N

        Menu.setBackground(new java.awt.Color(153, 153, 255));
        Menu.setName("MENU"); // NOI18N
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
        });

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel17.setName("MENUbtn"); // NOI18N

        jLabel18.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel18.setText("MENÚ");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel17)
                .addGap(18, 18, 18)
                .addComponent(jLabel18)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 206, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 830, 120));

        Precio.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Precio.setText("Precio");
        jPanel1.add(Precio, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 241, -1, -1));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 401, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 172, 179, 36));

        ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ID.setText("ID");
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(64, 178, -1, -1));

        IDEstudiante.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IDEstudiante.setText("ID estudiante");
        jPanel1.add(IDEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));
        jPanel1.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 235, 179, 36));
        jPanel1.add(txtIDEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 314, 179, 36));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/lapiz.png"))); // NOI18N
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        Agregar.setBackground(new java.awt.Color(204, 204, 204));
        Agregar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Agregar.setText("Agregar");
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        jPanel1.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 160, 40));

        Modificar.setBackground(new java.awt.Color(204, 204, 204));
        Modificar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel1.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 260, 160, 40));

        Eliminar.setBackground(new java.awt.Color(204, 204, 204));
        Eliminar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 160, 40));

        Limipiar.setBackground(new java.awt.Color(204, 204, 204));
        Limipiar.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Limipiar.setText("Limpiar");
        Limipiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimipiarActionPerformed(evt);
            }
        });
        jPanel1.add(Limipiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 400, 160, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void MenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMousePressed
this.setVisible(false);
            Menu v=new Menu();
            v.setVisible(true);         // TODO add your handling code here:
    }//GEN-LAST:event_MenuMousePressed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:

        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID");
        }
        if (txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el precio");
        }
        if (txtIDEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID del estudiante");
        } else {

            Matricula a = new Matricula();

            a.setID_MATRICULA(Integer.parseInt(txtID.getText()));
            a.setPRECIO_MATRICULA(Integer.parseInt(txtPrecio.getText()));
            a.setID_ESTUDIANTE(Integer.parseInt(txtIDEstudiante.getText()));

            String mensaje = aBO.agregarMatricula(a);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:

               if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID");
        }
        if (txtPrecio.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el precio");
        }
        if (txtIDEstudiante.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID del estudiante");
        } else {

            Matricula a = new Matricula();

            a.setID_MATRICULA(Integer.parseInt(txtID.getText()));
            a.setPRECIO_MATRICULA(Integer.parseInt(txtPrecio.getText()));
            a.setID_ESTUDIANTE(Integer.parseInt(txtIDEstudiante.getText()));

            String mensaje = aBO.ModificarMatricula(a);
        }

    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:

        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID");
        } else {

            String mensaje = aBO.eliminarMatricula(Integer.parseInt(txtID.getText()));
            System.out.println(mensaje);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void LimipiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimipiarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtPrecio.setText("");
        txtIDEstudiante.setText("");
    }//GEN-LAST:event_LimipiarActionPerformed

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
            java.util.logging.Logger.getLogger(MatriculaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IDEstudiante;
    private javax.swing.JButton Limipiar;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDEstudiante;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}

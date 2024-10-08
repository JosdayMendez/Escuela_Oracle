/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import BO.MadreBO;
import Entidad.Madre;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabiola Mora
 */
public class MadreVista extends javax.swing.JFrame {
    
    private MadreBO aBO = new MadreBO();
    /**
     * Creates new form Madre
     */
    public MadreVista() {
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
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        Nombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        Apellido1 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        Apellido2 = new javax.swing.JLabel();
        txtApellido2 = new javax.swing.JTextField();
        Telefono = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        Correo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        IDProvincia = new javax.swing.JLabel();
        txtIDProvincia = new javax.swing.JTextField();
        Agregar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        Limipiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("ESCUELA LENGUAJE BD");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ESCUELA (2).png"))); // NOI18N

        Menu.setBackground(new java.awt.Color(153, 153, 255));
        Menu.setName("MENU"); // NOI18N
        Menu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MenuMousePressed(evt);
            }
        });

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        jLabel19.setName("MENUbtn"); // NOI18N

        jLabel20.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel20.setText("MENÚ");

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(jLabel20)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20))
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel4)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 204, Short.MAX_VALUE)
                .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel3)
                .addGap(45, 45, 45))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 830, 120));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tutor.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        ID.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        ID.setText("ID");
        jPanel1.add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 179, 36));

        Nombre.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Nombre.setText("Nombre");
        jPanel1.add(Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, -1, -1));

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 179, 36));

        Apellido1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Apellido1.setText("Apellido 1");
        jPanel1.add(Apellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, -1, -1));

        txtApellido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido1ActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 179, 36));

        Apellido2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Apellido2.setText("Apellido 2");
        jPanel1.add(Apellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        txtApellido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellido2ActionPerformed(evt);
            }
        });
        jPanel1.add(txtApellido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 179, 36));

        Telefono.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Telefono.setText("Telefono");
        jPanel1.add(Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 320, 179, 36));

        Correo.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Correo.setText("Correo");
        jPanel1.add(Correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 179, 36));

        IDProvincia.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        IDProvincia.setText("ID provincia");
        jPanel1.add(IDProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, -1, -1));

        txtIDProvincia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDProvinciaActionPerformed(evt);
            }
        });
        jPanel1.add(txtIDProvincia, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 179, 36));

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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, Short.MAX_VALUE)
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

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido1ActionPerformed

    private void txtApellido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellido2ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtIDProvinciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDProvinciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDProvinciaActionPerformed

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
        if (txtApellido1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue primer apellido");
        }
        if (txtApellido2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el segundo apellido");
        }
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el correo");
        }
        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el telefono");
        }
        if (txtIDProvincia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID de la provincia");
        }
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el nombre de la madre");
        }else {

            Madre a = new Madre();

            a.setID_MADRE(Integer.parseInt(txtID.getText()));
            a.setID_PROVINCIA(Integer.parseInt(txtIDProvincia.getText()));
            a.setNOMBRE_MADRE(txtNombre.getText());
            a.setAPELLIDO_MADRE1(txtApellido1.getText());
            a.setAPELLIDO_MADRE2(txtApellido2.getText());
            a.setTELEFONO_CONTACTO(txtTelefono.getText());
            a.setCORREO_MADRE(txtCorreo.getText());

            String mensaje = aBO.agregarMadre(a);
        }
    }//GEN-LAST:event_AgregarActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed
        // TODO add your handling code here:

               if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID");
        }
        if (txtApellido1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue primer apellido");
        }
        if (txtApellido2.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el segundo apellido");
        }
        if (txtCorreo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el correo");
        }
        if (txtTelefono.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el telefono");
        }
        if (txtIDProvincia.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID de la provincia");
        }
        if (txtNombre.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el nombre de la madre");
        }else {

            Madre a = new Madre();

            a.setID_MADRE(Integer.parseInt(txtID.getText()));
            a.setID_PROVINCIA(Integer.parseInt(txtIDProvincia.getText()));
            a.setNOMBRE_MADRE(txtNombre.getText());
            a.setAPELLIDO_MADRE1(txtApellido1.getText());
            a.setAPELLIDO_MADRE2(txtApellido2.getText());
            a.setTELEFONO_CONTACTO(txtTelefono.getText());
            a.setCORREO_MADRE(txtCorreo.getText());

            String mensaje = aBO.ModificarMadre(a);
        }
    }//GEN-LAST:event_ModificarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        // TODO add your handling code here:

        if (txtID.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Agregue el ID");
        } else {

            String mensaje = aBO.eliminarMadre(Integer.parseInt(txtID.getText()));
            System.out.println(mensaje);
        }
    }//GEN-LAST:event_EliminarActionPerformed

    private void LimipiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimipiarActionPerformed
        // TODO add your handling code here:
        txtID.setText("");
        txtApellido1.setText("");
        txtApellido2.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtIDProvincia.setText("");
        txtNombre.setText("");
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
            java.util.logging.Logger.getLogger(MadreVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MadreVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MadreVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MadreVista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MadreVista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel Apellido1;
    private javax.swing.JLabel Apellido2;
    private javax.swing.JLabel Correo;
    private javax.swing.JButton Eliminar;
    private javax.swing.JLabel ID;
    private javax.swing.JLabel IDProvincia;
    private javax.swing.JButton Limipiar;
    private javax.swing.JPanel Menu;
    private javax.swing.JButton Modificar;
    private javax.swing.JLabel Nombre;
    private javax.swing.JLabel Telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIDProvincia;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}

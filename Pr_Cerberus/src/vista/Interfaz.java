package vista;

import controlador.ControladorProducto;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtFotoUsuario = new javax.swing.JTextField();
        txtBuscarID = new javax.swing.JTextField();
        txtNombreUsuario = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAreaDeTrabajo = new javax.swing.JTextField();
        BtnLimpiar = new javax.swing.JButton();
        BtnActualizar = new javax.swing.JButton();
        BtnBorrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTablaUsuarios = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        BtnAgregar = new javax.swing.JButton();
        BtnBuscar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtDocumentoUsuario = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jButton1.setText("jButton1");

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Lista de Usuarios");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 200, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("URL Foto usuario:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 150, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Nombre de Usuario:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 170, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Buscar por Documento:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 210, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 140, 30));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Correo Electrónico:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 170, 30));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Area de Trabajo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 160, 30));

        txtFotoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtFotoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFotoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtFotoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, -1));

        txtBuscarID.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtBuscarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarIDActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarID, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, 230, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 200, -1));

        txtTelefono.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 180, 200, -1));

        txtEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 200, -1));

        txtAreaDeTrabajo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtAreaDeTrabajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAreaDeTrabajoActionPerformed(evt);
            }
        });
        getContentPane().add(txtAreaDeTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 200, -1));

        BtnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        BtnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnLimpiar.setText("Limpiar");
        BtnLimpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BtnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 110, 40));

        BtnActualizar.setBackground(new java.awt.Color(0, 0, 255));
        BtnActualizar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnActualizar.setText("Actualizar");
        BtnActualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BtnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 160, 110, 40));

        BtnBorrar.setBackground(new java.awt.Color(153, 0, 0));
        BtnBorrar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnBorrar.setText("Borrar");
        BtnBorrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BtnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBorrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 210, 110, 40));

        tblTablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblTablaUsuarios);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 790, 120));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 153));
        jLabel8.setText("Control de Usuarios");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 230, 60));

        BtnAgregar.setBackground(new java.awt.Color(51, 153, 0));
        BtnAgregar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnAgregar.setText("Agregar");
        BtnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BtnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 110, 40));

        BtnBuscar.setBackground(new java.awt.Color(153, 0, 153));
        BtnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        BtnBuscar.setText("Buscar");
        BtnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        BtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 110, 40));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Documento Usuario:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 170, 30));

        txtDocumentoUsuario.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txtDocumentoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocumentoUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtDocumentoUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtFotoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFotoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFotoUsuarioActionPerformed

    private void txtBuscarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarIDActionPerformed

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtAreaDeTrabajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAreaDeTrabajoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAreaDeTrabajoActionPerformed

    private void BtnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnLimpiarActionPerformed

    private void BtnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnActualizarActionPerformed

    private void BtnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBorrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBorrarActionPerformed

    private void BtnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnAgregarActionPerformed

    private void BtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnBuscarActionPerformed

    private void txtDocumentoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocumentoUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocumentoUsuarioActionPerformed

    public static void main(String args[]) {
        /*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });*/
        Interfaz vista = new Interfaz();
        ControladorProducto controlador = new ControladorProducto(vista);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnActualizar;
    private javax.swing.JButton BtnAgregar;
    private javax.swing.JButton BtnBorrar;
    private javax.swing.JButton BtnBuscar;
    private javax.swing.JButton BtnLimpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTablaUsuarios;
    private javax.swing.JTextField txtAreaDeTrabajo;
    private javax.swing.JTextField txtBuscarID;
    private javax.swing.JTextField txtDocumentoUsuario;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFotoUsuario;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnActualizar() {
        return BtnActualizar;
    }

    public JButton getBtnAgregar() {
        return BtnAgregar;
    }

    public JButton getBtnBorrar() {
        return BtnBorrar;
    }

    public JButton getBtnBuscar() {
        return BtnBuscar;
    }

    public JButton getBtnLimpiar() {
        return BtnLimpiar;
    }

    public JTable getTblTablaUsuarios() {
        return tblTablaUsuarios;
    }

    public JTextField getTxtAreaDeTrabajo() {
        return txtAreaDeTrabajo;
    }

    public JTextField getTxtDocumentoUsuario() {
        return txtDocumentoUsuario;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtFotoUsuario() {
        return txtFotoUsuario;
    }

    public JTextField getTxtNombreUsuario() {
        return txtNombreUsuario;
    }

    public JTextField getTxtTelefono() {
        return txtTelefono;
    }

    public JTextField getTxtBuscarID() {
        return txtBuscarID;
    }

    //Agregar los Getters
    public Object getTxtBuscarDocumento() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}

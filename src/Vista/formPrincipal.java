/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Modelo.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Tete
 */
public class formPrincipal extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn;
    Statement st;
    ResultSet rs;
    DefaultTableModel tablaModel;
    int id;

    public formPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        showContent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField5 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        createBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        exitBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        tipoTxt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        modeloTxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cantTxt = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        precioTxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        descrTxt = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        estantTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        almacenTxt = new javax.swing.JTextField();

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo", "Modelo", "Cantidad", "Precio", "Desc.", "Estanteria", "Almacen"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMostrarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaMostrar);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 495, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                .addContainerGap())
        );

        createBtn.setText("Crear");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        deleteBtn.setText("Borrar");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        updateBtn.setText("Modificar");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        exitBtn.setText("Salir");
        exitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Tipo:");

        tipoTxt.setEditable(false);
        tipoTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTxtActionPerformed(evt);
            }
        });

        jLabel4.setText("Modelo:");

        modeloTxt.setEditable(false);

        jLabel5.setText("Cantidad: ");

        cantTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantTxtActionPerformed(evt);
            }
        });

        jLabel6.setText("Precio:");

        jLabel7.setText("Descripcion:");

        jLabel8.setText("€");

        descrTxt.setColumns(20);
        descrTxt.setRows(5);
        jScrollPane2.setViewportView(descrTxt);

        jLabel9.setText("Estant.");

        estantTxt.setEditable(false);
        estantTxt.setText(" ");

        jLabel2.setText("Almacen");

        almacenTxt.setEditable(false);
        almacenTxt.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(createBtn)
                                .addGap(18, 18, 18)
                                .addComponent(deleteBtn))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel9))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modeloTxt)
                                        .addComponent(estantTxt)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(almacenTxt))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(updateBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(exitBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(precioTxt))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(cantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addComponent(tipoTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(modeloTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(precioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(estantTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(almacenTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createBtn)
                    .addComponent(deleteBtn)
                    .addComponent(updateBtn)
                    .addComponent(exitBtn))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        formCrear FC = new formCrear();
        FC.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_createBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        eliminar();
        showContent();
        nuevo();
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void cantTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantTxtActionPerformed

    private void exitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitBtnActionPerformed

    private void tablaMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMostrarMouseClicked
        tableClick();
    }//GEN-LAST:event_tablaMostrarMouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        modificar();
        showContent();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void tipoTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTxtActionPerformed

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
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formPrincipal().setVisible(true);
            }
        });
    }
    
    void tableClick(){
        int fila = tablaMostrar.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Dato no seleccionado");
        } else {
            String tipo = (String) tablaMostrar.getValueAt(fila, 0);
            String modelo = (String) tablaMostrar.getValueAt(fila, 1);
            int cantidad = Integer.parseInt((String) tablaMostrar.getValueAt(fila, 2).toString());
            float precio = Float.parseFloat((String) tablaMostrar.getValueAt(fila, 3).toString());
            String descripcion = (String) tablaMostrar.getValueAt(fila, 4);
            String estanteria=(String)tablaMostrar.getValueAt(fila, 5);
            String almacen=(String)tablaMostrar.getValueAt(fila, 6);
            
            tipoTxt.setText("" + tipo);
            modeloTxt.setText("" + modelo);
            cantTxt.setText("" + cantidad);
            precioTxt.setText("" + precio);
            descrTxt.setText("" + descripcion);
            estantTxt.setText("" + estanteria);
            //Faltaría añadir un txt para estantería y almacén
            almacenTxt.setText(""+almacen);
        }
    }
    
    void showContent() {

        String SelSql = "SELECT * FROM piezas";

        try {

            cn = con.getConnection();
            st = cn.createStatement();
            rs = st.executeQuery(SelSql);
            Object[] pieza = new Object[8];
            tablaModel = (DefaultTableModel) tablaMostrar.getModel();

            while (rs.next()) {
                pieza[0] = rs.getString("Tipo");
                pieza[1] = rs.getString("Modelo");
                pieza[2] = rs.getInt("Cantidad");
                pieza[3] = rs.getInt("Precio");
                pieza[4] = rs.getString("Descripcion");
                pieza[5] = rs.getString("Nombre_estanteria");
                pieza[6]=rs.getString("Almacen");
                tablaModel.addRow(pieza);

                tablaMostrar.setModel(tablaModel);
            }
        } catch (Exception e) {
            System.out.println("Error e: " + e);
        }
    }
     
    void modificar(){
        String tipo=tipoTxt.getText();
        String modelo=modeloTxt.getText();
        String cantidad=cantTxt.getText();
        String precio=precioTxt.getText();
        String desc=descrTxt.getText();
        
        String sql="Update piezas set Cantidad= '" +cantidad+ 
                "', Precio='" +precio+ "', Descripcion='" +desc+
                "' where Tipo=" +"'"+tipo+ "'"+" and Modelo="+modelo;
        
        if(cantidad.equals("")||precio.equals("")||desc.equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar los datos");
        }else{
            
            System.out.println("dentro del else");
            try{
                System.out.println("dentro del try");
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                System.out.println(sql);
                JOptionPane.showMessageDialog(null,"Pieza seleccionada modificada con éxito");
                
            }catch(Exception e){
                System.out.println("Error en update: "+e);
            }
        }
        limpiarTabla();
    }

    void limpiarTabla() {
        System.out.println("estoy en limpiar");
        for (int i = 0; i < tablaMostrar.getRowCount(); i++) {
            tablaModel.removeRow(i);
            i--;
        }
    }
    
    void eliminar() {
        int filaseleccionado = tablaMostrar.getSelectedRow();
        if (filaseleccionado == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar fila");
        } else {
            String sql = "delete from piezas where Tipo=" +"'"+ tipoTxt.getText()+"'"+ " and Modelo="+Integer.parseInt(modeloTxt.getText());
            try {
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null, "Pieza borrada con éxito");
               limpiarTabla();
            } catch (Exception e) {
                System.err.println("Error en eliminar: "+e);
            }
        }

    }

    void nuevo() {
        tipoTxt.setText("");
        modeloTxt.setText("");
        cantTxt.setText("");
        precioTxt.setText("");
        descrTxt.setText("");
        estantTxt.setText("");
        almacenTxt.setText("");
        modeloTxt.requestFocus();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField almacenTxt;
    private javax.swing.JTextField cantTxt;
    private javax.swing.JButton createBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JTextArea descrTxt;
    private javax.swing.JTextField estantTxt;
    private javax.swing.JButton exitBtn;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField modeloTxt;
    private javax.swing.JTextField precioTxt;
    private javax.swing.JTable tablaMostrar;
    private javax.swing.JTextField tipoTxt;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}

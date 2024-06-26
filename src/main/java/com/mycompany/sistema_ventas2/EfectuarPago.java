/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.mycompany.sistema_ventas2;

import javax.swing.JOptionPane;

/**
 *
 * @author xergg
 */
public class EfectuarPago extends javax.swing.JDialog {

    private Factura factura;
    
    public EfectuarPago(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.factura = factura;
        initComponents();
        mostrarDetallesPedido();
        this.setLocationRelativeTo(parent);
    }

    private void mostrarDetallesPedido(){
         String detalles = "Cliente:\n" +
                          "Nombre: " + factura.getCliente().getNombre() + "\n" +
                          "DNI: " + factura.getCliente().getDni() + "\n" +
                          "Teléfono: " + factura.getCliente().getTelefono() + "\n" +
                          "Dirección: " + factura.getCliente().getDireccion() + "\n\n" +
                          "Número de Pedido: " + factura.getPedido().getCodigo() + "\n\n" +
                          "Productos:\n";

        for (Producto producto : factura.getPedido().getListaProductos()) {
            detalles += producto.getNombre() + " - Cantidad: " + producto.getCantidad() +
                        " - Precio: " + producto.getPrecio() + "\n";
        }

        detalles += "\nTotal sin IGV: " + String.format("%.2f", factura.getTotalSinIGV()) + "\n" +
                    "Total con IGV: " + String.format("%.2f", factura.getTotalConIGV());

        txapago.setText(detalles);
    }
 
    private void realizarPago() {
        JOptionPane.showMessageDialog(this, "Pago efectuado correctamente", "Pago", JOptionPane.INFORMATION_MESSAGE);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel1 = new javax.swing.JPanel();
        btnpagar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txapago = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Punto de Pago");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnpagar.setText("PAGAR");
        btnpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpagarActionPerformed(evt);
            }
        });
        jPanel1.add(btnpagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 90, 50));

        btnimprimir.setText("IMPRIMIR");
        jPanel1.add(btnimprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 100, 50));

        txapago.setColumns(20);
        txapago.setRows(5);
        jScrollPane2.setViewportView(txapago);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 440, 200));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpagarActionPerformed
       realizarPago();
    }//GEN-LAST:event_btnpagarActionPerformed

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
            java.util.logging.Logger.getLogger(EfectuarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EfectuarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EfectuarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EfectuarPago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EfectuarPago dialog = new EfectuarPago(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnpagar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea txapago;
    // End of variables declaration//GEN-END:variables
}

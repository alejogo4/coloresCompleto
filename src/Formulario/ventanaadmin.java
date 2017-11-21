/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Principal.java
 *
 * Created on 05-abr-2013, 20:15:45
 */
package Formulario;

import views.Factura;
import views.ConsultasClientes;
import views.ConsultasFacturas;
import views.ConsultasProductos;
import views.IngresoProductos;
import views.usuarios;
import views.IngresoCliente;
import claseConectar.conectar;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author Administrador
 */
public class ventanaadmin extends javax.swing.JFrame {

    /** Creates new form Principal */
    public ventanaadmin() {
        initComponents();
        this.setLocation(200, 50);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpescritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_clientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblusu = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_inventario = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_pendiente = new javax.swing.JLabel();
        btn_descuentos = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_factura = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Ventas");

        jdpescritorio.setBackground(new java.awt.Color(25, 153, 153));

        jPanel1.setBackground(new java.awt.Color(41, 128, 185));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logo_small.png"))); // NOI18N

        btn_clientes.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_clientes.setForeground(new java.awt.Color(255, 255, 255));
        btn_clientes.setText("CLIENTES");
        btn_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_clientesMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Usuario Conectado:");

        lblusu.setBackground(new java.awt.Color(255, 255, 255));
        lblusu.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        lblusu.setForeground(new java.awt.Color(255, 255, 255));
        lblusu.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblusu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/clientes.png"))); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/inventario.png"))); // NOI18N

        btn_inventario.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_inventario.setForeground(new java.awt.Color(255, 255, 255));
        btn_inventario.setText("INVENTARIO");
        btn_inventario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_inventarioMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/pendiente.png"))); // NOI18N

        btn_pendiente.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_pendiente.setForeground(new java.awt.Color(255, 255, 255));
        btn_pendiente.setText("CONSULTAS");
        btn_pendiente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pendienteMouseClicked(evt);
            }
        });

        btn_descuentos.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_descuentos.setForeground(new java.awt.Color(255, 255, 255));
        btn_descuentos.setText("DESCUENTOS");
        btn_descuentos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_descuentosMouseClicked(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/promocion.png"))); // NOI18N

        btn_factura.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btn_factura.setForeground(new java.awt.Color(255, 255, 255));
        btn_factura.setText("FACTURAS");
        btn_factura.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_facturaMouseClicked(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/facturas.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_pendiente)
                            .addComponent(btn_inventario)
                            .addComponent(btn_descuentos)
                            .addComponent(btn_factura))
                        .addGap(59, 59, 59))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_clientes)
                        .addGap(79, 79, 79))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblusu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblusu, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(btn_clientes))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(btn_inventario))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(btn_pendiente))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10)
                    .addComponent(btn_descuentos))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(btn_factura))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario (1).png"))); // NOI18N
        jMenu1.setText("Usuario");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuItem1.setText("Cerrar Sesion");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Salir");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/analitica.png"))); // NOI18N
        jMenu5.setText("Reportes");

        jMenuItem6.setText("Clientes");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6);

        jMenuItem12.setText("Productos");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem12);

        jMenuItem13.setText("Facturas");
        jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem13ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem13);

        jMenuBar1.add(jMenu5);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/administracion.png"))); // NOI18N
        jMenu6.setText("Administrar Usuarios");

        jMenuItem15.setText("Nuevo Usuario");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem15);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jdpescritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 820, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdpescritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 549, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
// TODO add your handling code here:
    
}//GEN-LAST:event_jMenu1ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
// TODO add your handling code here:
     IngresoSistema principal= new IngresoSistema();
    principal.setVisible(true);
    principal.pack();
    this.setVisible(false);
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
// TODO add your handling code here:
    this.dispose();
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
// TODO add your handling code here:
    
        try {
            conectar cc= new conectar();
            
            JasperReport reportes=JasperCompileManager.compileReport("reportesClientes.jrxml");
            JasperPrint print=JasperFillManager.fillReport(reportes, null,cc.conexion());
            JasperViewer.viewReport(print);
            
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
    
    
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
// TODO add your handling code here:
           try {
            conectar cc= new conectar();
            
            JasperReport reportes=JasperCompileManager.compileReport("reportesProductos.jrxml");
            JasperPrint print=JasperFillManager.fillReport(reportes, null,cc.conexion());
            JasperViewer.viewReport(print);
            
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
}//GEN-LAST:event_jMenuItem12ActionPerformed

private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
// TODO add your handling code here:
    try {
            conectar cc= new conectar();
            
            JasperReport reportes=JasperCompileManager.compileReport("reportesFacturas.jrxml");
            JasperPrint print=JasperFillManager.fillReport(reportes, null,cc.conexion());
            JasperViewer.viewReport(print);
            
        } catch (Exception e) {
            System.out.printf(e.getMessage());
        }
}//GEN-LAST:event_jMenuItem13ActionPerformed

private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
  usuarios usu= new usuarios();
    jdpescritorio.add(usu);
    usu.show();// TODO add your handling code here:
}//GEN-LAST:event_jMenuItem15ActionPerformed

    private void btn_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_clientesMouseClicked
        // TODO add your handling code here:
        IngresoCliente cli= new IngresoCliente();
        jdpescritorio.add(cli);
        cli.show();
    }//GEN-LAST:event_btn_clientesMouseClicked

    private void btn_inventarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_inventarioMouseClicked
        // TODO add your handling code here:
        IngresoProductos ip= new IngresoProductos();
        jdpescritorio.add(ip);
        ip.show();
    }//GEN-LAST:event_btn_inventarioMouseClicked

    private void btn_pendienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pendienteMouseClicked
        // TODO add your handling code here:
        ConsultasClientes clientes= new ConsultasClientes();
        jdpescritorio.add(clientes);
        clientes.show();
        
        ConsultasProductos productos= new ConsultasProductos();
        productos.setLocation(0, 300);
        jdpescritorio.add(productos);
        productos.show();
        
        ConsultasFacturas Facturas= new  ConsultasFacturas();
        Facturas.setLocation(300, 300);
        jdpescritorio.add(Facturas);
        Facturas.show();
    }//GEN-LAST:event_btn_pendienteMouseClicked

    private void btn_facturaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_facturaMouseClicked
    Factura fac= new Factura();
    jdpescritorio.add(fac);
    fac.show();
    // TODO add your handling code here:
    }//GEN-LAST:event_btn_facturaMouseClicked

    private void btn_descuentosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_descuentosMouseClicked
     //Promo pro = new Promo();
     //jdpescritorio.add(pro);
     //pro.show();
    }//GEN-LAST:event_btn_descuentosMouseClicked

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
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaadmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new ventanaadmin().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_clientes;
    private javax.swing.JLabel btn_descuentos;
    private javax.swing.JLabel btn_factura;
    private javax.swing.JLabel btn_inventario;
    private javax.swing.JLabel btn_pendiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JDesktopPane jdpescritorio;
    public static javax.swing.JLabel lblusu;
    // End of variables declaration//GEN-END:variables
}

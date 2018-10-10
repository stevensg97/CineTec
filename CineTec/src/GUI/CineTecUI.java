/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Font;
import java.awt.event.KeyEvent;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

/**
 *
 * @author Steven
 */
public class CineTecUI extends javax.swing.JFrame {

    /**
     * Creates new form CineTecUI
     */
    public CineTecUI() {
        initComponents();
        JTableHeader header = jTable1.getTableHeader();
        header.setFont(new Font("Tahome", Font.BOLD, 18));
        txt_Año1.setEnabled(false);
        txt_Año2.setEnabled(false);
        chk_Nombre.setSelected(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txt_buscador = new javax.swing.JTextField();
        lbl_buscar = new javax.swing.JLabel();
        txt_Año1 = new javax.swing.JTextField();
        txt_Año2 = new javax.swing.JTextField();
        chk_Nombre = new javax.swing.JRadioButton();
        chk_Franquicia = new javax.swing.JRadioButton();
        chk_Productora = new javax.swing.JRadioButton();
        chk_InfoProductora = new javax.swing.JRadioButton();
        chk_Años = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1920, 1080));
        setPreferredSize(new java.awt.Dimension(1920, 1080));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Género", "Director", "Franquicia", "País", "Año", "Duración (Minutos)", "Productora", "Actores"
            }
        ));
        jTable1.setMinimumSize(new java.awt.Dimension(1800, 700));
        jTable1.setRowHeight(35);
        jTable1.setRowSelectionAllowed(false);
        jScrollPane2.setViewportView(jTable1);

        txt_buscador.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txt_buscador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_buscadorActionPerformed(evt);
            }
        });
        txt_buscador.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txt_buscadorKeyPressed(evt);
            }
        });

        lbl_buscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbl_buscar.setText("Buscar por:");

        chk_Nombre.setText("Nombre");
        chk_Nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_NombreMouseClicked(evt);
            }
        });

        chk_Franquicia.setText("Franquicia");
        chk_Franquicia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_FranquiciaMouseClicked(evt);
            }
        });

        chk_Productora.setText("Productora");
        chk_Productora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_ProductoraMouseClicked(evt);
            }
        });

        chk_InfoProductora.setText("Información de Productora");
        chk_InfoProductora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_InfoProductoraMouseClicked(evt);
            }
        });

        chk_Años.setText("Años:");
        chk_Años.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chk_AñosMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_buscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(chk_Nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_Franquicia)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_Productora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_InfoProductora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chk_Años)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Año1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_Año2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_buscador))
                .addContainerGap(88, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_buscar)
                    .addComponent(txt_buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Año1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_Año2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(chk_Años))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(chk_Nombre)
                        .addComponent(chk_Franquicia)
                        .addComponent(chk_Productora)
                        .addComponent(chk_InfoProductora)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_buscadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_buscadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_buscadorActionPerformed

    private void txt_buscadorKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_buscadorKeyPressed
        if(evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (chk_Nombre.isSelected()) {
                Conexion.CineTecMain.peliculaPorTitulo(txt_buscador.getText());
            }
            else if (chk_Franquicia.isSelected()) {
                Conexion.CineTecMain.peliculaPorFranquicia(txt_buscador.getText());
            }
            else if (chk_Productora.isSelected()) {
                Conexion.CineTecMain.peliculasPorProductora(txt_buscador.getText());
            }
            else if (chk_InfoProductora.isSelected()) {
                Conexion.CineTecMain.infoPeliculasPorProductora(txt_buscador.getText());
            }
            else if(chk_Años.isSelected()){
                Conexion.CineTecMain.peliculasPorAños(txt_Año1.getText(), txt_Año2.getText());
            }
        }
    }//GEN-LAST:event_txt_buscadorKeyPressed

    private void chk_NombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_NombreMouseClicked
        chk_Franquicia.setSelected(false);
        chk_Productora.setSelected(false);
        chk_InfoProductora.setSelected(false);
        chk_Años.setSelected(false);
        txt_Año1.setEnabled(false);
        txt_Año2.setEnabled(false);
    }//GEN-LAST:event_chk_NombreMouseClicked

    private void chk_FranquiciaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_FranquiciaMouseClicked
        chk_Nombre.setSelected(false);
        chk_Productora.setSelected(false);
        chk_InfoProductora.setSelected(false);
        chk_Años.setSelected(false);
        txt_Año1.setEnabled(false);
        txt_Año2.setEnabled(false);
    }//GEN-LAST:event_chk_FranquiciaMouseClicked

    private void chk_ProductoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_ProductoraMouseClicked
        chk_Franquicia.setSelected(false);
        chk_Nombre.setSelected(false);
        chk_InfoProductora.setSelected(false);
        chk_Años.setSelected(false);
        txt_Año1.setEnabled(false);
        txt_Año2.setEnabled(false);
    }//GEN-LAST:event_chk_ProductoraMouseClicked

    private void chk_InfoProductoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_InfoProductoraMouseClicked
        chk_Franquicia.setSelected(false);
        chk_Productora.setSelected(false);
        chk_Nombre.setSelected(false);
        chk_Años.setSelected(false);
        txt_Año1.setEnabled(false);
        txt_Año2.setEnabled(false);
    }//GEN-LAST:event_chk_InfoProductoraMouseClicked

    private void chk_AñosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chk_AñosMouseClicked
        chk_Franquicia.setSelected(false);
        chk_Productora.setSelected(false);
        chk_InfoProductora.setSelected(false);
        chk_Nombre.setSelected(false);
        txt_Año1.setEnabled(true);
        txt_Año2.setEnabled(true);
    }//GEN-LAST:event_chk_AñosMouseClicked

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
            java.util.logging.Logger.getLogger(CineTecUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CineTecUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CineTecUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CineTecUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CineTecUI().setVisible(true);
            }
        });
    }
    
    //Función para limpiar la tabla
    public void cleanTable(){
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JRadioButton chk_Años;
    public static javax.swing.JRadioButton chk_Franquicia;
    public static javax.swing.JRadioButton chk_InfoProductora;
    public static javax.swing.JRadioButton chk_Nombre;
    public static javax.swing.JRadioButton chk_Productora;
    private javax.swing.JScrollPane jScrollPane2;
    public static javax.swing.JTable jTable1;
    private javax.swing.JLabel lbl_buscar;
    public static javax.swing.JTextField txt_Año1;
    public static javax.swing.JTextField txt_Año2;
    public static javax.swing.JTextField txt_buscador;
    // End of variables declaration//GEN-END:variables
}
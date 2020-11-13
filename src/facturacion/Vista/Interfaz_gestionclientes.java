
package facturacion.Vista;

import facturacion.Controlador.control_cliente;
import facturacion.Controlador.control_existencias;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;


public class Interfaz_gestionclientes extends javax.swing.JInternalFrame {

   
    private Object[][] datostabla;    
    control_existencias ctr = new control_existencias();
    public Interfaz_gestionclientes() {
        initComponents();
        mostrar_tabla();
        
    }
              
    
    @SuppressWarnings("empty-statement")
     public void mostrar_tabla(){
         
//        jTable1.setFont(jTable1.getFont().deriveFont( Font.BOLD));
//        jTable1.setBackground(Color.white);
        control_cliente control = new control_cliente("Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","telefono","");       
        String[] columnas = {"Documento","Tipo de documento","Nombres","Apellidos","Direccion","Ciudad","Telefono","ID"};
        
        datostabla = control.consulta_clientes();
        DefaultTableModel datos = new DefaultTableModel(datostabla,columnas){
    public boolean isCellEditable(int rowIndex,int columnIndex){return false;}
};
        jTable1.setModel(datos);
        //ocultar ultima columna
        jTable1.getColumnModel().getColumn(7).setMaxWidth(0);
        jTable1.getColumnModel().getColumn(7).setMinWidth(0);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(0);

} 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 195, 239));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestionar clientes");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable1.setGridColor(java.awt.Color.white);
        jScrollPane1.setViewportView(jTable1);

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setBackground(java.awt.Color.white);
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/eliminar.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(java.awt.Color.white);
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/actualizar.png"))); // NOI18N
        jButton4.setText("Actulizar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(jTable1.getSelectedRow()>=1){
         if(JOptionPane.showConfirmDialog(null, "Realmente desea eliminar el registro?", "Eliminar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
        int a1 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.removeRow(jTable1.getSelectedRow());
        boolean estado = ctr.Delete_Clie_Usu("id_cliente","cliente",String.valueOf(a1));

        if (estado) {
            JOptionPane.showMessageDialog(null, "Se elimino el cliente con exito");
        } else {
            JOptionPane.showMessageDialog(null, "A ocurrido un error al intentar eliminar el cliente");
        }
        }
        } 
        else{
        JOptionPane.showMessageDialog(null, "No se a seleccionado ningun registro");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        if(jTable1.getSelectedRow()>=0){
         if(JOptionPane.showConfirmDialog(null, "Realmente desea modificar este Cliente?", "Actualizar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
        int a1 = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 7).toString());
       Interfaz_Update_Clientes_id act = new Interfaz_Update_Clientes_id(String.valueOf(a1));
        act.show();
        }
        } 
        else{
        JOptionPane.showMessageDialog(null, "No se a seleccionado ningun Usuario");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
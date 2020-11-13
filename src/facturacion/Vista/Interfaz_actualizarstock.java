
package facturacion.Vista;

import facturacion.Controlador.control_existencias;
import javax.swing.JOptionPane;


public class Interfaz_actualizarstock extends javax.swing.JInternalFrame {
     control_existencias ctrl = new control_existencias();
     private String id_articulo;
    public Interfaz_actualizarstock() {
        initComponents();
        nuevo_stock.setEnabled(false);
        desc_articulo.setEnabled(false);
        Object[] idarticulo = ctrl.combox("articulo","ref_articulo");
        combo_articulo.removeAllItems();
        for(int i=0;i<idarticulo.length;i++)
        {
        combo_articulo.addItem(idarticulo[i]);
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        combo_articulo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        desc_articulo = new javax.swing.JTextField();
        nuevo_stock = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        registrar_nuevo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(157, 195, 239));
        setTitle("Actualizar stock");

        combo_articulo.setBackground(java.awt.Color.white);
        combo_articulo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_articuloActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Id_articulo");

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Descricion articulo");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Stock actual");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Registr nuevo stock");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(47, 47, 47))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(desc_articulo)
                            .addComponent(registrar_nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                            .addComponent(nuevo_stock)
                            .addComponent(combo_articulo, 0, 151, Short.MAX_VALUE))
                        .addGap(229, 229, 229))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(combo_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(desc_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevo_stock, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(0, 45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(registrar_nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void combo_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_articuloActionPerformed
    if(combo_articulo.getSelectedItem()!=null )
     {
            
            Object[][] datos = ctrl.datos_articulo(combo_articulo.getSelectedItem().toString(),"ref_articulo");
            
            desc_articulo.setText(datos[0][0].toString());
            nuevo_stock.setText(datos[0][2].toString());    
           
                    
        }        
    }//GEN-LAST:event_combo_articuloActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    if(!registrar_nuevo.getText().equals("0") && !registrar_nuevo.getText().equals(""))
        {
            
            
            if( ctrl.update_stock(registrar_nuevo.getText(),combo_articulo.getSelectedItem().toString()))
            {
                JOptionPane.showMessageDialog(this, "Se actualizo correctamente el stock");
                registrar_nuevo.setText("0");     
                Object[][] datos = ctrl.datos_articulo(combo_articulo.getSelectedItem().toString(),"ref_articulo");
                nuevo_stock.setText(datos[0][2].toString()); 
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al actualizar");
            }
            }
            
            else
            {
            JOptionPane.showMessageDialog(this, "La cantidad a ingresar no es valida");
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_articulo;
    private javax.swing.JTextField desc_articulo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField nuevo_stock;
    private javax.swing.JTextField registrar_nuevo;
    // End of variables declaration//GEN-END:variables
}

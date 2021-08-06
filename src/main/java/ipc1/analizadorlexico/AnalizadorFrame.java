/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.analizadorlexico;

/**
 *
 * @author byron
 */
public class AnalizadorFrame extends javax.swing.JFrame {

     manejador analizador;
     /**
      * Creates new form AnalizadorFrame
      */
     public AnalizadorFrame() {
          initComponents();
          setLocationRelativeTo(null);
          
     }

     /**
      * This method is called from within the constructor to initialize the form. WARNING:
      * Do NOT modify this code. The content of this method is always regenerated by the
      * Form Editor.
      */
     @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          limpiarBoton = new javax.swing.JButton();
          analizarBoton = new javax.swing.JButton();
          jScrollPane1 = new javax.swing.JScrollPane();
          textoResultado = new javax.swing.JTextArea();
          jScrollPane2 = new javax.swing.JScrollPane();
          textoIntro = new javax.swing.JTextArea();

          setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

          limpiarBoton.setText("Limpiar");

          analizarBoton.setText("Analizar");
          analizarBoton.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    analizarBotonActionPerformed(evt);
               }
          });

          textoResultado.setEditable(false);
          textoResultado.setColumns(20);
          textoResultado.setLineWrap(true);
          textoResultado.setRows(5);
          jScrollPane1.setViewportView(textoResultado);

          textoIntro.setColumns(20);
          textoIntro.setLineWrap(true);
          textoIntro.setRows(5);
          jScrollPane2.setViewportView(textoIntro);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                         .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(analizarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addComponent(limpiarBoton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(13, 13, 13))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(analizarBoton)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 221, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(limpiarBoton)
                    .addGap(16, 16, 16))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     private void analizarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_analizarBotonActionPerformed
         
          analizador = new manejador(textoIntro.getText());
          textoResultado.setText(analizador.getDatos());
     }//GEN-LAST:event_analizarBotonActionPerformed

     /**
      * @param args the command line arguments
      */

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.JButton analizarBoton;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JButton limpiarBoton;
     private javax.swing.JTextArea textoIntro;
     private javax.swing.JTextArea textoResultado;
     // End of variables declaration//GEN-END:variables
}
//
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author xp
 */
public class VentanaXML extends javax.swing.JFrame {
    
    DOM gesDOM = new DOM();
    SAX gesSAX = new SAX();
    
    public VentanaXML() {
        initComponents();
    }
    
    private File seleccionarFichero(){
        
        File fichero = null;
        
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        if (JFileChooser.APPROVE_OPTION == fileChooser.showOpenDialog(jLabel1)) {
            fichero = fileChooser.getSelectedFile();
        }
        
        return fichero;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        bototnDOM = new javax.swing.JButton();
        botonSAX = new javax.swing.JButton();
        botonJAXB = new javax.swing.JButton();
        labelTitulo = new javax.swing.JLabel();
        textFieldTitulo = new javax.swing.JTextField();
        labelAutor = new javax.swing.JLabel();
        textFieldAutor = new javax.swing.JTextField();
        labelAnno = new javax.swing.JLabel();
        textFieldAnno = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ficheros XML");

        jLabel1.setText("<fichero XML no seleccionado>");

        bototnDOM.setText("Mostrar contenido DOM");
        bototnDOM.setEnabled(false);
        bototnDOM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bototnDOMActionPerformed(evt);
            }
        });

        botonSAX.setText("Mostrar contenido SAX");
        botonSAX.setEnabled(false);
        botonSAX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSAXActionPerformed(evt);
            }
        });

        botonJAXB.setText("Mostrar contenido JAXB");
        botonJAXB.setEnabled(false);

        labelTitulo.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelTitulo.setText("Titulo");

        labelAutor.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAutor.setText("Autor");

        labelAnno.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        labelAnno.setText("Publicado en");

        jButton4.setText("A??adir");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Guardar DOM como salida XML");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jMenu1.setText("Fichero XML");

        jMenuItem1.setText("Abrir DOM");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Abrir SAX");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("jMenuItem1");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bototnDOM, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonSAX, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonJAXB, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldTitulo)
                                .addContainerGap())
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelAnno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(textFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelAutor)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(textFieldAutor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(10, 10, 10))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bototnDOM)
                    .addComponent(botonSAX)
                    .addComponent(botonJAXB))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelTitulo)
                    .addComponent(textFieldTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAutor)
                    .addComponent(textFieldAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnno)
                    .addComponent(textFieldAnno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addContainerGap(197, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
           File ficheroXML;
           ficheroXML= seleccionarFichero();
           
           if(ficheroXML == null){
               this.jLabel1.setText("Vuelve a seleccionar el fichero");
           }
           else{
               if(gesDOM.abrir_XML_DOM(ficheroXML) == -1){
                   this.jLabel1.setText("Error al crear el objeto DOM");
               }else{
                   this.jLabel1.setText("Objeto DOM creado");
               }
               
           }
           
           if(jLabel1.getText() == "Objeto DOM creado"){
               
                bototnDOM.setEnabled(true);
                botonSAX.setEnabled(false);
                botonJAXB.setEnabled(false);
           }
           
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void bototnDOMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bototnDOMActionPerformed
            
                String mostrarAqui = gesDOM.mostrar();
                jTextArea1.setText(mostrarAqui);
        
    }//GEN-LAST:event_bototnDOMActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        String titulo = textFieldTitulo.getText();
        String autor = textFieldAutor.getText();
        String anno = textFieldAnno.getText();
        

        if(gesDOM.annadir_DOM(titulo, autor, anno) == 0){
            jLabel1.setText("Se a??adio correctamente");
        }else{
            jLabel1.setText("Error al a??adir!!");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        File ficheroXML = seleccionarFichero();
        gesSAX.abrir_XML_SAX(ficheroXML);
        
        if(ficheroXML == null){
            this.jLabel1.setText("Vuelve a seleccionar el fichero");
        }
        else{
            if(gesDOM.abrir_XML_DOM(ficheroXML) == -1){
                this.jLabel1.setText("Error al crear el objeto SAX");
            }else{
                this.jLabel1.setText("Objeto SAX creado");
            }

        }

        if(jLabel1.getText() == "Objeto SAX creado"){
            
            bototnDOM.setEnabled(false);
            botonSAX.setEnabled(true);
            botonJAXB.setEnabled(false);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void botonSAXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSAXActionPerformed
                String mostrarAqui = gesSAX.recorrerSAX();
                jTextArea1.append(mostrarAqui);
    }//GEN-LAST:event_botonSAXActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaXML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaXML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaXML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaXML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaXML().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonJAXB;
    private javax.swing.JButton botonSAX;
    private javax.swing.JButton bototnDOM;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel labelAnno;
    private javax.swing.JLabel labelAutor;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JTextField textFieldAnno;
    private javax.swing.JTextField textFieldAutor;
    private javax.swing.JTextField textFieldTitulo;
    // End of variables declaration//GEN-END:variables
}

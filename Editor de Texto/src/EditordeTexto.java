
import java.awt.Desktop;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class EditordeTexto extends javax.swing.JFrame {
    JFileChooser seleccionar = new JFileChooser();
    File archivo;
    FileInputStream entrada;
    FileOutputStream salida;           
    
    public EditordeTexto() {
        initComponents();
        setTitle("                                                                                                 EDITOR DE TEXTO *LAUJ*");
        limpiar();
    }

    private void limpiar(){
    txtarea.setText("");
}
    
    public String abrirarchivo(File archivo){
        String documento = "";
        try{
            entrada = new FileInputStream(archivo);
            int ascci;
            while((ascci = entrada.read())!=-1){
                char caracter=(char)ascci;
                documento+=caracter;
            }            
        }catch(IOException e){
        }
        return documento;
}   

    public String guardararchivo(File archivo, String documento){
    String msj = null;
    try{
            salida = new FileOutputStream(archivo);
            byte [] bytxt=documento.getBytes();
            salida.write(bytxt);
            msj = "Archivo guardado";
            
        }catch(IOException e){
        }
        return msj;
}
         
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        GUARDAR = new javax.swing.JButton();
        ABRIR = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        eliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtarea = new javax.swing.JTextPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        GUARDAR.setBackground(new java.awt.Color(255, 255, 0));
        GUARDAR.setText("Guardar como");
        GUARDAR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        GUARDAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GUARDARActionPerformed(evt);
            }
        });

        ABRIR.setBackground(new java.awt.Color(255, 255, 0));
        ABRIR.setText("Abrir ");
        ABRIR.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ABRIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ABRIRActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 0));
        jButton7.setText("Navegador");
        jButton7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        eliminar.setBackground(new java.awt.Color(255, 255, 0));
        eliminar.setText("Eliminar todo");
        eliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ABRIR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(GUARDAR, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(GUARDAR)
                .addGap(18, 18, 18)
                .addComponent(ABRIR)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addGap(18, 18, 18)
                .addComponent(eliminar)
                .addContainerGap(223, Short.MAX_VALUE))
        );

        txtarea.setBackground(new java.awt.Color(0, 0, 0));
        txtarea.setForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(txtarea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 717, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        Desktop browser = Desktop.getDesktop();
        try{
            browser.browse(new URI ("http://www.google.com"));
        }catch(IOException | URISyntaxException err){
        }        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void ABRIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ABRIRActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null, "Abrir" )==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.canRead()){
                if(archivo.getName().endsWith("txt")){
                    String documento = abrirarchivo(archivo);
                    txtarea.setText(documento);
                }else{
                    JOptionPane.showMessageDialog(null, "El archivo no es compatible");
                }
            }
        }
    }//GEN-LAST:event_ABRIRActionPerformed

    private void GUARDARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GUARDARActionPerformed
        // TODO add your handling code here:
        if(seleccionar.showDialog(null, "Guardar" )==JFileChooser.APPROVE_OPTION){
            archivo=seleccionar.getSelectedFile();
            if(archivo.getName().endsWith("txt")){
                    String documento = txtarea.getText();
                    String msj = guardararchivo (archivo, documento);
                    if(msj!=null){
                        JOptionPane.showMessageDialog(null, msj);
                    }else{
                        JOptionPane.showMessageDialog(null, "Archivo no compatible");
                    }                        
            }else{
                JOptionPane.showMessageDialog(null, "Guardar documento");
            }                    
        }
    }//GEN-LAST:event_GUARDARActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_eliminarActionPerformed
        
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new EditordeTexto().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ABRIR;
    private javax.swing.JButton GUARDAR;
    private javax.swing.JButton eliminar;
    private javax.swing.JButton jButton7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane txtarea;
    // End of variables declaration//GEN-END:variables
    
}

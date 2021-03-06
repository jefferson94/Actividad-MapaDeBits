/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ufps.gui;

import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import ufps.negocio.Imagen;
import ufps.util.ExceptionUFPS;

/**
 *
 * @author FERNEY JARAMILLO
 */
public class Form3 extends javax.swing.JFrame {

  
    private Imagen imagen;
    private JTextField mYText[][];
    
    /**
     * Creates new form Form3
     */
    public Form3(int filas , int columnas) throws ExceptionUFPS {
           initComponents();
        imagen =new Imagen (filas , columnas);
        mYText= new JTextField[filas][columnas];
         this.setBounds(0,0,567,408);
        pintar();
        
        this.setBounds(0, 0, 900, 600);
        this.setLocationRelativeTo(null);
       
        
     
    }

      private void pintar() {
     
          //this.setBounds(0,0,567,408);  
       
        this.repaint();
        int x = 16;
        int y =20;
        
        for (int i =0 ; i<this.imagen.getFilaColores1().get(0).getPixeles().length();i++){
        
            for (int j = 0; j < this.imagen.getFilaColores1().length(); j++) {
                
                this.mYText[j][i]= new JTextField();
                this.mYText[j][i].setBackground(this.imagen.getFilaColores1().get(j).getPixeles().get(i).getRgb());
                this.mYText[j][i].setBounds(x+(i*10), y+(j*10), 10, 10);
                this.jPanel2.add(this.mYText[j][i]);
                
            }
        
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButtonCrearMarco = new javax.swing.JButton();
        jButtonFlipHorizontal = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jButtonRecortar = new javax.swing.JButton();
        jTextFieldFilasCortar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldColumnaRecortar = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldAltoRecortar = new javax.swing.JTextField();
        jTextFieldAnchoRecortar = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButtonInvertirGamma = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButtonRojo = new javax.swing.JButton();
        jButtonVerde = new javax.swing.JButton();
        jButtonAzul = new javax.swing.JButton();
        jTextFieldInvertirGamma = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BMP");
        setBackground(new java.awt.Color(255, 175, 175));
        setMaximumSize(new java.awt.Dimension(932, 663));
        setMinimumSize(new java.awt.Dimension(932, 663));
        setPreferredSize(new java.awt.Dimension(932, 663));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonCrearMarco.setBackground(new java.awt.Color(153, 153, 255));
        jButtonCrearMarco.setText("CREAR MARCO");
        jButtonCrearMarco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearMarcoActionPerformed(evt);
            }
        });

        jButtonFlipHorizontal.setBackground(new java.awt.Color(255, 102, 255));
        jButtonFlipHorizontal.setText("FLIP HORIZONTAL");
        jButtonFlipHorizontal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFlipHorizontalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonRecortar.setBackground(new java.awt.Color(204, 0, 0));
        jButtonRecortar.setText("RECORTAR");
        jButtonRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecortarActionPerformed(evt);
            }
        });

        jLabel2.setText("FILA:");

        jLabel3.setText("COLUMNA:");

        jTextFieldColumnaRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldColumnaRecortarActionPerformed(evt);
            }
        });

        jLabel4.setText("ALTO:");

        jTextFieldAnchoRecortar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAnchoRecortarActionPerformed(evt);
            }
        });

        jLabel5.setText("ANCHO:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jTextFieldAltoRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel5)
                            .addGap(16, 16, 16)
                            .addComponent(jTextFieldAnchoRecortar))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addComponent(jTextFieldFilasCortar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextFieldColumnaRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(17, 17, 17))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldFilasCortar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldColumnaRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldAltoRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldAnchoRecortar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRecortar)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(102, 255, 102));
        jButton1.setText("VOLVER A CREAR MAPA DE PIXELES");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ufps/imagenes/fondoescritorioForm3.jpg"))); // NOI18N

        jLabel6.setText("COLOR A DETECTAR");

        jLabel7.setText("COLOR A INVERTIR");

        jButtonInvertirGamma.setBackground(new java.awt.Color(51, 255, 51));
        jButtonInvertirGamma.setText("INVERTIR GAMMA");
        jButtonInvertirGamma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInvertirGammaActionPerformed(evt);
            }
        });

        jButtonRojo.setBackground(new java.awt.Color(255, 102, 102));
        jButtonRojo.setText("ROJO");
        jButtonRojo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRojoActionPerformed(evt);
            }
        });

        jButtonVerde.setBackground(new java.awt.Color(153, 255, 153));
        jButtonVerde.setText("VERDE");
        jButtonVerde.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVerdeActionPerformed(evt);
            }
        });

        jButtonAzul.setBackground(new java.awt.Color(0, 153, 255));
        jButtonAzul.setText("AZUL");
        jButtonAzul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAzulActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVerde, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonRojo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAzul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonRojo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonVerde)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAzul)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextFieldInvertirGamma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldInvertirGammaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonCrearMarco, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonFlipHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFieldInvertirGamma)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonInvertirGamma)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jButtonCrearMarco)
                .addGap(18, 18, 18)
                .addComponent(jButtonFlipHorizontal)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldInvertirGamma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonInvertirGamma))
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(701, 701, 701)
                .addComponent(jLabel1))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInvertirGammaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInvertirGammaActionPerformed
        // TODO add your handling code here:
        
        try {
            String color = (jTextFieldInvertirGamma.getText());
            this.imagen.invertirGama(color);
             repintar();
        }catch(NullPointerException vacio){
            JOptionPane.showMessageDialog(null, "Color no valido"); 
        } catch (ExceptionUFPS ex) {
           JOptionPane.showMessageDialog(null, "Color no valido"); 
            
        }
        
    }//GEN-LAST:event_jButtonInvertirGammaActionPerformed

    private void jTextFieldAnchoRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAnchoRecortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAnchoRecortarActionPerformed

    private void jTextFieldColumnaRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldColumnaRecortarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldColumnaRecortarActionPerformed

    private void jButtonRecortarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecortarActionPerformed

       
        try {
            int filas = Integer.parseInt(jTextFieldFilasCortar.getText());
            int columnas = Integer.parseInt(jTextFieldColumnaRecortar.getText());
            int ancho = Integer.parseInt(jTextFieldAnchoRecortar.getText());
            int alto = Integer.parseInt(jTextFieldAltoRecortar.getText());
            this.imagen.cortar(filas, columnas, ancho, alto);
            repintar();
        } catch (ExceptionUFPS ex) {
              JOptionPane.showMessageDialog(rootPane, "Fuera de Rango");
            
            
        }
        catch (java.lang.NumberFormatException e) {
              JOptionPane.showMessageDialog(rootPane, "Casilla vacia o Digite números no letras");
            
            
        }

    }//GEN-LAST:event_jButtonRecortarActionPerformed

    private void jButtonFlipHorizontalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFlipHorizontalActionPerformed
        // TODO adthis.imagen.flipHorizontal();
        this.imagen.flipHorizontal();
        repintar();
    }//GEN-LAST:event_jButtonFlipHorizontalActionPerformed

    private void jButtonCrearMarcoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearMarcoActionPerformed

        this.imagen.crearMarco();
        repintar();
    }//GEN-LAST:event_jButtonCrearMarcoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         Form2 k;
        k = new Form2();
        k.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldInvertirGammaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldInvertirGammaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldInvertirGammaActionPerformed

    private void jButtonVerdeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerdeActionPerformed
        // TODO add your handling code here:
        String color = jButtonVerde.getText();
        this.imagen.detectarPatron(color);
        repintar();
    }//GEN-LAST:event_jButtonVerdeActionPerformed

    private void jButtonRojoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRojoActionPerformed
        // TODO add your handling code here:
        String color = jButtonRojo.getText();

        this.imagen.detectarPatron(color);
        repintar();
    }//GEN-LAST:event_jButtonRojoActionPerformed

    private void jButtonAzulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAzulActionPerformed
        // TODO add your handling code here:
        String color = jButtonAzul.getText();

        this.imagen.detectarPatron(color);
        repintar();
    }//GEN-LAST:event_jButtonAzulActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAzul;
    private javax.swing.JButton jButtonCrearMarco;
    private javax.swing.JButton jButtonFlipHorizontal;
    private javax.swing.JButton jButtonInvertirGamma;
    private javax.swing.JButton jButtonRecortar;
    private javax.swing.JButton jButtonRojo;
    private javax.swing.JButton jButtonVerde;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextFieldAltoRecortar;
    private javax.swing.JTextField jTextFieldAnchoRecortar;
    private javax.swing.JTextField jTextFieldColumnaRecortar;
    private javax.swing.JTextField jTextFieldFilasCortar;
    private javax.swing.JTextField jTextFieldInvertirGamma;
    // End of variables declaration//GEN-END:variables

    private void repintar() {
      this.jPanel2.removeAll();
        this.pintar();
       
        
       this.repaint();
       
       
    }

  
  
}

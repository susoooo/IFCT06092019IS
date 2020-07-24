/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejgui10;

import java.awt.Color;
import java.awt.PopupMenu;
import java.io.File;

/**
 *
 * @author mlorenzo
 */
public class EjGUI10 extends javax.swing.JFrame {

    /**
     * Creates new form EjGUI10
     */
    pizza piz1;
    public String nombre,direccion;
    public Integer nIng,numero,descuento;
    
    
    public EjGUI10() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.etiquetaNombre.setVisible(false);
        this.etiquetaDireccion.setVisible(false);
        this.etiquetaTelefono.setVisible(false);
        this.textoNombre.setVisible(false);
        this.textoDireccion.setVisible(false);
        this.textoTelefono.setVisible(false);
        this.botonValidar.setVisible(false);
        numero=0;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        comboIngredientes = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        comboMasa = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboNumIng = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboDescuento = new javax.swing.JComboBox<>();
        botonDomicilio = new javax.swing.JRadioButton();
        botonLocal = new javax.swing.JRadioButton();
        etiquetaNombre = new javax.swing.JLabel();
        textoNombre = new javax.swing.JTextField();
        etiquetaDireccion = new javax.swing.JLabel();
        textoDireccion = new javax.swing.JTextField();
        botonAceptar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonAñadir = new javax.swing.JButton();
        botonQuitar = new javax.swing.JButton();
        botonValidar = new javax.swing.JButton();
        añadirMasa = new javax.swing.JButton();
        quitarMasa = new javax.swing.JButton();
        etiquetaTelefono = new javax.swing.JLabel();
        textoTelefono = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        textoPizza = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pizzeria telesuperpizzaqueloflipas");

        jPanel3.setBackground(new java.awt.Color(224, 116, 0));

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("PIZZA SELECCIONADA:");

        comboIngredientes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Chorizo", "Jamón", "Jamón de York", "Queso", "Morcilla", "Champiñones", "Gambas", "Grelos", "Piña ", "Melocotón", "Maracuya", "Chistorra", "Pulpo" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        comboIngredientes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(comboIngredientes);

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("TIPO DE MASA");

        comboMasa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "hiperextramegafina", "hipermegafina", "extrahiperfina", "megaextrafina", "extrafina", "megafina", "hiperfina", "fina" }));

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("INGREDIENTES");

        jLabel4.setText("Numero de ingreditentes:");

        comboNumIng.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6" }));
        comboNumIng.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboNumIngActionPerformed(evt);
            }
        });

        jLabel5.setText("Tipo de ingredientes:");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("DESCUENTO:");

        comboDescuento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "5", "10", "15", "20", "25", " " }));
        comboDescuento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboDescuentoActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonDomicilio);
        botonDomicilio.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botonDomicilio.setText("Domicilio");
        botonDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDomicilioActionPerformed(evt);
            }
        });

        buttonGroup1.add(botonLocal);
        botonLocal.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botonLocal.setText("Local");
        botonLocal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLocalActionPerformed(evt);
            }
        });

        etiquetaNombre.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        etiquetaNombre.setText("NOMBRE:");

        etiquetaDireccion.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        etiquetaDireccion.setText("DIRECCION:");

        botonAceptar.setBackground(new java.awt.Color(24, 188, 40));
        botonAceptar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botonAceptar.setText("ACEPTAR");
        botonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAceptarActionPerformed(evt);
            }
        });

        botonCancelar.setBackground(new java.awt.Color(215, 39, 27));
        botonCancelar.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        botonCancelar.setText("CANCELAR");

        botonAñadir.setText("AÑADIR");
        botonAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAñadirActionPerformed(evt);
            }
        });

        botonQuitar.setText("QUITAR");
        botonQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarActionPerformed(evt);
            }
        });

        botonValidar.setText("VALIDAR");

        añadirMasa.setText("AÑADIR");
        añadirMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirMasaActionPerformed(evt);
            }
        });

        quitarMasa.setText("QUITAR");
        quitarMasa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitarMasaActionPerformed(evt);
            }
        });

        etiquetaTelefono.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        etiquetaTelefono.setText("TELÉFONO:");

        textoPizza.setEditable(false);
        textoPizza.setColumns(20);
        textoPizza.setRows(5);
        jScrollPane2.setViewportView(textoPizza);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(236, 236, 236)
                .addComponent(botonAceptar)
                .addGap(120, 120, 120)
                .addComponent(botonCancelar)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(comboNumIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(comboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaDireccion)
                            .addComponent(etiquetaTelefono)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonAñadir)
                            .addComponent(botonQuitar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(comboMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(añadirMasa)
                            .addComponent(quitarMasa))))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                            .addComponent(textoNombre)
                            .addComponent(textoDireccion))
                        .addGap(18, 18, 18)
                        .addComponent(botonValidar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 12, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonDomicilio)
                            .addComponent(botonLocal))
                        .addGap(79, 79, 79)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(101, 101, 101))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(comboMasa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel2)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(comboNumIng, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(botonAñadir)
                                        .addGap(18, 18, 18)
                                        .addComponent(botonQuitar))))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(añadirMasa)
                        .addGap(18, 18, 18)
                        .addComponent(quitarMasa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonLocal)
                        .addGap(21, 21, 21)
                        .addComponent(botonDomicilio)))
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(textoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaDireccion)
                            .addComponent(textoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonValidar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(comboDescuento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTelefono)
                    .addComponent(textoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAceptar)
                    .addComponent(botonCancelar))
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDomicilioActionPerformed
        // TODO add your handling code here:
        if(this.botonDomicilio.isSelected()==true)
        {
            this.botonLocal.setSelected(false);
            this.botonValidar.setVisible(true);
            this.etiquetaNombre.setVisible(true);
            this.etiquetaDireccion.setVisible(true);
            this.etiquetaTelefono.setVisible(true);
            this.textoNombre.setVisible(true);
            this.textoDireccion.setVisible(true);
            this.textoTelefono.setVisible(true);
        }
        else
        {
            this.botonLocal.setSelected(true);
            this.botonValidar.setVisible(false);
            this.etiquetaNombre.setVisible(false);
            this.etiquetaDireccion.setVisible(false);
            this.etiquetaTelefono.setVisible(false);
            this.textoNombre.setVisible(false);
            this.textoDireccion.setVisible(false);
            this.textoTelefono.setVisible(false);
            
        }
    }//GEN-LAST:event_botonDomicilioActionPerformed

    private void botonLocalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLocalActionPerformed
        // TODO add your handling code here:
        if(this.botonLocal.isSelected()==true)
        {
            this.botonDomicilio.setSelected(false);
            this.botonValidar.setVisible(false);
            this.etiquetaNombre.setVisible(false);
            this.etiquetaDireccion.setVisible(false);
            this.etiquetaTelefono.setVisible(false);
            this.textoNombre.setVisible(false);
            this.textoDireccion.setVisible(false);
            this.textoTelefono.setVisible(false);
        }
        else
        {
            this.botonDomicilio.setSelected(true);
            this.botonValidar.setVisible(true);
            this.etiquetaNombre.setVisible(true);
            this.etiquetaDireccion.setVisible(true);
            this.etiquetaTelefono.setVisible(true);
            this.textoNombre.setVisible(true);
            this.textoDireccion.setVisible(true);
            this.textoTelefono.setVisible(true);
            
        }
    }//GEN-LAST:event_botonLocalActionPerformed

    private void añadirMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirMasaActionPerformed
        // TODO add your handling code here:
        
        this.textoPizza.append(this.comboMasa.getSelectedItem().toString()+"\n");
        
        
        
    }//GEN-LAST:event_añadirMasaActionPerformed

    private void botonAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAñadirActionPerformed
        // TODO add your handling code here:
        this.textoPizza.append(this.comboIngredientes.getSelectedValue()+"\n");
        numero=numero+1;
        if (numero>=nIng)
        {
          
          this.botonAñadir.setVisible(false);
        }
        else
        {
            this.botonAñadir.setVisible(true);
        }
        
    }//GEN-LAST:event_botonAñadirActionPerformed

    private void quitarMasaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitarMasaActionPerformed
        // TODO add your handling code here:
        String texto,textob;
        texto=this.textoPizza.getText();
        textob=texto.replaceAll(this.comboMasa.getSelectedItem().toString()+"\n", "");
        this.textoPizza.setText(textob);
       
    }//GEN-LAST:event_quitarMasaActionPerformed

    private void comboNumIngActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboNumIngActionPerformed
        // TODO add your handling code here:
        nIng=(this.comboNumIng.getSelectedIndex()+1);
        if(nIng>=numero)
        {
            this.botonAñadir.setVisible(true);
        }
    }//GEN-LAST:event_comboNumIngActionPerformed

    private void botonQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarActionPerformed
        // TODO add your handling code here:
        String texto,textob;
        texto=this.textoPizza.getText();
        textob=texto.replaceAll(this.comboIngredientes.getSelectedValue()+"\n", "");
        this.textoPizza.setText(textob);
        numero=numero-1;
        if(nIng>=numero)
        {
            this.botonAñadir.setVisible(true);
        }
    }//GEN-LAST:event_botonQuitarActionPerformed

    private void comboDescuentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboDescuentoActionPerformed
        // TODO add your handling code here:
        descuento=(this.comboNumIng.getSelectedIndex());
    }//GEN-LAST:event_comboDescuentoActionPerformed

    private void botonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAceptarActionPerformed
        // TODO add your handling code here:
        File precios;
        precios = new File("/home/mlorenzo/Documentos/Repositorio/Java/EjGUI10/precios.txt");
    }//GEN-LAST:event_botonAceptarActionPerformed

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
            java.util.logging.Logger.getLogger(EjGUI10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EjGUI10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EjGUI10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EjGUI10.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EjGUI10().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirMasa;
    private javax.swing.JButton botonAceptar;
    private javax.swing.JButton botonAñadir;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JRadioButton botonDomicilio;
    private javax.swing.JRadioButton botonLocal;
    private javax.swing.JButton botonQuitar;
    private javax.swing.JButton botonValidar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> comboDescuento;
    private javax.swing.JList<String> comboIngredientes;
    private javax.swing.JComboBox<String> comboMasa;
    private javax.swing.JComboBox<String> comboNumIng;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton quitarMasa;
    private javax.swing.JTextField textoDireccion;
    private javax.swing.JTextField textoNombre;
    private javax.swing.JTextArea textoPizza;
    private javax.swing.JTextField textoTelefono;
    // End of variables declaration//GEN-END:variables
}

class pizza
{
    private String masa;
    private int numIng;
    private String ingredientes[];
    private float precio;
    
    public void tipoMasa(String m)
    {
        this.masa=m;
    }
    public String verMasa()
    {
        return(this.masa);
    }
    public void numIngred(int n)
    {
        this.numIng=n;
    }
    public Integer verNumIng()
    {
        return(this.numIng);
    }
}

package Calculadora;

import java.awt.*;
import java.text.DecimalFormat;

public class Principal extends javax.swing.JFrame {
    Color Marron = new Color(98,52,29);
    Color Violeta = new Color(207,150,253);
    Color Naranja = new Color (255,153,51);
    Color Plateado = new Color(184,184,177);
    Color Dorado = new Color(191,174,1);
    DecimalFormat df = new DecimalFormat("#.00");
    
    String cadenita="",cadenita2="";
    boolean resp=false;
    
    int N_boton;
    
    String ArrayCadena[] = new String[10];
    
    String cadena="";
    String constante="";
    String cadenaAux="";
    
    int multiplicador;
    int m_aux;
    int c_temp;
    double Rtotal=0;
    double tolerancia;
    
    String cadenaResistencia;

    int resistencia1;
    int resistencia2;
    float aux;
    double REquivalente;
    
    boolean s1=false,s2=false,s3=false,s4=false,s5=false,s6=false,Dop=false;
    
    public Principal() {
        initComponents();
        
        CBox_Banda1.setEnabled(false);
        CBox_banda2.setEnabled(false);
        CBox_banda3.setEnabled(false);
        CBox_banda4.setEnabled(false);
        CBox_banda5.setEnabled(false);
        CBox_banda6.setEnabled(false);
        Etiqueta1.setVisible(false);
        Etiqueta2.setVisible(false);
        TxtFieldTemperatura.setVisible(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        ColorBanda1 = new javax.swing.JTextField();
        ColorBanda2 = new javax.swing.JTextField();
        ColorBanda3 = new javax.swing.JTextField();
        ColorBanda4 = new javax.swing.JTextField();
        RBttn3Bandas = new javax.swing.JRadioButton();
        RBttn4Bandas = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        CBox_Banda1 = new javax.swing.JComboBox<>();
        CBox_banda2 = new javax.swing.JComboBox<>();
        CBox_banda3 = new javax.swing.JComboBox<>();
        CBox_banda4 = new javax.swing.JComboBox<>();
        RBttn5Bandas = new javax.swing.JRadioButton();
        RBttn6Bandas = new javax.swing.JRadioButton();
        ColorBanda5 = new javax.swing.JTextField();
        ColorBanda6 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        CBox_banda5 = new javax.swing.JComboBox<>();
        CBox_banda6 = new javax.swing.JComboBox<>();
        TxtFieldRespuesta = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TxtFieldR1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TxtFieldR2 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TxtFieldRespuesta2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        TxtFieldTolerancia = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        Etiqueta1 = new javax.swing.JLabel();
        TxtFieldTemperatura = new javax.swing.JTextField();
        Etiqueta2 = new javax.swing.JLabel();
        ButtonSumar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ColorBanda1.setEditable(false);
        ColorBanda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorBanda1ActionPerformed(evt);
            }
        });

        ColorBanda2.setEditable(false);

        ColorBanda3.setEditable(false);

        ColorBanda4.setEditable(false);

        buttonGroup1.add(RBttn3Bandas);
        RBttn3Bandas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RBttn3Bandas.setText("3 bandas");
        RBttn3Bandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBttn3BandasActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBttn4Bandas);
        RBttn4Bandas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RBttn4Bandas.setText("4 bandas");
        RBttn4Bandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBttn4BandasActionPerformed(evt);
            }
        });

        jLabel1.setText("Banda 1");

        jLabel2.setText("Banda 2");

        jLabel3.setText("Banda 3");

        jLabel4.setText("Banda 4");

        CBox_Banda1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco" }));
        CBox_Banda1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CBox_Banda1ItemStateChanged(evt);
            }
        });
        CBox_Banda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_Banda1ActionPerformed(evt);
            }
        });

        CBox_banda2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris" }));
        CBox_banda2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_banda2ActionPerformed(evt);
            }
        });

        CBox_banda3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado" }));
        CBox_banda3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_banda3ActionPerformed(evt);
            }
        });

        CBox_banda4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Dorado", "Plateado", " " }));
        CBox_banda4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_banda4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBttn5Bandas);
        RBttn5Bandas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RBttn5Bandas.setText("5 bandas");
        RBttn5Bandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBttn5BandasActionPerformed(evt);
            }
        });

        buttonGroup1.add(RBttn6Bandas);
        RBttn6Bandas.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        RBttn6Bandas.setText("6 bandas");
        RBttn6Bandas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBttn6BandasActionPerformed(evt);
            }
        });

        ColorBanda5.setEditable(false);

        ColorBanda6.setEditable(false);

        jLabel5.setText("Banda 5");

        jLabel6.setText("Banda 6");

        CBox_banda5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado" }));
        CBox_banda5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_banda5ActionPerformed(evt);
            }
        });

        CBox_banda6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Negro", "Marron", "Rojo", "Naranja", "Amarillo", "Verde", "Azul", "Violeta", "Gris", "Blanco", "Dorado", "Plateado" }));
        CBox_banda6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBox_banda6ActionPerformed(evt);
            }
        });

        TxtFieldRespuesta.setEditable(false);

        jLabel7.setText("Ohms");

        TxtFieldR1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFieldR1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Ohms");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel9.setText("Resistencia1");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setText("Resistencia2");

        jLabel11.setText("Ohms");

        TxtFieldRespuesta2.setEditable(false);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setText("TOTAL:");

        jLabel13.setText("Ohms");

        TxtFieldTolerancia.setEditable(false);

        jLabel14.setText("% de Tolerancia");

        jLabel15.setText("+/-");

        Etiqueta1.setText("Coeficiente de temperatura");

        TxtFieldTemperatura.setEditable(false);

        Etiqueta2.setText("ppm/K");

        ButtonSumar.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        ButtonSumar.setText("Sumar");
        ButtonSumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSumarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RBttn3Bandas, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RBttn5Bandas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 407, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(TxtFieldRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(ColorBanda4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorBanda3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorBanda5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ColorBanda6, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addComponent(RBttn4Bandas)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CBox_banda5, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(CBox_banda6, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(TxtFieldR1)
                                            .addComponent(TxtFieldR2)
                                            .addComponent(TxtFieldRespuesta2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                                            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(38, 38, 38))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(CBox_Banda1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CBox_banda2, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CBox_banda4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(CBox_banda3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(ButtonSumar, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(Etiqueta1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(TxtFieldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(Etiqueta2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addContainerGap())
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                    .addGap(170, 170, 170)))))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(RBttn6Bandas, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TxtFieldTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel14)))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBttn3Bandas)
                    .addComponent(RBttn5Bandas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBttn4Bandas)
                    .addComponent(RBttn6Bandas))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorBanda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(CBox_Banda1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFieldR1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorBanda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(CBox_banda2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(TxtFieldR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorBanda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(CBox_banda3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonSumar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CBox_banda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ColorBanda4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtFieldRespuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorBanda5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(CBox_banda5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ColorBanda6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(CBox_banda6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFieldRespuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(TxtFieldTolerancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta1)
                    .addComponent(TxtFieldTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Etiqueta2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ColorBanda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorBanda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ColorBanda1ActionPerformed

    private void CBox_Banda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_Banda1ActionPerformed
        
        int contador;
        String colorAux="";
        colorAux=colorAux+CBox_Banda1.getSelectedItem();
        
        if(colorAux.equals("Negro")){
            ColorBanda1.setBackground(Color.black);    
            constante="0";         
        }else if(colorAux.equals("Marron")){
            ColorBanda1.setBackground(Marron);
            constante="1";
            
        }else if(colorAux.equals("Rojo")){
            ColorBanda1.setBackground(Color.red);
            constante="2";
            
        }else if(colorAux.equals("Naranja")){
            ColorBanda1.setBackground(Naranja);
            constante="3";
            
        }else if(colorAux.equals("Amarillo")){
            ColorBanda1.setBackground(Color.yellow);
            constante="4";
            
        }else if(colorAux.equals("Verde")){
            ColorBanda1.setBackground(Color.green);
            constante="5";
            
        }else if(colorAux.equals("Azul")){
            ColorBanda1.setBackground(Color.blue);
            constante="6";
            
        }else if(colorAux.equals("Violeta")){
            ColorBanda1.setBackground(Violeta);
            constante="7";
            
        }else if(colorAux.equals("Gris")){
            ColorBanda1.setBackground(Color.gray);
            constante="8";
            
        }else if(colorAux.equals("Blanco")){
            ColorBanda1.setBackground(Color.white);
            constante="9";
            
        }
        ArrayCadena[0]=constante;
        s1=true;
        if(N_boton==3){
            if((s1==true)&&(s2==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
            
        }
        if(N_boton==4){
            if((s1==true)&&(s2==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==5){
            if((s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==6){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                TxtFieldTemperatura.setText(""+c_temp);
                
                
            }
        }
    }//GEN-LAST:event_CBox_Banda1ActionPerformed

    private void CBox_Banda1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CBox_Banda1ItemStateChanged

        
    }//GEN-LAST:event_CBox_Banda1ItemStateChanged

    private void CBox_banda2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_banda2ActionPerformed
        
        int contador;
        String colorAux="";
        colorAux=colorAux+CBox_banda2.getSelectedItem();
        
        if(colorAux.equals("Negro")){
            ColorBanda2.setBackground(Color.black);
            constante="0";
                
        }else if(colorAux.equals("Marron")){
            ColorBanda2.setBackground(Marron);
            constante="1";
            
        }else if(colorAux.equals("Rojo")){
            ColorBanda2.setBackground(Color.red);
            constante="2";
            
        }else if(colorAux.equals("Naranja")){
            ColorBanda2.setBackground(Naranja);
            constante="3";
            
        }else if(colorAux.equals("Amarillo")){
            ColorBanda2.setBackground(Color.yellow);
            constante="4";
            
        }else if(colorAux.equals("Verde")){
            ColorBanda2.setBackground(Color.green);
            constante="5";
            
        }else if(colorAux.equals("Azul")){
            ColorBanda2.setBackground(Color.blue);
            constante="6";
            
        }else if(colorAux.equals("Violeta")){
            ColorBanda2.setBackground(Violeta);
            constante="7";
            
        }else if(colorAux.equals("Gris")){
            ColorBanda2.setBackground(Color.gray);
            constante="8";
            
        }else if(colorAux.equals("Blanco")){
            ColorBanda2.setBackground(Color.white);
            constante="9";
            
        }
        
        ArrayCadena[1]=constante;
        s2=true;
        
        if(N_boton==3){
            if((s1==true)&&(s2==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
            
        }
        if(N_boton==4){
            if((s1==true)&&(s2==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==5){
            if((s1==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==6){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                TxtFieldTemperatura.setText(""+c_temp);
                
                
            }
        }
        
        
    }//GEN-LAST:event_CBox_banda2ActionPerformed

    private void CBox_banda3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_banda3ActionPerformed
         int contador;
        String colorAux="";
        colorAux=colorAux+CBox_banda3.getSelectedItem();
        tolerancia=20;
        
        
        if(colorAux.equals("Negro")){
            ColorBanda3.setBackground(Color.black);
            
            if(N_boton>=3){
                constante="0";
                multiplicador=1;
            }    
        }else if(colorAux.equals("Marron")){
            ColorBanda3.setBackground(Marron);
            
            if(N_boton>=3){
                constante="1";
                multiplicador=10;
            }
        }else if(colorAux.equals("Rojo")){
            ColorBanda3.setBackground(Color.red);
             
            if(N_boton>=3){
                constante="2";
                multiplicador=100;
            }
        }else if(colorAux.equals("Naranja")){  
            ColorBanda3.setBackground(Naranja);
            
            if(N_boton>=3){
                constante="3";
                multiplicador=100;
            }
        }else if(colorAux.equals("Amarillo")){
            ColorBanda3.setBackground(Color.yellow);
            
            if(N_boton>=3){    
                constante="4";
                multiplicador=1000;
            }
        }else if(colorAux.equals("Verde")){
            ColorBanda3.setBackground(Color.green);
            
            if(N_boton>=3){
                constante="5";
                multiplicador=100000;
            }
        }else if(colorAux.equals("Azul")){
            ColorBanda3.setBackground(Color.blue);
            
            if(N_boton>=3){
                constante="6";
                multiplicador=1000000;
            }
        }else if(colorAux.equals("Violeta")){
            ColorBanda3.setBackground(Violeta);
            
            if(N_boton>=3){
                constante="7";
                multiplicador=10000000;
            }
        }else if(colorAux.equals("Gris")){
            ColorBanda3.setBackground(Color.gray);
            
            if(N_boton>=3){    
                constante="8";
                multiplicador=100000000;
            }
        }else if(colorAux.equals("Blanco")){
            ColorBanda3.setBackground(Color.white);
            
            if(N_boton>=3){
                constante="9";
                multiplicador=1000000000;
            }
        }
        else if(colorAux.equals("Dorado")){
            ColorBanda3.setBackground(Dorado);
            Dop=true; 
            m_aux=10;
            
        }
        else if(colorAux.equals("Plateado")){
            ColorBanda3.setBackground(Plateado);
            m_aux=100; 
            
        }
        ArrayCadena[2]=constante;
        s3=true;
        
        
        if(N_boton==3){
            if((s1==true)&&(s2==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
            
        }
        if(N_boton==4){
            if((s1==true)&&(s2==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==5){
            if((s1==true)&&(s2==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==6){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                TxtFieldTemperatura.setText(""+c_temp);
                
                
            }
        }
        
        
    }//GEN-LAST:event_CBox_banda3ActionPerformed

    private void CBox_banda4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_banda4ActionPerformed
        int contador;
        String colorAux="";
        colorAux=colorAux+CBox_banda4.getSelectedItem();
        
        if(colorAux.equals("Negro")){
            ColorBanda4.setBackground(Color.black);
            tolerancia=0;
            if(N_boton>4){
                constante="0";
                multiplicador=1;
            }    
        }else if(colorAux.equals("Marron")){
            ColorBanda4.setBackground(Marron);
            tolerancia=1;
            if(N_boton>4){
                constante="1";
                multiplicador=10;
            }
        }else if(colorAux.equals("Rojo")){
            ColorBanda4.setBackground(Color.red);
            tolerancia=2;    
            if(N_boton>4){
                constante="2";
                multiplicador=100;
            }
        }else if(colorAux.equals("Naranja")){  
            ColorBanda4.setBackground(Naranja);
            tolerancia=0;
            if(N_boton>4){
                constante="3";
                multiplicador=100;
            }
        }else if(colorAux.equals("Amarillo")){
            ColorBanda4.setBackground(Color.yellow);
            tolerancia=0;
            if(N_boton>4){    
                constante="4";
                multiplicador=1000;
            }
        }else if(colorAux.equals("Verde")){
            ColorBanda4.setBackground(Color.green);
            tolerancia=0.5;
            if(N_boton>4){
                constante="5";
                multiplicador=100000;
            }
        }else if(colorAux.equals("Azul")){
            ColorBanda4.setBackground(Color.blue);
            tolerancia=0.25;
            if(N_boton>4){
                constante="6";
                multiplicador=1000000;
            }
        }else if(colorAux.equals("Violeta")){
            ColorBanda4.setBackground(Violeta);
            tolerancia=0.10;
            if(N_boton>4){
                constante="7";
                multiplicador=10000000;
            }
        }else if(colorAux.equals("Gris")){
            ColorBanda4.setBackground(Color.gray);
            tolerancia=0.05;
            if(N_boton>4){    
                constante="8";
                multiplicador=100000000;
            }
        }else if(colorAux.equals("Blanco")){
            ColorBanda4.setBackground(Color.white);
            tolerancia=0;
            if(N_boton>4){
                constante="9";
                multiplicador=1000000000;
            }
        }
        else if(colorAux.equals("Dorado")){
            ColorBanda4.setBackground(Dorado);
            tolerancia=5;
             
           
            
        }
        else if(colorAux.equals("Plateado")){
            ColorBanda4.setBackground(Plateado);
            tolerancia=10;
            
        }
        
        s4=true;
        
        if(N_boton==3){
            if((s1==true)&&(s2==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
            
        }
        if(N_boton==4){
            if((s1==true)&&(s2==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==5){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==6){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                TxtFieldTemperatura.setText(""+c_temp);
                
                
            }
        }
        
        
    }//GEN-LAST:event_CBox_banda4ActionPerformed

    private void RBttn4BandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBttn4BandasActionPerformed
        N_boton=4;
        CBox_Banda1.setEnabled(true);
        CBox_banda2.setEnabled(true);
        CBox_banda3.setEnabled(true);
        CBox_banda4.setEnabled(true);
        CBox_banda5.setEnabled(false);
        CBox_banda6.setEnabled(false);
    }//GEN-LAST:event_RBttn4BandasActionPerformed

    private void CBox_banda5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_banda5ActionPerformed
        int contador;
        String colorAux="";
        colorAux=colorAux+CBox_banda5.getSelectedItem();
        
        if(colorAux.equals("Negro")){
            ColorBanda5.setBackground(Color.black);
            tolerancia=0;
            if(N_boton>4){
                constante="0";
                multiplicador=1;
            }    
        }else if(colorAux.equals("Marron")){
            ColorBanda5.setBackground(Marron);
            tolerancia=1;
            if(N_boton>4){
                constante="1";
                multiplicador=10;
            }
        }else if(colorAux.equals("Rojo")){
            ColorBanda5.setBackground(Color.red);
            tolerancia=2;    
            if(N_boton>4){
                constante="2";
                multiplicador=100;
            }
        }else if(colorAux.equals("Naranja")){  
            ColorBanda5.setBackground(Naranja);
            tolerancia=0;
            if(N_boton>4){
                constante="3";
                multiplicador=100;
            }
        }else if(colorAux.equals("Amarillo")){
            ColorBanda5.setBackground(Color.yellow);
            tolerancia=0;
            if(N_boton>4){    
                constante="4";
                multiplicador=1000;
            }
        }else if(colorAux.equals("Verde")){
            ColorBanda5.setBackground(Color.green);
            tolerancia=0.5;
            if(N_boton>4){
                constante="5";
                multiplicador=100000;
            }
        }else if(colorAux.equals("Azul")){
            ColorBanda5.setBackground(Color.blue);
            tolerancia=0.25;
            if(N_boton>4){
                constante="6";
                multiplicador=1000000;
            }
        }else if(colorAux.equals("Violeta")){
            ColorBanda5.setBackground(Violeta);
            tolerancia=0.10;
            if(N_boton>4){
                constante="7";
                multiplicador=10000000;
            }
        }else if(colorAux.equals("Gris")){
            ColorBanda5.setBackground(Color.gray);
            tolerancia=0.05;
            if(N_boton>4){    
                constante="8";
                multiplicador=100000000;
            }
        }else if(colorAux.equals("Blanco")){
            ColorBanda5.setBackground(Color.white);
            tolerancia=0;
            if(N_boton>4){
                constante="9";
                multiplicador=1000000000;
            }
        }
        else if(colorAux.equals("Dorado")){
            ColorBanda5.setBackground(Dorado);
            tolerancia=5;
             
           
            
        }
        else if(colorAux.equals("Plateado")){
            ColorBanda5.setBackground(Plateado);
            tolerancia=10;
            
        }
        
        s5=true;
        
        if(N_boton==3){
            if((s1==true)&&(s2==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
            
        }
        if(N_boton==4){
            if((s1==true)&&(s2==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==5){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==6){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                TxtFieldTemperatura.setText(""+c_temp);
                
                
            }
        }
    }//GEN-LAST:event_CBox_banda5ActionPerformed

    private void CBox_banda6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBox_banda6ActionPerformed
        int contador;
        String colorAux="";
        colorAux=colorAux+CBox_banda6.getSelectedItem();
        
        if(colorAux.equals("Negro")){
            ColorBanda6.setBackground(Color.black);
            tolerancia=0;
            if(N_boton>4){
                c_temp=250;
                constante="0";
                multiplicador=1;
            }    
        }else if(colorAux.equals("Marron")){
            ColorBanda6.setBackground(Marron);
            tolerancia=1;
            if(N_boton>4){
                c_temp=100;
                constante="1";
                multiplicador=10;
            }
        }else if(colorAux.equals("Rojo")){
            ColorBanda6.setBackground(Color.red);
            tolerancia=2;    
            if(N_boton>4){
                c_temp=50;
                constante="2";
                multiplicador=100;
            }
        }else if(colorAux.equals("Naranja")){  
            ColorBanda6.setBackground(Naranja);
            tolerancia=0;
            if(N_boton>4){
                c_temp=15;
                constante="3";
                multiplicador=100;
            }
        }else if(colorAux.equals("Amarillo")){
            ColorBanda6.setBackground(Color.yellow);
            tolerancia=0;
            if(N_boton>4){
                c_temp=25;
                constante="4";
                multiplicador=1000;
            }
        }else if(colorAux.equals("Verde")){
            ColorBanda6.setBackground(Color.green);
            tolerancia=0.5;
            if(N_boton>4){
                c_temp=20;
                constante="5";
                multiplicador=100000;
            }
        }else if(colorAux.equals("Azul")){
            ColorBanda6.setBackground(Color.blue);
            tolerancia=0.25;
            if(N_boton>4){
                c_temp=10;
                constante="6";
                multiplicador=1000000;
            }
        }else if(colorAux.equals("Violeta")){
            ColorBanda6.setBackground(Violeta);
            tolerancia=0.10;
            if(N_boton>4){
                c_temp=5;
                constante="7";
                multiplicador=10000000;
            }
        }else if(colorAux.equals("Gris")){
            ColorBanda6.setBackground(Color.gray);
            tolerancia=0.05;
            if(N_boton>4){
                c_temp=1;
                constante="8";
                multiplicador=100000000;
            }
        }else if(colorAux.equals("Blanco")){
            ColorBanda6.setBackground(Color.white);
            tolerancia=0;
            if(N_boton>4){
                constante="9";
                multiplicador=1000000000;
            }
        }
        else if(colorAux.equals("Dorado")){
            ColorBanda6.setBackground(Dorado);
            tolerancia=5;
             
           
            
        }
        else if(colorAux.equals("Plateado")){
            ColorBanda6.setBackground(Plateado);
            tolerancia=10;
            
        }
        
        s6=true;
        
        if(N_boton==3){
            if((s1==true)&&(s2==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
            
        }
        if(N_boton==4){
            if((s1==true)&&(s2==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==5){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                
            }
        }
        if(N_boton==6){
            if((s1==true)&&(s2==true)&&(s3==true)&&(s4==true)&&(s5==true)){
                cadena=ArrayCadena[0];
                cadena=cadena+ArrayCadena[1];
                cadena=cadena+ArrayCadena[2];
                aux= Integer.parseInt(cadena);
                if(Dop==true){
                    aux=aux/m_aux;
                }else{
                    aux=aux*multiplicador;
                }
                REquivalente=aux;
                TxtFieldRespuesta.setText(""+df.format(REquivalente));
                TxtFieldTolerancia.setText(""+tolerancia);
                TxtFieldTemperatura.setText(""+c_temp);
                
                
            }
        }
    }//GEN-LAST:event_CBox_banda6ActionPerformed

    private void RBttn3BandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBttn3BandasActionPerformed
        CBox_Banda1.setEnabled(true);
        CBox_banda2.setEnabled(true);
        CBox_banda3.setEnabled(true);
        CBox_banda4.setEnabled(false);
        CBox_banda5.setEnabled(false);
        CBox_banda6.setEnabled(false);
        N_boton=3;
        
    }//GEN-LAST:event_RBttn3BandasActionPerformed

    private void RBttn5BandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBttn5BandasActionPerformed
        N_boton=5;
        CBox_Banda1.setEnabled(true);
        CBox_banda2.setEnabled(true);
        CBox_banda3.setEnabled(true);
        CBox_banda4.setEnabled(true);
        CBox_banda5.setEnabled(true);
        CBox_banda6.setEnabled(false);
    }//GEN-LAST:event_RBttn5BandasActionPerformed

    private void RBttn6BandasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBttn6BandasActionPerformed
        N_boton=6;
        Etiqueta1.setVisible(true);
        Etiqueta2.setVisible(true);
        TxtFieldTemperatura.setVisible(true);
        CBox_Banda1.setEnabled(true);
        CBox_banda2.setEnabled(true);
        CBox_banda3.setEnabled(true);
        CBox_banda4.setEnabled(true);
        CBox_banda5.setEnabled(true);
        CBox_banda6.setEnabled(true);
        
    }//GEN-LAST:event_RBttn6BandasActionPerformed

    private void TxtFieldR1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFieldR1ActionPerformed
      
    }//GEN-LAST:event_TxtFieldR1ActionPerformed

    private void ButtonSumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSumarActionPerformed
        cadenita=TxtFieldR1.getText();
        resistencia1 = Integer.parseInt(cadenita);
        cadenita2=TxtFieldR2.getText();
        resistencia2= Integer.parseInt(cadenita2);
        Rtotal=resistencia1+resistencia2;
        TxtFieldRespuesta2.setText(""+Rtotal);
        
    }//GEN-LAST:event_ButtonSumarActionPerformed

 
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonSumar;
    private javax.swing.JComboBox<String> CBox_Banda1;
    private javax.swing.JComboBox<String> CBox_banda2;
    private javax.swing.JComboBox<String> CBox_banda3;
    private javax.swing.JComboBox<String> CBox_banda4;
    private javax.swing.JComboBox<String> CBox_banda5;
    private javax.swing.JComboBox<String> CBox_banda6;
    private javax.swing.JTextField ColorBanda1;
    private javax.swing.JTextField ColorBanda2;
    private javax.swing.JTextField ColorBanda3;
    private javax.swing.JTextField ColorBanda4;
    private javax.swing.JTextField ColorBanda5;
    private javax.swing.JTextField ColorBanda6;
    private javax.swing.JLabel Etiqueta1;
    private javax.swing.JLabel Etiqueta2;
    private javax.swing.JRadioButton RBttn3Bandas;
    private javax.swing.JRadioButton RBttn4Bandas;
    private javax.swing.JRadioButton RBttn5Bandas;
    private javax.swing.JRadioButton RBttn6Bandas;
    private javax.swing.JTextField TxtFieldR1;
    private javax.swing.JTextField TxtFieldR2;
    private javax.swing.JTextField TxtFieldRespuesta;
    private javax.swing.JTextField TxtFieldRespuesta2;
    private javax.swing.JTextField TxtFieldTemperatura;
    private javax.swing.JTextField TxtFieldTolerancia;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

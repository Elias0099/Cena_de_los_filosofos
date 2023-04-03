package Clase;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Interfaz extends javax.swing.JFrame {

    public Interfaz() {
        initComponents();
        inicio();

    }

    public void inicio() {
        labelFiloCom1.setText("0");
        labelFiloCom2.setText("0");
        labelFiloCom3.setText("0");
        labelFiloCom4.setText("0");
        labelFiloCom5.setText("0");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jButtonInicio = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        labelFilo1 = new javax.swing.JLabel();
        jPanelMesa = new Mesa();
        buttonFilosofo1 = new javax.swing.JButton();
        labelTenedor1 = new javax.swing.JLabel();
        labelTenedor5 = new javax.swing.JLabel();
        labelTenedor3 = new javax.swing.JLabel();
        buttonFilosofo2 = new javax.swing.JButton();
        labelTenedor2 = new javax.swing.JLabel();
        labelTenedor4 = new javax.swing.JLabel();
        buttonFilosofo3 = new javax.swing.JButton();
        buttonFilosofo4 = new javax.swing.JButton();
        buttonFilosofo5 = new javax.swing.JButton();
        labelFiloCom1 = new javax.swing.JLabel();
        labelFilo2 = new javax.swing.JLabel();
        labelFiloCom2 = new javax.swing.JLabel();
        labelFilo3 = new javax.swing.JLabel();
        labelFiloCom3 = new javax.swing.JLabel();
        labelFilo4 = new javax.swing.JLabel();
        labelFiloCom4 = new javax.swing.JLabel();
        labelFilo5 = new javax.swing.JLabel();
        labelFiloCom5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TextArea_Procesos = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Problema de los Filósofasos");
        setBackground(java.awt.SystemColor.window);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(java.awt.SystemColor.window);

        labelTitulo.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        labelTitulo.setText("Contador de Comidas:");

        jButtonInicio.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonInicio.setText("Inicio");
        jButtonInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInicioActionPerformed(evt);
            }
        });

        jButtonSalir.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        labelFilo1.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFilo1.setText("Filósofo 1");

        jPanelMesa.setBackground(new java.awt.Color(0, 0, 0));
        jPanelMesa.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jPanelMesa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonFilosofo1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonFilosofo1.setText("1");
        jPanelMesa.add(buttonFilosofo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, -1, 40));

        labelTenedor1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTenedor1.setText("T1");
        jPanelMesa.add(labelTenedor1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        labelTenedor5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTenedor5.setText("T5");
        jPanelMesa.add(labelTenedor5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        labelTenedor3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTenedor3.setText("T3");
        jPanelMesa.add(labelTenedor3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, -1, -1));

        buttonFilosofo2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonFilosofo2.setText("2");
        buttonFilosofo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFilosofo2ActionPerformed(evt);
            }
        });
        jPanelMesa.add(buttonFilosofo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, 40));

        labelTenedor2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTenedor2.setText("T2");
        jPanelMesa.add(labelTenedor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, -1, -1));

        labelTenedor4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        labelTenedor4.setText("T4");
        jPanelMesa.add(labelTenedor4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 370, -1, -1));

        buttonFilosofo3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonFilosofo3.setText("3");
        jPanelMesa.add(buttonFilosofo3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 380, -1, 40));

        buttonFilosofo4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonFilosofo4.setText("4");
        jPanelMesa.add(buttonFilosofo4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 560, -1, 40));

        buttonFilosofo5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        buttonFilosofo5.setText("5");
        jPanelMesa.add(buttonFilosofo5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 40));

        labelFiloCom1.setText("0");

        labelFilo2.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFilo2.setText("Filósofo 2");

        labelFiloCom2.setText("0");

        labelFilo3.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFilo3.setText("Filósofo 3");

        labelFiloCom3.setText("0");

        labelFilo4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFilo4.setText("Filósofo 4");

        labelFiloCom4.setText("0");

        labelFilo5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        labelFilo5.setText("Filósofo 5");

        labelFiloCom5.setText("0");

        TextArea_Procesos.setColumns(20);
        TextArea_Procesos.setRows(5);
        jScrollPane1.setViewportView(TextArea_Procesos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelFilo1)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelFiloCom1, javax.swing.GroupLayout.PREFERRED_SIZE, 7, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelFilo2)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelFiloCom2)))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelFilo4)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelFiloCom4))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(labelFilo5)
                                                .addGap(18, 18, 18)
                                                .addComponent(labelFiloCom5))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(labelFilo3)
                                        .addGap(18, 18, 18)
                                        .addComponent(labelFiloCom3))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(labelTitulo)))
                        .addGap(215, 215, 215)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelMesa, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(labelTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelFilo1)
                                    .addComponent(labelFiloCom1)
                                    .addComponent(labelFilo4)
                                    .addComponent(labelFiloCom4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelFilo2)
                                    .addComponent(labelFiloCom2)
                                    .addComponent(labelFilo5)
                                    .addComponent(labelFiloCom5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelFilo3)
                                    .addComponent(labelFiloCom3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1))
                    .addComponent(jPanelMesa, javax.swing.GroupLayout.DEFAULT_SIZE, 679, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Contador");

        getAccessibleContext().setAccessibleName("Problema de los Filósofos - elias valle");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonFilosofo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFilosofo2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonFilosofo2ActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_jButtonSalirActionPerformed
//Código para dar funcionalidad al butón de inicio.
    private void jButtonInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInicioActionPerformed

        JButton filosofo[];
        filosofo = new JButton[5];
        filosofo[0] = buttonFilosofo1;
        filosofo[1] = buttonFilosofo2;
        filosofo[2] = buttonFilosofo3;
        filosofo[3] = buttonFilosofo4;
        filosofo[4] = buttonFilosofo5;

        Filosofo com;

        JLabel tenedor[];
        tenedor = new JLabel[5];
        tenedor[0] = labelTenedor1;
        tenedor[1] = labelTenedor2;
        tenedor[2] = labelTenedor3;
        tenedor[3] = labelTenedor4;
        tenedor[4] = labelTenedor5;

        JLabel resultado[];
        resultado = new JLabel[5];
        resultado[0] = labelFiloCom1;
        resultado[1] = labelFiloCom2;
        resultado[2] = labelFiloCom3;
        resultado[3] = labelFiloCom4;
        resultado[4] = labelFiloCom5;

        int i, izq, der = 0;

        for (i = 0; i < 5; i++) {

            izq = i - 1;

            if (izq < 0) {
                izq = 4;
            }
            der = i;

            com = new Filosofo(i, tenedor[izq], tenedor[der], filosofo[i], resultado[i], TextArea_Procesos); //Arreglo del TextArea.
        }
    }//GEN-LAST:event_jButtonInicioActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TextArea_Procesos;
    private javax.swing.JButton buttonFilosofo1;
    private javax.swing.JButton buttonFilosofo2;
    private javax.swing.JButton buttonFilosofo3;
    private javax.swing.JButton buttonFilosofo4;
    private javax.swing.JButton buttonFilosofo5;
    private javax.swing.JButton jButtonInicio;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelMesa;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFilo1;
    private javax.swing.JLabel labelFilo2;
    private javax.swing.JLabel labelFilo3;
    private javax.swing.JLabel labelFilo4;
    private javax.swing.JLabel labelFilo5;
    private javax.swing.JLabel labelFiloCom1;
    private javax.swing.JLabel labelFiloCom2;
    private javax.swing.JLabel labelFiloCom3;
    private javax.swing.JLabel labelFiloCom4;
    private javax.swing.JLabel labelFiloCom5;
    private javax.swing.JLabel labelTenedor1;
    private javax.swing.JLabel labelTenedor2;
    private javax.swing.JLabel labelTenedor3;
    private javax.swing.JLabel labelTenedor4;
    private javax.swing.JLabel labelTenedor5;
    private javax.swing.JLabel labelTitulo;
    // End of variables declaration//GEN-END:variables

    class Mesa extends JPanel { 

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/Img/mesa.png")).getImage();
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
            setOpaque(false);
            super.paint(g);
        }
    }

}

package Samt.Spiro.Graphics;

import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

/**
 *
 * @version 21.10.2021
 * @author Julian Cummaudo
 */
public class Spirograph extends javax.swing.JFrame implements ComponentListener {
    private int status = 0;
    static Spirograph frame;
    /**
     * Creates new form Spirograph
     */
    public Spirograph() {
        initComponents();
    }
    
    // <editor-fold defaultstate="collapsed" desc="ComponentListener"> 
    @Override
    public void componentResized(ComponentEvent e) {
        canvas1.reloadRadiuses();
        canvas1.repaint();
    }

    @Override
    public void componentMoved(ComponentEvent e) {
    }

    @Override
    public void componentShown(ComponentEvent e) {
    }

    @Override
    public void componentHidden(ComponentEvent e) {
    }
    //</editor-fold>
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pc = new javax.swing.JButton();
        Pm = new javax.swing.JButton();
        canvas1 = new Samt.Spiro.Graphics.Canvas();
        Pc30 = new javax.swing.JButton();
        Pc45 = new javax.swing.JButton();
        Pc40 = new javax.swing.JButton();
        Pc50 = new javax.swing.JButton();
        Pc55 = new javax.swing.JButton();
        Pc60 = new javax.swing.JButton();
        Pm65 = new javax.swing.JButton();
        Pm60 = new javax.swing.JButton();
        Pm55 = new javax.swing.JButton();
        Pm50 = new javax.swing.JButton();
        Pm85 = new javax.swing.JButton();
        Pm80 = new javax.swing.JButton();
        Pm75 = new javax.swing.JButton();
        Pm70 = new javax.swing.JButton();
        Pc65 = new javax.swing.JButton();
        Pc35 = new javax.swing.JButton();
        inside = new javax.swing.JButton();
        SaveLayer = new javax.swing.JButton();
        ChangeLayer = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pc.setText("Pc");
        Pc.setPreferredSize(new java.awt.Dimension(53, 25));

        Pm.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Pm.setText("Pm");

        javax.swing.GroupLayout canvas1Layout = new javax.swing.GroupLayout(canvas1);
        canvas1.setLayout(canvas1Layout);
        canvas1Layout.setHorizontalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        canvas1Layout.setVerticalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE)
        );

        Pc30.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc30.setText("30");
        Pc30.setToolTipText("");
        Pc30.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc30ActionPerformed(evt);
            }
        });

        Pc45.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc45.setText("45");
        Pc45.setToolTipText("");
        Pc45.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc45ActionPerformed(evt);
            }
        });

        Pc40.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc40.setText("40");
        Pc40.setToolTipText("");
        Pc40.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc40ActionPerformed(evt);
            }
        });

        Pc50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc50.setText("50");
        Pc50.setToolTipText("");
        Pc50.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc50ActionPerformed(evt);
            }
        });

        Pc55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc55.setText("55");
        Pc55.setToolTipText("");
        Pc55.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc55ActionPerformed(evt);
            }
        });

        Pc60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc60.setText("60");
        Pc60.setToolTipText("");
        Pc60.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc60ActionPerformed(evt);
            }
        });

        Pm65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm65.setText("65");
        Pm65.setToolTipText("");
        Pm65.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm65ActionPerformed(evt);
            }
        });

        Pm60.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm60.setText("60");
        Pm60.setToolTipText("");
        Pm60.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm60ActionPerformed(evt);
            }
        });

        Pm55.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm55.setText("55");
        Pm55.setToolTipText("");
        Pm55.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm55ActionPerformed(evt);
            }
        });

        Pm50.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm50.setText("50");
        Pm50.setToolTipText("");
        Pm50.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm50ActionPerformed(evt);
            }
        });

        Pm85.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm85.setText("85");
        Pm85.setToolTipText("");
        Pm85.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm85.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm85ActionPerformed(evt);
            }
        });

        Pm80.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm80.setText("80");
        Pm80.setToolTipText("");
        Pm80.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm80.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm80ActionPerformed(evt);
            }
        });

        Pm75.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm75.setText("75");
        Pm75.setToolTipText("");
        Pm75.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm75.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm75ActionPerformed(evt);
            }
        });

        Pm70.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pm70.setText("70");
        Pm70.setToolTipText("");
        Pm70.setPreferredSize(new java.awt.Dimension(53, 25));
        Pm70.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pm70ActionPerformed(evt);
            }
        });

        Pc65.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc65.setText("65");
        Pc65.setToolTipText("");
        Pc65.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc65.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc65ActionPerformed(evt);
            }
        });

        Pc35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Pc35.setText("35");
        Pc35.setToolTipText("");
        Pc35.setPreferredSize(new java.awt.Dimension(53, 25));
        Pc35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pc35ActionPerformed(evt);
            }
        });

        inside.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        inside.setText("Inside");
        inside.setToolTipText("");
        inside.setMargin(null);
        inside.setPreferredSize(new java.awt.Dimension(53, 25));
        inside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insideActionPerformed(evt);
            }
        });

        SaveLayer.setText("Save");
        SaveLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveLayerActionPerformed(evt);
            }
        });

        ChangeLayer.setText("Change");
        ChangeLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeLayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pc, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pc30, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pc45, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pc50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pc55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Pc60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(Pc35, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addComponent(Pc40, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                            .addComponent(Pc65, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pm, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pm50, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pm55, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pm60, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pm65, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Pm70, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pm75, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pm80, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Pm85, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SaveLayer)
                        .addGap(240, 240, 240)
                        .addComponent(inside, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ChangeLayer)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Pm)
                            .addComponent(Pc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pc30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pc65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Pm50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm65, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm70, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm80, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Pm85, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(canvas1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inside, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SaveLayer)
                    .addComponent(ChangeLayer))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    // <editor-fold defaultstate="collapsed" desc="PcActionPerformed">
    /**
     * canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
     * canvas1.repaint();
     * */
    private void Pc30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc30ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc30ActionPerformed

    private void Pc35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc35ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc35ActionPerformed

    private void Pc40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc40ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc40ActionPerformed

    private void Pc45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc45ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc45ActionPerformed

    private void Pc50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc50ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc50ActionPerformed

    private void Pc55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc55ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc55ActionPerformed

    private void Pc60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc60ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc60ActionPerformed

    private void Pc65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pc65ActionPerformed
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pc65ActionPerformed
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="PmActionPerformed">
    private void Pm50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm50ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm50ActionPerformed

    private void Pm55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm55ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm55ActionPerformed

    private void Pm60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm60ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm60ActionPerformed

    private void Pm65ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm65ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm65ActionPerformed

    private void Pm70ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm70ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm70ActionPerformed

    private void Pm75ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm75ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm75ActionPerformed

    private void Pm80ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm80ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm80ActionPerformed

    private void Pm85ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pm85ActionPerformed
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }//GEN-LAST:event_Pm85ActionPerformed
    // </editor-fold>
    
    
    private void insideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insideActionPerformed
        canvas1.changeInsideMode();
        canvas1.repaint();
        inside.setText(canvas1.getInsideMode() ? "Inside" : "outside");
        
    }//GEN-LAST:event_insideActionPerformed

    private void SaveLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveLayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SaveLayerActionPerformed

    private void ChangeLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeLayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ChangeLayerActionPerformed
    
    
    
    
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
            java.util.logging.Logger.getLogger(Spirograph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Spirograph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Spirograph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Spirograph.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        frame = new Spirograph();
        frame.addComponentListener(frame);
        frame.setMinimumSize(new Dimension(500, 400));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
            }
        });
        
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="JButton">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChangeLayer;
    private javax.swing.JButton Pc;
    private javax.swing.JButton Pc30;
    private javax.swing.JButton Pc35;
    private javax.swing.JButton Pc40;
    private javax.swing.JButton Pc45;
    private javax.swing.JButton Pc50;
    private javax.swing.JButton Pc55;
    private javax.swing.JButton Pc60;
    private javax.swing.JButton Pc65;
    private javax.swing.JButton Pm;
    private javax.swing.JButton Pm50;
    private javax.swing.JButton Pm55;
    private javax.swing.JButton Pm60;
    private javax.swing.JButton Pm65;
    private javax.swing.JButton Pm70;
    private javax.swing.JButton Pm75;
    private javax.swing.JButton Pm80;
    private javax.swing.JButton Pm85;
    private javax.swing.JButton SaveLayer;
    private Samt.Spiro.Graphics.Canvas canvas1;
    private javax.swing.JButton inside;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

    
}

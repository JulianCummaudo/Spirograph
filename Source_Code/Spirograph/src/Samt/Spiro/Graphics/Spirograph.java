package Samt.Spiro.Graphics;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import javax.swing.JColorChooser;
import javax.swing.SwingUtilities;

/**
 *
 * @version 02.12.2021
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
        checkAndPerform();
    }
    
    // <editor-fold defaultstate="collapsed" desc="ComponentListener"> 
    @Override
    public void componentResized(ComponentEvent e) {
//        canvas1.reloadRadiuses();
//        canvas1.repaint();
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

        pmToolbar = new Samt.Spiro.Graphics.PointChoice();
        canvas1 = new Samt.Spiro.Graphics.Canvas();
        pcToolbar = new Samt.Spiro.Graphics.PointChoice();
        offToolbar = new Samt.Spiro.Graphics.PointChoice();
        color = new javax.swing.JButton();
        inside = new javax.swing.JButton();
        layersManager1 = new Samt.Spiro.Graphics.LayersManager();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(909, 916));
        getContentPane().setLayout(new java.awt.FlowLayout());
        getContentPane().add(pmToolbar);

        canvas1.setPreferredSize(new java.awt.Dimension(400, 400));

        javax.swing.GroupLayout canvas1Layout = new javax.swing.GroupLayout(canvas1);
        canvas1.setLayout(canvas1Layout);
        canvas1Layout.setHorizontalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        canvas1Layout.setVerticalGroup(
            canvas1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );

        getContentPane().add(canvas1);
        getContentPane().add(pcToolbar);
        getContentPane().add(offToolbar);

        color.setText("color");
        color.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorActionPerformed(evt);
            }
        });
        getContentPane().add(color);

        inside.setText("inside");
        inside.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insideActionPerformed(evt);
            }
        });
        getContentPane().add(inside);
        getContentPane().add(layersManager1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void colorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorActionPerformed
        Color color = Color.BLACK;
        color=JColorChooser.showDialog(null, "ColorPicker", color);
        
    }//GEN-LAST:event_colorActionPerformed

    private void insideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insideActionPerformed
        canvas1.changeInsideMode();
    }//GEN-LAST:event_insideActionPerformed
            
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
        frame.setMinimumSize(new Dimension(991,448));
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frame.setVisible(true);
                
            }
        });
        
        
    }
  
    // <editor-fold defaultstate="collapsed" desc="JButton">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Samt.Spiro.Graphics.Canvas canvas1;
    private javax.swing.JButton color;
    private javax.swing.JButton inside;
    private Samt.Spiro.Graphics.LayersManager layersManager1;
    private Samt.Spiro.Graphics.PointChoice offToolbar;
    private Samt.Spiro.Graphics.PointChoice pcToolbar;
    private Samt.Spiro.Graphics.PointChoice pmToolbar;
    // End of variables declaration//GEN-END:variables
    // </editor-fold>

    
    public void checkAndPerform(){
        for (Component component : this.getRootPane().getComponents()) {
            System.out.println("Percorro il componente: " + component);
            System.out.println(component);
            //se il componente attuale è un JButton
            if (component instanceof javax.swing.JButton){
                    
                //Se il bottone è dentro alla giusta toolbar allora fai cose
                if(SwingUtilities.getAncestorOfClass(javax.swing.JToolBar.class, component).equals(pcToolbar)){
                    ((javax.swing.JButton) component).addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            pcActionPerformed(evt);
                        }
                    });
                }else if(SwingUtilities.getAncestorOfClass(javax.swing.JToolBar.class, component).equals(pmToolbar)){
                    ((javax.swing.JButton) component).addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            pmActionPerformed(evt);
                        }
                    });
                }else if(SwingUtilities.getAncestorOfClass(javax.swing.JToolBar.class, component).equals(offToolbar)){
                    ((javax.swing.JButton) component).addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                            offActionPerformed(evt);
                        }
                    });
                }
            }
        }
    }
    
    
    private void pcActionPerformed(java.awt.event.ActionEvent evt) {
        canvas1.setRadiusCenter(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }
    private void pmActionPerformed(java.awt.event.ActionEvent evt) {
        canvas1.setRadiusMobile(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }
    private void offActionPerformed(java.awt.event.ActionEvent evt) {
        canvas1.setOffset(Double.parseDouble(evt.getActionCommand()));
        canvas1.repaint();
    }
    
}

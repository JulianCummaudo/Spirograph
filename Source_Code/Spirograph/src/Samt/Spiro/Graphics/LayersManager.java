/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Samt.Spiro.Graphics;

/**
 *
 * @author julian.cummaudo
 */
public class LayersManager extends javax.swing.JPanel {

    /**
     * Creates new form LayersManager
     */
    public LayersManager() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        layersPanel = new javax.swing.JPanel();
        layerElement1 = new Samt.Spiro.Graphics.LayerElement();
        layerElement2 = new Samt.Spiro.Graphics.LayerElement();
        layerElement3 = new Samt.Spiro.Graphics.LayerElement();

        setLayout(new java.awt.BorderLayout());

        jButton1.setText("New");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, java.awt.BorderLayout.NORTH);

        layersPanel.setLayout(new javax.swing.BoxLayout(layersPanel, javax.swing.BoxLayout.Y_AXIS));
        layersPanel.add(layerElement1);
        layersPanel.add(layerElement2);
        layersPanel.add(layerElement3);

        jScrollPane1.setViewportView(layersPanel);

        add(jScrollPane1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        layersPanel.add(new LayerElement());
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private Samt.Spiro.Graphics.LayerElement layerElement1;
    private Samt.Spiro.Graphics.LayerElement layerElement2;
    private Samt.Spiro.Graphics.LayerElement layerElement3;
    private javax.swing.JPanel layersPanel;
    // End of variables declaration//GEN-END:variables
}
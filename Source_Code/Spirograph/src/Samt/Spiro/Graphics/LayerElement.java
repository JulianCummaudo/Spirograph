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
public class LayerElement extends javax.swing.JPanel {

    /**
     * Creates new form LayerElement
     */
    public LayerElement() {
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

        indexLabel = new javax.swing.JLabel();
        buttonsPanel = new javax.swing.JPanel();
        visibleButton = new javax.swing.JToggleButton();
        deleteButton = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setLayout(new java.awt.BorderLayout());
        add(indexLabel, java.awt.BorderLayout.CENTER);

        buttonsPanel.setLayout(new javax.swing.BoxLayout(buttonsPanel, javax.swing.BoxLayout.LINE_AXIS));

        visibleButton.setText("Visible");
        visibleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visibleButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(visibleButton);

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        buttonsPanel.add(deleteButton);

        add(buttonsPanel, java.awt.BorderLayout.EAST);
    }// </editor-fold>//GEN-END:initComponents

    private void visibleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visibleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visibleButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_deleteButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel buttonsPanel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel indexLabel;
    private javax.swing.JToggleButton visibleButton;
    // End of variables declaration//GEN-END:variables
}
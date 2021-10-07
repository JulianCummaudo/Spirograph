import java.awt.Color;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author julian.cummaudo
 */
public class TestClient extends javax.swing.JFrame {

        
    private final Double RAGGIO_PM = 750.0;
    private final Double RAGGIO_PC = 40.0;
    private final Double OFFSET = 50.0;
    private boolean insideMode = true;
    private Point2D.Double current = new Point2D.Double(0,0);
    
    
    
    public TestClient(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1500,1000);
    }

    public Point2D.Double getOutsidePoint(Double pc, Double pm, 
            Double offset, Double angolo){
        
        angolo = Math.toRadians(angolo);
        return new Point2D.Double(
                (pc+pm)*Math.cos(angolo)-offset*Math.cos(((pc+pm)/pm)*angolo),
                (pc+pm)*Math.sin(angolo)-offset*Math.sin(((pc+pm)/pm)*angolo)
            );
    }
    
    public Point2D.Double getInsidePoint(Double pc, Double pm, 
            Double offset, Double angolo){
        
        angolo = Math.toRadians(angolo);
        return new Point2D.Double(
                (pc-pm)*Math.cos(angolo)+offset*Math.cos(((pc-pm)/pm)*angolo),
                (pc-pm)*Math.sin(angolo)-offset*Math.sin(((pc-pm)/pm)*angolo)
            );
    }
    
    public void paint(Graphics g){
        g.setColor(Color.BLACK);
        int center = (int)(RAGGIO_PC*2+RAGGIO_PM*2);
        for(Double i = 0.0; i < 12000; i++){
            if(insideMode){
                current = getInsidePoint(RAGGIO_PC, RAGGIO_PM, OFFSET, i);
            }else{
                current = getOutsidePoint(RAGGIO_PC, RAGGIO_PM, OFFSET, i);
            }
            g.drawLine((int)current.getX()+center, center+(int)current.getY(),
                    (int)current.getX()+center, center+(int)current.getY());
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    
    
    /**0
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
            java.util.logging.Logger.getLogger(TestClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TestClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TestClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TestClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TestClient().setVisible(true);
            }
        });
    }
    
    
    
    /**
     * Creates new form TestClient
     */
    public TestClient() {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("jButton1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(jButton1)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}


import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author julian.cummaudo
 */
public class Canvas extends javax.swing.JPanel {

    private Double radiusMobile = 80.0;
    private Double radiusCenter = 50.0;
    private Double offset = 40.0;
    private boolean insideMode = true;
    private Point2D.Double current = new Point2D.Double(0,0);
    
    // <editor-fold defaultstate="collapsed" desc="Setter">
    public void setRadiusMobile(Double radius){
        this.radiusMobile = radius;
    }
    
    public void setRadiusCenter(Double radius){
        this.radiusCenter = radius;
    }

    public Double getOffset() {
        return this.offset;
    }

    public void setOffset(Double offset){
        this.offset = offset;
    }
    // </editor-fold>
    
    
    /**
     * Creates new form Canvas
     */
    public Canvas() {
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D)g;
        
        g2D.setRenderingHint(
             RenderingHints.KEY_TEXT_ANTIALIASING,
             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        g2D.setColor(Color.magenta);
        int centerX = (int)(this.getWidth()/2);
        int centerY = (int)(this.getHeight()/2);
        
        for(Double i = 0.0; i < 6000; i += 1){

            if(insideMode){
                current = getInsidePoint(radiusCenter, radiusMobile, offset, i);
            }else{
                current = getOutsidePoint(radiusCenter, radiusMobile, offset, i);
            }
            
            g2D.drawLine((int)current.getX()+centerX, centerY+(int)current.getY(),
                    (int)current.getX()+centerX, centerY+(int)current.getY());
            /*
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestClient.class.getName()).log(Level.SEVERE, null, ex);
            }
            */
        }
    }

    // <editor-fold defaultstate="collapsed" desc="getIn&OutPoint">
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
     // </editor-fold>
    
    /**
    * Interpolating method
    * @param start start of the interval
    * @param end end of the interval
    * @param count count of output interpolated numbers
    * @return array of interpolated number with specified count
    */

    public static double[] interpolate(double start, double end, int count) {
        if (count < 2) {
            throw new IllegalArgumentException("interpolate: illegal count!");
        }
        double[] array = new double[count + 1];
        for (int i = 0; i <= count; ++ i) {
            array[i] = start + i * (end - start) / count;
        }
        return array;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
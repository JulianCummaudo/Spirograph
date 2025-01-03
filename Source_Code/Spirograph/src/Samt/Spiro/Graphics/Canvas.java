package Samt.Spiro.Graphics;


import Samt.Spiro.Helpers.Drawing;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.geom.Point2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import javax.imageio.ImageIO;

/**
 *
 * @version 14.10.2021
 * @author Julian Cummaudo
 */
public class Canvas extends javax.swing.JPanel implements Runnable{

    /**
     * Questi valori sono quelli che cambiano in base alla grandezza.
     * Il loro valore si basa sui fromButtonRadius, che sono i valori dei raggi
     * presi direttamente dai bottoni senza essere considerati.
     */
    private Double radiusMobile;
    private Double radiusCenter;
    
    private Double fromButtonRadiusMobile;
    private Double fromButtonRadiusCenter;
    
    private Double offset = 40.0;
    private boolean insideMode = true;
    
    private Point2D.Double current = new Point2D.Double(0,0);

    private ArrayList<Drawing> drawings = new ArrayList<Drawing>();
    private int indexOfDrawing = 0;
    private Color pointColor = Color.RED;
    
    // <editor-fold defaultstate="collapsed" desc="Setter&Getter">
    public void setpointcolor(Color col){
        this.pointColor = col;
    }
    public void setIndexOfDrawing(int index){
        this.indexOfDrawing = index;
    }
    public void changeInsideMode(){
        this.insideMode = !this.insideMode;
    }
    
    public boolean getInsideMode(){
        return this.insideMode;
    }
    
    public void setRadiusMobile(Double radius){
        this.fromButtonRadiusMobile = radius;
        reloadRadiusMobile();
    }
    public void setRadiusCenter(Double radius){
        this.fromButtonRadiusCenter = radius;
        reloadRadiusCenter();
    }
    
    public Double getRadiusMobile(){
        return this.radiusMobile;
    }
    
    public Double getRadiusCenter(){
        return this.radiusCenter;
    }

    public Double getOffset() {
        return this.offset;
    }

    public void setOffset(Double offset){
        this.offset = offset;
    }
    // </editor-fold>
    // <editor-fold defaultstate="collapsed" desc="Realoader">
    public void reloadRadiuses(){
        reloadRadiusMobile();
        reloadRadiusCenter();
    }
    public void reloadRadiusMobile(){
        this.radiusMobile = this.fromButtonRadiusMobile * (Math.min(this.getWidth(), this.getHeight()))/150;
        setOffset(radiusMobile/4.5);
    }
    public void reloadRadiusCenter(){
        this.radiusCenter = this.fromButtonRadiusCenter * (Math.min(this.getWidth(), this.getHeight()))/150;
    }
    // </editor-fold>
    
    public void changeDrawing(Drawing next){
        this.drawings.add(next);
        this.indexOfDrawing += 1;
    }
    
    public void saveImage(){
        BufferedImage imagebuf = null;
        try {
            imagebuf = new Robot().createScreenCapture(this.getBounds());
        } catch (AWTException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }  
         Graphics2D graphics2D = imagebuf.createGraphics();
         this.paint(graphics2D);
         try {
            ImageIO.write(imagebuf,"jpeg", new File("immagine.jpeg"));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            System.out.println("error");
        }
    }
    /**
     * Creates new form Canvas
     */
    public Canvas() {
        //80 e 50 sono solo valori di default
        setRadiusMobile(80.0);
        setRadiusCenter(50.0);
        initComponents();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        Drawing currentDrawing = new Drawing();
        
        Graphics2D g2D = (Graphics2D)g;
        
        g2D.setRenderingHint(
             RenderingHints.KEY_TEXT_ANTIALIASING,
             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        
        g2D.setColor(this.pointColor);
        int centerX = (int)(this.getWidth()/2);
        int centerY = (int)(this.getHeight()/2);
        
        //Thread
        //<editor-fold defaultstate="collapsed" desc="Thread needed">
        for(Double i = 0.0; i < 60000; i += 0.1){
            
            if(insideMode){
                current = getInsidePoint(radiusCenter, radiusMobile, offset, i);
            }else{
                current = getOutsidePoint(radiusCenter, radiusMobile, offset, i);
            }
            currentDrawing.addPointAndColor(current, this.pointColor);
            
            g2D.drawLine((int)current.getX()+centerX, centerY+(int)current.getY(),
                    (int)current.getX()+centerX, centerY+(int)current.getY());
            
            // Se finisco il ciclo per interruzione o altro, aggiungo il
            // disegno alla lista
        }
        //</editor-fold>
        drawings.add(currentDrawing);
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
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(255, 255, 255));

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

    @Override
    public void run() {
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

/**
 *
 * @version 7 ott 2021
 * @author Julian Cummaudo
 */

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Point2D;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestClient2 extends JFrame{
    
    private final Double RAGGIO_PM = 75.0;
    private final Double RAGGIO_PC = 40.0;
    private final Double OFFSET = 50.0;
    private boolean insideMode = true;
    private Point2D.Double current = new Point2D.Double(0,0);
    
    public TestClient2(String title){
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(750,500);
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
    
    
    @Override
    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D)g;
        g2D.setRenderingHint(
             RenderingHints.KEY_TEXT_ANTIALIASING,
             RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        
        g2D.setColor(Color.magenta);
        int center = (int)(RAGGIO_PC*2+RAGGIO_PM*2);
        for(Double i = 0.0; i < 6000; i += 1){
            if(insideMode){
                current = getInsidePoint(RAGGIO_PC, RAGGIO_PM, OFFSET, i);
            }else{
                current = getOutsidePoint(RAGGIO_PC, RAGGIO_PM, OFFSET, i);
            }
            g2D.drawLine((int)current.getX()+center, center+(int)current.getY(),
                    (int)current.getX()+center, center+(int)current.getY());
            
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            }
        }
    }


    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
                new TestClient2("Spirograph").setVisible(true);
            }
        });
    }

}

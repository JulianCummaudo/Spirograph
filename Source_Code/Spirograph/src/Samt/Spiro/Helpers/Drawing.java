package Samt.Spiro.Helpers;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.util.ArrayList;

/**
 *
 * @version 11.11.2021
 * @author Julian Cummaudo
 */
public class Drawing {
    private ArrayList<Point2D> points = new ArrayList<Point2D>();
    private ArrayList<Color> pointColor = new ArrayList<Color>();
    private boolean visible = true;
    
    public void addPointAndColor(Point2D p, Color c){
        points.add(p);
        pointColor.add(c);
    }
    
    public Drawing(){
        
    }
    
}

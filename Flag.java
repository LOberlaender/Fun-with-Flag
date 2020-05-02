/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Write a description of class Flag here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flag{
    public static final double X = 200;
    public static final double Y = 600;
    public static final double WIDE = 100;
    public static final double WIDE2 = 40; 
    public static final double ADD = 60;  
    
    public static final double X2 = 800;
    public static final double Y2 = 1400;
    
    /**
     * Constructor for objects of class Flag 
     */
    public Flag(){
        UI.initialise();
        UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    private void drawFlag(){
        double bottem = WIDE+ ADD;
        double top = WIDE2;
        double middel = WIDE2 + ADD;
        
        UI.setLineWidth (60);
        UI.setColor(Color.yellow);
        UI.drawLine(X, bottem, Y,bottem);
        
        UI.setColor(Color.black);
        UI.drawLine(X, top, Y,top);
        
        UI.setColor(Color.red);
        UI.drawLine(X,middel, Y,middel);
        
        
        
        UI.setLineWidth (60);
        UI.setColor(Color.red);
        UI.drawLine(X2, bottem, Y2,bottem);
        
        UI.setColor(Color.white);
        UI.drawLine(X2, top, Y2,top);
        
        UI.setColor(Color.blue);
        UI.drawLine(X2,middel, Y2,middel);
              
                          
    }
    
   
    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Flag obj = new Flag();
        obj.drawFlag();
    }

}


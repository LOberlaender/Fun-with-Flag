/* Based on the VUW ecs100 template
 *
 */


import ecs100.*;
import java.util.*;
import java.io.*;
import java.awt.Color;

/** 
 * Write a description of class Flag_vertical here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Flag_vertical{
    public static final double X = 100;
    public static final double Y = 200;
    public static final double WIDE = 300;
    public static final double WIDE2 = 390; 
    public static final double ADD = 90;  
    
    /**
     * Constructor for objects of class Flag_vertical 
     */
    public Flag_vertical(){
    UI.initialise();
    UI.addButton("Quit", UI::quit);    // Comment out to checkstyle
    }
    
    private void drawFlag_vertical(){
        double first = WIDE;
        double middel = WIDE2;
        double last = WIDE2 + ADD;
        
        UI.setLineWidth (90);
        UI.setColor(Color.green);
        UI.drawLine(first, X, first,Y);
        
        UI.setColor(Color.white);
        UI.drawLine(middel, X, middel,Y);
        
        UI.setColor(Color.red);
        UI.drawLine(last, X, last,Y);                  
                          
    }

    /**
     * Main routine
     *
     */
    public static void main(String[] args){
        Flag_vertical obj = new Flag_vertical();
        obj.drawFlag_vertical();
    }

}


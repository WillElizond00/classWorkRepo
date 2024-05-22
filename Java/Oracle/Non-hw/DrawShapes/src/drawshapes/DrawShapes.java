/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package drawshapes;
import java.awt.*;
import java.applet.*;

/**
 *
 * @author 0618506375
 */
public class DrawShapes extends Applet {
    Font font;
    Color blackColor;
    Color grayColor;
    Color whiteColor;
    
    public void init(){
        //The Font is Arial size, 18 and is italicized
        font = new Font("Arial", Font.ITALIC,18);
        
       // Colors for black, gray, and white
        blackColor = Color.black;
        grayColor = Color.gray;
        whiteColor = Color.white;
       
        //Set the background Color of the applet
        setBackground(whiteColor);
    }
    public void stop(){
    }
    
    
    public void paint(Graphics graph){
    //Set font
    graph.setFont(font);
    
    //Create a title
    graph.setColor(blackColor);
    graph.drawString("Draw Shapes",90,20);
    
    //Set the color for the first shape
    graph.setColor(grayColor);
    
    //Draw a rectangle using drawRect(int x, int y, int width, int height)
    graph.drawRect(120, 120, 120, 120);
  
    // This will fill a rectangle
    graph.fillRect(115,115,90,90);
    
    //Set the color for the next shape
    graph.setColor(blackColor);
    
    //Draw a circle using drawArc(int x, int y, int width, int height. int startAngle, int arcAngle)
    graph.fillArc(110,110,50,50,0,360);
    
    //Set the color for next shape
    graph.setColor(grayColor);
    
    //Draw another rectangle
    graph.drawRect(50,50,50,50);
    
    //This will fill a rectangle
    graph.fillRect(50,50,60,60);
    
    }
    
}

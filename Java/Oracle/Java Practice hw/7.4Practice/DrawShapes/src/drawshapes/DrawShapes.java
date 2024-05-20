/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package drawshapes;
import java.awt.*;
import java.applet.*;
/**
 *
 * @author deck
 */
public class DrawShapes extends Applet {
        Font font;
    Color blackColor;
    Color whiteColor;
    Color grayColor;
public void init() {
        // The Font is Arial size, 18 and is italicized
        font = new Font("Arial", Font.ITALIC, 18);
        
        // Define black, white, and gray colors
        blackColor = Color.black;
        whiteColor = Color.white;
        grayColor = Color.gray;
        
        // Set the background Color of the applet to gray
        setBackground(grayColor);
    }

    public void stop(){
    }
    
    
    public void paint(Graphics graph){
        //Set font
        graph.setFont(font);
        
        //Create a title
        graph.drawString("Draw Shapes", 90, 20);
        
        //Set the color for the first shape
        graph.setColor(grayColor);
        
        //Draw a rectangle using drawRect(int x, int y, int width, int height)
        graph.drawRect(120, 120, 120, 120);
        
        //This will fill a rectangle
        graph.fillRect(115,115,90,90);
        
        //Set the color for the next shape
        graph.setColor(whiteColor);
        
        //Draw a circle using drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)
        graph.fillArc(110, 110, 50, 50, 0, 360);
        
        //Set color for next shape
        graph.setColor(Color.CYAN);
        
        //Draw another rectangle
        graph.drawRect(50,50,50,50);
        
        //This will fill a rectangle
        graph.fillRect(50,50,60,60);
    }
}

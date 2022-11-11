import java.awt.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
import java.awt.Toolkit.*;
class bg extends JPanel{
Image img;
public bg(){
img = Toolkit.getDefaultToolkit().createImage("restaurant.png");

}
public void paintComponent(Graphics g) 
{        
g.drawImage(img,0,0,600,450,this);
}        
}       

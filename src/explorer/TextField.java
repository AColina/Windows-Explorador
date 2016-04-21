/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package explorer;

import java.awt.Color;
import java.awt.Dimension;

/**
 *
 * @author Clases
 */

public class TextField extends javax.swing.JTextField{

    private int arcw=20; 
    private int arch=20; 
    private java.awt.Image image=null; 
    private javax.swing.Icon icon=null; 

     
    public TextField(Dimension size) { 
        setOpaque(false);   
        setPreferredSize(size); 
    } 

    @Override 
     protected void paintComponent(java.awt.Graphics g) { 
         
        java.awt.Graphics2D g2 = (java.awt.Graphics2D) g; 
        g2.setColor(super.getBackground());
        g2.fillRect(0, 0, getWidth(), getHeight());
         super.paintComponent(g); 
        if(getImage()!=null){ 
            g2.drawImage(getImage(), 5, 2, getHeight()-3, getHeight()-3, null); 
            setBorder(new javax.swing.border.EmptyBorder(0,(int)(getHeight()*1.2),0,2)); 
        } 
        g2.setColor(Color.black);
        g2.drawRect(0, 0, getWidth()-1, getHeight()-1);

    } 

    public int getArcw() { 
        return arcw; 
    } 

    public void setArcw(int arcw) { 
        this.arcw = arcw; 
    } 

    public int getArch() { 
        return arch; 
    } 

    public void setArch(int arch) { 
        this.arch = arch; 
    } 

    public java.awt.Image getImage() { 
        return image; 
    } 

    public void setImage(java.awt.Image image) { 
        this.image = image; 
    } 

    public javax.swing.Icon getIcon() { 
        return icon; 
    } 

    public void setIcon(javax.swing.Icon icon){ 
        this.icon=icon; 
        setImage(((javax.swing.ImageIcon)icon).getImage()); 
    } 


}

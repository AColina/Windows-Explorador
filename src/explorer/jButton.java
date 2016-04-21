package explorer;

import java.awt.Point;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Clases
 */
public class jButton extends JButton  {
    
    private int x;
    private int y;
    private Point Default_posi;
    java.awt.Image img1;
    java.awt.Image img2;
    
    public jButton(int x, int y,int width,int high){
    this.x=x;
    this.y=y;
    Default_posi = new Point(x, y);
    super.resize(width, high);
    super.setLocation(x, y);
    super.setFocusPainted(false);
    super.setBorderPainted(false);
    super.setContentAreaFilled(false);/**/
    super.setVisible(true);
 //   super.setFocusable(false);
    
    }
    
    @Override
    public void addActionListener(ActionListener ac){
    super.addActionListener(ac);
    }
    
    public void SelectIcon(boolean Folder){
        if (Folder) {
           img1 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_close.png")).getImage();
           img2 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder_open-2.png")).getImage(); 
        }else{
            img1 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/exe.png")).getImage();
            img2 = new javax.swing.ImageIcon(getClass().getResource("/imagenes/exe2.png")).getImage();
        }
        
    }
    
    public void setX(int x){
        this.x=x;
        this.y=y;
        super.setLocation(x, y);    
    }
    
    public void setY(int y){
        this.x=x;
        this.y=y;
        super.setLocation(x, y); 
    
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setDefault_position(){
    
    setX((int)Default_posi.getX());
    setY((int)Default_posi.getY());
    }
    
    public void setSelect(boolean Select){
        if (Select) {
            this.setIcon(new javax.swing.ImageIcon(img2));
        }else{
            this.setIcon(new javax.swing.ImageIcon(img1));
        }
     //   this.setFocusable(Select);
    }
 
}

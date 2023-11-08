import javax.swing.*;

/**
 * This class is an example of main window with an icon
 * 
 * @author PG 
 * @version 2013-02-04
 */
public class MyFirstWindowWithIcon
{
    public static void main ()
    {
        JFrame myFrame;
        
        Icon icon = new ImageIcon("DukeSprite.jpg");
        JLabel label = new JLabel(icon);
        
        myFrame = new JFrame();
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        myFrame.setTitle("Hello, I'm Duke!");
        myFrame.add(label);
        
        myFrame.setSize(150, 150);
        //myFrame.pack();
        myFrame.setVisible(true);
    }
}

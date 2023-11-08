import javax.swing.*;


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

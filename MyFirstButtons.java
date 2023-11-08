import javax.swing.*;

/**
 * This class is an example for creating two buttons
 * 
 * @author PG 
 * @version 2013-02-04
 */
public class MyFirstButtons
{
    public static void main ()
    {
        JFrame myFrame;
        JButton myButton1, myButton2;
        
        myButton1 = new JButton("Click on me !");
        Icon icon = new ImageIcon("DukeSprite.jpg");
        myButton2 = new JButton(icon);

        JPanel myPanel = new JPanel();
        myPanel.add(myButton1);
        myPanel.add(myButton2);
        
        myFrame = new JFrame("My Buttons");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        myFrame.add(myPanel);

        myFrame.pack();
        myFrame.setVisible(true);
    }
}

import javax.swing.*;

/**
 * This class is an example of button
 * 
 * @author PG 
 * @version 2013-02-04
 */
public class MyFirstButton
{
    public static void main ()
    {
        JFrame myFrame;
        JButton myButton;
        
        myButton = new JButton("Click on me !");
        /*
        Icon icon = new ImageIcon("DukeSprite.jpg");
        myButton = new JButton(icon);
        //myButton = new JButton ("Click on me !", icon); 
        */
        
        myFrame = new JFrame("My First Button");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        myFrame.add(myButton);

        myFrame.pack();
        myFrame.setVisible(true);
    }
}

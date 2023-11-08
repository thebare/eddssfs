import javax.swing.*;

/**
 * This class is only an example of main program for window manipulation
 * 
 * @author PG 
 * @version 2013-02-04
 */
public class MyFirstWindow
{
    public static void main ()
    {
        JFrame myFrame;
        myFrame = new JFrame("My First Window");

        //myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        myFrame.setSize(150, 150);
        myFrame.setVisible(true);
    }
}

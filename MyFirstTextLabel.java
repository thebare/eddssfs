import javax.swing.*;

/**
 * This class is an example of text label
 * 
 * @author PG 
 * @version 2013-02-04
 */
public class MyFirstTextLabel
{
    public static void main ()
    {
        JFrame myFrame;
        JLabel myLabel;
        
        myLabel = new JLabel("This is a label");
        //myLabel.setText("This is another label");
        //myLabel = new JLabel("This is another label", JLabel.CENTER);

        myFrame = new JFrame("My first Text Label");
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        myFrame.add(myLabel);

        myFrame.pack();
        myFrame.setVisible(true);
    }
}
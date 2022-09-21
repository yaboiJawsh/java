import javax.swing.JFrame;
public class MyFrame extends JFrame
{
    public MyFrame()
    {
        setSize(640,400);
        setLocation(0,0);
        setTitle("Joshua Sablan, CS-201");
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new MyFrame();
    }
}
/*Notes to be copied sa inbox:
   JAVA Swing Containers
   Container - provides a space where a component can be located. A Cointainer in AWT
   is a component itself
   SWING Containers:
       JPanel - simplest
       JFrame - top-level window with title and border
       JWindow - top-level window with no borders and no menubar
       
    JFrame - extended version of java.awt.Frame that supports JFC/Swing component architecture
    declaration: javax.swing.JFrame
    
    JFrame Methods:
        setVisible() - true display window, false do not display window
        setSize() - Set size of the window, (width,height)
        setLocation() - By default: by pixel, (0,0)-Upper Left
        setTitle() - Put the title on the top of the window
        setDefaultCloseOperation():
            JFrame.DO_NOTHING_ON_CLOSE - neglects the exist click
            JFrame.HIDE_ON_CLOSE (DEFAULT) - does not close but hides the 
            program
            JFrame.DISPOSE_ON_CLOSE - idk
            JFrame.EXIT_ON_CLOSE - closes the program
        setBounds() - Implementation of both setSize() and setLocation()
    Layout - arrangement of components within the container
    Layout Manager:
        FlowLayout
        BorderLayout
        CardLayout
        GridLayout
        GridBagLayout
        BoxLayout
        SpringLayout
    
   */
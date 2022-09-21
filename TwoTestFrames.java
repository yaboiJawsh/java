import java.awt.*;
import javax.swing.*;

public class TwoTestFrames
{
    public static void main(String[] args)
    {
        int height = 100, width=200;
        JFrame master = new JFrame("Click to close everything");
        JFrame temp = new JFrame("Click to close just this");
        
        master.setVisible(true);
        master.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        master.setSize(400,200);
        
        temp.setVisible(true);
        temp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        temp.setSize(300,200);
        
    }
}
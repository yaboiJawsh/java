import javax.swing.*;
public class myWindow
{
    public static void main(String[] args)
    {
        JFrame window = new JFrame();
        window.setTitle("My Window");
        window.setVisible(true);
        //window.setSize(800,300);
        //window.setLocation(0,0);
        window.setBounds(0,0,800,300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
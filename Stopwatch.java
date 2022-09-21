import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stopwatch extends JFrame
{

    long startTime;
    long stopTime;
    double elapsedTime;
    
    JButton startButton = new JButton();
    JButton stopButton = new JButton();
    JButton exitButton = new JButton();
    
    JLabel startLabel = new JLabel();
    JLabel stopLabel = new JLabel();
    JLabel elapsedLabel = new JLabel();
    
    JTextField startTextField = new JTextField();
    JTextField stopTextField = new JTextField();
    JTextField elapsedTextField = new JTextField();
    
    public Stopwatch()
    {
        setTitle("Stopwatch Application");
        
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                exitForm(e);
            }
        });
        getContentPane().setLayout(new GridBagLayout());
        
        GridBagConstraints gridConstraints = new GridBagConstraints();
        startButton.setText("Start Timing");
        gridConstraints.gridx=0;
        gridConstraints.gridy=0;
        getContentPane().add(startButton,gridConstraints);
        //setSize(300,100);
        
        startButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                startButtonActionPerformed(e);
            }
        });
        
        stopButton.setText("Stop Timing");
        gridConstraints.gridx=0;
        gridConstraints.gridy=1;
        getContentPane().add(stopButton,gridConstraints);
        
        stopButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                stopButtonActionPerformed(e);
            }
        });
        
        exitButton.setText("Exit");
        gridConstraints.gridx=0;
        gridConstraints.gridy=2;
        getContentPane().add(exitButton,gridConstraints);
        
        exitButton.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                exitButtonActionPerformed(e);
            }
        });
        
        startLabel.setText("Start Time");
        gridConstraints.gridx=1;
        gridConstraints.gridy=0;
        getContentPane().add(startLabel,gridConstraints);
        
        stopLabel.setText("Stop Time");
        gridConstraints.gridx=1;
        gridConstraints.gridy=1;
        getContentPane().add(stopLabel,gridConstraints);
        
        elapsedLabel.setText("Elapsed Time (sec)");
        gridConstraints.gridx=1;
        gridConstraints.gridy=2;
        getContentPane().add(elapsedLabel,gridConstraints);
        
        startTextField.setText("");
        startTextField.setColumns(15);
        gridConstraints.gridx=2;
        gridConstraints.gridy=0;
        getContentPane().add(startTextField,gridConstraints);
        
        stopTextField.setText("");
        stopTextField.setColumns(15);
        gridConstraints.gridx=2;
        gridConstraints.gridy=1;
        getContentPane().add(stopTextField,gridConstraints);
        
        elapsedTextField.setText("");
        elapsedTextField.setColumns(15);
        gridConstraints.gridx=2;
        gridConstraints.gridy=2;
        getContentPane().add(elapsedTextField,gridConstraints);
        
        pack();
    }
    private void exitForm(WindowEvent e)
    {
        //System.exit(0);
        JFrame f;
        f = new JFrame();
        JOptionPane.showMessageDialog(f,"Exiting Module");
    }
    private void startButtonActionPerformed(ActionEvent e)
    {
        //System.exit(0);
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Start Timer Initiated");
    }
    private void stopButtonActionPerformed(ActionEvent e)
    {
        //System.exit(0);
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Timer Has Been Stopped");
    }
    private void exitButtonActionPerformed(ActionEvent e)
    {
        JFrame f;
        f=new JFrame();
        JOptionPane.showMessageDialog(f,"Exiting Module");
        System.exit(0);
    }
    public static void main(String[] args)
    {
        new Stopwatch().show();
    }
}
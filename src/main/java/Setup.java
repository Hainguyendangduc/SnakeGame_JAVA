import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;

public class Setup extends JFrame implements ActionListener{
    private JButton btnOK;
    private JRadioButton rSnakeBubble;
    private JRadioButton rSnakeGreen;
    private JRadioButton rSnakeBlue;
    private JRadioButton rAppleGreen;
    private JRadioButton rAppleYellow;
    private JRadioButton rAppleRed;
    private JRadioButton rLevelLow;
    private JRadioButton rLevelMedium;
    private JRadioButton rLevelHigh;
    private JPanel panel2;
    private JFrame frame2;
    public static int DELAY;

    public Setup() {
        frame2 = new JFrame("Set up Snake game");
        frame2.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame2.setPreferredSize(new Dimension(350,210));
        frame2.setResizable(false);
        frame2.add(panel2);

        ButtonGroup group = new ButtonGroup();
        group.add(rLevelLow);
        group.add(rLevelMedium);
        group.add(rLevelHigh);

        frame2.pack();
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);

        btnOK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(panel2, "Set up successful");
                new GameFame();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == rLevelLow){
            DELAY = 10;
            System.out.println(DELAY);
        }
        else if (e.getSource() == rLevelMedium){
            DELAY = 75;
            System.out.println(DELAY);
        }
        else if (e.getSource() == rLevelHigh){
            DELAY = 150;
            System.out.println(DELAY);
        }
    }


//    public void actionPerformed(ActionEvent e){
//        if (e.getSource() == rLevelLow){
//            DELAY = 10;
//            System.out.println(DELAY);
//        }
//        else if (e.getSource() == rLevelMedium){
//            DELAY = 75;
//            System.out.println(DELAY);
//        }
//        else if (e.getSource() == rLevelHigh){
//            DELAY = 150;
//            System.out.println(DELAY);
//        }
//    }
}

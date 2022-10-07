import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class LoginForm extends JFrame{
    private JTextField txtUsername;
    private JPasswordField txtPassword;
    private JCheckBox chRememberme;
    private JButton btnRestart;
    private JButton btnLogin;
    private JPanel panel1;
    private JFrame frame;

    public LoginForm() {
        frame = new JFrame("Login to System");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(350,210));
        frame.setResizable(false);
        frame.add(panel1);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

        btnLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUsername.getText();
                String password = new String((txtPassword.getPassword()));

                StringBuilder sb = new StringBuilder();

                if (username.equals("")){
                    sb.append("Username is empty\n");
                }

                if (password.equals("")){
                    sb.append("Password is empty\n");
                }

                if (sb.length()>0){
                    JOptionPane.showMessageDialog(panel1, sb.toString(), "Invalidation", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (username.equals("java") && password.equals("java")){
                    JOptionPane.showMessageDialog(panel1, "Logic successfully");
                    if(chRememberme.isSelected()){
                        JOptionPane.showMessageDialog(panel1, "Login information is remember");
                    }
                    new GameFame();
                } else {
                    JOptionPane.showMessageDialog(panel1, "Invalid username or password", "Failure", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btnRestart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtUsername.setText("");
                txtPassword.setText("");
                chRememberme.setSelected(true);
            }
        });
    }
}



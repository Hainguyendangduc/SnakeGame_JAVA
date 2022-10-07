import javax.swing.*;

public class GameFame extends JFrame {
    GameFame(){
        GamePanel panel = new GamePanel();
        this.add(new GamePanel());
        this.setTitle("SNAKE GAME");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        setLocationRelativeTo(null);
    }
}

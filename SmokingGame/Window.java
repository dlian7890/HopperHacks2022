package SmokingGame;

import javax.swing.JFrame;
import javax.swing.JButton;

public class Window extends JFrame {

    protected JFrame window = new JFrame("Test Form");

    public static void main(String[] args) {
        JFrame window = new Window();

        Button button = new Button(500, 500);
        button.loadButton();
    }

    public Window() {
        super.setTitle("Game");
        super.setSize(1300, 750);
        super.setLocation(100, 35);
        super.setResizable(false);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        super.add(new SmokingGameContent());
    }

}

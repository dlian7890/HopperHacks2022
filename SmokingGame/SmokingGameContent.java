package SmokingGame;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class SmokingGameContent extends JPanel {

    private Image dude;

    public SmokingGameContent() {
        super.setDoubleBuffered(true);
    }

    @Override
    public void paintComponent(Graphics g) {
        Image 
        Graphics2D graph2D = (Graphics2D) g;
        graph2D.drawRect(50, 50, 250, 200);
        graph2D.setColor(Color.blue);
        graph2D.drawOval(10, 100, 100, 200);
        graph2D.fillOval(400, 400, 100, 100);
    }

}

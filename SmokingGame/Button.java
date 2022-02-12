package SmokingGame;

import java.awt.*;
import javax.swing.*;

public class Button extends Window {

    protected JButton clickButton = new JButton();
    private int width;
    private int height;

    public Button(int width, int height) {
        width = 0;
        height = 0;
    };

    public void loadButton() {
        Container c = (window.getContentPane());
        c.setLayout(new FlowLayout());
        clickButton.setPreferredSize(new Dimension(width, height));
        c.add(clickButton);
        c.setSize(500, 500);
        c.setVisible(true);

    }

}

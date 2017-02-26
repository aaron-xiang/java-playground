package playground.ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by henry on 12/3/16.
 */
public class DrawTest extends JPanel {

    Dimension dim;
    public void paintComponent(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(10, 10, 20, 20);
    }

    public void init() {
        DrawTest draw = new DrawTest();
        JFrame jFrame = new JFrame();
        jFrame.setTitle("Test");
        jFrame.setSize(300, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.add(draw);
        jFrame.setVisible(true);
    }

}

package playground;

/**
 * Created by aaron on 12/3/16.
 */
import java.awt.*;
import javax.swing.*;

class realCoordinate {
    int x;
    int y;
}

public class DrawTest1 extends JPanel{
    final double scale = 10;

    public void drawCircle(double x, double y, double r, Color color) {
        Graphics g = getGraphics();
    }

    public void drawLine(Graphics g, double x1, double y1, double x2, double y2, Color color) {
        realCoordinate real1 = new realCoordinate();
        realCoordinate real2 = new realCoordinate();
        coordinate(x1, y1, real1);
        coordinate(x2, y2, real2);
        g.setColor(color);
        g.drawLine(real1.x, real1.y, real2.x, real2.y );

    }

    public void coordinate(double x, double y, realCoordinate coordinate) {

        dimension = getSize();
        coordinate.x = (int)(x * scale + (double)(dimension.width/2));
        coordinate.y = (int)((double)(dimension.height/2) - y * scale);
    }

    Dimension dimension;

    public void paintComponent(Graphics g) {

        super.paintComponent(g);
        g.setColor(Color.red);
        g.drawRect(100, 10, 30, 40);
        g.fillRect(10, 10, 20, 20);
        dimension = getSize();
//        g.drawLine(0, 0, dimension.width, dimension.height);
//        g.drawLine(0, dimension.height/2, dimension.width, dimension.height/2);
//        g.drawLine(dimension.width/2, 0, dimension.width/2, dimension.height);
        drawLine(g, 0, 0, 30, 30, Color.BLACK);


    }

    public void init() {
        DrawTest1 fpg = new DrawTest1();
        JFrame jf = new JFrame();
        jf.setTitle("DrawTest1");
        jf.setSize(300, 200);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(fpg);
        jf.setVisible(true);
        dimension = fpg.getSize();

    }
}

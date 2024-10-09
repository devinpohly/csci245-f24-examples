package sudoku2;

import javax.swing.JComponent;
import java.awt.*;

public class Indicator extends JComponent {

    private Color color;

    public Indicator() {
        super();
        setSize(15, 15);
        setPreferredSize(new Dimension(15, 15));
        color = Color.WHITE;
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillOval(4, 4, 8, 8);
    }

    public void setColor(Color color) {
        this.color = color;
        repaint();
    }
}
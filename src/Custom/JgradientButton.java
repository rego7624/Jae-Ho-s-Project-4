package Custom;

import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;

import javax.swing.JButton;

public class JGradientButton extends JButton {
	//UseLess
    public JGradientButton(String ButtonValue) {
        super(ButtonValue);
        setContentAreaFilled(false);
        setFocusPainted(false); // used for demonstration
    }

    @Override
    protected void paintComponent(Graphics g) {
        final Graphics2D g2 = (Graphics2D) g.create();
        g2.setPaint(new GradientPaint(
                new Point(0, 0), 
                Color.BLACK, 
                new Point(0, getHeight()), 
                Color.PINK.darker()));
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.dispose();

        super.paintComponent(g);
    }

    public static JGradientButton newInstance() {
        return new JGradientButton("");
    }
}

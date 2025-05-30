import javax.swing.*;
import java.awt.*;
import java.awt.geom.Path2D;

public class HeartAnimation extends JPanel {
    private String message1 = "How to impress your sweetHeart?";
    private String message2 = "Chaburkhuu I am sorry";
    private int messageState = 0; // 0: Initial message, 1: Heart animation with the second message
    private double t = 0.0; // Parameter to control heart drawing animation

    public HeartAnimation() {
        // Timer to update the animation every 40ms
        Timer timer = new Timer(40, e -> {
            if (messageState == 0) {
                messageState = 1; // Switch to the heart animation
            } else if (messageState == 1) {
                t += 0.01; // Gradually increase the value of t to draw the heart
                if (t > 1.0) {
                    t = 1.0;
                    ((Timer) e.getSource()).stop(); // Stop the timer once the heart is fully drawn
                    messageState = 2; // Move to the second message display
                }
                repaint();
            }
        });
        timer.setInitialDelay(3000); // Delay before the first message changes
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set background color
        setBackground(Color.WHITE);

        // Anti-aliasing for smoother graphics
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Draw the first message
        if (messageState == 0) {
            g2d.setFont(new Font("Serif", Font.BOLD, 24));
            g2d.setColor(Color.BLACK);
            FontMetrics fm = g2d.getFontMetrics();
            int x = (getWidth() - fm.stringWidth(message1)) / 2;
            int y = getHeight() / 4;
            g2d.drawString(message1, x, y);
        }

        // Gradually draw the heart with animation
        if (messageState >= 1) {
            g2d.setColor(Color.RED);
            Path2D.Double heart = createHeartShape(t);

            // Fill the gradually drawn heart shape
            g2d.fill(heart);

            // Draw the second message inside the heart once fully drawn
            if (messageState == 2) {
                g2d.setFont(new Font("Serif", Font.BOLD, 36));
                g2d.setColor(Color.WHITE);
                FontMetrics fm = g2d.getFontMetrics();
                int x = (getWidth() - fm.stringWidth(message2)) / 2;
                int y = getHeight() / 2 + fm.getAscent() / 2;
                g2d.drawString(message2, x, y);
            }
        }
    }

    // Create a heart shape with parameter 't' controlling how much of the heart is drawn
    private Path2D.Double createHeartShape(double t) {
        Path2D.Double heart = new Path2D.Double();
        double width = getWidth() / 2.0;
        double height = getHeight() / 2.0;
        double scale = 300; // Scale for heart size

        // Incrementally draw the heart using Bézier curves
        heart.moveTo(width, height - scale * 0.5 * t);
        heart.curveTo(width + scale * 0.5 * t, height - scale * 1.1 * t, 
                      width + scale * 1.5 * t, height + scale * 0.3 * t, 
                      width, height + scale * 0.9 * t);
        heart.curveTo(width - scale * 1.5 * t, height + scale * 0.3 * t, 
                      width - scale * 0.5 * t, height - scale * 1.1 * t, 
                      width, height - scale * 0.5 * t);
        heart.closePath();

        return heart;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Heart Animation");
        HeartAnimation panel = new HeartAnimation();
        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}

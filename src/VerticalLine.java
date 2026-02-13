import java.awt.*;

public class VerticalLine {
    private int x1, y1, x2, y2;

    public VerticalLine(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLACK);
        g.drawLine(x1, y1, x2, y2);
    }

    public Rectangle getBounds() {
        return new Rectangle(x1, y1, 3, y2 - y1);
    }


}

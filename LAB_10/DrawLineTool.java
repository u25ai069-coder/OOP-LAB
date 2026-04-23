package LAB_10;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class DrawLineTool extends JFrame {
    public static void main(String[] args) {
        
        JFrame frame = new JFrame();

        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        DrawingPanel dp = new DrawingPanel();
        frame.add(dp);

        frame.setLocationRelativeTo(null);
    }

}

class DrawingPanel extends JPanel {

    Point startPoint = null;
    Point endPoint = null;
    boolean isDrawing = false;
    ArrayList<Line> lines = new ArrayList<>();

    DrawingPanel() {

        setBackground(Color.WHITE);
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));

        MouseAdapter adapter = new MouseAdapter() {
            
            @Override
            public void mousePressed(MouseEvent e) {
                startPoint = e.getPoint();
                isDrawing = true;
            }

            @Override
            public void mouseDragged(MouseEvent e) {
                if (isDrawing) {
                    endPoint = e.getPoint();
                    repaint();
                }
            }

            @Override
            public void mouseReleased(MouseEvent e) {

                if (isDrawing && startPoint != null) {
                    endPoint = e.getPoint();
                    lines.add(new Line(startPoint, endPoint));
                    isDrawing = false;
                    startPoint = null;
                    endPoint = null;
                    repaint();
                }
            }
        };

        addMouseListener(adapter);
        addMouseMotionListener(adapter);
    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        for (Line line : lines) {
            g.setColor(Color.BLACK);
            g.drawLine(line.startPoint.x, line.startPoint.y, line.endPoint.x, line.endPoint.y);
        }
        if (isDrawing) {
            g.setColor(Color.RED);
            g.drawLine(startPoint.x, startPoint.y, endPoint.x, endPoint.y);
        }
    }
}

class Line {

    Point startPoint, endPoint;

    Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }
}



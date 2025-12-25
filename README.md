# LabReport04-GUI
1.TITLE OF THE LAB REPORT EXPERIMENT:Graphical User Interfaces 
2.OBJECTIVES:
1.We can use GUI to interact with applications visually instead of using the command line.
2.We can make applications user-friendly by using buttons, text fields, menus, etc.
3.We can display information and receive user input through the GUI.
4.We can respond to user actions through events such as mouse clicks and keyboard input.
5.We can improve the usability and appearance of applications by using GUI.
3.Theory:
Java Graphical User Interfaces (GUIs) allow users to interact with programs using visual components like buttons and text fields instead of command-line input.
Java GUI development began with AWT (Abstract Window Toolkit), which uses heavyweight, OS-dependent components. This caused inconsistent appearance and behavior across platforms.
To overcome this, Swing was introduced as part of the Java Foundation Classes (JFC). Swing uses lightweight, Java-based components, providing a consistent look on all operating systems. It uses layout managers to arrange components and event handling to respond to user actions.
Later, JavaFX was developed as the modern GUI framework. It supports advanced graphics, multimedia, and CSS-based styling, making it suitable for modern and visually rich applications.
In general, Java GUI development involves creating a main window, adding components like buttons and text fields, and using event listeners to handle user interactions.



4.PROCEDURE / ANALYSIS / DESIGN :
4.1: UML class diagram:

LabReport_4_GUI
drawingPanel : DrawingPanel
LabReport_4_GUI()
|
v
DrawingPanel
circles : List<Point>
CIRCLE_SIZE : int
random : Random
DrawingPanel()
addRandomCircle() : void
clearCircles() : void
paintComponent(g : Graphics) : void


LabReport04
main(args : String[]) : void

5.IMPLEMENTATION:

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.*;

class LabReport_4_GUI extends JFrame {
    private DrawingPanel drawingPanel;
    public LabReport_4_GUI() {
        setTitle("Lab Report 04 GUI");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        drawingPanel = new DrawingPanel();
        add(drawingPanel, BorderLayout.CENTER);


        JPanel controlPanel = new JPanel();
        JButton btnDraw = new JButton("Draw Circle");
        JButton btnClear = new JButton("Clear");


        controlPanel.add(btnDraw);
        controlPanel.add(btnClear);
        add(controlPanel, BorderLayout.SOUTH);


        btnDraw.addActionListener(e -> drawingPanel.addRandomCircle());
        btnClear.addActionListener(e -> drawingPanel.clearCircles());


        btnDraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.addRandomCircle();
            }
        });


        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.clearCircles();
            }
        });
    }
    class DrawingPanel extends JPanel {
        private final List<Point> circles = new ArrayList<>();
        private final int CIRCLE_SIZE = 40;

        private final Random random = new Random();
        public DrawingPanel() {
            String title = "Swing Circle Drawer";
            String size = "600x500";
            String bgColor = "White";
            String circleColor = "Pink";
            setBackground(Color.PINK);
        }
        public void addRandomCircle() {
            int x = random.nextInt(Math.max(1, getWidth() - CIRCLE_SIZE));
            int y = random.nextInt(Math.max(1, getHeight() - CIRCLE_SIZE));
            circles.add(new Point(x, y));
            repaint();
        }
        public void clearCircles() {
            circles.clear();
            repaint();
        }


        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D g2d = (Graphics2D) g;
            g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2d.setColor(Color.PINK);
            for (Point p : circles) {
                g2d.fillOval(p.x, p.y, CIRCLE_SIZE, CIRCLE_SIZE);
            }
        }

    }
}

public class LabReport04 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LabReport().setVisible(true);
        });
    }
}
}

6.TEST RESULT / OUTPUT:




7. ANALYSIS AND DISCUSSION: 
This program demonstrates the use of Multithreading in Java, where two threads operate simultaneously. It illustrates the two standard methods of thread creation: one thread is created by extending the Thread class, and the other is created by implementing the Runnable interface.
The first thread prints numbers from 1 to 10, while the second thread prints the squares of those numbers. A 500-millisecond delay is applied between each output, causing the outputs of both threads to interleave.
Both threads utilize a shared counter variable. To prevent data inconsistency, the method responsible for updating the counter has been synchronized, ensuring that only one thread can modify the counter at a time.
In summary, this program clearly explains the importance of multithreading, concurrent execution, and synchronization.

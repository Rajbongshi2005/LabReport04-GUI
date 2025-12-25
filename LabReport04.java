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
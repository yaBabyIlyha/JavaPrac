import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ex1 extends JFrame{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final int NUM_SHAPES = 20;

    public ex1(){
        setTitle("Random Shapes");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel drawingPanel = new JPanel(){

            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Random random = new Random();
                for (int i = 0; i < NUM_SHAPES; i++){
                    int x = random.nextInt(ex1.WIDTH);
                    int y = random.nextInt(ex1.HEIGHT);
                    Color color = new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
                    int radius = random.nextInt(50) + 10;
                    g.setColor(color);
                    g.fillOval(x - radius, y - radius, 2*radius, 2*radius);
                }
            }
        };
        ActionListener action = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                drawingPanel.repaint();
            }
        };
        add(drawingPanel);
    }
    public static void main(String[] args){
        ex1 app = new ex1();
        app.setVisible(true);
    }

}

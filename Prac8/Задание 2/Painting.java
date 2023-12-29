import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Painting extends JFrame{
    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    String path = "/Users/ilyatatarinov/IdeaProjects/mainProj/src/68683aba046da843aafdd805eef6c1e3.jpeg";


    public Painting(){
        setSize(WIDTH,HEIGHT);
        setTitle("Painting");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.BLUE);
        setResizable(true);

        JLabel label = new JLabel(new ImageIcon(path));
        label.setVisible(true);

        add(label);
        setVisible(true);
    }

    public static void main(String[] args){
        Painting painting = new Painting();
    }
}
